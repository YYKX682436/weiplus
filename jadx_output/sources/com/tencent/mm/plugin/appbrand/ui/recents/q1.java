package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes15.dex */
public class q1 implements androidx.recyclerview.widget.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a2 f90140a;

    public q1(com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var) {
        this.f90140a = a2Var;
    }

    @Override // androidx.recyclerview.widget.k2
    public void a() {
        synchronized (this.f90140a.f90031w) {
            java.util.Iterator it = new java.util.HashSet(this.f90140a.f90031w).iterator();
            while (it.hasNext()) {
                ((androidx.recyclerview.widget.k2) it.next()).a();
            }
        }
        this.f90140a.L = false;
    }
}
