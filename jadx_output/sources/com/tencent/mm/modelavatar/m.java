package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class m implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.r0 f70477d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f70478e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70479f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70480g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70481h;

    public m(com.tencent.mm.modelavatar.r rVar, com.tencent.mm.modelavatar.r0 r0Var) {
        this.f70481h = rVar;
        this.f70477d = null;
        this.f70477d = r0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:193:0x016c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x068d A[Catch: Exception -> 0x0688, TryCatch #37 {Exception -> 0x0688, blocks: (B:67:0x0684, B:58:0x068d, B:59:0x0690), top: B:66:0x0684 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0684 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05db  */
    @Override // com.tencent.mm.sdk.platformtools.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.m.a():boolean");
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mm.storage.z3 n17;
        com.tencent.mm.modelavatar.r0 r0Var = this.f70477d;
        if (r0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(r0Var.e())) {
            boolean M0 = com.tencent.mm.sdk.platformtools.t8.M0(this.f70478e);
            com.tencent.mm.modelavatar.r rVar = this.f70481h;
            if (M0) {
                rVar.f70522e.remove(r0Var.e());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(138L, 10L, 1L, true);
                if (this.f70480g && (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r0Var.e(), true)) != null && n17.X4()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HttpGetAvatar", "try getContact to fetch new avatar imgUrl, username: %s", n17.d1());
                    c01.n8.a().c(n17.d1(), 11);
                    ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n17.d1());
                }
                return false;
            }
            c01.s8 s8Var = c01.n8.f37348a;
            if (s8Var != null) {
                ((com.tencent.mm.modelstat.s0) s8Var).a(this.f70478e.length, 0, 0);
            }
            rVar.h(new com.tencent.mm.modelavatar.l(rVar, r0Var, this.f70478e, this.f70479f));
        }
        return false;
    }
}
