package hr3;

/* loaded from: classes8.dex */
public final class k4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365244d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        yq3.v vVar = (yq3.v) contact;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.h(), c01.z1.r()) && vVar.k()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365244d;
            activityC16846x5788f028.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.h(), c01.z1.r())) {
                item.f439496q = pr3.f.f439506f;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
                int i18 = z3Var != null ? z3Var.I : 0;
                item.f439488f = i18 != 1 ? i18 != 2 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572491bd2 : com.p314xaae8f345.mm.R.C30867xcad56011.bcx : com.p314xaae8f345.mm.R.C30867xcad56011.bcy;
                p13.u uVar = new p13.u();
                uVar.f432674c = vVar.h();
                uVar.f432684m = new hr3.z3(item, activityC16846x5788f028, vVar);
                uVar.f432685n = activityC16846x5788f028.f235245x;
                uVar.f432673b = 5;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
