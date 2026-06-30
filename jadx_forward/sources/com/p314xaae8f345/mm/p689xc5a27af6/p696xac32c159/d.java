package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f f146676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f146678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f fVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f146676d = fVar;
        this.f146677e = str;
        this.f146678f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String avatarPath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarPath, "avatarPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146676d.f146683a, "onAvatarPathGot, username: " + this.f146677e + ", avatarPath: " + avatarPath);
        android.graphics.Bitmap bitmap = null;
        if (avatarPath.length() > 0) {
            android.graphics.Bitmap bitmap2 = com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f.f146682f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap h17 = com.p314xaae8f345.mm.p943x351df9c2.z.h(avatarPath, null, false);
            if (h17 != null) {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(h17, true, h17.getWidth() * 0.1f);
            }
        }
        ym5.a1.f(new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.c(this.f146678f, bitmap));
        return jz5.f0.f384359a;
    }
}
