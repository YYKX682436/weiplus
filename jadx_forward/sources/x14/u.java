package x14;

/* loaded from: classes15.dex */
public final class u implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 f532999a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364) {
        this.f532999a = c17503x53f0d364;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public final void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364.f243188s;
        c11121x1f1011.m48126x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364 = this.f532999a;
        boolean z17 = c17503x53f0d364.f243199p;
        if (!c17503x53f0d364.f243199p) {
            android.widget.TextView textView = c17503x53f0d364.f243198o;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = c17503x53f0d364.f243198o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = c17503x53f0d364.f243198o;
        if (textView3 == null) {
            return;
        }
        textView3.setText(c11121x1f1011.f152745e + ' ' + c11121x1f1011.f152746f);
    }
}
