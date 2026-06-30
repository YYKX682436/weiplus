package cj2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f41858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj2.h f41859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, cj2.h hVar) {
        super(0);
        this.f41858d = bitmap;
        this.f41859e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f41858d;
        if (bitmap != null) {
            cj2.h hVar = this.f41859e;
            hVar.f41868g.f262410d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(hVar.getContext().getResources(), bitmap));
        }
        return jz5.f0.f302826a;
    }
}
