package lf4;

/* loaded from: classes4.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f399947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(lf4.j1 j1Var) {
        super(4);
        this.f399947d = j1Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        long longValue = ((java.lang.Number) obj).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String fromUser = (java.lang.String) obj3;
        java.lang.String storyOwner = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyOwner, "storyOwner");
        nf4.j L0 = ef4.w.f334001t.i().L0(longValue);
        if (L0 != null) {
            lf4.j1 j1Var = this.f399947d;
            java.util.Iterator it = j1Var.f399964u.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) it.next(), df4.b.f313571a.a(java.lang.Integer.valueOf(L0.f69403xac3be4e)))) {
                    break;
                }
                i18++;
            }
            if (i18 != -1) {
                java.lang.Object obj5 = j1Var.f399955i.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                java.util.ArrayList arrayList = (java.util.ArrayList) obj5;
                java.util.Iterator it6 = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((if4.f) it6.next()).f372779d == longValue) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
                if (i17 != -1) {
                    pm0.v.X(new lf4.h1(booleanValue, j1Var, i18, i17, arrayList, new if4.f(L0, L0.y0(), if4.g.f372783d)));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
