package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.j0 f150304d = new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.j0();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] a17 = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403.f134628p.a();
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var = com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a;
        int i17 = 0;
        for (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 : a17) {
            com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e = c4720x9bbc2403.f134635m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4723x52a73b7e);
            i17 += c4723x52a73b7e.f134647d;
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.a(k0Var, a17, 2001, i17, 0L);
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var2 = com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        for (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc24032 : a17) {
            if (!z17) {
                sb6.append("\n|> SystemInfo: " + c4720x9bbc24032.f134634i + '\n');
                z17 = true;
            }
            sb6.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("|> Process   : ");
            com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d = c4720x9bbc24032.f134630e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d);
            sb7.append(c4722x6f76cf9d.f134642e);
            sb7.append('\n');
            sb6.append(sb7.toString());
            sb6.append("|> AMS-Pss   : " + c4720x9bbc24032.f134635m + '\n');
            sb6.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6.toString(), "toString(...)");
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var3 = com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a;
        java.lang.String.valueOf(k0Var3.l(a17));
        k0Var3.j().f381419f.C(1, 1, a17, a17);
        k0Var3.g().f381419f.C(1, 1, a17, a17);
        k0Var3.f().f381419f.C(1, 1, a17, a17);
        k0Var3.e().f381419f.C(1, 1, a17, a17);
        k0Var3.d().f381419f.C(1, 1, a17, a17);
        k0Var3.c().f381419f.C(1, 1, a17, a17);
        k0Var3.b().f381419f.C(1, 1, a17, a17);
        k0Var3.i().f381419f.C(1, 1, a17, a17);
        k0Var3.h().f381419f.C(1, 1, a17, a17);
        com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var4 = com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0.f150306a;
        java.lang.Object bgStatefulOwner = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495;
        yz5.r mVar = new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.m((long) (1024 * 500.0d));
        if ((32 & 2) != 0) {
            bgStatefulOwner = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4682x5dbe6c9e.f19972x4fbc8495;
        }
        if ((32 & 4) != 0) {
            java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
        }
        if ((32 & 64) != 0) {
            mVar = ji.f.f381412d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgStatefulOwner, "bgStatefulOwner");
        java.util.concurrent.TimeUnit.MINUTES.toMillis(5L);
        mVar.C(1, 1, a17, a17);
    }
}
