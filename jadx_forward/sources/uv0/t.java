package uv0;

/* loaded from: classes5.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512883d;

    public t(uv0.u uVar) {
        this.f512883d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv0.u uVar = this.f512883d;
        vv0.k kVar = uVar.f512884J;
        vv0.k kVar2 = vv0.k.f521916f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, vv0.k.f521916f)) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc = uVar.N;
            if (c10956x6271c3cc != null) {
                c10956x6271c3cc.setVisibility(8);
            }
            android.widget.TextView textView = uVar.P;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc2 = uVar.N;
            if (c10956x6271c3cc2 != null) {
                c10956x6271c3cc2.setVisibility(0);
            }
            android.widget.TextView textView2 = uVar.P;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.view.ViewGroup viewGroup = uVar.M;
            if (viewGroup != null) {
                viewGroup.setEnabled(true);
            }
            android.view.ViewGroup viewGroup2 = uVar.M;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc3 = uVar.N;
            if (c10956x6271c3cc3 != null) {
                c10956x6271c3cc3.m47185x3ae760af(uVar.K);
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc4 = uVar.N;
            if (c10956x6271c3cc4 != null) {
                c10956x6271c3cc4.setEnabled(true);
            }
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc5 = uVar.N;
        if (c10956x6271c3cc5 != null) {
            uv0.u.O(uVar, c10956x6271c3cc5.getProgress());
        }
    }
}
