package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchCardLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/kidswatch/model/KidsWatchAcctInfo;", "kidsAcctInfo", "Ljz5/f0;", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout */
/* loaded from: classes14.dex */
public final class C16153xf0d27e3c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f224635d;

    /* renamed from: e, reason: collision with root package name */
    public final o11.f f224636e;

    /* renamed from: f, reason: collision with root package name */
    public final w83.a f224637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16153xf0d27e3c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 16);
        o11.f fVar = new o11.f();
        this.f224636e = fVar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmt, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.p314xaae8f345.mm.R.id.a9n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a9n);
        if (c22643xbdaadc7d != null) {
            i18 = com.p314xaae8f345.mm.R.id.f565087b73;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f565087b73);
            if (linearLayout != null) {
                i18 = com.p314xaae8f345.mm.R.id.cwt;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cwt);
                if (textView != null) {
                    i18 = com.p314xaae8f345.mm.R.id.io_;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.io_);
                    if (textView2 != null) {
                        i18 = com.p314xaae8f345.mm.R.id.ioa;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ioa);
                        if (textView3 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.kbg;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.kbg);
                            if (textView4 != null) {
                                this.f224637f = new w83.a((android.widget.LinearLayout) inflate, c22643xbdaadc7d, linearLayout, textView, textView2, textView3, textView4);
                                setNestedScrollingEnabled(true);
                                c22643xbdaadc7d.f292939f = a17;
                                c22643xbdaadc7d.f292940g = a17;
                                fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
                                fVar.f423630u = a17;
                                fVar.f423629t = true;
                                a();
                                a93.a aVar = a93.a.f83962a;
                                android.content.Context context2 = getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                aVar.c(context2, linearLayout, null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void a() {
        boolean z17 = this.f224635d;
        w83.a aVar = this.f224637f;
        if (z17) {
            aVar.f525488e.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aid));
            aVar.f525489f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573897g81));
        } else {
            aVar.f525488e.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ai9));
            aVar.f525489f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7j));
        }
    }

    /* renamed from: setData */
    public final void m65187x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29.C16152x604567c3 kidsAcctInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kidsAcctInfo, "kidsAcctInfo");
        n11.a b17 = n11.a.b();
        w83.a aVar = this.f224637f;
        b17.h(kidsAcctInfo.f224632f, aVar.f525485b, this.f224636e.a());
        aVar.f525490g.setText(kidsAcctInfo.f224631e);
        this.f224635d = kidsAcctInfo.f224630d == 1;
        aVar.f525487d.setText(kidsAcctInfo.f224634h);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16153xf0d27e3c(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
