package ei4;

/* loaded from: classes9.dex */
public final class u implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei4.v f334776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hi4.e f334778c;

    public u(ei4.v vVar, android.content.Context context, hi4.e eVar) {
        this.f334776a = vVar;
        this.f334777b = context;
        this.f334778c = eVar;
    }

    @Override // bi4.v0
    public final void a(boolean z17, java.util.List list) {
        ei4.v vVar = this.f334776a;
        android.content.Context context = this.f334777b;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            vVar.getClass();
            if (list != null && (!list.isEmpty())) {
                pj4.j jVar = (pj4.j) kz5.n0.X(list);
                ai4.m0 m0Var = ai4.m0.f86706a;
                hi4.e eVar = this.f334778c;
                mj4.h M = m0Var.M(eVar.f76597x1c3513c9);
                hi4.k kVar = hi4.m.f363088f;
                if (M == null) {
                    new mi4.h(context, null, eVar, false, 10, null).C();
                    java.lang.String field_session_id = eVar.f76597x1c3513c9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id, "field_session_id");
                    kVar.d(field_session_id, 104);
                } else {
                    ki4.g0.f389665a.b(context, jVar.f436660f, "greeting", eVar);
                    java.lang.String field_session_id2 = eVar.f76597x1c3513c9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id2, "field_session_id");
                    kVar.d(field_session_id2, 103);
                }
            }
        } else {
            db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8), "");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = vVar.f334779d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
