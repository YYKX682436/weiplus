package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f289231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289232e;

    public g5(xg3.l0 l0Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f289231d = l0Var;
        this.f289232e = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.l0 l0Var = this.f289231d;
        if (l0Var != null) {
            java.lang.String str = l0Var.f535944b;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "insert");
            java.util.ArrayList arrayList = l0Var.f535945c;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289232e;
            if (b17) {
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
                    if (f9Var != null) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.a(o5Var, l0Var, f9Var, true);
                    }
                }
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "update")) {
                int size2 = arrayList.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i18);
                    if (f9Var2 != null) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.a(o5Var, l0Var, f9Var2, false);
                    }
                }
            }
        }
    }
}
