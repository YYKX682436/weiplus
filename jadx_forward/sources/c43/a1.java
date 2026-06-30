package c43;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f119924d;

    public a1(c43.x xVar) {
        this.f119924d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c43.x xVar = this.f119924d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) xVar.f120030o.getLayoutParams();
        layoutParams.topMargin = xVar.f120031p.getTop() + ((xVar.f120031p.getHeight() - xVar.f120030o.getHeight()) / 2);
        xVar.f120030o.setLayoutParams(layoutParams);
    }
}
