package dk2;

/* loaded from: classes3.dex */
public final class k1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f315208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315209b;

    public k1(yz5.r rVar, dk2.r4 r4Var) {
        this.f315208a = rVar;
        this.f315209b = r4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.x71 x71Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (x71Var = (r45.x71) fVar.f152151d) != null) {
            dk2.r4 r4Var = this.f315209b;
            mm2.f5 f5Var = (mm2.f5) r4Var.m(mm2.f5.class);
            java.util.ArrayList arrayList = f5Var.f410557f;
            arrayList.clear();
            arrayList.addAll(x71Var.m75941xfb821914(1));
            java.util.ArrayList arrayList2 = f5Var.f410559h;
            arrayList2.clear();
            arrayList2.addAll(x71Var.m75941xfb821914(3));
            f5Var.f410560i = x71Var.m75939xb282bd08(5);
            f5Var.f410561m = x71Var.m75939xb282bd08(6);
            f5Var.f410558g = (r45.xn1) x71Var.m75936x14adae67(7);
            java.lang.String m75945x2fec8307 = x71Var.m75945x2fec8307(13);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            f5Var.f410562n = m75945x2fec8307;
            f5Var.f410563o = x71Var.m75939xb282bd08(19);
            ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.set(1, java.lang.Integer.valueOf(x71Var.m75939xb282bd08(5)));
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410420t4 = x71Var.m75939xb282bd08(9);
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410426u4 = x71Var.m75939xb282bd08(10);
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410371l5.clear();
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410371l5.addAll(x71Var.m75941xfb821914(11));
            if (!zl2.r4.f555483a.w1()) {
                mm2.f5 f5Var2 = (mm2.f5) r4Var.m(mm2.f5.class);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("online member enableComment:");
                r45.xn1 xn1Var = ((mm2.f5) f5Var2.m147920xbba4bfc0(mm2.f5.class)).f410558g;
                sb6.append(xn1Var != null ? java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(1)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveOnlineMemberSlice", sb6.toString());
                r45.xn1 xn1Var2 = ((mm2.f5) f5Var2.m147920xbba4bfc0(mm2.f5.class)).f410558g;
                if (xn1Var2 != null) {
                    if (xn1Var2.m75939xb282bd08(1) == 1) {
                        ((mm2.c1) f5Var2.m147920xbba4bfc0(mm2.c1.class)).f410429v = true;
                    } else if (xn1Var2.m75939xb282bd08(1) == 0) {
                        ((mm2.c1) f5Var2.m147920xbba4bfc0(mm2.c1.class)).f410429v = false;
                    }
                }
            }
        }
        yz5.r rVar = this.f315208a;
        if (rVar == null) {
            return null;
        }
        rVar.C(java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a), fVar.f152150c, fVar.f152151d);
        return jz5.f0.f384359a;
    }
}
