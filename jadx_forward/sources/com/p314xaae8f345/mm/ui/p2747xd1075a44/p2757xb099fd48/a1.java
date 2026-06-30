package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f293272n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293273o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super(context);
        this.f293273o = k0Var;
        this.f293272n = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public android.graphics.PointF a(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f293272n;
        return (c1163xf1deaba4 == null || c1163xf1deaba4.getLayoutManager() == null || !(c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) ? super.a(i17) : ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) this.f293273o.G1.getLayoutManager()).a(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 1.0f / displayMetrics.densityDpi;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int m() {
        return -1;
    }
}
