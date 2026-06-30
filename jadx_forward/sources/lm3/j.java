package lm3;

/* loaded from: classes3.dex */
public final class j implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f401024b;

    public j(lm3.b0 b0Var, android.widget.ImageView imageView) {
        this.f401023a = b0Var;
        this.f401024b = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if ((bVar != null ? bVar.f441067d : null) == null || bVar.f441067d.isRecycled()) {
            return;
        }
        um5.d dVar = new um5.d();
        android.graphics.Bitmap bitmap = bVar.f441067d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "bitmap");
        dVar.b(bitmap);
        lm3.b0 b0Var = this.f401023a;
        int B = i65.a.B(b0Var.f401003e);
        int k17 = i65.a.k(b0Var.f401003e);
        dVar.f510674b = B;
        dVar.f510675c = k17;
        dVar.f510677e.f510726b.d();
        dVar.a(new lm3.i(this.f401024b));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
