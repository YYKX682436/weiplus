package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f173188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f f173189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f173190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173191d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w0 w0Var, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f fVar, int i17, java.lang.String str) {
        this.f173188a = weakReference;
        this.f173189b = fVar;
        this.f173190c = i17;
        this.f173191d = str;
    }

    public void a(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z4 z4Var) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f173188a.get();
            if (v5Var == null) {
                return;
            }
            org.json.JSONObject put = new org.json.JSONObject().put("value", str).put("keyCode", (int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) this.f173189b.n())).m53465xfe6f04ef()).put("inputId", this.f173190c).put("cursor", i17);
            java.lang.String str2 = null;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z4.CHANGED.equals(z4Var)) {
                qc1.u uVar = new qc1.u();
                uVar.f163907f = put.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f173191d).toString();
                v5Var.i(uVar, null);
                return;
            }
            int ordinal = z4Var.ordinal();
            if (ordinal == 0) {
                str2 = "onKeyboardComplete";
            } else if (ordinal == 1) {
                str2 = "onKeyboardConfirm";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            v5Var.g(str2, put.toString());
        } catch (java.lang.Exception unused) {
        }
    }
}
