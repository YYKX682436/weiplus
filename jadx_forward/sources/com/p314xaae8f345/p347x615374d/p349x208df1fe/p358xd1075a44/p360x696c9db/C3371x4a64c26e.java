package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.KindaStaticActivityLifeCycleCallbacks */
/* loaded from: classes9.dex */
public class C3371x4a64c26e implements com.p314xaae8f345.mm.app.v6 {
    private static final java.lang.String TAG = "KindaContext";

    /* renamed from: printBackupContextStack */
    private void m27322x28380688() {
        java.util.Iterator<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3368x7c09b87a> it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<android.content.Context> m27302x76847179 = it.next().m27302x76847179();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixKindaContext", "BackContextObject.activity：" + (m27302x76847179.get() instanceof android.app.Activity ? ((android.app.Activity) m27302x76847179.get()).getComponentName().getClassName() : ""));
        }
    }

    /* renamed from: printContextStack */
    private void m27323x4a53d66() {
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27310xa2dc648f().iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<android.content.Context> next = it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixKindaContext", "ContextStack.activity：" + (next.get() instanceof android.app.Activity ? ((android.app.Activity) next.get()).getComponentName().getClassName() : ""));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0078, code lost:
    
        r1 = r5.getClassName();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9958x78cb4fa(android.app.Activity r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3371x4a64c26e.mo9958x78cb4fa(android.app.Activity, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27310xa2dc648f().iterator();
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
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27310xa2dc648f().remove(weakReference);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "The context is destroy, so sContextStack.remove:[" + activity + "]");
        }
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPaused */
    public void mo27324x99a658dc(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        java.util.Objects.toString(activity);
        if (activity.isFinishing()) {
            java.util.Iterator<java.lang.ref.WeakReference<android.content.Context>> it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27310xa2dc648f().iterator();
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
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27310xa2dc648f().remove(weakReference);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "The context is finishing, so sContextStack.remove:[" + activity + "]");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostCreated */
    public /* bridge */ /* synthetic */ void mo27325xd264673a(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostDestroyed */
    public /* bridge */ /* synthetic */ void mo27326x1da8b1eb(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostPaused */
    public /* bridge */ /* synthetic */ void mo27327x97ef5e9c(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostResumed */
    public /* bridge */ /* synthetic */ void mo27328xd6812629(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostSaveInstanceState */
    public /* bridge */ /* synthetic */ void mo27329xadb8051(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostStarted */
    public /* bridge */ /* synthetic */ void mo27330x240128d3(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPostStopped */
    public /* bridge */ /* synthetic */ void mo27331x24c57a1f(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreCreated */
    public /* bridge */ /* synthetic */ void mo27332xc08eef73(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreDestroyed */
    public /* bridge */ /* synthetic */ void mo27333x2b520fe4(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPrePaused */
    public /* bridge */ /* synthetic */ void mo27334xc0a66b43(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreResumed */
    public /* bridge */ /* synthetic */ void mo27335xc4abae62(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreSaveInstanceState */
    public /* bridge */ /* synthetic */ void mo27336x7267d54a(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreStarted */
    public /* bridge */ /* synthetic */ void mo27337x122bb10c(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPreStopped */
    public /* bridge */ /* synthetic */ void mo27338x12f00258(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityResumed */
    public void mo27339xba973e9(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivitySaveInstanceState */
    public void mo27340x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStarted */
    public void mo27341x59297693(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStopped */
    public void mo27342x59edc7df(android.app.Activity activity) {
    }
}
