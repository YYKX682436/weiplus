package com.tencent.mm.plugin.appbrand.ui.launcher;

/* loaded from: classes7.dex */
public abstract class FolderActivityContextWithLifecycle extends android.content.ContextWrapper implements zj1.a, androidx.lifecycle.x {
    public FolderActivityContextWithLifecycle(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
    }

    public final com.tencent.mm.ui.MMActivity a() {
        return (com.tencent.mm.ui.MMActivity) getBaseContext();
    }

    public void b(android.content.Intent intent) {
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
    public final void onActivityDidCreateCall() {
        b(a().getIntent());
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onActivityDidResume() {
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onActivityWillDestroy() {
        android.view.View findViewById = a().findViewById(android.R.id.content);
        if (findViewById instanceof android.view.ViewGroup) {
            am1.a.a((android.view.ViewGroup) findViewById);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onActivityWillPause() {
    }
}
