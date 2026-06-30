package hr3;

/* loaded from: classes8.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365245d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        this.f365245d.getClass();
        yq3.v vVar = (yq3.v) contact;
        java.lang.String f17 = vVar.f();
        if (f17 == null) {
            f17 = "";
        }
        item.f439489g = f17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init desc: ");
        java.lang.String f18 = vVar.f();
        sb6.append((java.lang.Object) (f18 != null ? f18 : ""));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", sb6.toString());
        return jz5.f0.f384359a;
    }
}
