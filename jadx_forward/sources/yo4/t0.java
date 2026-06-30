package yo4;

/* loaded from: classes10.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f) {
        super(2);
        this.f545845d = c18795x62fd7c3f;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        if (intValue != intValue2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545845d;
            java.lang.Object obj3 = c18795x62fd7c3f.G.f257263d.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = c18795x62fd7c3f.G;
            u0Var.f257263d.remove(intValue);
            u0Var.f257263d.add(intValue2, (java.lang.String) obj3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoPluginLayout", "user change image index from:" + intValue + " to:" + intValue2);
        }
        return jz5.f0.f384359a;
    }
}
