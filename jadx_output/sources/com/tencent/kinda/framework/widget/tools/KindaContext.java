package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaContext {
    private static final java.lang.String TAG = "KindaContext";
    private static final java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> sContextStack = new java.util.Stack<>();
    private static final java.util.Stack<com.tencent.kinda.framework.widget.tools.KindaBackContextObject> sBackupContextStack = new java.util.Stack<>();

    public static void backupStack() {
        sBackupContextStack.removeAllElements();
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = sContextStack.iterator();
        while (it.hasNext()) {
            sBackupContextStack.add(new com.tencent.kinda.framework.widget.tools.KindaBackContextObject(it.next(), false));
        }
    }

    private static void clearNullContextOfStack() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = sContextStack;
        if (stack == null || stack.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(stack);
        java.util.Iterator it = stack2.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (((android.content.Context) weakReference.get()) == null) {
                arrayList.add(weakReference);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) it6.next();
            sContextStack.remove(weakReference2);
            com.tencent.mars.xlog.Log.i(TAG, "clearNullContextOfStack sContextStack.remove:[" + weakReference2.get() + "]");
        }
    }

    public static android.content.Context get() {
        return getUsableContext();
    }

    public static java.util.Stack<com.tencent.kinda.framework.widget.tools.KindaBackContextObject> getBackupContextStack() {
        return sBackupContextStack;
    }

    public static java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> getContextStack() {
        return sContextStack;
    }

    public static android.app.Activity getTargetWebUIActivity(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent;
        android.app.Activity activity = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e(TAG, "rawurl or fromkindaid is null, return");
            return null;
        }
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = sContextStack;
        if (stack == null) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is null then return case3");
            return null;
        }
        clearNullContextOfStack();
        if (stack.size() == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is stack is null then return case4");
            return null;
        }
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(stack);
        java.lang.Object obj = null;
        while (true) {
            if (stack2.empty()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) stack2.pop();
            if (weakReference != null) {
                obj = (android.content.Context) weakReference.get();
            }
            if (obj instanceof android.app.Activity) {
                android.app.Activity activity2 = (android.app.Activity) obj;
                if (!activity2.isFinishing() && (intent = activity2.getIntent()) != null) {
                    java.lang.String stringExtra = intent.getStringExtra("rawUrl");
                    java.lang.String stringExtra2 = intent.getStringExtra("kFromKindaId");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) && stringExtra.equals(str) && stringExtra2.equals(str2)) {
                        com.tencent.mars.xlog.Log.i(TAG, "find match webui");
                        activity = activity2;
                        break;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "getTargetWebUIActivity finally return [" + activity + "]");
        return activity;
    }

    public static android.app.Activity getTopActivity() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = sContextStack;
        android.app.Activity activity = null;
        if (stack == null) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is null then return case3");
            return null;
        }
        clearNullContextOfStack();
        if (stack.size() == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is stack is null then return case4");
            return null;
        }
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(stack);
        java.lang.Object obj = null;
        while (true) {
            if (stack2.empty()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) stack2.pop();
            if (weakReference != null) {
                obj = (android.content.Context) weakReference.get();
            }
            if (obj instanceof android.app.Activity) {
                android.app.Activity activity2 = (android.app.Activity) obj;
                if (!activity2.isFinishing()) {
                    activity = activity2;
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "getTopActivity finally return [" + activity + "]");
        return activity;
    }

    public static android.app.Activity getTopOrUIPageFragmentActivity() {
        return getTopOrUIPageFragmentActivity("");
    }

    private static android.content.Context getUsableContext() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = sContextStack;
        if (stack == null) {
            com.tencent.mars.xlog.Log.e(TAG, "The sContextStack is null then getUsableContext return null! case1");
            return null;
        }
        clearNullContextOfStack();
        java.lang.String printContextStack = printContextStack();
        if (stack.size() == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "The sContextStack is empty, so that return null! case2");
            return null;
        }
        java.lang.ref.WeakReference<android.content.Context> peek = stack.peek();
        android.content.Context context = peek != null ? peek.get() : null;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing()) {
                stack.pop();
                com.tencent.mars.xlog.Log.i(TAG, "getUsableContext，sContextStack.pop:[" + activity + "]");
                context = getUsableContext();
            }
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "getUsableContext get null and the sContextStack before call：" + printContextStack);
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "getUsableContext get value：" + context);
        }
        return context;
    }

    private static void init() {
        com.tencent.mars.xlog.Log.i(TAG, "KindaContext has finish init.");
    }

    public static void initStack() {
        init();
    }

    public static void popToContext(android.content.Context context) {
        boolean z17;
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack;
        if (context == null) {
            return;
        }
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(sContextStack);
        java.util.Iterator it = stack2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() != null && context == weakReference.get()) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            return;
        }
        do {
            stack = sContextStack;
            java.lang.ref.WeakReference<android.content.Context> peek = stack.peek();
            if (peek != null && peek.get() == context) {
                com.tencent.mars.xlog.Log.i(TAG, "popToContext break");
                return;
            }
            stack.pop();
            com.tencent.mars.xlog.Log.i(TAG, "popToContext pop context：" + ((peek == null || peek.get() == null) ? "null" : peek.toString()));
        } while (stack.size() > 0);
    }

    private static java.lang.String printContextStack() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\t");
        java.util.Stack stack = new java.util.Stack();
        stack.addAll(sContextStack);
        java.util.Iterator it = stack.iterator();
        while (it.hasNext()) {
            android.content.Context context = (android.content.Context) ((java.lang.ref.WeakReference) it.next()).get();
            if (context != null) {
                sb6.append(context.toString());
                sb6.append("\n\t");
            } else {
                sb6.append("null\n\t");
            }
        }
        return sb6.toString();
    }

    public static android.app.Activity getTopOrUIPageFragmentActivity(java.lang.String str) {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = sContextStack;
        android.app.Activity activity = null;
        if (stack == null) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is null then return case1");
            return null;
        }
        clearNullContextOfStack();
        if (stack.size() == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaContext is stack is null then return case2");
            return null;
        }
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(stack);
        android.content.Context context = null;
        android.app.Activity activity2 = null;
        while (true) {
            if (stack2.empty()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) stack2.pop();
            if (weakReference != null) {
                context = (android.content.Context) weakReference.get();
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity3 = (android.app.Activity) context;
                if (activity3.isFinishing()) {
                    continue;
                } else {
                    if (activity2 == null) {
                        activity2 = activity3;
                    }
                    if (activity3 instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
                        activity = (com.tencent.mm.framework.app.UIPageFragmentActivity) activity3;
                        break;
                    }
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || activity2 == null || !str.equals(activity2.getClass().getName())) {
            if (activity == null) {
                activity = activity2;
            }
            activity2 = activity;
        }
        com.tencent.mars.xlog.Log.i(TAG, "getTopOrUIPageFragmentActivity finally return [" + activity2 + "]");
        return activity2;
    }
}
