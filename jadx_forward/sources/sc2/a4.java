package sc2;

/* loaded from: classes.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b4 f487280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f487283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f487284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f487285i;

    public a4(sc2.b4 b4Var, android.view.View view, in5.s0 s0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f487280d = b4Var;
        this.f487281e = view;
        this.f487282f = s0Var;
        this.f487283g = c22699x3dcdb352;
        this.f487284h = textView;
        this.f487285i = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth;
        java.lang.String str;
        this.f487280d.getClass();
        java.lang.Object parent = this.f487281e.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int i17 = 0;
        if (view == null) {
            measuredWidth = 0;
        } else if (view.getLayoutParams().width == -2) {
            java.lang.Object parent2 = view.getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            measuredWidth = view2 != null ? view2.getMeasuredWidth() : view.getMeasuredWidth();
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        android.widget.TextView textView = this.f487285i;
        if (measuredWidth <= 0) {
            if (textView == null) {
                return;
            }
            textView.setMaxWidth(Integer.MAX_VALUE);
            return;
        }
        int measuredWidth2 = (measuredWidth - this.f487283g.getMeasuredWidth()) - this.f487282f.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        android.widget.TextView textView2 = this.f487284h;
        if (textView2 != null && textView2.getVisibility() == 0) {
            android.text.TextPaint paint = textView2.getPaint();
            java.lang.CharSequence text = textView2.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            i17 = (int) paint.measureText(str);
        }
        int i18 = measuredWidth2 - i17;
        if (textView == null) {
            return;
        }
        textView.setMaxWidth(i18);
    }
}
