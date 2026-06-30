package ey0;

/* loaded from: classes5.dex */
public class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f338831d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9 f338832e;

    public d(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dfi, null);
        this.f338831d = inflate;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqo);
        this.f338832e = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9(context);
        linearLayout.removeAllViews();
        linearLayout.setGravity(17);
        this.f338832e.m47426xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.o8w).setBackgroundColor(0);
        linearLayout.addView(this.f338832e.m47426xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
