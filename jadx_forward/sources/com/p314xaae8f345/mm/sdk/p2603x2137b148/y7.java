package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f274636a;

    /* renamed from: b, reason: collision with root package name */
    public int f274637b;

    public y7(int i17) {
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleObjectPool", "The max pool size must be > 0");
        } else {
            this.f274636a = new java.lang.Object[i17];
        }
    }

    public java.lang.Object a() {
        int i17;
        java.lang.Object[] objArr = this.f274636a;
        if (objArr == null || (i17 = this.f274637b) <= 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.lang.Object obj = objArr[i18];
        objArr[i18] = null;
        this.f274637b = i17 - 1;
        return obj;
    }

    public boolean b(java.lang.Object obj) {
        boolean z17;
        java.lang.Object[] objArr = this.f274636a;
        if (objArr == null) {
            return false;
        }
        if (objArr != null) {
            for (int i17 = 0; i17 < this.f274637b; i17++) {
                if (objArr[i17] == obj) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
        int i18 = this.f274637b;
        if (i18 >= objArr.length || i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleObjectPool", "error index %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(objArr.length));
            return false;
        }
        objArr[i18] = obj;
        this.f274637b = i18 + 1;
        return true;
    }
}
