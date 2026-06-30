package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamOptionResult */
/* loaded from: classes5.dex */
public class C4014x7afd8704 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129428a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f129429b = new java.util.ArrayList();

    public C4014x7afd8704(java.lang.String str, java.lang.Object[] objArr) {
        this.f129428a = str;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                if (obj instanceof com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4031x1e637c27) {
                    this.f129429b.add((com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4031x1e637c27) obj);
                }
            }
        }
    }

    /* renamed from: getMd5String */
    public java.lang.String m32618x3c6acc79() {
        return this.f129428a;
    }

    /* renamed from: getRenderNodeStatsResults */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4031x1e637c27> m32619xa9c38e25() {
        return this.f129429b;
    }

    /* renamed from: toString */
    public java.lang.String m32620x9616526c() {
        return "MJCamOptionResult{md5String='" + this.f129428a + "', renderNodeStatsResults=" + this.f129429b + '}';
    }
}
