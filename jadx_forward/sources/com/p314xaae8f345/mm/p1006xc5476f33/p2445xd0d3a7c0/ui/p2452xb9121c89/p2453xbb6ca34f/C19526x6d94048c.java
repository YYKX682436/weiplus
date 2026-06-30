package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2453xbb6ca34f;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager */
/* loaded from: classes12.dex */
public class C19526x6d94048c extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d {

    /* renamed from: w, reason: collision with root package name */
    public final int f269713w;

    /* renamed from: x, reason: collision with root package name */
    public int f269714x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f269715y;

    public C19526x6d94048c(android.content.Context context) {
        super(context);
        this.f269713w = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
        this.f269714x = -1;
        this.f269715y = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i17 = this.f269714x;
        if (i17 > 0) {
            return i17;
        }
        return 900;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onFocusSearchFailed */
    public android.view.View mo7914x990cf8de(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            return super.mo7914x990cf8de(view, i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteLinearLayoutManager", "[onFocusSearchFailed] crash e = " + e17);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteLinearLayoutManager", "[onLayoutChildren] crash e = " + e17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            return super.mo2419x96d40915(i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteLinearLayoutManager", "[scrollHorizontallyBy] crash e = " + e17);
            return 0;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (!this.f269715y) {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        }
        boolean z17 = i17 < 0 && android.util.TypedValue.applyDimension(1, 49.0f, mz4.j0.f414825x) <= ((float) java.lang.Math.abs(i17));
        if (i17 > 0) {
            z17 = ((float) this.f269713w) + android.util.TypedValue.applyDimension(1, 49.0f, mz4.j0.f414825x) < ((float) i17);
        }
        if (z17 && this.f269715y) {
            return 0;
        }
        try {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public C19526x6d94048c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f269713w = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
        this.f269714x = -1;
        this.f269715y = false;
        this.f93414u = 0;
    }
}
