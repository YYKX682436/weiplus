package com.p314xaae8f345.mm.ui;

/* loaded from: classes2.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public final int f278668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f278669b;

    public ah(int i17, int i18) {
        this.f278668a = i17;
        this.f278669b = i18;
    }

    /* renamed from: equals */
    public boolean m78824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.ah)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.ah ahVar = (com.p314xaae8f345.mm.ui.ah) obj;
        return this.f278668a == ahVar.f278668a && this.f278669b == ahVar.f278669b;
    }

    /* renamed from: hashCode */
    public int m78825x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f278668a) * 31) + java.lang.Integer.hashCode(this.f278669b);
    }

    /* renamed from: toString */
    public java.lang.String m78826x9616526c() {
        return "Size(width=" + this.f278668a + ", height=" + this.f278669b + ')';
    }
}
