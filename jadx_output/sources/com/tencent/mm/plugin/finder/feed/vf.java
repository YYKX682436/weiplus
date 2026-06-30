package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class vf extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f110899b;

    /* renamed from: d, reason: collision with root package name */
    public int f110901d;

    /* renamed from: h, reason: collision with root package name */
    public yj2.f f110905h;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f110900c = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f110902e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110903f = "";

    /* renamed from: g, reason: collision with root package name */
    public pm2.a f110904g = pm2.a.f356853f;

    public vf(int i17) {
        this.f110899b = i17;
    }

    @Override // hn5.c
    public int a() {
        return this.f110900c.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f110900c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        java.lang.String str;
        xh2.a data = (xh2.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        int i18 = 2;
        boolean z17 = true;
        if (!data.f454521b.f454556h) {
            km2.q qVar = data.f454520a;
            if (kotlin.jvm.internal.o.b(qVar != null ? qVar.f309170a : null, this.f110903f)) {
                i18 = 3;
            } else {
                km2.q qVar2 = data.f454520a;
                if (qVar2 != null && qVar2.f309177h) {
                    i18 = 4;
                } else {
                    if (qVar2 != null) {
                        xh2.i iVar = data.f454521b;
                        if (!iVar.f454556h) {
                            if (pm0.v.z(iVar.f454557i, 2)) {
                                i18 = 1;
                            }
                        }
                    }
                    i18 = 0;
                }
            }
            km2.q qVar3 = data.f454520a;
            if (!(qVar3 != null && qVar3.f309174e == 1)) {
                if (!(qVar3 != null && qVar3.f309185p)) {
                    z17 = false;
                }
            }
            android.content.Context context = d().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            km2.q qVar4 = data.f454520a;
            if (qVar4 == null || (str = qVar4.f309184o) == null) {
                str = "";
            }
            yj2.a aVar = new yj2.a(this.f110899b, context, i18, str);
            aVar.a(new yj2.g(data, this.f110904g, z17, this.f110901d, this.f110902e, this.f110905h));
            return aVar;
        }
        int ordinal = this.f110904g.ordinal();
        if (ordinal == 7) {
            android.content.Context context2 = d().getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            xj2.k kVar = new xj2.k(context2, null, 2, null);
            kVar.l(this.f110904g, data);
            kVar.setNeedAutoAdjust(true);
            return kVar;
        }
        if (ordinal == 8) {
            android.content.Context context3 = d().getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            xj2.n nVar = new xj2.n(context3, null);
            nVar.l(this.f110904g, data);
            nVar.setNeedAutoAdjust(true);
            return nVar;
        }
        if (ordinal != 9) {
            android.content.Context context4 = d().getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            wj2.g0 g0Var = new wj2.g0(context4, null, 2, null);
            g0Var.setNeedAutoAdjust(true);
            return g0Var;
        }
        android.content.Context context5 = d().getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        xj2.i iVar2 = new xj2.i(context5, null, 2, null);
        iVar2.l(this.f110904g, data);
        iVar2.setNeedAutoAdjust(true);
        return iVar2;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f110900c.get(i17)).f454521b;
    }
}
