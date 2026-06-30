package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes10.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f144893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f144894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f144895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        super(1);
        this.f144893d = j17;
        this.f144894e = c0Var;
        this.f144895f = c0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p642xad8b531f.a1 fixUp = (com.p314xaae8f345.mm.p642xad8b531f.a1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fixUp, "fixUp");
        long j17 = this.f144893d;
        long j18 = fixUp.f144831a;
        boolean z17 = true;
        long j19 = fixUp.f144832b;
        if (j17 >= j18 && j17 < j19 && !fixUp.a().contains(java.lang.Long.valueOf(j17))) {
            if (fixUp.a().contains(java.lang.Long.valueOf(j17))) {
                this.f144894e.f391645d = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "fixUp distinct: syncNum=" + j17 + ", fixUp=" + fixUp);
            } else {
                this.f144895f.f391645d = true;
                fixUp.a().add(java.lang.Long.valueOf(j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.NotifyReceiver", "fixUp success: syncNum=" + j17 + ", fixUp=" + fixUp);
            }
        }
        e06.n nVar = j19 <= Long.MIN_VALUE ? e06.n.f327757g : new e06.n(j18, j19 - 1);
        if (!(nVar instanceof java.util.Collection) || !((java.util.Collection) nVar).isEmpty()) {
            java.util.Iterator it = nVar.iterator();
            while (true) {
                if (!((e06.m) it).f327755f) {
                    break;
                }
                if (!fixUp.a().contains(java.lang.Long.valueOf(((kz5.y0) it).b()))) {
                    z17 = false;
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
