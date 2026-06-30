package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b!\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderChooseOriginalView;", "Landroid/widget/LinearLayout;", "", "original", "Ljz5/f0;", "setOriginalFlag", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTipTv", "()Landroid/widget/TextView;", "setTipTv", "(Landroid/widget/TextView;)V", "tipTv", "e", "I", "getFlag", "()I", "setFlag", "(I)V", "flag", "Lkotlin/Function1;", "f", "Lyz5/l;", "getOnFlagChangedListener", "()Lyz5/l;", "setOnFlagChangedListener", "(Lyz5/l;)V", "onFlagChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderChooseOriginalView */
/* loaded from: classes2.dex */
public final class C15257x1dd522b3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView tipTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int flag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.l onFlagChangedListener;

    public C15257x1dd522b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.flag = 1;
        setOrientation(1);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aew, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kmk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.tipTv = (android.widget.TextView) findViewById;
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n3(this));
    }

    public final int getFlag() {
        return this.flag;
    }

    public final yz5.l getOnFlagChangedListener() {
        return this.onFlagChangedListener;
    }

    public final android.widget.TextView getTipTv() {
        return this.tipTv;
    }

    /* renamed from: setFlag */
    public final void m61713x764a2eee(int i17) {
        this.flag = i17;
    }

    /* renamed from: setOnFlagChangedListener */
    public final void m61714xd21be6db(yz5.l lVar) {
        this.onFlagChangedListener = lVar;
    }

    /* renamed from: setOriginalFlag */
    public final void m61715x16a43a5f(int i17) {
        this.flag = i17;
        if (i17 == 1) {
            this.tipTv.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573505et0);
        } else if (i17 == 2) {
            this.tipTv.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ere);
        } else {
            this.tipTv.setText("");
        }
        yz5.l lVar = this.onFlagChangedListener;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: setTipTv */
    public final void m61716x53bfd13b(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.tipTv = textView;
    }

    public C15257x1dd522b3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.flag = 1;
        setOrientation(1);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aew, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kmk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.tipTv = (android.widget.TextView) findViewById;
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n3(this));
    }
}
