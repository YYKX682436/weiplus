package c43;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38391d;

    public a1(c43.x xVar) {
        this.f38391d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c43.x xVar = this.f38391d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) xVar.f38497o.getLayoutParams();
        layoutParams.topMargin = xVar.f38498p.getTop() + ((xVar.f38498p.getHeight() - xVar.f38497o.getHeight()) / 2);
        xVar.f38497o.setLayoutParams(layoutParams);
    }
}
