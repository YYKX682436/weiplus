package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIGCSubmitRequest */
/* loaded from: classes5.dex */
public class C3995xe72952b6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129383a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129384b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129385c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3991xbd360e62[] f129386d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f129387e;

    public C3995xe72952b6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        this(str, str2, str3, objArr, java.util.Collections.emptyMap());
    }

    /* renamed from: toString */
    public java.lang.String m32505x9616526c() {
        return "MJAIGCSubmitRequest{requestID='" + this.f129383a + "', templateID='" + this.f129384b + "', aigcServiceID='" + this.f129385c + "', assets=" + this.f129386d + '}';
    }

    public C3995xe72952b6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr, java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3991xbd360e62[] c3991xbd360e62Arr;
        this.f129383a = str;
        this.f129384b = str2;
        this.f129385c = str3;
        if (objArr == null) {
            c3991xbd360e62Arr = null;
        } else {
            c3991xbd360e62Arr = new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3991xbd360e62[objArr.length];
            for (int i17 = 0; i17 < objArr.length; i17++) {
                c3991xbd360e62Arr[i17] = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3991xbd360e62) objArr[i17];
            }
        }
        this.f129386d = c3991xbd360e62Arr;
        this.f129387e = map == null ? java.util.Collections.emptyMap() : map;
    }
}
