package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f221918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221919g;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r2 r2Var, android.content.Context context, java.lang.String str, float f17, int i17) {
        this.f221916d = context;
        this.f221917e = str;
        this.f221918f = f17;
        this.f221919g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        o53.e eVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) this.f221916d).f222519e;
        eVar.getClass();
        java.lang.String str = this.f221917e;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                eVar.m64562x26c2c9e9(android.graphics.Color.parseColor(str) | (-16777216));
            } catch (java.lang.Exception unused) {
            }
        }
        eVar.m64566x4a8f5a11(this.f221919g);
        float f17 = this.f221918f;
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        eVar.setAlpha(f17);
    }
}
