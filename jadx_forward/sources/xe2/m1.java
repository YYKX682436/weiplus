package xe2;

/* loaded from: classes3.dex */
public final class m1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535415c = "LiveTopDescInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.jk1 jk1Var = new r45.jk1();
        if (ch1Var != null && (m75934xbce7f2f = ch1Var.m75934xbce7f2f(4)) != null) {
            r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
            java.lang.String str = null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c(), c01.z1.r())) {
                r45.xn1 xn1Var2 = (r45.xn1) ch1Var.m75936x14adae67(13);
                if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                    str = c19782x23db1cfa.m76197x6c03c64c();
                }
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, xy2.c.e(context))) {
                    jk1Var.mo11468x92b714fd(m75934xbce7f2f.g());
                    r45.t12 t12Var = new r45.t12();
                    t12Var.set(8, new r45.xn1());
                    r45.xn1 xn1Var3 = (r45.xn1) t12Var.m75936x14adae67(8);
                    if (xn1Var3 != null && (m75941xfb821914 = xn1Var3.m75941xfb821914(11)) != null) {
                        r45.yl1 yl1Var = new r45.yl1();
                        yl1Var.set(0, -10001);
                        yl1Var.set(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.npz));
                        m75941xfb821914.add(yl1Var);
                    }
                    t12Var.set(0, jk1Var.m75945x2fec8307(0));
                    t12Var.set(2, jk1Var.m75945x2fec8307(1));
                    gk2.e eVar = this.f526800a;
                    ((mm2.x4) eVar.a(mm2.x4.class)).f411064i.clear();
                    ((mm2.x4) eVar.a(mm2.x4.class)).f411064i.add(t12Var);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535415c, "receiver promote msg: " + pm0.b0.g(jk1Var));
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20121};
    }
}
