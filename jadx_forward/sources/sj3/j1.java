package sj3;

/* loaded from: classes14.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.m1 f490131d;

    public j1(sj3.m1 m1Var) {
        this.f490131d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.m1 m1Var = this.f490131d;
        int i17 = ((android.view.ViewGroup.MarginLayoutParams) m1Var.f490168h.getLayoutParams()).bottomMargin;
        int height = (int) (m1Var.f490171n.getHeight() - ((r1.getHeight() + i17) + r2.topMargin));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m1Var.f490170m;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c1163xf1deaba4.getLayoutParams();
        int i18 = (sj3.i1.f490097i * 3) + (sj3.i1.f490092d * 2);
        if (height >= i18) {
            layoutParams.height = i18;
        } else {
            layoutParams.height = height;
        }
        c1163xf1deaba4.setLayoutParams(layoutParams);
    }
}
