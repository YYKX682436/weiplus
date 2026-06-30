package lm3;

/* loaded from: classes3.dex */
public final class l implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f401027a;

    public l(android.widget.ImageView imageView) {
        this.f401027a = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap X;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if ((bVar != null ? bVar.f441067d : null) == null || bVar.f441067d.isRecycled() || (X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(bVar.f441067d, 10)) == null) {
            return;
        }
        pm0.v.X(new lm3.k(this.f401027a, X));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
