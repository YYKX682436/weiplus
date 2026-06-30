package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/wa;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfUI */
/* loaded from: classes2.dex */
public final class ActivityC15063x2c6bbac6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements zy2.wa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 95;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.m8.class)), pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.o8.class)), sr2.l5.class, hy2.f.class, d92.a2.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.o5.class)), pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.n5.class))});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ig(this));
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(this).c(zy2.ra.class))).V6();
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, getIntent().getStringExtra("key_ref_feed_dup_flag"), intExtra);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSelfUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 40, 1, false);
        jz5.l[] lVarArr = new jz5.l[7];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[0] = new jz5.l("enterscene", java.lang.Integer.valueOf(c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0));
        lVarArr[1] = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        lVarArr[4] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        lVarArr[5] = new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(intExtra));
        lVarArr[6] = new jz5.l("source_feed_sessionbuffer", ek6);
        aVar.gk(this, kz5.c1.k(lVarArr));
    }
}
