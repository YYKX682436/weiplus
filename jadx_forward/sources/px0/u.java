package px0;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440343d;

    public u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        this.f440343d = c10988x551cb0cc;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc.f151175z;
        android.widget.TextView textView = (android.widget.TextView) this.f440343d.f151184o.mo141623x754a37bb();
        if (textView != null) {
            if (i27 - i18 < textView.getLineHeight() * 3) {
                textView.setMaxLines(2);
            } else {
                textView.setMaxLines(3);
            }
        }
    }
}
