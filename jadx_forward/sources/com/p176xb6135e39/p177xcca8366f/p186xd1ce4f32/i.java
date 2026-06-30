package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public int f125790a;

    /* renamed from: b, reason: collision with root package name */
    public int f125791b;

    /* renamed from: c, reason: collision with root package name */
    public int f125792c;

    /* renamed from: d, reason: collision with root package name */
    public int f125793d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125794e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f125795f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 f125797h;

    public i(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 c1626x16b77f31, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.h hVar) {
        this.f125797h = c1626x16b77f31;
    }

    public static void a(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 c1626x16b77f31 = iVar.f125797h;
        if (c1626x16b77f31.l() || !c1626x16b77f31.f125737i) {
            iVar.f125792c = iVar.f125794e ? c1626x16b77f31.f125745t.g() : c1626x16b77f31.f125745t.k();
        } else {
            iVar.f125792c = iVar.f125794e ? c1626x16b77f31.f125745t.g() : c1626x16b77f31.m8037x755bd410() - c1626x16b77f31.f125745t.k();
        }
    }

    public static void b(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar) {
        iVar.f125790a = -1;
        iVar.f125791b = -1;
        iVar.f125792c = Integer.MIN_VALUE;
        iVar.f125795f = false;
        iVar.f125796g = false;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 c1626x16b77f31 = iVar.f125797h;
        if (c1626x16b77f31.l()) {
            int i17 = c1626x16b77f31.f125733e;
            if (i17 == 0) {
                iVar.f125794e = c1626x16b77f31.f125732d == 1;
                return;
            } else {
                iVar.f125794e = i17 == 2;
                return;
            }
        }
        int i18 = c1626x16b77f31.f125733e;
        if (i18 == 0) {
            iVar.f125794e = c1626x16b77f31.f125732d == 3;
        } else {
            iVar.f125794e = i18 == 2;
        }
    }

    /* renamed from: toString */
    public java.lang.String m17259x9616526c() {
        return "AnchorInfo{mPosition=" + this.f125790a + ", mFlexLinePosition=" + this.f125791b + ", mCoordinate=" + this.f125792c + ", mPerpendicularCoordinate=" + this.f125793d + ", mLayoutFromEnd=" + this.f125794e + ", mValid=" + this.f125795f + ", mAssignedFromSavedState=" + this.f125796g + '}';
    }
}
