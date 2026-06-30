package ns4;

/* loaded from: classes2.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f420968d;

    public a4(android.widget.TextView textView) {
        this.f420968d = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f420968d;
        textView.setX((-textView.getWidth()) / 2.0f);
        textView.setY((-textView.getHeight()) / 2.0f);
    }
}
