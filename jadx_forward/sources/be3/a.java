package be3;

/* loaded from: classes.dex */
public final class a implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ be3.b f101088d;

    public a(be3.b bVar) {
        this.f101088d = bVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        java.util.HashMap hashMap = (java.util.HashMap) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        be3.b bVar = this.f101088d;
        if (intValue != 0) {
            bVar.s().mo146xb9724478(bVar.h(2, "offsetInfo is null"));
        } else if (hashMap != null) {
            java.lang.Object obj4 = hashMap.get("offsetheight");
            java.lang.Double d17 = obj4 instanceof java.lang.Double ? (java.lang.Double) obj4 : null;
            double doubleValue = d17 != null ? d17.doubleValue() : 0.0d;
            java.lang.Object obj5 = hashMap.get("offsettop");
            java.lang.Double d18 = obj5 instanceof java.lang.Double ? (java.lang.Double) obj5 : null;
            double doubleValue2 = d18 != null ? d18.doubleValue() : 0.0d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiGetFrameSetOffsetInfo", "getFrameSetOffsetTop listViewHeight:" + doubleValue + ", offsetTop:" + doubleValue2);
            yz5.l s17 = bVar.s();
            lc3.a0 k17 = bVar.k();
            k17.put("offsetHeight", doubleValue);
            k17.put("offsetTop", doubleValue2);
            s17.mo146xb9724478(k17);
        }
        return jz5.f0.f384359a;
    }
}
