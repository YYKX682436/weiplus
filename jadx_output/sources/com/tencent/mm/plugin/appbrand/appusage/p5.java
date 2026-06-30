package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class p5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76543d = 0;

    public p5(com.tencent.mm.plugin.appbrand.appusage.q5 q5Var, com.tencent.mm.plugin.appbrand.appusage.o5 o5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76543d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76543d;
        this.f76543d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appusage.d7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
