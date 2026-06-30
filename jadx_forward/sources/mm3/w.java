package mm3;

/* loaded from: classes10.dex */
public final class w extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f411210n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f411211o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.p f411212p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f411213q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f411214r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f411215s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, java.lang.String str, java.util.List pagInfoList, yz5.p onPreview, yz5.l onSelected) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagInfoList, "pagInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPreview, "onPreview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelected, "onSelected");
        this.f411210n = str;
        this.f411211o = pagInfoList;
        this.f411212p = onPreview;
        this.f411213q = onSelected;
        this.f411214r = str;
        this.f411215s = jz5.h.b(new mm3.v(this));
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4u);
    }

    public final void E(boolean z17) {
        android.view.View view = (android.view.View) ((jz5.n) this.f411215s).mo141623x754a37bb();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        c1163xf1deaba4.mo7960x6cab2c8d(new mm3.q(this));
        setOnCancelListener(new mm3.r(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bz6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        findViewById2.setOnClickListener(new mm3.s(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.c_3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        findViewById3.setOnClickListener(new mm3.t(this));
        jz5.g gVar = this.f411215s;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new mm3.u(this));
    }
}
