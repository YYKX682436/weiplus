package e33;

/* loaded from: classes10.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f328982d;

    public r1(e33.s1 s1Var, android.widget.TextView textView) {
        this.f328982d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f328982d;
        if (8 == textView.getVisibility()) {
            return;
        }
        textView.animate().alpha(0.0f).setDuration(300L).withEndAction(new e33.q1(this));
    }
}
