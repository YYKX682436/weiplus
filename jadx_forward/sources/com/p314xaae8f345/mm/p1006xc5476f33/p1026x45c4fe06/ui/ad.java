package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final int f171043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f171044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171046d;

    public ad(int i17, int i18, int i19, int i27) {
        this.f171043a = i17;
        this.f171044b = i18;
        this.f171045c = i19;
        this.f171046d = i27;
    }

    /* renamed from: equals */
    public boolean m52929xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad) obj;
        return this.f171043a == adVar.f171043a && this.f171044b == adVar.f171044b && this.f171045c == adVar.f171045c && this.f171046d == adVar.f171046d;
    }

    /* renamed from: hashCode */
    public int m52930x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f171043a) * 31) + java.lang.Integer.hashCode(this.f171044b)) * 31) + java.lang.Integer.hashCode(this.f171045c)) * 31) + java.lang.Integer.hashCode(this.f171046d);
    }

    /* renamed from: toString */
    public java.lang.String m52931x9616526c() {
        return "Padding(left=" + this.f171043a + ", top=" + this.f171044b + ", right=" + this.f171045c + ", bottom=" + this.f171046d + ')';
    }
}
