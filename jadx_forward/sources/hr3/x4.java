package hr3;

/* loaded from: classes8.dex */
public final class x4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365703d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365703d;
        activityC16846x5788f028.getClass();
        yq3.v vVar = (yq3.v) contact;
        if (!vVar.k() || activityC16846x5788f028.X6()) {
            item.f439489g = "";
        } else {
            g95.d dVar = g95.e.f351334a;
            java.lang.String h17 = vVar.h();
            long c17 = dVar.c(h17 != null ? h17 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "[initFriendSourceTime] time:%s", java.lang.Long.valueOf(c17));
            if (c17 > 0) {
                item.f439489g = k35.m1.d(activityC16846x5788f028.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573682fe4), c17);
            }
        }
        return jz5.f0.f384359a;
    }
}
