package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class fj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f285508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gj f285509e;

    public fj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gj gjVar, q11.b bVar) {
        this.f285509e = gjVar;
        this.f285508d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q11.b bVar = this.f285508d;
        int i17 = bVar.f441064a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gj gjVar = this.f285509e;
        if (i17 != 0 || bVar.f441067d == null) {
            gjVar.f285579a.setVisibility(8);
            return;
        }
        gjVar.f285579a.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = gjVar.f285580b;
        android.graphics.Bitmap bitmap = bVar.f441067d;
        android.widget.ImageView imageView = gjVar.f285579a;
        java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
        c21908xb66fd105.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        boolean z17 = layoutParams.width > layoutParams.height;
        boolean z18 = bitmap.getWidth() > bitmap.getHeight();
        if (z17 != z18) {
            int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 160);
            int a17 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 67.5f);
            if (z18) {
                b17 = a17;
            }
            layoutParams.height = b17;
            imageView.setLayoutParams(layoutParams);
        }
        gjVar.f285579a.setImageBitmap(bVar.f441067d);
    }
}
