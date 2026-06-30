package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchHeadComponent;", "Landroid/widget/RelativeLayout;", "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "Ljz5/f0;", "setTitle", "", "resId", "setCloseIconResId", "Lkotlin/Function0;", "d", "Lyz5/a;", "getCloseBtnCallBack", "()Lyz5/a;", "setCloseBtnCallBack", "(Lyz5/a;)V", "closeBtnCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent */
/* loaded from: classes5.dex */
public final class C16155xa1f2bfdb extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a closeBtnCallBack;

    /* renamed from: e, reason: collision with root package name */
    public final w83.b f224643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16155xa1f2bfdb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmu, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.p314xaae8f345.mm.R.id.byt;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.byt);
        if (c22699x3dcdb352 != null) {
            i18 = com.p314xaae8f345.mm.R.id.gzr;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gzr);
            if (c22699x3dcdb3522 != null) {
                i18 = com.p314xaae8f345.mm.R.id.obf;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.obf);
                if (textView != null) {
                    this.f224643e = new w83.b((android.widget.LinearLayout) inflate, c22699x3dcdb352, c22699x3dcdb3522, textView);
                    setNestedScrollingEnabled(true);
                    textView.setVisibility(4);
                    c22699x3dcdb3522.setVisibility(4);
                    c22699x3dcdb352.setBackground(getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0));
                    c22699x3dcdb352.setOnClickListener(new y83.c(this));
                    c22699x3dcdb3522.setOnClickListener(new y83.d(this));
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final yz5.a getCloseBtnCallBack() {
        return this.closeBtnCallBack;
    }

    /* renamed from: setCloseBtnCallBack */
    public final void m65189x5018364b(yz5.a aVar) {
        this.closeBtnCallBack = aVar;
    }

    /* renamed from: setCloseIconResId */
    public final void m65190x6c2a7ecc(int i17) {
        this.f224643e.f525492b.setBackground(getContext().getDrawable(i17));
    }

    /* renamed from: setTitle */
    public final void m65191x53bfe316(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        w83.b bVar = this.f224643e;
        bVar.f525494d.setText(title);
        bVar.f525494d.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16155xa1f2bfdb(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
