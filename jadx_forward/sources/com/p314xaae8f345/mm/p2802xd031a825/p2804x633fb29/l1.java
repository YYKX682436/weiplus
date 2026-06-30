package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes11.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f295465a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295466b;

    public l1(int i17, java.lang.String str) {
        this.f295465a = i17;
        this.f295466b = str;
    }

    /* renamed from: equals */
    public boolean m82997xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l1)) {
            return false;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l1 l1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l1) obj;
        if (this.f295465a != l1Var.f295465a) {
            return false;
        }
        java.lang.String str = l1Var.f295466b;
        java.lang.String str2 = this.f295466b;
        return str2 == null ? str == null : str2.equals(str);
    }
}
