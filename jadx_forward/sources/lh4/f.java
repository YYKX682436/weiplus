package lh4;

/* loaded from: classes8.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lh4.h f400239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400240f;

    public f(boolean z17, lh4.h hVar, int i17) {
        this.f400238d = z17;
        this.f400239e = hVar;
        this.f400240f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (!this.f400238d) {
            i17 = 1;
        }
        int i18 = this.f400240f;
        lh4.h hVar = this.f400239e;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            hVar.e(i18);
            return;
        }
        gh4.e0 e0Var = (gh4.e0) i95.n0.c(gh4.e0.class);
        java.lang.String field_id = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) hVar.m145780xa0ab20ce().f400257d).get(i18)).f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) hVar.m145780xa0ab20ce().f400257d).get(i18)).f66793x2262335f;
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Ai = e0Var.Ai(field_id);
        if (Ai != null) {
            com.p314xaae8f345.mm.vfs.w6.c(gh4.m0.f353473b + field_id, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.b(field_id));
            lk3.b aj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).aj();
            if (aj6 != null) {
                if (aj6.Y6(field_id, i19) == null) {
                    com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.U6(aj6, Ai, false, false, false, 14, null);
                    nk3.f.f419574a.d(Ai, 3L, 2L, "", "");
                } else {
                    com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(aj6, Ai, false, false, 6, null);
                    nk3.f.f419574a.d(Ai, 3L, 1L, "", "");
                }
            }
        }
        db5.t7.h(hVar.getContext(), i65.a.r(hVar.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571840rc));
    }
}
