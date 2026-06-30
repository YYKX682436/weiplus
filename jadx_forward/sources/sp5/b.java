package sp5;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f492859d;

    public b(android.widget.TextView textView) {
        this.f492859d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        float j17 = i65.a.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.widget.TextView textView = this.f492859d;
        textView.setTextSize(0, textView.getTextSize() / j17);
    }
}
