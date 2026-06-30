package vc;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.p347x615374d.p348x5b09653.api.InterfaceC3080x6025a77c.class, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.class})
/* loaded from: classes9.dex */
public class z extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        if (fp.h.a(23)) {
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.m24743x731dce11();
        ((ku5.t0) ku5.t0.f394148d).B(new vc.x(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_close_init_getfingertype, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxKindaApiFeatureService", "close init getfingertype");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxKindaApiFeatureService", "open init getfingertype");
            ((ku5.t0) ku5.t0.f394148d).k(new vc.y(this), 500L);
        }
    }
}
