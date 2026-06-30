package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView */
/* loaded from: classes12.dex */
public class C13617x6fbceb5e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 {

    /* renamed from: e, reason: collision with root package name */
    public w82.e f183060e;

    public C13617x6fbceb5e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        w82.e eVar;
        super.onScrollChanged(i17, i18, i19, i27);
        if (getScrollY() == 0 && (eVar = this.f183060e) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b) eVar).f182229a.mo78530x8b45058f();
            return;
        }
        w82.e eVar2 = this.f183060e;
        if (eVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b) eVar2).f182229a.m78599xdf056fb4();
        }
    }

    /* renamed from: setOnScrollChangeListener */
    public void m55386x945a8432(w82.e eVar) {
        this.f183060e = eVar;
    }

    public C13617x6fbceb5e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
