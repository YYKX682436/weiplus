package hr3;

/* loaded from: classes5.dex */
public final class ae extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f364933e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f364934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f364935g;

    public ae(hr3.pf pfVar, java.lang.String str, java.lang.String picPath, yz5.a onSpanClickCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(picPath, "picPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSpanClickCallback, "onSpanClickCallback");
        this.f364935g = pfVar;
        this.f364932d = str;
        this.f364933e = picPath;
        this.f364934f = onSpanClickCallback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f364932d;
        objArr[0] = str != null ? java.lang.Integer.valueOf(str.length()) : "";
        java.lang.String str2 = this.f364933e;
        objArr[1] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "WriteSayHiSpan onClick() called hiContent:%s picPath:%s", objArr);
        hr3.pf pfVar = this.f364935g;
        hr3.pf.P6(pfVar, 2, 0);
        this.f364934f.mo152xb9724478();
        java.lang.String e17 = ck5.f.e(str, 100);
        java.lang.String str3 = e17 != null ? e17 : "";
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 S6 = pfVar.S6();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = pfVar.m158354x19263085();
        float m79030x40077844 = pfVar.S6().m79030x40077844();
        ((ke0.e) xVar).getClass();
        S6.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(m158354x19263085, str3, m79030x40077844));
        if (!android.text.TextUtils.isEmpty(str2)) {
            pfVar.Z6(str2);
        }
        pfVar.S6().m79037xf579a34a(str3.length());
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) pfVar.f365430p).mo141623x754a37bb();
        if (textView != null) {
            textView.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f364935g.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
        ds6.setUnderlineText(false);
    }
}
