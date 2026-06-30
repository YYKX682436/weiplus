package ni2;

/* loaded from: classes3.dex */
public final class q2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f418973h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f418974i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f418975m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f418976n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f418977o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f418978p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, yz5.a confirmBlock) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmBlock, "confirmBlock");
        this.f418973h = confirmBlock;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570469dl0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModeConfirmPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.b5i) {
            a();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.c9z) {
            this.f418973h.mo152xb9724478();
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModeConfirmPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f418974i = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f418976n = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f418977o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.gz9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f418975m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sae);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f418978p = (android.widget.TextView) findViewById4;
        android.widget.TextView textView = this.f418975m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTextView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f418976n;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f418977o;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f418976n;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        textView4.setOnClickListener(this);
        android.widget.TextView textView5 = this.f418977o;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
    }
}
