package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class l implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70466d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f70467e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f70468f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f70469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70470h;

    public l(com.tencent.mm.modelavatar.r rVar, com.tencent.mm.modelavatar.r0 r0Var, byte[] bArr, boolean z17) {
        this.f70470h = rVar;
        this.f70466d = r0Var;
        this.f70467e = bArr;
        this.f70468f = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        boolean z17 = this.f70468f;
        byte[] bArr = this.f70467e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(138, 51);
            bArr = com.tencent.mm.jni.utils.UtilsJni.DecryptAvatar(bArr);
            if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                g0Var.A(138, 52);
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt output empty");
                return false;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.y1.h(bArr)) {
            this.f70469g = bArr;
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: hevc to pic");
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.A(138, 53);
        byte[] bj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(bArr, 3);
        this.f70469g = bj6;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bj6)) {
            return true;
        }
        g0Var2.A(138, 54);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: output is empty");
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.f70469g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: onPostExecute output is empty");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "DecryptAvatar: post to save length is %s", java.lang.Integer.valueOf(this.f70469g.length));
        com.tencent.mm.modelavatar.r0 r0Var = this.f70466d;
        byte[] bArr = this.f70469g;
        com.tencent.mm.modelavatar.r rVar = this.f70470h;
        com.tencent.mm.modelavatar.p pVar = new com.tencent.mm.modelavatar.p(rVar, r0Var, bArr);
        int i17 = com.tencent.mm.modelavatar.r.f70520o;
        rVar.h(pVar);
        return true;
    }
}
