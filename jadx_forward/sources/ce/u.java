package ce;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce.o f122258d;

    public u(ce.o oVar) {
        this.f122258d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ce.o oVar = this.f122258d;
        android.widget.ImageView imageView = oVar.f122226q;
        if (imageView == null) {
            return;
        }
        if (imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) oVar.f122226q.getDrawable();
            oVar.f122226q.setImageDrawable(null);
            try {
                bitmapDrawable.getBitmap().recycle();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", e17, "hy: cleanupCoverScreenshot error!", new java.lang.Object[0]);
            }
        }
        oVar.f122226q.setVisibility(8);
    }
}
