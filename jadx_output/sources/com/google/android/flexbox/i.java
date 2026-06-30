package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public int f44257a;

    /* renamed from: b, reason: collision with root package name */
    public int f44258b;

    /* renamed from: c, reason: collision with root package name */
    public int f44259c;

    /* renamed from: d, reason: collision with root package name */
    public int f44260d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44262f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.flexbox.FlexboxLayoutManager f44264h;

    public i(com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager, com.google.android.flexbox.h hVar) {
        this.f44264h = flexboxLayoutManager;
    }

    public static void a(com.google.android.flexbox.i iVar) {
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = iVar.f44264h;
        if (flexboxLayoutManager.l() || !flexboxLayoutManager.f44204i) {
            iVar.f44259c = iVar.f44261e ? flexboxLayoutManager.f44212t.g() : flexboxLayoutManager.f44212t.k();
        } else {
            iVar.f44259c = iVar.f44261e ? flexboxLayoutManager.f44212t.g() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.f44212t.k();
        }
    }

    public static void b(com.google.android.flexbox.i iVar) {
        iVar.f44257a = -1;
        iVar.f44258b = -1;
        iVar.f44259c = Integer.MIN_VALUE;
        iVar.f44262f = false;
        iVar.f44263g = false;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = iVar.f44264h;
        if (flexboxLayoutManager.l()) {
            int i17 = flexboxLayoutManager.f44200e;
            if (i17 == 0) {
                iVar.f44261e = flexboxLayoutManager.f44199d == 1;
                return;
            } else {
                iVar.f44261e = i17 == 2;
                return;
            }
        }
        int i18 = flexboxLayoutManager.f44200e;
        if (i18 == 0) {
            iVar.f44261e = flexboxLayoutManager.f44199d == 3;
        } else {
            iVar.f44261e = i18 == 2;
        }
    }

    public java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.f44257a + ", mFlexLinePosition=" + this.f44258b + ", mCoordinate=" + this.f44259c + ", mPerpendicularCoordinate=" + this.f44260d + ", mLayoutFromEnd=" + this.f44261e + ", mValid=" + this.f44262f + ", mAssignedFromSavedState=" + this.f44263g + '}';
    }
}
