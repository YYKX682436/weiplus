package al1;

/* loaded from: classes7.dex */
public final class w extends al1.q {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f87350i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f87351m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, java.util.Map params, yz5.l onViewCreated) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onViewCreated, "onViewCreated");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569548dn, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hri);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m2261x764b6bfb((android.widget.ImageView) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.hrj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f87351m = textView;
        this.f87350i = java.lang.String.valueOf(params.get("key_appid"));
        textView.setText(java.lang.String.valueOf(params.get("key_content")));
        m2264x6ae74eb9(onViewCreated);
        a(java.lang.String.valueOf(params.get("key_img_url")), false);
        a(java.lang.String.valueOf(params.get("key_img_url_dark")), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2.class)) != null) {
            java.lang.String str = this.f87350i;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(str, 1, 5, 3);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2.class)) != null) {
            java.lang.String str = this.f87350i;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.k(str, 2, 5, 3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // al1.q
    /* renamed from: setColor */
    public void mo2260x52d2f021(int i17) {
        if (m2259xbcd54749() == i17) {
            return;
        }
        android.widget.TextView textView = this.f87351m;
        if (i17 == -1) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(-16777216);
        }
        b(i17);
        m2265x533ababd(i17);
    }
}
