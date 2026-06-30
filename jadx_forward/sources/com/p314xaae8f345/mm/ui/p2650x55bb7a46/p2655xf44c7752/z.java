package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class z implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f283120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283121e;

    public z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f283120d = h0Var;
        this.f283121e = f9Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return false;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 job) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
    }

    @Override // ot0.f3
    public void f2(ot0.e3 job) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
    }

    @Override // ot0.f3
    public void k6(ot0.e3 job) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        if (job == ot0.e3.del) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f283120d;
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f282507g).iterator();
            int i17 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                f9Var = this.f283121e;
                if (!hasNext) {
                    i17 = -1;
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = ((zb5.c) it.next()).f552842b;
                if (f9Var2 != null && f9Var2.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                    break;
                } else {
                    i17++;
                }
            }
            ((java.util.ArrayList) h0Var.f282507g).removeIf(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x(f9Var));
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.y(h0Var, i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "[handleDel] msg with msgId: " + f9Var.m124847x74d37ac6() + " removed");
            if (h0Var.f282506f) {
                return;
            }
            android.content.Context context = h0Var.f282504d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((ee5.h0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ee5.h0.class)).P6(new ae5.j(null, null, null, null, null, null, null, null, f9Var.m124847x74d37ac6(), null, null, 0L, 3839, null));
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
