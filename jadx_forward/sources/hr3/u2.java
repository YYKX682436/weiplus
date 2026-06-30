package hr3;

/* loaded from: classes8.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365574d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797.f235207z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365574d;
        activityC16844x18232797.getClass();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(contact.d1()) || contact.I1 == 0) {
            item.f439496q = pr3.f.f439506f;
        } else {
            java.lang.String Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(contact.Q0(), "openim_intro_desc", j41.a0.TYPE_WORDING, 0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16844x18232797.mo55332x76847179();
            ((ke0.e) xVar).getClass();
            item.f439489g = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, Vi);
            java.lang.String Vi2 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(contact.Q0(), "openim_intro_url", j41.a0.TYPE_URL, 0);
            if (!android.text.TextUtils.isEmpty(Vi2)) {
                item.f439499t = new hr3.d2(activityC16844x18232797, Vi2, contact, Vi);
            }
        }
        return jz5.f0.f384359a;
    }
}
