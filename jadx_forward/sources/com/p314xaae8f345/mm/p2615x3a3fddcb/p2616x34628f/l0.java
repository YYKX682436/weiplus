package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes5.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f275056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f275057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f275058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p098xc4a6178c.p099x38a77192.e f275059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n85.t f275060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i17, int i18, e0.f1 f1Var, p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar, n85.t tVar) {
        super(0);
        this.f275056d = i17;
        this.f275057e = i18;
        this.f275058f = f1Var;
        this.f275059g = eVar;
        this.f275060h = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n85.t tVar;
        e0.f1 listState = this.f275058f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listState, "listState");
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.e items = this.f275059g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        n85.t tVar2 = null;
        if (!listState.a()) {
            e0.h0 f17 = listState.f();
            java.util.Iterator it = f17.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e0.q0 q0Var = (e0.q0) ((e0.n) it.next());
                int i17 = q0Var.f327212b;
                if (i17 <= 0 || i17 >= items.c()) {
                    tVar = null;
                } else {
                    tVar = (n85.t) ((g4.u0) ((n0.q4) items.f93250b).mo128745x754a37bb()).get(i17 - 1);
                }
                if (tVar != null && (tVar instanceof n85.s)) {
                    int f18 = f17.f();
                    int i18 = q0Var.f327211a;
                    if (f18 - i18 < this.f275057e) {
                        break;
                    }
                    if (i18 > (-this.f275056d)) {
                        tVar2 = tVar;
                        break;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2, this.f275060h));
    }
}
