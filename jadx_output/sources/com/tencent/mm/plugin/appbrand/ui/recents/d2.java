package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public abstract class d2 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f90065a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f90066b;

    public d2(java.util.List list, java.util.List list2) {
        this.f90065a = list;
        this.f90066b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public final int d() {
        java.util.List list = this.f90066b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public final int e() {
        java.util.List list = this.f90065a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
