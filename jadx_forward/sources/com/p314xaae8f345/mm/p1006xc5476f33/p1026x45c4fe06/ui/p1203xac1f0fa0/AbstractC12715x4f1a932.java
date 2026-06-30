package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle */
/* loaded from: classes7.dex */
public abstract class AbstractC12715x4f1a932 extends android.content.ContextWrapper implements zj1.a, p012xc85e97e9.p093xedfae76a.x {
    public AbstractC12715x4f1a932(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
    }

    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a() {
        return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) getBaseContext();
    }

    public void b(android.content.Intent intent) {
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
    /* renamed from: onActivityDidCreateCall */
    public final void m53010x31359feb() {
        b(a().getIntent());
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onActivityDidResume */
    public void mo52972xf541971e() {
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityWillDestroy */
    public void mo52973xfd8954da() {
        android.view.View findViewById = a().findViewById(android.R.id.content);
        if (findViewById instanceof android.view.ViewGroup) {
            am1.a.a((android.view.ViewGroup) findViewById);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onActivityWillPause */
    public void m53011xc8b592d6() {
    }
}
