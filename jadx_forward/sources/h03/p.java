package h03;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h03.q f359442d;

    public p(h03.q qVar) {
        this.f359442d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h03.q qVar = this.f359442d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = qVar.f359443d;
        if (c19792x256d2725 != null) {
            so2.u1 c17 = c03.i.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0));
            java.lang.Integer num = qVar.f359444e;
            h03.q.a(qVar, c17, num != null ? num.intValue() : 162);
            qVar.f359443d = null;
        }
    }
}
