package lf4;

/* loaded from: classes4.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(lf4.q0 q0Var) {
        super(4);
        this.f399991d = q0Var;
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
        lf4.q0 q0Var = this.f399991d;
        java.util.Iterator it = q0Var.f399998i.iterator();
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((if4.f) it.next()).f372781f.f372767b == longValue) {
                i17 = i18;
                break;
            }
            i18++;
        }
        java.util.ArrayList arrayList = q0Var.f399998i;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            ef4.v vVar = ef4.w.f334001t;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(storyOwner, vVar.e())) {
                java.lang.Object obj5 = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                nf4.j L0 = vVar.i().L0(longValue);
                if (L0 != null) {
                    pm0.v.X(new lf4.o0(booleanValue, L0, this.f399991d, i17, new if4.f(L0, L0.y0(), if4.g.f372783d)));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
