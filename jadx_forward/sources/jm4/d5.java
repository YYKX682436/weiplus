package jm4;

/* loaded from: classes9.dex */
public final class d5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381913d;

    public d5(yz5.l lVar) {
        this.f381913d = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        bw5.s1 s1Var = new bw5.s1();
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        boolean[] zArr = s1Var.f114281g;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "black list succ");
            s1Var.f114278d = 0L;
            zArr[1] = true;
            s1Var.f114279e = "";
            zArr[2] = true;
            s1Var.f114280f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            zArr[3] = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "black list failed");
            s1Var.f114278d = 1L;
            zArr[1] = true;
            s1Var.f114279e = "";
            zArr[2] = true;
            s1Var.f114280f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            zArr[3] = true;
        }
        yz5.l lVar = this.f381913d;
        if (lVar != null) {
            lVar.mo146xb9724478(s1Var);
        }
    }
}
