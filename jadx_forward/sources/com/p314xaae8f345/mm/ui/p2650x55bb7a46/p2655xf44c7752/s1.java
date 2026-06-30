package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class s1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f282883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282884e;

    public s1(java.util.List list, android.content.Context context) {
        this.f282883d = list;
        this.f282884e = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f282883d;
        boolean z17 = false;
        boolean z18 = list.size() <= 1;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            boolean N = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var);
            android.content.Context context = this.f282884e;
            boolean l17 = N ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.l(context, f9Var, z18) : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(context, f9Var, z18);
            if (!z17 && l17) {
                z17 = true;
            }
        }
        if (z18) {
            return "";
        }
        if (z17) {
            return "Success";
        }
        return null;
    }
}
