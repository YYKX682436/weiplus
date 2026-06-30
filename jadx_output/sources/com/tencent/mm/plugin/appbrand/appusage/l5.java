package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class l5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76514d = 0;

    public l5(com.tencent.mm.plugin.appbrand.appusage.m5 m5Var, com.tencent.mm.plugin.appbrand.appusage.k5 k5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76514d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76514d;
        this.f76514d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.taskbar.ui.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
