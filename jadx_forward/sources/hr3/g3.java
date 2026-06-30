package hr3;

/* loaded from: classes8.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365106d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        java.lang.String w07 = contact.w0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365106d;
        if (w07 == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = activityC16844x18232797.f235211g;
            w07 = yaVar != null ? yaVar.f66692x4854b29d : null;
            if (w07 == null) {
                w07 = "";
            }
        }
        item.f439489g = w07;
        if (r26.n0.N(w07)) {
            item.f439489g = contact.f2();
            item.f439493n = java.lang.Integer.valueOf(i65.a.d(activityC16844x18232797, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        } else {
            item.f439493n = java.lang.Integer.valueOf(i65.a.d(activityC16844x18232797, com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        }
        return jz5.f0.f384359a;
    }
}
