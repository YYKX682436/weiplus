package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class h4 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f171992a;

    /* renamed from: b, reason: collision with root package name */
    public int f171993b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g4 f171994c;

    public h4(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g4 g4Var) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context));
        this.f171992a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
        this.f171993b = 45;
        this.f171994c = g4Var;
    }

    @Override // android.view.OrientationEventListener
    public void disable() {
        super.disable();
        this.f171992a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 == -1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var = this.f171992a;
        int i18 = this.f171993b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var2 = ((i17 < 360 - i18 || i17 >= 360) && (i17 < 0 || i17 > i18 + 0)) ? (i17 < 270 - i18 || i17 > i18 + 270) ? (i17 < 180 - i18 || i17 > i18 + 180) ? (i17 < 90 - i18 || i17 > i18 + 90) ? f4Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.REVERSE_LANDSCAPE : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.REVERSE_PORTRAIT : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.PORTRAIT;
        if (f4Var2 != f4Var) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g4 g4Var = this.f171994c;
            if (g4Var != null && f4Var != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE) {
                g4Var.a(f4Var, f4Var2);
            }
            this.f171992a = f4Var2;
        }
    }
}
