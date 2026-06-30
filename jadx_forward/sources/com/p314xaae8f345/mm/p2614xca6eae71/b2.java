package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class b2 implements com.p314xaae8f345.mm.p2614xca6eae71.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2614xca6eae71.g1 f274753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274754b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f274755c;

    public b2(java.util.List codePointList, com.p314xaae8f345.mm.p2614xca6eae71.g1 picItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codePointList, "codePointList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(picItem, "picItem");
        this.f274753a = picItem;
        this.f274754b = z17;
        this.f274755c = new int[codePointList.size()];
        int i17 = 0;
        for (java.lang.Object obj : codePointList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            this.f274755c[i17] = ((java.lang.Number) obj).intValue();
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.a1
    public int[] a() {
        return this.f274755c;
    }
}
