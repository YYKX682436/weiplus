package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class qq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qq f214437d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qq();

    public qq() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        android.content.res.Resources resources2;
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        if (booleanValue) {
            if (booleanValue2) {
                resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.e7p;
            } else {
                resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.e7n;
            }
            java.lang.String string = resources2.getString(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oq.f214334a);
        } else {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(string2);
            if (booleanValue2) {
                resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.e7i;
            } else {
                resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.e7o;
            }
            sb6.append(resources.getString(i17));
            db5.t7.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, sb6.toString(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pq.f214389a);
        }
        return jz5.f0.f384359a;
    }
}
