package va2;

/* loaded from: classes2.dex */
public final class f extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f515770g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f515771h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1662x2e7b10.C15389xa972d578 f515772i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f515773m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f515773m = jz5.h.b(new va2.d(this));
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        android.widget.FrameLayout frameLayout = this.f534253e;
        this.f515770g = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.ohd) : null;
        android.widget.FrameLayout frameLayout2 = this.f534253e;
        this.f515771h = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.ogu) : null;
        android.widget.FrameLayout frameLayout3 = this.f534253e;
        this.f515772i = frameLayout3 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1662x2e7b10.C15389xa972d578) frameLayout3.findViewById(com.p314xaae8f345.mm.R.id.oh7) : null;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        V6(stringExtra);
        android.widget.TextView textView = this.f515770g;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        android.widget.TextView textView2 = this.f515771h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8n, "0"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    @Override // x92.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va2.f.U6():void");
    }

    public final void V6(java.lang.String str) {
        java.lang.String str2;
        android.widget.TextView textView = this.f515770g;
        if (textView == null) {
            return;
        }
        if (((java.lang.Boolean) ((jz5.n) this.f515773m).mo141623x754a37bb()).booleanValue()) {
            str2 = m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573526m16, str);
        } else {
            str2 = "#" + str;
        }
        textView.setText(str2);
    }
}
