package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.avatar.f f65143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f65145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.feature.avatar.f fVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f65143d = fVar;
        this.f65144e = str;
        this.f65145f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String avatarPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(avatarPath, "avatarPath");
        com.tencent.mars.xlog.Log.i(this.f65143d.f65150a, "onAvatarPathGot, username: " + this.f65144e + ", avatarPath: " + avatarPath);
        android.graphics.Bitmap bitmap = null;
        if (avatarPath.length() > 0) {
            android.graphics.Bitmap bitmap2 = com.tencent.mm.feature.avatar.f.f65149f;
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap h17 = com.tencent.mm.modelavatar.z.h(avatarPath, null, false);
            if (h17 != null) {
                bitmap = com.tencent.mm.sdk.platformtools.x.s0(h17, true, h17.getWidth() * 0.1f);
            }
        }
        ym5.a1.f(new com.tencent.mm.feature.avatar.c(this.f65145f, bitmap));
        return jz5.f0.f302826a;
    }
}
