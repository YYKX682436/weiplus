package lx;

/* loaded from: classes4.dex */
public final class c5 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403247d;

    public c5(lx.m5 m5Var) {
        this.f403247d = m5Var;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public final boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 != 2001) {
            return false;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c();
        lx.m5 m5Var = this.f403247d;
        lx.m5.a(m5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone onActivityResult: isBound=" + c17);
        yz5.l lVar = m5Var.f403403f;
        if (lVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(c17))));
        }
        m5Var.f403403f = null;
        return true;
    }
}
