package cj2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f123391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj2.h f123392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, cj2.h hVar) {
        super(0);
        this.f123391d = bitmap;
        this.f123392e = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f123391d;
        if (bitmap != null) {
            cj2.h hVar = this.f123392e;
            hVar.f123401g.f343943d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(hVar.getContext().getResources(), bitmap));
        }
        return jz5.f0.f384359a;
    }
}
