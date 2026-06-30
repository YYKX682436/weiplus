package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes6.dex */
public class d5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f76416d = 0;

    public d5(com.tencent.mm.plugin.appbrand.appusage.e5 e5Var, com.tencent.mm.plugin.appbrand.appusage.c5 c5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76416d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f76416d;
        this.f76416d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.taskbar.ui.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
