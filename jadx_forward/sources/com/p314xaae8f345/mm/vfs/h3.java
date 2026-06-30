package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class h3 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294505e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22751xe388182 f294507g;

    public h3(com.p314xaae8f345.mm.vfs.C22751xe388182 c22751xe388182, com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294507g = c22751xe388182;
        this.f294505e = q2Var;
        this.f294506f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294506f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294505e;
    }

    public final boolean O(com.p314xaae8f345.mm.vfs.x1 x1Var) {
        if (!com.p314xaae8f345.mm.vfs.C22751xe388182.f294246f || java.lang.System.currentTimeMillis() - x1Var.f294768e <= 86400000) {
            return false;
        }
        boolean b17 = x1Var.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.ImageGCFileSystem", "deleteFile, fe = " + x1Var.f294764a + ", ret = " + b17 + ", modifiedTime = " + x1Var.f294768e);
        return b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r56) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.h3.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "imageGC <- " + this.f294505e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294507g;
    }
}
