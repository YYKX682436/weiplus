package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 f264634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f264635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f264636h;

    public s2(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var, java.util.ArrayList arrayList, r45.jv5 jv5Var) {
        this.f264632d = i17;
        this.f264633e = i18;
        this.f264634f = y2Var;
        this.f264635g = arrayList;
        this.f264636h = jv5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f264632d != 0 || this.f264633e != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = this.f264634f;
            y2Var.a(this.f264636h, y2Var.f264728c, y2Var.f264731f, y2Var.f264732g, y2Var.f264733h);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var2 = this.f264634f;
            y2Var2.f264731f.clear();
            y2Var2.f264731f.addAll(this.f264635g);
        }
    }
}
