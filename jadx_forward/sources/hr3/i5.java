package hr3;

/* loaded from: classes8.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365181d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365181d;
        activityC16846x5788f028.getClass();
        item.f439489g = "";
        java.util.List h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.h(contact);
        if (!h17.isEmpty()) {
            item.f439489g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(h17, activityC16846x5788f028.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572457ba0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.U6(activityC16846x5788f028, item, contact, 39);
        return jz5.f0.f384359a;
    }
}
