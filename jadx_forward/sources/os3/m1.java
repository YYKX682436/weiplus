package os3;

/* loaded from: classes8.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16933xbb799720 f429682d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16933xbb799720 c16933xbb799720) {
        this.f429682d = c16933xbb799720;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16933xbb799720 c16933xbb799720 = this.f429682d;
        android.view.View view2 = (android.view.View) c16933xbb799720.getParent();
        if (view2 == null || (view = (android.view.View) view2.getParent()) == null || !(view instanceof android.widget.ScrollView)) {
            return;
        }
        c16933xbb799720.H = true;
        view.setOnTouchListener(new os3.l1(this));
    }
}
