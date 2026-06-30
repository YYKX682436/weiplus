package sc2;

/* loaded from: classes2.dex */
public final class x8 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.a9 f487903d;

    public x8(sc2.a9 a9Var) {
        this.f487903d = a9Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        yz5.p pVar;
        r45.mi2 req = (r45.mi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        sc2.a9 a9Var = this.f487903d;
        a9Var.f487304d = false;
        android.app.Dialog dialog = a9Var.f487303c;
        if (dialog != null) {
            dialog.dismiss();
        }
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        java.lang.String m75945x2fec8307 = ret.m75945x2fec8307(2);
        if (m75939xb282bd08 == -4051) {
            m75945x2fec8307 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573625f61);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            db5.t7.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75945x2fec8307, sc2.w8.f487877a);
        }
        if (ret.m75939xb282bd08(1) != 0 || (pVar = a9Var.f487302b) == null) {
            return;
        }
        pVar.mo149xb9724478(req, ret);
    }
}
