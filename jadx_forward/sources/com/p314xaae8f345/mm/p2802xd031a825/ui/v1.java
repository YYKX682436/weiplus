package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f295775a;

    /* renamed from: b, reason: collision with root package name */
    public static int f295776b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f295777c;

    public static void a(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        if (f295775a == 1000) {
            int i17 = f295776b;
            if (i17 == 1) {
                if (!abstractActivityC22902xe37969e.mo63464xa6efccdf()) {
                    abstractActivityC22902xe37969e.mo67598xf0aced2e(0);
                }
                abstractActivityC22902xe37969e.mo65144xd0a01007(0);
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p2802xd031a825.a.c(abstractActivityC22902xe37969e.mo55332x76847179(), abstractActivityC22902xe37969e.m83105x7498fe14(), f295776b);
            } else if (abstractActivityC22902xe37969e.mo63463x4510f9c8() || abstractActivityC22902xe37969e.m83104x209a3aba() != 0) {
                abstractActivityC22902xe37969e.finish();
            } else {
                abstractActivityC22902xe37969e.mo65144xd0a01007(0);
            }
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.a.b(abstractActivityC22902xe37969e.mo55332x76847179(), f295776b);
        }
        f295775a = 0;
        f295776b = 0;
        f295777c = null;
    }
}
