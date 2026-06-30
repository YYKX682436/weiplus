package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f282866a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f282867b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f282868c = new java.util.ArrayList();

    public r4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.o4 o4Var) {
    }

    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        java.util.ArrayList arrayList = this.f282866a;
        arrayList.remove(f9Var);
        arrayList.remove(c(f9Var.m124847x74d37ac6()));
        arrayList.add(f9Var);
        java.util.Iterator it = this.f282868c.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4) it.next()).l0(f9Var, true);
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f282866a.clear();
        java.util.Iterator it = this.f282868c.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4) it.next()).mo79579x5a5b64d();
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 c(long j17) {
        java.util.Iterator it = this.f282866a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.m124847x74d37ac6() == j17) {
                return f9Var;
            }
        }
        return null;
    }

    public boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        java.util.Iterator it = this.f282866a.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                return true;
            }
        }
        return false;
    }

    public void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        java.util.ArrayList arrayList = this.f282866a;
        arrayList.remove(f9Var);
        arrayList.remove(c(f9Var.m124847x74d37ac6()));
        java.util.Iterator it = this.f282868c.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4) it.next()).l0(f9Var, false);
        }
    }

    public int f() {
        return this.f282866a.size();
    }
}
