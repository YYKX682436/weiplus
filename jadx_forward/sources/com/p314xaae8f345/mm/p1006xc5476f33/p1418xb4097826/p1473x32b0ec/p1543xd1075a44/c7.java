package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 f199503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f199504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199505f;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var, dk2.vg vgVar, int i17) {
        this.f199503d = d7Var;
        this.f199504e = vgVar;
        this.f199505f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.d22 d22Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = this.f199503d;
        if (itemId == d7Var.L) {
            d7Var.f199613l1.a();
            te2.j0 j0Var = d7Var.I;
            if (j0Var != null) {
                int i18 = this.f199505f;
                te2.p1 p1Var = (te2.p1) j0Var;
                dk2.vg musicItem = this.f199504e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
                gk2.e eVar = p1Var.f499820e;
                dk2.vg d17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().d();
                r45.d22 d22Var2 = d17 != null ? d17.f315787a : null;
                te2.d4 d4Var = te2.d4.f499481a;
                r45.d22 d22Var3 = musicItem.f315787a;
                if (d22Var2 == null || !dk2.q.d(d22Var3, d22Var2)) {
                    d22Var = d22Var3;
                } else {
                    d22Var = d22Var3;
                    d4Var.c(p1Var.h(), 4, musicItem, false, true);
                    if (((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.size() > 1) {
                        jz5.l c17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().c(musicItem, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315408d);
                        dk2.vg vgVar = (dk2.vg) c17.f384366d;
                        if (vgVar != null) {
                            te2.j0.M3(p1Var, vgVar, ((java.lang.Number) c17.f384367e).intValue(), false, 4, null);
                            d4Var.c(p1Var.h(), 2, musicItem, true, false);
                        } else {
                            tn0.w0 f17 = dk2.ef.f314905a.f();
                            if (f17 != null) {
                                f17.F0();
                            }
                        }
                    } else {
                        tn0.w0 f18 = dk2.ef.f314905a.f();
                        if (f18 != null) {
                            f18.F0();
                        }
                    }
                }
                dk2.p Z6 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6();
                Z6.getClass();
                java.util.ArrayList arrayList = Z6.f315410f;
                try {
                    java.lang.Object obj = arrayList.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    dk2.vg vgVar2 = (dk2.vg) obj;
                    r45.rm1 rm1Var = (r45.rm1) Z6.f315409e.get(i18);
                    if (dk2.q.d(d22Var, vgVar2.f315787a) && dk2.q.c(d22Var, rm1Var)) {
                        arrayList.remove(i18);
                        Z6.f315409e.remove(i18);
                        int i19 = Z6.f315408d;
                        if (i19 > i18) {
                            Z6.f315408d = i19 - 1;
                        } else if (i19 == i18) {
                            Z6.f315408d = -1;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "deleteMusicItem item:" + musicItem + " songId size:" + Z6.f315409e.size() + ", musicList id size:" + arrayList.size() + ", locMusicItem:" + vgVar2 + " locSongId:" + rm1Var + ", curPlayPos:" + Z6.f315408d);
                } catch (java.lang.Exception e17) {
                    hc2.c.a(e17, "FinderLiveAnchorMusicData deleteMusicItem");
                }
                if (((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.isEmpty()) {
                    te2.k0 k0Var = p1Var.f499823h;
                    if (k0Var != null) {
                        ((te2.q1) k0Var).d(false);
                    }
                } else {
                    bm2.m mVar = p1Var.f499824i;
                    if (mVar != null) {
                        mVar.b(true);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "deleteMusic bgMusicId:" + d22Var2 + ", songPlayId:" + d22Var);
                long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f410518o;
                android.content.Context context = p1Var.f499819d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String e18 = xy2.c.e(context);
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
                r45.xl1 f19 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f();
                new ek2.p1(m75942xfb822ef2, bArr, e18, j17, f19, 3, new xl2.a(m75942xfb822ef2, bArr, e18, j17, f19)).l();
                boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr = ml2.u2.f409642d;
                d4Var.a(a86, 4, dk2.q.e(d22Var), p1Var.f499830r);
            }
            d7Var.e0(false);
        }
    }
}
