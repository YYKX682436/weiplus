package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.KindaContext */
/* loaded from: classes9.dex */
public class C3369x2d6489c2 {
    private static final java.lang.String TAG = "KindaContext";

    /* renamed from: sContextStack */
    private static final java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> f13381x7091122c = new java.util.Stack<>();

    /* renamed from: sBackupContextStack */
    private static final java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3368x7c09b87a> f13380x4b06aece = new java.util.Stack<>();

    /* renamed from: backupStack */
    public static void m27307x4214a5e6() {
        f13380x4b06aece.removeAllElements();
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = f13381x7091122c.iterator();
        while (it.hasNext()) {
            f13380x4b06aece.add(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3368x7c09b87a(it.next(), false));
        }
    }

    /* renamed from: clearNullContextOfStack */
    private static void m27308xdf1d74d6() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = f13381x7091122c;
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
            f13381x7091122c.remove(weakReference2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clearNullContextOfStack sContextStack.remove:[" + weakReference2.get() + "]");
        }
    }

    public static android.content.Context get() {
        return m27315x47795de1();
    }

    /* renamed from: getBackupContextStack */
    public static java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3368x7c09b87a> m27309x8d156af1() {
        return f13380x4b06aece;
    }

    /* renamed from: getContextStack */
    public static java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> m27310xa2dc648f() {
        return f13381x7091122c;
    }

    /* renamed from: getTargetWebUIActivity */
    public static android.app.Activity m27311x9a46aed0(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent;
        android.app.Activity activity = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "rawurl or fromkindaid is null, return");
            return null;
        }
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = f13381x7091122c;
        if (stack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is null then return case3");
            return null;
        }
        m27308xdf1d74d6();
        if (stack.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is stack is null then return case4");
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
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) && stringExtra.equals(str) && stringExtra2.equals(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "find match webui");
                        activity = activity2;
                        break;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getTargetWebUIActivity finally return [" + activity + "]");
        return activity;
    }

    /* renamed from: getTopActivity */
    public static android.app.Activity m27312xbc663a4e() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = f13381x7091122c;
        android.app.Activity activity = null;
        if (stack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is null then return case3");
            return null;
        }
        m27308xdf1d74d6();
        if (stack.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is stack is null then return case4");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getTopActivity finally return [" + activity + "]");
        return activity;
    }

    /* renamed from: getTopOrUIPageFragmentActivity */
    public static android.app.Activity m27313x7608d9c4() {
        return m27314x7608d9c4("");
    }

    /* renamed from: getUsableContext */
    private static android.content.Context m27315x47795de1() {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = f13381x7091122c;
        if (stack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "The sContextStack is null then getUsableContext return null! case1");
            return null;
        }
        m27308xdf1d74d6();
        java.lang.String m27319x4a53d66 = m27319x4a53d66();
        if (stack.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "The sContextStack is empty, so that return null! case2");
            return null;
        }
        java.lang.ref.WeakReference<android.content.Context> peek = stack.peek();
        android.content.Context context = peek != null ? peek.get() : null;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing()) {
                stack.pop();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getUsableContext，sContextStack.pop:[" + activity + "]");
                context = m27315x47795de1();
            }
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getUsableContext get null and the sContextStack before call：" + m27319x4a53d66);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getUsableContext get value：" + context);
        }
        return context;
    }

    /* renamed from: init */
    private static void m27316x316510() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaContext has finish init.");
    }

    /* renamed from: initStack */
    public static void m27317xeffb1758() {
        m27316x316510();
    }

    /* renamed from: popToContext */
    public static void m27318x1a0a0763(android.content.Context context) {
        boolean z17;
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack;
        if (context == null) {
            return;
        }
        java.util.Stack stack2 = new java.util.Stack();
        stack2.addAll(f13381x7091122c);
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
            stack = f13381x7091122c;
            java.lang.ref.WeakReference<android.content.Context> peek = stack.peek();
            if (peek != null && peek.get() == context) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "popToContext break");
                return;
            }
            stack.pop();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "popToContext pop context：" + ((peek == null || peek.get() == null) ? "null" : peek.toString()));
        } while (stack.size() > 0);
    }

    /* renamed from: printContextStack */
    private static java.lang.String m27319x4a53d66() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\t");
        java.util.Stack stack = new java.util.Stack();
        stack.addAll(f13381x7091122c);
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

    /* renamed from: getTopOrUIPageFragmentActivity */
    public static android.app.Activity m27314x7608d9c4(java.lang.String str) {
        java.util.Stack<java.lang.ref.WeakReference<android.content.Context>> stack = f13381x7091122c;
        android.app.Activity activity = null;
        if (stack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is null then return case1");
            return null;
        }
        m27308xdf1d74d6();
        if (stack.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaContext is stack is null then return case2");
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
                    if (activity3 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
                        activity = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) activity3;
                        break;
                    }
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || activity2 == null || !str.equals(activity2.getClass().getName())) {
            if (activity == null) {
                activity = activity2;
            }
            activity2 = activity;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getTopOrUIPageFragmentActivity finally return [" + activity2 + "]");
        return activity2;
    }
}
