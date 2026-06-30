package hr3;

/* loaded from: classes8.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797) {
        super(2);
        this.f365760d = activityC16844x18232797;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797.f235207z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365760d;
        activityC16844x18232797.getClass();
        if (!contact.r2() || activityC16844x18232797.W6()) {
            item.f439489g = "";
        } else {
            g95.d dVar = g95.e.f351334a;
            java.lang.String d17 = contact.d1();
            long c17 = dVar.c(d17 != null ? d17 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "[initFriendSourceTime] time:%s", java.lang.Long.valueOf(c17));
            if (c17 > 0) {
                item.f439489g = k35.m1.d(activityC16844x18232797.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573682fe4), c17);
            }
        }
        return jz5.f0.f384359a;
    }
}
