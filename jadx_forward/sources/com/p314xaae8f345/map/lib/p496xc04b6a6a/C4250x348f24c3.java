package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.IndoorCellInfo */
/* loaded from: classes5.dex */
public final class C4250x348f24c3 {

    /* renamed from: areaIds */
    private java.util.List<java.lang.String> f16517xd38166eb = new java.util.ArrayList();

    /* renamed from: style */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3.Style f16518x68b1db1;

    /* renamed from: com.tencent.map.lib.models.IndoorCellInfo$Style */
    /* loaded from: classes5.dex */
    public static class Style {

        /* renamed from: color */
        private int f16519x5a72f63;

        public Style(int i17) {
            this.f16519x5a72f63 = i17;
        }

        /* renamed from: getColor */
        public int m35370x7444d5ad() {
            return this.f16519x5a72f63;
        }

        /* renamed from: setColor */
        public void m35371x52d2f021(int i17) {
            this.f16519x5a72f63 = i17;
        }

        /* renamed from: toString */
        public java.lang.String m35372x9616526c() {
            return "Style{color=" + java.lang.Integer.toHexString(this.f16519x5a72f63) + '}';
        }
    }

    public C4250x348f24c3(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3.Style style) {
        this.f16518x68b1db1 = style;
    }

    /* renamed from: addAreaId */
    public final void m35365xe1339289(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f16517xd38166eb.add(str);
    }

    /* renamed from: getAreaIds */
    public final java.util.List<java.lang.String> m35366x114ea2b5() {
        return this.f16517xd38166eb;
    }

    /* renamed from: getStyle */
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3.Style m35367x7528c3fb() {
        return this.f16518x68b1db1;
    }

    /* renamed from: setStyle */
    public final void m35368x53b6de6f(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3.Style style) {
        this.f16518x68b1db1 = style;
    }

    /* renamed from: toString */
    public final java.lang.String m35369x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IndoorCellInfo{areaIds=");
        sb6.append(this.f16517xd38166eb);
        sb6.append(", style=");
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3.Style style = this.f16518x68b1db1;
        sb6.append(style != null ? style.m35372x9616526c() : "null");
        sb6.append('}');
        return sb6.toString();
    }
}
