package uc5;

/* loaded from: classes10.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f508056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f508057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl5.r f508059g;

    public m(uc5.d dVar, uc5.n nVar, android.content.Context context, rl5.r rVar) {
        this.f508056d = dVar;
        this.f508057e = nVar;
        this.f508058f = context;
        this.f508059g = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = null;
        ad5.t0 t0Var = new ad5.t0(null, 1, null);
        ad5.q0 q0Var = ad5.q0.f84833a;
        java.util.List c17 = kz5.b0.c(this.f508056d.p());
        java.util.Map map = t0Var.f84847a;
        map.put(q0Var, c17);
        map.put(ad5.r0.f84836a, ad5.p0.f84824d);
        uc5.n nVar = this.f508057e;
        uc5.r rVar = nVar.f508064g;
        android.content.Context context = this.f508058f;
        if (rVar == null) {
            rVar = context instanceof uc5.r ? (uc5.r) context : null;
        }
        if (rVar != null) {
            ad5.o0 o0Var = ad5.o0.f84823a;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a k76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar).k7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k76, "null cannot be cast to non-null type kotlin.Any");
            map.put(o0Var, k76);
            map.put(ad5.n0.f84822a, new uc5.l(rVar));
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ad5.l0 l0Var = (ad5.l0) kz5.z.U(nVar.f508062e, menuItem.getItemId());
            if (l0Var != null) {
                l0Var.d(context, t0Var);
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHistoryGalleryBaseItemConvert", m143898xd4a2fc34, "showActionPopupMenu operate failed", new java.lang.Object[0]);
            this.f508059g.a();
        }
    }
}
