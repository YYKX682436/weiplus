package md2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f407370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md2.f f407373d;

    public e(android.app.Activity activity, yz5.l lVar, java.lang.String str, md2.f fVar) {
        this.f407370a = activity;
        this.f407371b = lVar;
        this.f407372c = str;
        this.f407373d = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        yz5.l lVar = this.f407371b;
        if (i17 == 0 && fVar.f152148a == 0) {
            ya2.b2 b17 = ya2.h.f542017a.b(this.f407372c);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i18 = b17 != null ? ya2.d.i(b17) : null;
            if (i18 == null) {
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                ml2.l1 l1Var = ml2.l1.f409223q;
                y4Var.getClass();
                y4Var.f409828e0 = l1Var;
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                android.app.Activity activity = this.f407370a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
                c61.ub.A3((c61.ub) c17, activity, intent, i18, 0, false, java.lang.Boolean.valueOf(((mm2.c1) this.f407373d.f407374d.a(mm2.c1.class)).a8()), null, true, (r45.j01) fVar.f152151d, new md2.d(lVar), 80, null);
            }
        } else {
            db5.t7.m123882x26a183b(this.f407370a, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
        }
        return jz5.f0.f384359a;
    }
}
