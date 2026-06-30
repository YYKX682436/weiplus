package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441;

/* renamed from: com.google.android.gms.common.server.response.SafeParcelResponse */
/* loaded from: classes13.dex */
public class C1978x7343ec77 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1977x5d6c1755 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77> f5989x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zaq();
    private final int zaa;
    private final android.os.Parcel zab;
    private final int zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zad;
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    public C1978x7343ec77(int i17, android.os.Parcel parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar) {
        this.zaa = i17;
        this.zab = (android.os.Parcel) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    /* renamed from: from */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 & com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77 m18486x3017aa(T t17) {
        java.lang.String str = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(t17.getClass().getCanonicalName());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan(t17.getClass());
        zaF(zanVar, t17);
        zanVar.zac();
        zanVar.zad();
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77(t17, zanVar, str);
    }

    private static void zaF(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 abstractC1975xf0edc3e5) {
        java.lang.Class<?> cls = abstractC1975xf0edc3e5.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9 = abstractC1975xf0edc3e5.mo17356xb4d428c9();
        zanVar.zae(cls, mo17356xb4d428c9);
        java.util.Iterator<java.lang.String> it = mo17356xb4d428c9.keySet().iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field = mo17356xb4d428c9.get(it.next());
            java.lang.Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5) cls2.newInstance());
                } catch (java.lang.IllegalAccessException e17) {
                    throw new java.lang.IllegalStateException("Could not access object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(field.zag)).getCanonicalName())), e17);
                } catch (java.lang.InstantiationException e18) {
                    throw new java.lang.IllegalStateException("Could not instantiate an object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(field.zag)).getCanonicalName())), e18);
                }
            }
        }
    }

    private final void zaG(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        if (field.zaf == -1) {
            throw new java.lang.IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        android.os.Parcel parcel = this.zab;
        if (parcel == null) {
            throw new java.lang.IllegalStateException("Internal Parcel object is null.");
        }
        int i17 = this.zaf;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
            this.zaf = 1;
        }
    }

    private final void zaH(java.lang.StringBuilder sb6, java.util.Map map, android.os.Parcel parcel) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sparseArray.put(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field) entry.getValue()).m18478x1fb0b8f(), entry);
        }
        sb6.append('{');
        int m18304xfa7642e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18304xfa7642e2(parcel);
        boolean z17 = false;
        while (parcel.dataPosition() < m18304xfa7642e2) {
            int m18293xce8f1fc3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18293xce8f1fc3(parcel);
            java.util.Map.Entry entry2 = (java.util.Map.Entry) sparseArray.get(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18284xa778f7f(m18293xce8f1fc3));
            if (entry2 != null) {
                if (z17) {
                    sb6.append(",");
                }
                java.lang.String str = (java.lang.String) entry2.getKey();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field) entry2.getValue();
                sb6.append("\"");
                sb6.append(str);
                sb6.append("\":");
                if (field.zaj()) {
                    int i17 = field.zac;
                    switch (i17) {
                        case 0:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3))));
                            break;
                        case 1:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18246x64856e3a(parcel, m18293xce8f1fc3)));
                            break;
                        case 2:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, java.lang.Long.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18298xcc46d932(parcel, m18293xce8f1fc3))));
                            break;
                        case 3:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, java.lang.Float.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18291xbc3e6666(parcel, m18293xce8f1fc3))));
                            break;
                        case 4:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, java.lang.Double.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18289xc851b907(parcel, m18293xce8f1fc3))));
                            break;
                        case 5:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18244x4bbd004d(parcel, m18293xce8f1fc3)));
                            break;
                        case 6:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, java.lang.Boolean.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18285xd7c8d5b2(parcel, m18293xce8f1fc3))));
                            break;
                        case 7:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18251x2cc26095(parcel, m18293xce8f1fc3)));
                            break;
                        case 10:
                            android.os.Bundle m18250x3e94109e = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18250x3e94109e(parcel, m18293xce8f1fc3);
                            java.util.HashMap hashMap = new java.util.HashMap();
                            for (java.lang.String str2 : m18250x3e94109e.keySet()) {
                                hashMap.put(str2, (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(m18250x3e94109e.getString(str2)));
                            }
                            zaJ(sb6, field, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.zaD(field, hashMap));
                            break;
                        case 11:
                            throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new java.lang.IllegalArgumentException("Unknown field out type = " + i17);
                    }
                } else if (field.zad) {
                    sb6.append("[");
                    switch (field.zac) {
                        case 0:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18520xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18264x5701d0c6(parcel, m18293xce8f1fc3));
                            break;
                        case 1:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18522xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18247xc271e83f(parcel, m18293xce8f1fc3));
                            break;
                        case 2:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18521xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18266xaea743a1(parcel, m18293xce8f1fc3));
                            break;
                        case 3:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18519xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18258x2e8beb79(parcel, m18293xce8f1fc3));
                            break;
                        case 4:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18518xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18255xcb0a926c(parcel, m18293xce8f1fc3));
                            break;
                        case 5:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18522xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18245x991aa0c(parcel, m18293xce8f1fc3));
                            break;
                        case 6:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18523xd86e3dba(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18248x372eca2d(parcel, m18293xce8f1fc3));
                            break;
                        case 7:
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18524xa6ac8369(sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18277xd171562c(parcel, m18293xce8f1fc3));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new java.lang.UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            android.os.Parcel[] m18269xae78f134 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18269xae78f134(parcel, m18293xce8f1fc3);
                            int length = m18269xae78f134.length;
                            for (int i18 = 0; i18 < length; i18++) {
                                if (i18 > 0) {
                                    sb6.append(",");
                                }
                                m18269xae78f134[i18].setDataPosition(0);
                                zaH(sb6, field.zah(), m18269xae78f134[i18]);
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out.");
                    }
                    sb6.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18295x40655679(parcel, m18293xce8f1fc3));
                            break;
                        case 1:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18246x64856e3a(parcel, m18293xce8f1fc3));
                            break;
                        case 2:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18298xcc46d932(parcel, m18293xce8f1fc3));
                            break;
                        case 3:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18291xbc3e6666(parcel, m18293xce8f1fc3));
                            break;
                        case 4:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18289xc851b907(parcel, m18293xce8f1fc3));
                            break;
                        case 5:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18244x4bbd004d(parcel, m18293xce8f1fc3));
                            break;
                        case 6:
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18285xd7c8d5b2(parcel, m18293xce8f1fc3));
                            break;
                        case 7:
                            java.lang.String m18276x5b8a402d = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18276x5b8a402d(parcel, m18293xce8f1fc3);
                            sb6.append("\"");
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2002x365c2489.m18589x77baa7f2(m18276x5b8a402d));
                            sb6.append("\"");
                            break;
                        case 8:
                            byte[] m18251x2cc26095 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18251x2cc26095(parcel, m18293xce8f1fc3);
                            sb6.append("\"");
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18528xb2963e16(m18251x2cc26095));
                            sb6.append("\"");
                            break;
                        case 9:
                            byte[] m18251x2cc260952 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18251x2cc26095(parcel, m18293xce8f1fc3);
                            sb6.append("\"");
                            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18529x27f51ea6(m18251x2cc260952));
                            sb6.append("\"");
                            break;
                        case 10:
                            android.os.Bundle m18250x3e94109e2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18250x3e94109e(parcel, m18293xce8f1fc3);
                            java.util.Set<java.lang.String> keySet = m18250x3e94109e2.keySet();
                            sb6.append("{");
                            boolean z18 = true;
                            for (java.lang.String str3 : keySet) {
                                if (!z18) {
                                    sb6.append(",");
                                }
                                sb6.append("\"");
                                sb6.append(str3);
                                sb6.append("\":\"");
                                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2002x365c2489.m18589x77baa7f2(m18250x3e94109e2.getString(str3)));
                                sb6.append("\"");
                                z18 = false;
                            }
                            sb6.append("}");
                            break;
                        case 11:
                            android.os.Parcel m18268x555fe025 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.m18268x555fe025(parcel, m18293xce8f1fc3);
                            m18268x555fe025.setDataPosition(0);
                            zaH(sb6, field.zah(), m18268x555fe025);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out");
                    }
                }
                z17 = true;
            }
        }
        if (parcel.dataPosition() != m18304xfa7642e2) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException("Overread allowed size end=" + m18304xfa7642e2, parcel);
        }
        sb6.append('}');
    }

    private static final void zaI(java.lang.StringBuilder sb6, int i17, java.lang.Object obj) {
        switch (i17) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb6.append(obj);
                return;
            case 7:
                sb6.append("\"");
                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2002x365c2489.m18589x77baa7f2(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj).toString()));
                sb6.append("\"");
                return;
            case 8:
                sb6.append("\"");
                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18528xb2963e16((byte[]) obj));
                sb6.append("\"");
                return;
            case 9:
                sb6.append("\"");
                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18529x27f51ea6((byte[]) obj));
                sb6.append("\"");
                return;
            case 10:
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2003xdf9d8d5.m18591x3956df8f(sb6, (java.util.HashMap) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj));
                return;
            case 11:
                throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new java.lang.IllegalArgumentException("Unknown type = " + i17);
        }
    }

    private static final void zaJ(java.lang.StringBuilder sb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.Object obj) {
        if (!field.zab) {
            zaI(sb6, field.zaa, obj);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        sb6.append("[");
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            zaI(sb6, field.zaa, arrayList.get(i17));
        }
        sb6.append("]");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: addConcreteTypeArrayInternal */
    public final <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17354x74407976(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        zaG(field);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77) arrayList.get(i17)).zaE());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18347x56d92186(this.zab, field.m18478x1fb0b8f(), arrayList2, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: addConcreteTypeInternal */
    public final <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> void mo17355xcd78397d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, T t17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18345x4e02a0c8(this.zab, field.m18478x1fb0b8f(), ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1978x7343ec77) t17).zaE(), true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getFieldMappings */
    public final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zae));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1977x5d6c1755, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getValueObject */
    public final java.lang.Object mo18459x7d17ceda(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1977x5d6c1755, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isPrimitiveFieldSet */
    public final boolean mo18460x9e40cf05(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setBooleanInternal */
    public final void mo18461x43735a43(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, boolean z17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(this.zab, field.m18478x1fb0b8f(), z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setDecodedBytesInternal */
    public final void mo17364x4ac0c734(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18317x3071b912(this.zab, field.m18478x1fb0b8f(), bArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setIntegerInternal */
    public final void mo17365x9549f959(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, int i17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(this.zab, field.m18478x1fb0b8f(), i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setLongInternal */
    public final void mo18462x2a4842db(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, long j17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(this.zab, field.m18478x1fb0b8f(), j17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringInternal */
    public final void mo17362x84691ef0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(this.zab, field.m18478x1fb0b8f(), str2, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringMapInternal */
    public final void mo18463x3a0d8b26(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        zaG(field);
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str2 : ((java.util.Map) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(this.zab, field.m18478x1fb0b8f(), bundle, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: setStringsInternal */
    public final void mo17360x33e7969d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = arrayList.get(i17);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18356xa6ac8369(this.zab, field.m18478x1fb0b8f(), strArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: toString */
    public final java.lang.String mo18464x9616526c() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.zad, "Cannot convert to JSON on client side.");
        android.os.Parcel zaE = zaE();
        zaE.setDataPosition(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        zaH(sb6, (java.util.Map) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zad.zab((java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zae))), zaE);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18345x4e02a0c8(parcel, 2, zaE(), false);
        int i19 = this.zac;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, i19 != 0 ? i19 != 1 ? this.zad : this.zad : null, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final android.os.Parcel zaE() {
        int i17 = this.zaf;
        if (i17 == 0) {
            int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(this.zab);
            this.zag = m18305xd0e7ddf5;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(this.zab, m18305xd0e7ddf5);
            this.zaf = 2;
        } else if (i17 == 1) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18307xbdf8b770(this.zab, field.m18478x1fb0b8f(), bigDecimal, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[size];
        for (int i17 = 0; i17 < size; i17++) {
            bigDecimalArr[i17] = (java.math.BigDecimal) arrayList.get(i17);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18308x46c9f0c9(this.zab, field.m18478x1fb0b8f(), bigDecimalArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.math.BigInteger bigInteger) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18309xd6c1255d(this.zab, field.m18478x1fb0b8f(), bigInteger, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[size];
        for (int i17 = 0; i17 < size; i17++) {
            bigIntegerArr[i17] = (java.math.BigInteger) arrayList.get(i17);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18310xffaa2efc(this.zab, field.m18478x1fb0b8f(), bigIntegerArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zak(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i17 = 0; i17 < size; i17++) {
            zArr[i17] = ((java.lang.Boolean) arrayList.get(i17)).booleanValue();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18312x9594490(this.zab, field.m18478x1fb0b8f(), zArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, double d17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18322x3a4f1c90(this.zab, field.m18478x1fb0b8f(), d17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        double[] dArr = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            dArr[i17] = ((java.lang.Double) arrayList.get(i17)).doubleValue();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18323xa045bfa9(this.zab, field.m18478x1fb0b8f(), dArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zar(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, float f17) {
        zaG(field);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18327xd8b1edbd(this.zab, field.m18478x1fb0b8f(), f17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zat(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        float[] fArr = new float[size];
        for (int i17 = 0; i17 < size; i17++) {
            fArr[i17] = ((java.lang.Float) arrayList.get(i17)).floatValue();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18328xa0c7a29c(this.zab, field.m18478x1fb0b8f(), fArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zaw(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18337xb1f6f4a9(this.zab, field.m18478x1fb0b8f(), iArr, true);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    public final void zaz(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(arrayList)).size();
        long[] jArr = new long[size];
        for (int i17 = 0; i17 < size; i17++) {
            jArr[i17] = ((java.lang.Long) arrayList.get(i17)).longValue();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18342xb2569c1e(this.zab, field.m18478x1fb0b8f(), jArr, true);
    }

    private C1978x7343ec77(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470 interfaceC1940x58398470, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.zab = obtain;
        interfaceC1940x58398470.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zanVar);
        this.zae = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.zaf = 2;
    }

    public C1978x7343ec77(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        this.zab = android.os.Parcel.obtain();
        this.zac = 0;
        this.zad = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zanVar);
        this.zae = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.zaf = 0;
    }
}
