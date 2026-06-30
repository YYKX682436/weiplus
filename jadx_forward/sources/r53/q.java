package r53;

/* loaded from: classes8.dex */
public class q implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.x f474216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r53.w f474217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f474218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r53.y f474219d;

    public q(r53.y yVar, r53.x xVar, r53.w wVar, android.widget.ImageView imageView) {
        this.f474219d = yVar;
        this.f474216a = xVar;
        this.f474217b = wVar;
        this.f474218c = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        r53.x xVar = this.f474216a;
        if (xVar != null) {
            xVar.b(str, view);
        }
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        if (bVar == null || (bitmap = bVar.f441067d) == null) {
            return;
        }
        r53.w wVar = this.f474217b;
        boolean z17 = wVar.f474246d;
        r53.y yVar = this.f474219d;
        if (z17) {
            yVar.getClass();
            if (bitmap != null && !bitmap.isRecycled()) {
                int width = bitmap.getHeight() > bitmap.getWidth() ? bitmap.getWidth() : bitmap.getHeight();
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, width, width, false);
            }
        }
        wVar.getClass();
        if (wVar.f474249g > 0.0f) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() * wVar.f474249g);
        }
        if (wVar.f474243a) {
            ((jt0.i) yVar.f474255d).j(str, bitmap);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new r53.p(this, bitmap));
        r53.x xVar = this.f474216a;
        if (xVar != null) {
            xVar.a(view, bitmap);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
