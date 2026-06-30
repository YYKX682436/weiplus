package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/EndMaskView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.EndMaskView */
/* loaded from: classes4.dex */
public final class C21356x182ee98c extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f278178d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f278179e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278180f;

    public C21356x182ee98c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csj, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f278178d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qih);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f278179e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f278180f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(getContext());
        int b17 = i65.a.b(getContext(), 32) * 2;
        int i17 = a17.f278668a;
        int b18 = (i17 - b17) - (i65.a.b(getContext(), 56) * 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EndMaskView", "changeTipsTvMaxHeight >> " + i17 + ". " + b18);
        this.f278178d.setMaxWidth(b18);
    }

    public final void b() {
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278180f;
        if (C) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79693x129a8c56, com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836);
        } else {
            c22699x3dcdb352.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ayk));
        }
        c22699x3dcdb352.setVisibility(0);
        this.f278178d.setVisibility(8);
        this.f278179e.setVisibility(8);
    }

    public final void c(java.lang.String tipsText, java.lang.String linkText, android.view.View.OnClickListener linkClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsText, "tipsText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkText, "linkText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkClickListener, "linkClickListener");
        android.widget.TextView textView = this.f278178d;
        textView.setText(tipsText);
        android.widget.TextView textView2 = this.f278179e;
        textView2.setText(linkText);
        textView2.setOnClickListener(linkClickListener);
        this.f278180f.setVisibility(8);
        textView.setVisibility(0);
        textView.post(new com.p314xaae8f345.mm.ui.c4(this));
    }

    public C21356x182ee98c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csj, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f278178d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qih);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f278179e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f278180f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        a();
    }
}
