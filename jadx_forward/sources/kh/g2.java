package kh;

/* loaded from: classes12.dex */
public final class g2 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.h2 f389346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(kh.h2 h2Var, kh.h2 h2Var2) {
        super(h2Var, h2Var2);
        this.f389346e = h2Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.h2 h2Var = new kh.h2();
        kh.h2 h2Var2 = (kh.h2) this.f477018b;
        h2Var.f389327d = h2Var2.f389327d;
        h2Var.f389328e = h2Var2.f389328e;
        long j17 = h2Var2.f389329f;
        kh.h2 h2Var3 = this.f389346e;
        h2Var.f389329f = j17 - h2Var3.f389329f;
        rh.x2 x2Var = h2Var3.f389330g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var);
        rh.x2 x2Var2 = h2Var2.f389330g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var2);
        h2Var.f389330g = rh.p2.a(x2Var, x2Var2);
        rh.x2 x2Var3 = h2Var3.f389331h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var3);
        rh.x2 x2Var4 = h2Var2.f389331h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var4);
        h2Var.f389331h = rh.p2.a(x2Var3, x2Var4);
        return h2Var;
    }
}
