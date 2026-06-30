package aw4;

/* loaded from: classes.dex */
public final class f0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96408d;

    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, java.lang.String str, tg0.h1 h1Var) {
        this.f96405a = c0Var;
        this.f96406b = c0Var2;
        this.f96407c = str;
        this.f96408d = h1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f96405a;
        if (c0Var.f391645d || this.f96406b.f391645d) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean(this.f96407c, false);
        tg0.h1 h1Var = this.f96408d;
        if (h1Var != null) {
            h1Var.a(c0Var.f391645d);
        }
    }
}
