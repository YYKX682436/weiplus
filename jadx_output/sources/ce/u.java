package ce;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce.o f40725d;

    public u(ce.o oVar) {
        this.f40725d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ce.o oVar = this.f40725d;
        android.widget.ImageView imageView = oVar.f40693q;
        if (imageView == null) {
            return;
        }
        if (imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) oVar.f40693q.getDrawable();
            oVar.f40693q.setImageDrawable(null);
            try {
                bitmapDrawable.getBitmap().recycle();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e17, "hy: cleanupCoverScreenshot error!", new java.lang.Object[0]);
            }
        }
        oVar.f40693q.setVisibility(8);
    }
}
