package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaStaticActivityLifeCycleCallbacks implements com.tencent.mm.app.v6 {
    private static final java.lang.String TAG = "KindaContext";

    private void printBackupContextStack() {
        java.util.Iterator<com.tencent.kinda.framework.widget.tools.KindaBackContextObject> it = com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<android.content.Context> context = it.next().getContext();
            com.tencent.mars.xlog.Log.i("FixKindaContext", "BackContextObject.activity：" + (context.get() instanceof android.app.Activity ? ((android.app.Activity) context.get()).getComponentName().getClassName() : ""));
        }
    }

    private void printContextStack() {
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.tencent.kinda.framework.widget.tools.KindaContext.getContextStack().iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<android.content.Context> next = it.next();
            com.tencent.mars.xlog.Log.i("FixKindaContext", "ContextStack.activity：" + (next.get() instanceof android.app.Activity ? ((android.app.Activity) next.get()).getComponentName().getClassName() : ""));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0078, code lost:
    
        r1 = r5.getClassName();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    @Override // com.tencent.mm.app.v6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.app.Activity r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.KindaStaticActivityLifeCycleCallbacks.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.tencent.kinda.framework.widget.tools.KindaContext.getContextStack().iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            } else {
                weakReference = it.next();
                if (weakReference.get() == activity) {
                    break;
                }
            }
        }
        if (weakReference != null) {
            com.tencent.kinda.framework.widget.tools.KindaContext.getContextStack().remove(weakReference);
            com.tencent.mars.xlog.Log.i(TAG, "The context is destroy, so sContextStack.remove:[" + activity + "]");
        }
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        java.util.Objects.toString(activity);
        if (activity.isFinishing()) {
            java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.tencent.kinda.framework.widget.tools.KindaContext.getContextStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    weakReference = null;
                    break;
                } else {
                    weakReference = it.next();
                    if (weakReference.get() == activity) {
                        break;
                    }
                }
            }
            if (weakReference != null) {
                com.tencent.kinda.framework.widget.tools.KindaContext.getContextStack().remove(weakReference);
                com.tencent.mars.xlog.Log.i(TAG, "The context is finishing, so sContextStack.remove:[" + activity + "]");
            }
        }
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostPaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostResumed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostStopped(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPrePaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreResumed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreStopped(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStopped(android.app.Activity activity) {
    }
}
