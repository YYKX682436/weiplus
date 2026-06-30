package th5;

/* loaded from: classes8.dex */
public final class u0 extends lf3.c0 {

    /* renamed from: h, reason: collision with root package name */
    public int f500997h;

    /* renamed from: i, reason: collision with root package name */
    public int f500998i;

    /* renamed from: m, reason: collision with root package name */
    public int f500999m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f501000n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500998i = -1;
    }

    @Override // lf3.c0, qf3.a
    public void T3(int i17) {
        super.T3(i17);
        a7(i17);
        b7(i17);
    }

    public final void a7(int i17) {
        if (this.f500997h == 0 || i17 == this.f500998i) {
            return;
        }
        this.f500998i = i17;
        try {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            px4.a.f440488a.a(this.f500997h, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPhotoPreviewComponent", "notifyOnImagePreviewPositionChanged pos=" + i17 + " webViewId=" + this.f500997h, e17);
        }
    }

    public final void b7(int i17) {
        android.widget.TextView textView;
        if (this.f500999m <= 1 || (textView = this.f501000n) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17 + 1);
        sb6.append('/');
        sb6.append(this.f500999m);
        textView.setText(sb6.toString());
    }

    @Override // lf3.c0, kg3.f
    /* renamed from: onPageSelected */
    public void mo143395x510f45c9(int i17) {
        super.mo143395x510f45c9(i17);
        a7(i17);
        b7(i17);
    }

    @Override // lf3.c0, lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 c10612x9ba63641;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        android.content.Intent intent = m158354x19263085().getIntent();
        if (intent != null && (c10612x9ba63641 = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641) b3.q.a(intent, "biz_photo_account_gallery_args", com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641.class)) != null) {
            this.f500997h = c10612x9ba63641.f148626h;
            this.f500999m = c10612x9ba63641.f148622d.size();
        }
        super.mo47092x594b1124(contentView);
        if (this.f500999m > 1) {
            android.content.Context context = contentView.getContext();
            int i17 = (int) (57 * context.getResources().getDisplayMetrics().density);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setTextColor(-1);
            textView.setTextSize(17.0f);
            textView.setGravity(17);
            textView.setShadowLayer(4.0f, 0.0f, 1.0f, 1711276032);
            this.f501000n = textView;
            android.view.ViewGroup viewGroup = contentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) contentView : null;
            if (viewGroup != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = i17;
                layoutParams.addRule(10);
                viewGroup.addView(textView, layoutParams);
            }
        }
    }
}
