package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f f146680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f fVar, java.lang.String str) {
        super(1);
        this.f146680d = fVar;
        this.f146681e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String str = this.f146680d.f146683a;
        java.util.Objects.toString(bitmap);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146680d.f146684b, this.f146681e)) {
            this.f146680d.f146685c = bitmap;
            this.f146680d.invalidateSelf();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146680d.f146683a, "invalidateLogic#tryUpdateAvatarAsync, drawable already reused");
        }
        return jz5.f0.f384359a;
    }
}
