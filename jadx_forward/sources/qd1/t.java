package qd1;

/* loaded from: classes7.dex */
public class t implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f443210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.w f443211e;

    public t(qd1.w wVar, android.widget.TextView textView) {
        this.f443211e = wVar;
        this.f443210d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f443210d;
        if (textView.getLineCount() > 1) {
            textView.setTextSize(0, i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
            int h17 = i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561394ha);
            qd1.w wVar = this.f443211e;
            wVar.getClass();
            textView.setSpannableFactory(new qd1.v(wVar, h17));
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
