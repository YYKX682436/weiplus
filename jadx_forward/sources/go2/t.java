package go2;

/* loaded from: classes2.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355598d;

    public t(go2.z zVar) {
        this.f355598d = zVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17 = g4Var.z();
        go2.z zVar = this.f355598d;
        if (z17) {
            g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571940u4);
            g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571948uc);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_show_post_entry, bm5.h0.RepairerConfig_Maas_ShowMainEntry_Int, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMaasXConfigImpl", "showMainPostEntry: " + z18);
            if (py0.b.f440504a.a() & z18) {
                g4Var.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.f9t);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f542028a.b(1010, zVar.F, g4Var, zVar.m80379x76847179());
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        android.app.Activity context = zVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 0, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
        android.app.Activity context2 = zVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var2, 0, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
