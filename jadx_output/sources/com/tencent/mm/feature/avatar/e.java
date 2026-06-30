package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.avatar.f f65147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.feature.avatar.f fVar, java.lang.String str) {
        super(1);
        this.f65147d = fVar;
        this.f65148e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String str = this.f65147d.f65150a;
        java.util.Objects.toString(bitmap);
        if (kotlin.jvm.internal.o.b(this.f65147d.f65151b, this.f65148e)) {
            this.f65147d.f65152c = bitmap;
            this.f65147d.invalidateSelf();
        } else {
            com.tencent.mars.xlog.Log.i(this.f65147d.f65150a, "invalidateLogic#tryUpdateAvatarAsync, drawable already reused");
        }
        return jz5.f0.f302826a;
    }
}
