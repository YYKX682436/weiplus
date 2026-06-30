package hr3;

/* loaded from: classes8.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365072d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 it = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797.f235207z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365072d;
        activityC16844x18232797.getClass();
        java.lang.Object l17 = gm0.j1.u().c().l(9, null);
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null);
        activityC16844x18232797.f235221t = activityC16844x18232797.getIntent().getLongExtra("Contact_Uin", 0L);
        java.lang.String stringExtra = activityC16844x18232797.getIntent().getStringExtra("Contact_QQNick");
        activityC16844x18232797.f235222u = stringExtra;
        if (activityC16844x18232797.f235221t != 0 && q17 != 0) {
            if (stringExtra != null) {
                if (stringExtra.length() == 0) {
                    long j17 = activityC16844x18232797.f235221t;
                    r61.x1 Ri = m61.k.Ri();
                    r61.w1 g17 = Ri != null ? Ri.g(j17) : null;
                    r61.w1 w1Var = g17 != null ? g17 : null;
                    if (w1Var != null) {
                        activityC16844x18232797.f235222u = w1Var.c();
                    }
                }
            }
            java.lang.String str = activityC16844x18232797.f235222u;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str + ' ' + new kk.v(activityC16844x18232797.f235221t).longValue();
            item.f439496q = pr3.f.f439505e;
            item.f439489g = str2;
            item.f439499t = hr3.o3.f365381d;
        }
        item.f439496q = pr3.f.f439506f;
        return jz5.f0.f384359a;
    }
}
