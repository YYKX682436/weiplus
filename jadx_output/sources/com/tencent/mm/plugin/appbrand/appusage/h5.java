package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class h5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76461d = 0;

    public h5(com.tencent.mm.plugin.appbrand.appusage.i5 i5Var, com.tencent.mm.plugin.appbrand.appusage.g5 g5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76461d;
        this.f76461d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.taskbar.ui.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
