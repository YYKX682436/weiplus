package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f168032a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ac(this);

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f168033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc f168034c;

    public cc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vb vbVar) {
        this.f168034c = dcVar;
    }

    public final void a() {
        android.view.View mo51310xc2a54588 = this.f168034c.f168072a.mo51310xc2a54588();
        if (mo51310xc2a54588 != null) {
            mo51310xc2a54588.removeCallbacks(this.f168032a);
            if (this.f168033b != null) {
                mo51310xc2a54588.getViewTreeObserver().removeOnGlobalLayoutListener(this.f168033b);
            }
        }
    }
}
