package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes11.dex */
public class z2 implements a25.u {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2 f230302b = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2(null);

    /* renamed from: a, reason: collision with root package name */
    public vg3.z4 f230303a;

    public void a(java.lang.Object obj, int i17, int i18, r45.b50 b50Var, byte[] bArr, boolean z17, r45.cx4 cx4Var) {
        vg3.w4 w4Var = (vg3.w4) vg3.v4.f518294a.get(java.lang.Integer.valueOf(b50Var.f452063d));
        if (w4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncDoCmdExtensions", "SyncDoCmdExtension for cmd id [%s] is null.", java.lang.Integer.valueOf(b50Var.f452063d));
            return;
        }
        try {
            mm.w.e("SyncDoCmd");
            w4Var.a(obj, b50Var, i17, bArr, z17, cx4Var, this.f230303a);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncDoCmdExtensions", "docmd: parse protobuf error, " + e17.getMessage());
            throw new java.lang.RuntimeException("docmd: parse protobuf error");
        }
    }
}
