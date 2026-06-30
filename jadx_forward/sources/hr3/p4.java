package hr3;

/* loaded from: classes8.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f365408d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        pr3.f fVar = ((yq3.v) contact).k() ? pr3.f.f439506f : pr3.f.f439505e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        this.f365408d.W6(item, contact, fVar, false);
        return jz5.f0.f384359a;
    }
}
