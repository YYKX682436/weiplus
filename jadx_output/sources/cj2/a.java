package cj2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f41855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj2.h f41856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.graphics.Bitmap bitmap, cj2.h hVar) {
        super(0);
        this.f41855d = bitmap;
        this.f41856e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f41855d;
        if (bitmap != null) {
            cj2.h hVar = this.f41856e;
            hVar.f41868g.f262410d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(hVar.getContext().getResources(), bitmap));
        }
        return jz5.f0.f302826a;
    }
}
