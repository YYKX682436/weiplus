package oc1;

/* loaded from: classes.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f425672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc1.b f425673e;

    public a(oc1.b bVar, android.widget.TextView textView) {
        this.f425673e = bVar;
        this.f425672d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f425672d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(this.f425673e.f425674d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
