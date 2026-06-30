package df2;

/* loaded from: classes3.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f312700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312701f;

    public qk(android.widget.TextView textView, android.widget.RelativeLayout.LayoutParams layoutParams, df2.pl plVar) {
        this.f312699d = textView;
        this.f312700e = layoutParams;
        this.f312701f = plVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = pm0.v.t(this.f312699d)[0];
        df2.pl plVar = this.f312701f;
        android.widget.TextView textView = plVar.f312632y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        int dimensionPixelSize = i17 - textView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int i18 = dimensionPixelSize >= 0 ? dimensionPixelSize : 0;
        android.widget.RelativeLayout.LayoutParams layoutParams = this.f312700e;
        layoutParams.setMargins(i18, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        android.widget.TextView textView2 = plVar.f312632y;
        if (textView2 == null) {
            return;
        }
        textView2.setLayoutParams(layoutParams);
    }
}
