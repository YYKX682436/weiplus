package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/mv/ui/view/j;", "searchViewListener", "Ljz5/f0;", "setSearchViewListener", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "<set-?>", "e", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "()Lcom/tencent/mm/ui/search/FTSEditTextView;", "ftsEditText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView */
/* loaded from: classes10.dex */
public final class C16680x607376f4 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f233127d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j f233129f;

    public C16680x607376f4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570655bd1, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f233127d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.k(this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.meb);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.gfl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.search.FTSEditTextView");
        this.ftsEditText = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) findViewById2;
    }

    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 getFtsEditText() {
        return this.ftsEditText;
    }

    /* renamed from: setSearchViewListener */
    public final void m67300xcd6a5043(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j jVar) {
        this.f233129f = jVar;
    }

    public C16680x607376f4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
