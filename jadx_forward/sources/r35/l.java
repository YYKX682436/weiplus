package r35;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f450708d;

    public l(r35.o oVar) {
        this.f450708d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r35.o oVar = this.f450708d;
        android.widget.ImageView imageView = (android.widget.ImageView) oVar.f450758q.mo81952xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.c_m);
        if (imageView != null) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String d17 = oVar.f450760s.d1();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(d17);
            if (a17 != null && oVar.f450760s.k2()) {
                a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, a17.getWidth() / 2);
            }
            if (a17 == null || a17.isRecycled()) {
                return;
            }
            imageView.setImageBitmap(a17);
            imageView.setVisibility(0);
        }
    }
}
