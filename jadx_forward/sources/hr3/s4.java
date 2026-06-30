package hr3;

/* loaded from: classes8.dex */
public final class s4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365500d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365500d;
        activityC16846x5788f028.getClass();
        yq3.v vVar = (yq3.v) contact;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(vVar.h())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
            java.lang.Integer valueOf = z3Var != null ? java.lang.Integer.valueOf(z3Var.I1) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = vVar.f546068f;
                java.lang.String Vi = ((l41.q2) b0Var).Vi(z3Var2 != null ? z3Var2.Q0() : null, "openim_intro_desc", j41.a0.TYPE_WORDING, 0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16846x5788f028.mo55332x76847179();
                ((ke0.e) xVar).getClass();
                item.f439489g = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, Vi);
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = vVar.f546068f;
                java.lang.String Vi2 = ((l41.q2) b0Var2).Vi(z3Var3 != null ? z3Var3.Q0() : null, "openim_intro_url", j41.a0.TYPE_URL, 0);
                if (!android.text.TextUtils.isEmpty(Vi2)) {
                    item.f439499t = new hr3.c4(activityC16846x5788f028, Vi2, contact, Vi);
                }
                return jz5.f0.f384359a;
            }
        }
        item.f439496q = pr3.f.f439506f;
        return jz5.f0.f384359a;
    }
}
