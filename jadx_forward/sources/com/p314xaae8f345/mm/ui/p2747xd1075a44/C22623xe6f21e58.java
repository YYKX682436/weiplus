package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMLoadScrollView */
/* loaded from: classes12.dex */
public class C22623xe6f21e58 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public al5.r1 f292858d;

    public C22623xe6f21e58(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        al5.r1 r1Var;
        if (z18 && i18 > 0 && (r1Var = this.f292858d) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a) r1Var).f182214a.f182133g.f425025q = true;
        }
        super.onOverScrolled(i17, i18, z17, z18);
    }

    /* renamed from: setOnTopOrBottomListerner */
    public void m81365x49cdb44e(al5.r1 r1Var) {
        this.f292858d = r1Var;
    }

    public C22623xe6f21e58(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
