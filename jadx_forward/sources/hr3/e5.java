package hr3;

/* loaded from: classes8.dex */
public final class e5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365044d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        yq3.v vVar = (yq3.v) contact;
        java.lang.String c17 = vVar.c();
        item.f439489g = c17;
        boolean z17 = c17 == null || r26.n0.N(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365044d;
        if (z17) {
            item.f439489g = vVar.d();
            item.f439493n = java.lang.Integer.valueOf(i65.a.d(activityC16846x5788f028, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        } else {
            item.f439493n = java.lang.Integer.valueOf(i65.a.d(activityC16846x5788f028, com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
        }
        return jz5.f0.f384359a;
    }
}
