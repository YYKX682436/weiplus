package cj4;

/* loaded from: classes11.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f42053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f42055f;

    public y0(cj4.i1 i1Var, android.content.Context context, mj4.h hVar) {
        this.f42053d = i1Var;
        this.f42054e = context;
        this.f42055f = hVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        di4.i.f232782a.f(false);
        int itemId = menuItem.getItemId();
        bw5.jn0 jn0Var = bw5.jn0.STATUS_UNKNOWN;
        bi4.o1 o1Var = bi4.o1.f21075a;
        qj4.s sVar = qj4.s.f363958a;
        android.content.Context context = this.f42054e;
        mj4.h hVar = this.f42055f;
        cj4.i1 i1Var = this.f42053d;
        if (itemId == com.tencent.mm.R.id.jgy) {
            i1Var.getClass();
            bi4.k1 k1Var = i1Var.f41942d;
            if (hVar != null) {
                new bi4.d1();
                bi4.d1 z17 = i1Var.z(true);
                z17.f354949s = 1;
                z17.f354950t = en1.a.a();
                mj4.k kVar = (mj4.k) hVar;
                z17.E = kVar.l();
                z17.f354956z = bk4.i.a().H();
                z17.L = sVar.f(k1Var.f21067g, i1Var.g()).f29056d;
                o1Var.a(context, z17, null);
                ej4.e0.f253344c.a(kVar.l());
                java.lang.String a17 = en1.a.a();
                long j17 = z17.f354942i;
                bw5.jn0 a18 = bw5.jn0.a(z17.L);
                bw5.jn0 jn0Var2 = a18 == null ? jn0Var : a18;
                java.lang.String str = z17.f354941h;
                kotlin.jvm.internal.o.d(a17);
                kotlin.jvm.internal.o.d(str);
                sVar.u(new qj4.l(a17, true, j17, null, str, jn0Var2, null, 72, null));
            }
            if (bi4.v1.i()) {
                new com.tencent.mm.autogen.events.StatusSquareUpdateEvent().e();
            }
            qj4.s.m(sVar, this.f42054e, 35L, null, this.f42055f, 0L, 0L, 0L, 0L, null, null, k1Var.f21067g, 1012, null);
            return;
        }
        if (itemId != com.tencent.mm.R.id.jhb) {
            if (itemId != com.tencent.mm.R.id.jgq) {
                if (itemId == com.tencent.mm.R.id.f485905ug1) {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310568a, null, new cj4.x0(hVar, context, null), 2, null);
                    return;
                }
                return;
            }
            if (bi4.v1.i()) {
                new com.tencent.mm.autogen.events.StatusSquareUpdateEvent().e();
            }
            if (hVar != null) {
                mj4.k kVar2 = (mj4.k) hVar;
                ej4.a aVar = new ej4.a(kVar2.l(), 1);
                cj4.i1.s(i1Var, 5967);
                gm0.j1.d().g(aVar);
                i1Var.S = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f493361jv4), context.getString(com.tencent.mm.R.string.f493361jv4), false, false, new cj4.t0(aVar, i1Var));
                qj4.s.m(sVar, context, 33L, null, kVar2, 0L, 0L, 0L, 0L, null, null, i1Var.f41942d.f21067g, 1012, null);
                return;
            }
            return;
        }
        if (bi4.v1.i()) {
            new com.tencent.mm.autogen.events.StatusSquareUpdateEvent().e();
        }
        i1Var.getClass();
        new android.os.Bundle();
        bi4.d1 z18 = i1Var.z(false);
        z18.f354942i = sVar.c(i1Var.g(), false, i1Var.R != null);
        z18.L = sVar.f(i1Var.f41942d.f21067g, i1Var.g()).f29056d;
        o1Var.a(context, z18, null);
        qj4.s.l(sVar, 16L, null, null, 0L, null, 0L, 62, null);
        java.lang.String a19 = en1.a.a();
        long j18 = z18.f354942i;
        bw5.jn0 a27 = bw5.jn0.a(z18.L);
        bw5.jn0 jn0Var3 = a27 == null ? jn0Var : a27;
        java.lang.String str2 = z18.f354941h;
        kotlin.jvm.internal.o.d(a19);
        kotlin.jvm.internal.o.d(str2);
        sVar.u(new qj4.l(a19, true, j18, null, str2, jn0Var3, null, 72, null));
        qj4.s.m(sVar, this.f42054e, 32L, null, this.f42055f, 0L, 0L, 0L, 0L, null, null, r2.f21067g, 1012, null);
    }
}
