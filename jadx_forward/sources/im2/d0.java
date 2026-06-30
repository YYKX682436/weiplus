package im2;

/* loaded from: classes3.dex */
public final class d0 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f373817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f373818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f373819f;

    public d0(android.widget.TextView textView, int i17, int i18) {
        this.f373817d = textView;
        this.f373818e = i17;
        this.f373819f = i18;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(this.f373818e, str) / 2;
        if (b17 < 0) {
            b17 = 0;
        }
        int i17 = this.f373819f;
        android.widget.TextView textView = this.f373817d;
        if (b17 > i17) {
            textView.setVisibility(4);
        } else {
            textView.setText(java.lang.String.valueOf(b17));
            textView.setVisibility(0);
        }
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f373817d.setText("0");
    }
}
