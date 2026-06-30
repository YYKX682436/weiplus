package lb0;

/* loaded from: classes4.dex */
public final class k extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f399211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f399213f;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Context context, int i17) {
        this.f399211d = h0Var;
        this.f399212e = context;
        this.f399213f = i17;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/util/ShareTipsUtil$checkShareTips$1$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", (java.lang.String) this.f399211d.f391656d);
        j45.l.j(this.f399212e, "webview", ".ui.tools.WebViewUI", intent, null);
        if (this.f399213f == 9) {
            lb0.q qVar = lb0.q.f399221a;
            ct.k3 k3Var = (ct.k3) ((jz5.n) lb0.q.f399228h).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k3Var, "access$getYuanBaoReportService(...)");
            ((qg5.e3) k3Var).tj(5, null);
        }
        yj0.a.h(this, "com/tencent/mm/feature/openway/util/ShareTipsUtil$checkShareTips$1$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f399212e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
    }
}
