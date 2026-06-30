package ey0;

/* loaded from: classes5.dex */
public class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f338829d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea f338830e;

    public c(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dfi, null);
        this.f338829d = inflate;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqo);
        this.f338830e = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea(context);
        linearLayout.removeAllViews();
        linearLayout.setGravity(17);
        this.f338830e.m47421xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.o8w).setBackgroundColor(0);
        linearLayout.addView(this.f338830e.m47421xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
