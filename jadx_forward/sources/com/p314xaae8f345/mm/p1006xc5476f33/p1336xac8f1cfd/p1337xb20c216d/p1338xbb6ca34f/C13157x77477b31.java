package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f;

/* renamed from: com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager */
/* loaded from: classes12.dex */
public class C13157x77477b31 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final int f178055v;

    /* renamed from: w, reason: collision with root package name */
    public int f178056w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f178057x;

    public C13157x77477b31(android.content.Context context) {
        super(context);
        this.f178055v = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
        this.f178056w = -1;
        this.f178057x = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i17 = this.f178056w;
        if (i17 > 0) {
            return i17;
        }
        return 900;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CollectEditorLinearLayoutManager", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (!this.f178057x) {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        }
        boolean z17 = i17 < 0 && android.util.TypedValue.applyDimension(1, 49.0f, nx1.z.f422863g) <= ((float) java.lang.Math.abs(i17));
        if (i17 > 0) {
            z17 = ((float) this.f178055v) + android.util.TypedValue.applyDimension(1, 49.0f, nx1.z.f422863g) < ((float) i17);
        }
        if (z17 && this.f178057x) {
            return 0;
        }
        try {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public C13157x77477b31(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f178055v = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
        this.f178056w = -1;
        this.f178057x = false;
    }
}
