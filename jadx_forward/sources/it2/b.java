package it2;

/* loaded from: classes3.dex */
public final class b implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f376034d;

    public b(java.lang.ref.WeakReference rPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rPlugin, "rPlugin");
        this.f376034d = rPlugin;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String giftId = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomGiftResourceDownloadListener", giftId + " download success:" + booleanValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm) this.f376034d.get();
        if (hmVar != null && booleanValue) {
            d75.b.g(new it2.a(hmVar));
        }
        return jz5.f0.f384359a;
    }
}
