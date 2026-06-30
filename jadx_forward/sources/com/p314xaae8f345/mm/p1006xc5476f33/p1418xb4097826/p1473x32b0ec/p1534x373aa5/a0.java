package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class a0 implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197700a;

    public a0(int i17) {
        this.f197700a = i17;
    }

    @Override // db5.s7
    public final void a(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.widget.TextView textView;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)) != null) {
            textView.setTextSize(1, 14.0f);
        }
        if (view == null || (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)) == null) {
            return;
        }
        c22699x3dcdb352.setImageResource(this.f197700a);
    }
}
