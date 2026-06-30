package aw2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96270g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f96271h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96272i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f96273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96274n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aw2.n nVar, int i17, java.lang.String str, java.lang.String str2, int i18, int i19, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.String str3) {
        super(0);
        this.f96267d = nVar;
        this.f96268e = i17;
        this.f96269f = str;
        this.f96270g = str2;
        this.f96271h = i18;
        this.f96272i = i19;
        this.f96273m = c19786x6a1e2862;
        this.f96274n = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aw2.n nVar = this.f96267d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = nVar.f96317o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        nVar.f96317o = null;
        java.util.Map map = db2.z4.f309792a;
        rx2.p pVar = nVar.f96312g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31 = nVar.f96316n;
        int i17 = this.f96268e;
        if (i17 == 0) {
            java.lang.String link = c15281x1c66dc31.getLink();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(link != null ? r26.n0.u0(link).toString() : null, this.f96269f)) {
                this.f96267d.e(this.f96269f, this.f96270g, this.f96271h, this.f96272i, this.f96273m);
                pVar.a();
            }
        } else {
            java.lang.String errMsg = nVar.f96309d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cu9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "getString(...)");
            if (i17 == -4054) {
                java.lang.String str = this.f96274n;
                if (!(str == null || str.length() == 0)) {
                    errMsg = str;
                }
            }
            pVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b = pVar.f482519g;
            c15280xb0aa035b.getClass();
            android.widget.TextView textView = c15280xb0aa035b.f212577o;
            textView.setText(errMsg);
            textView.setVisibility(0);
            textView.setTextColor(c15280xb0aa035b.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            c15281x1c66dc31.c();
        }
        return jz5.f0.f384359a;
    }
}
