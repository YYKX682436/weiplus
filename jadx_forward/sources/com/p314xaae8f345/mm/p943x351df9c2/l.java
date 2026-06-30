package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.r0 f151999d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f152000e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f152001f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f152002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f152003h;

    public l(com.p314xaae8f345.mm.p943x351df9c2.r rVar, com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var, byte[] bArr, boolean z17) {
        this.f152003h = rVar;
        this.f151999d = r0Var;
        this.f152000e = bArr;
        this.f152001f = z17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        boolean z17 = this.f152001f;
        byte[] bArr = this.f152000e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(138, 51);
            bArr = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46293xb5d01926(bArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                g0Var.A(138, 52);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt output empty");
                return false;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(bArr)) {
            this.f152002g = bArr;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: hevc to pic");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.A(138, 53);
        byte[] bj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(bArr, 3);
        this.f152002g = bj6;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bj6)) {
            return true;
        }
        g0Var2.A(138, 54);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: output is empty");
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f152002g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: onPostExecute output is empty");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "DecryptAvatar: post to save length is %s", java.lang.Integer.valueOf(this.f152002g.length));
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = this.f151999d;
        byte[] bArr = this.f152002g;
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152003h;
        com.p314xaae8f345.mm.p943x351df9c2.p pVar = new com.p314xaae8f345.mm.p943x351df9c2.p(rVar, r0Var, bArr);
        int i17 = com.p314xaae8f345.mm.p943x351df9c2.r.f152053o;
        rVar.h(pVar);
        return true;
    }
}
