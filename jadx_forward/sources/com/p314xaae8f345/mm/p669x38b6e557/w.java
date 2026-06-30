package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f146382d;

    public w(android.content.Context context) {
        this.f146382d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(lp0.b.g0(), false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    x1Var.a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p669x38b6e557.a(this));
    }
}
