package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class vf extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f192432b;

    /* renamed from: d, reason: collision with root package name */
    public int f192434d;

    /* renamed from: h, reason: collision with root package name */
    public yj2.f f192438h;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f192433c = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f192435e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f192436f = "";

    /* renamed from: g, reason: collision with root package name */
    public pm2.a f192437g = pm2.a.f438386f;

    public vf(int i17) {
        this.f192432b = i17;
    }

    @Override // hn5.c
    public int a() {
        return this.f192433c.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f192433c.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        java.lang.String str;
        xh2.a data = (xh2.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i18 = 2;
        boolean z17 = true;
        if (!data.f536054b.f536089h) {
            km2.q qVar = data.f536053a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar != null ? qVar.f390703a : null, this.f192436f)) {
                i18 = 3;
            } else {
                km2.q qVar2 = data.f536053a;
                if (qVar2 != null && qVar2.f390710h) {
                    i18 = 4;
                } else {
                    if (qVar2 != null) {
                        xh2.i iVar = data.f536054b;
                        if (!iVar.f536089h) {
                            if (pm0.v.z(iVar.f536090i, 2)) {
                                i18 = 1;
                            }
                        }
                    }
                    i18 = 0;
                }
            }
            km2.q qVar3 = data.f536053a;
            if (!(qVar3 != null && qVar3.f390707e == 1)) {
                if (!(qVar3 != null && qVar3.f390718p)) {
                    z17 = false;
                }
            }
            android.content.Context context = d().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            km2.q qVar4 = data.f536053a;
            if (qVar4 == null || (str = qVar4.f390717o) == null) {
                str = "";
            }
            yj2.a aVar = new yj2.a(this.f192432b, context, i18, str);
            aVar.a(new yj2.g(data, this.f192437g, z17, this.f192434d, this.f192435e, this.f192438h));
            return aVar;
        }
        int ordinal = this.f192437g.ordinal();
        if (ordinal == 7) {
            android.content.Context context2 = d().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            xj2.k kVar = new xj2.k(context2, null, 2, null);
            kVar.l(this.f192437g, data);
            kVar.m175623x505f1856(true);
            return kVar;
        }
        if (ordinal == 8) {
            android.content.Context context3 = d().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            xj2.n nVar = new xj2.n(context3, null);
            nVar.l(this.f192437g, data);
            nVar.m175627x505f1856(true);
            return nVar;
        }
        if (ordinal != 9) {
            android.content.Context context4 = d().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            wj2.g0 g0Var = new wj2.g0(context4, null, 2, null);
            g0Var.m174004x505f1856(true);
            return g0Var;
        }
        android.content.Context context5 = d().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        xj2.i iVar2 = new xj2.i(context5, null, 2, null);
        iVar2.l(this.f192437g, data);
        iVar2.m175627x505f1856(true);
        return iVar2;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f192433c.get(i17)).f536054b;
    }
}
