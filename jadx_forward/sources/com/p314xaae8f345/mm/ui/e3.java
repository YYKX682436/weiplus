package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f289894a;

    /* renamed from: b, reason: collision with root package name */
    public int f289895b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f289896c;

    public e3(java.lang.Object obj, int i17, java.lang.Object obj2) {
        this.f289894a = obj;
        this.f289895b = i17;
        this.f289896c = obj2;
    }

    /* renamed from: equals */
    public boolean m80633xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p314xaae8f345.mm.ui.e3.class != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.ui.e3 e3Var = (com.p314xaae8f345.mm.ui.e3) obj;
        if (this.f289895b != e3Var.f289895b) {
            return false;
        }
        java.lang.Object obj2 = e3Var.f289894a;
        java.lang.Object obj3 = this.f289894a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m80634x8cdac1b() {
        int i17 = (this.f289895b + 31) * 31;
        java.lang.Object obj = this.f289894a;
        return i17 + (obj == null ? 0 : obj.hashCode());
    }
}
