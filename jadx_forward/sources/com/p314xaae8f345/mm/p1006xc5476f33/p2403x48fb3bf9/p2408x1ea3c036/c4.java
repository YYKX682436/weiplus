package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f263691a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f263692b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f263693c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f263694d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.f263694d = e0Var;
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf;
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (indexOf = str.indexOf("#")) >= 0) ? str.substring(0, indexOf) : str;
    }

    public java.lang.String b() {
        java.lang.String u17 = this.f263694d.u();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
            return null;
        }
        return (java.lang.String) this.f263691a.get(a(u17));
    }
}
