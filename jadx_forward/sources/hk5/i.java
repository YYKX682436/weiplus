package hk5;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f363539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0 f363540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hk5.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0 c0Var) {
        super(0);
        this.f363539d = kVar;
        this.f363540e = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hk5.k kVar = this.f363539d;
        if (kVar.m158354x19263085().isFinishing() || kVar.m158354x19263085().isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm callback after activity destroyed, skip UI updates");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9 = kVar.f363542i;
            if (c22651x9410f9f9 != null) {
                c22651x9410f9f9.f();
                android.view.ViewParent parent = c22651x9410f9f9.getParent();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = parent instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) parent : null;
                if (c1073x7e08a787 != null) {
                    c1073x7e08a787.removeView(c22651x9410f9f9);
                }
            }
            kVar.f363542i = null;
            kVar.f363544n = false;
            kVar.W6().a().setEnabled(true);
            kVar.W6().i().setEnabled(true);
            if (this.f363540e.f161825a) {
                j75.f Q6 = kVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new wg5.d());
                }
            } else {
                try {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = kVar.m158354x19263085();
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
                    e4Var.f293309c = kVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h0a);
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
                    e4Var.c();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm: show toast failed: " + th6.getMessage());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm failed, allow retry");
            }
        }
        return jz5.f0.f384359a;
    }
}
