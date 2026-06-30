package db5;

/* loaded from: classes.dex */
public class n7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f309980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309981e;

    public n7(android.widget.TextView textView, android.content.Context context) {
        this.f309980d = textView;
        this.f309981e = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f309980d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(this.f309981e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
