package nl2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m3 f419705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nl2.g f419706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bm2.m3 m3Var, nl2.g gVar) {
        super(1);
        this.f419705d = m3Var;
        this.f419706e = gVar;
    }

    public static final void a(nl2.g gVar, bm2.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et) gVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.class);
        if (etVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFastOuterCommentMsg ");
            sb6.append(j3Var != null ? j3Var.f103538a : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", sb6.toString());
            etVar.V1(j3Var, ((mm2.j2) etVar.P0(mm2.j2.class)).S6());
        }
        ((mm2.u0) gVar.m56788xbba4bfc0(mm2.u0.class)).O6(j3Var.f103541d, j3Var.f103538a, j3Var.f103542e);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String l17;
        int intValue = ((java.lang.Number) obj).intValue();
        bm2.j3 j3Var = (bm2.j3) kz5.n0.a0(this.f419705d.f103630f, intValue);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveOuterShortcutWordingController", "cannot get fastCommentInfo at " + intValue);
        } else {
            nl2.g gVar = this.f419706e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bq bqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bq(gVar.O6(), gVar.getStore().getLiveRoomData(), false, 4, null);
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i17 = r4Var.I0().getInt("finder_live_fast_comment_guide_show_cnt", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOuterShortcutWordingController", "shouldShowQuickCommentGuide " + i17);
            jz5.f0 f0Var2 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bq bqVar2 = i17 == 0 ? bqVar : null;
            if (bqVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOuterShortcutWordingController", "open guide panel");
                r4Var.I0().putInt("finder_live_fast_comment_guide_show_cnt", 1);
                gk2.e eVar = dk2.ef.I;
                if (eVar == null || (l17 = r4Var.m0(eVar).m76184x8010e5e4()) == null) {
                    l17 = c01.z1.l();
                }
                java.lang.String content = j3Var.f103538a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var3 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(l17 + ": " + content);
                android.content.Context context = bqVar2.f199716e;
                f0Var3.c(new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adi)), 0, l17.length() + 1, 33);
                f0Var3.c(new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh)), l17.length() + 1, f0Var3.length(), 33);
                bqVar2.L = f0Var3;
                bqVar2.K = new nl2.b(j3Var, gVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(bqVar2, null, false, 0, 7, null);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                a(gVar, j3Var);
            }
        }
        return f0Var;
    }
}
