package hr3;

/* loaded from: classes8.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365321d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contact.d1(), c01.z1.r()) && contact.r2()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797.f235207z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365321d;
            activityC16844x18232797.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contact.d1(), c01.z1.r())) {
                item.f439496q = pr3.f.f439506f;
            } else {
                int i18 = contact.I;
                item.f439488f = i18 != 1 ? i18 != 2 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572491bd2 : com.p314xaae8f345.mm.R.C30867xcad56011.bcx : com.p314xaae8f345.mm.R.C30867xcad56011.bcy;
                p13.u uVar = new p13.u();
                uVar.f432674c = contact.d1();
                uVar.f432684m = new hr3.a2(item, activityC16844x18232797, contact);
                uVar.f432685n = activityC16844x18232797.f235226y;
                uVar.f432673b = 5;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
