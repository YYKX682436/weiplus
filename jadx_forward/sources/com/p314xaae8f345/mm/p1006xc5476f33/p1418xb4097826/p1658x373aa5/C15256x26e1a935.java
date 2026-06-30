package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderChooseNewsView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/CheckBox;", "e", "Ljz5/g;", "getCheckBox", "()Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/TextView;", "f", "getDescText", "()Landroid/widget/TextView;", "descText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderChooseNewsView */
/* loaded from: classes3.dex */
public final class C15256x26e1a935 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final vb2.u f212408d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g checkBox;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g descText;

    public C15256x26e1a935(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        vb2.u a17 = vb2.u.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f212408d = a17;
        this.checkBox = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h3(this));
        this.descText = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i3(this));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.text.SpannableString spannableString = new android.text.SpannableString(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573600f43));
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80143xebd704ef, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        android.graphics.drawable.Drawable e18 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80124xebd44b8e, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e18.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        al5.w wVar2 = new al5.w(e18, 1);
        int K = r26.n0.K(spannableString, (char) 8197, 0, false, 6, null);
        int K2 = r26.n0.K(spannableString, (char) 8198, 0, false, 6, null);
        spannableString.setSpan(wVar, K, K + 1, 34);
        spannableString.setSpan(wVar2, K2, K2 + 1, 34);
        m61709xb87d44d4().setText(spannableString);
        android.widget.TextView title = a17.f516265d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
        hc2.f1.E(title, com.p314xaae8f345.mm.R.C30860x5b28f31.f561222co, false);
        android.widget.TextView m61709xb87d44d4 = m61709xb87d44d4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m61709xb87d44d4, "<get-descText>(...)");
        hc2.f1.E(m61709xb87d44d4, com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca, true);
    }

    /* renamed from: getCheckBox */
    private final android.widget.CheckBox m61708xd774e119() {
        return (android.widget.CheckBox) this.checkBox.mo141623x754a37bb();
    }

    /* renamed from: getDescText */
    private final android.widget.TextView m61709xb87d44d4() {
        return (android.widget.TextView) this.descText.mo141623x754a37bb();
    }

    public final boolean a() {
        return m61708xd774e119().isChecked();
    }

    public C15256x26e1a935(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        vb2.u a17 = vb2.u.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f212408d = a17;
        this.checkBox = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h3(this));
        this.descText = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i3(this));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.text.SpannableString spannableString = new android.text.SpannableString(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573600f43));
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80143xebd704ef, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        android.graphics.drawable.Drawable e18 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80124xebd44b8e, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e18.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        al5.w wVar2 = new al5.w(e18, 1);
        int K = r26.n0.K(spannableString, (char) 8197, 0, false, 6, null);
        int K2 = r26.n0.K(spannableString, (char) 8198, 0, false, 6, null);
        spannableString.setSpan(wVar, K, K + 1, 34);
        spannableString.setSpan(wVar2, K2, K2 + 1, 34);
        m61709xb87d44d4().setText(spannableString);
        android.widget.TextView title = a17.f516265d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
        hc2.f1.E(title, com.p314xaae8f345.mm.R.C30860x5b28f31.f561222co, false);
        android.widget.TextView m61709xb87d44d4 = m61709xb87d44d4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m61709xb87d44d4, "<get-descText>(...)");
        hc2.f1.E(m61709xb87d44d4, com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca, true);
    }
}
