package gt4;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356982f;

    public i(boolean z17, android.widget.TextView textView, android.content.Context context) {
        this.f356980d = z17;
        this.f356981e = textView;
        this.f356982f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView;
        if (this.f356980d && (textView = this.f356981e) != null && fp.h.c(28)) {
            textView.requestFocus();
        }
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f356982f).mo26063x7b383410();
    }
}
