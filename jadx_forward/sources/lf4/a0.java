package lf4;

/* loaded from: classes4.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f399883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lf4.b0 b0Var) {
        super(4);
        this.f399883d = b0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        int i18;
        nf4.j L0;
        long longValue = ((java.lang.Number) obj).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String fromUser = (java.lang.String) obj3;
        java.lang.String storyOwner = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyOwner, "storyOwner");
        lf4.b0 b0Var = this.f399883d;
        if (booleanValue) {
            b0Var.getClass();
        }
        java.util.List list = b0Var.f399894n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getUserList$p(...)");
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((lf4.m) it.next()).f399971a, storyOwner)) {
                i17 = i19;
                break;
            }
            i19++;
        }
        if (i17 != -1) {
            java.util.ArrayList arrayList = ((lf4.m) b0Var.f399894n.get(i17)).f399973c;
            java.util.Iterator it6 = arrayList.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((if4.f) it6.next()).f372779d == longValue) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i18 != -1 && (L0 = ef4.w.f334001t.i().L0(longValue)) != null) {
                pm0.v.X(new lf4.z(booleanValue, this.f399883d, i17, i18, arrayList, new if4.f(L0, L0.y0(), if4.g.f372783d)));
            }
        }
        return jz5.f0.f384359a;
    }
}
