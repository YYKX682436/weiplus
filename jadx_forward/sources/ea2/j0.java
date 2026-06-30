package ea2;

/* loaded from: classes2.dex */
public final class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 {

    /* renamed from: v, reason: collision with root package name */
    public int f332095v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public int O6(int i17) {
        return this.f332095v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public int P6() {
        return 138;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public int Q6() {
        return m158354x19263085().getIntent().getIntExtra("key_latest_index", 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 R6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(ea2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860) a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public int T6() {
        return 15;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public boolean V6() {
        return 1 == this.f183274d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1
    public void d7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.class);
        da2.g Z6 = c13650x1bf60d72.Z6();
        r45.hj2 hj2Var = Z6.f309282a;
        r45.zi2 zi2Var = hj2Var != null ? (r45.zi2) hj2Var.m75936x14adae67(3) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = Z6.c();
        qd2.g gVar = Z6.f309286e;
        if (gVar.f443261b == null && c17 != null) {
            gVar.f443261b = c17;
            gVar.d(zi2Var);
        }
        c13650x1bf60d72.U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1
    public void e7() {
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6();
        android.content.Intent intent = m158354x19263085().getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        r45.r03 r03Var = (r45.r03) ((ea2.k0) pf5.z.f435481a.a(activity2).a(ea2.k0.class)).f534244w;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        java.lang.String str = null;
        lVarArr[1] = new jz5.l("audioid", (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.m75936x14adae67(19)) == null) ? null : hj2Var2.m75945x2fec8307(15));
        if (r03Var != null && (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) != null && (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) != null) {
            str = zi2Var.m75945x2fec8307(12);
        }
        lVarArr[2] = new jz5.l("songid", str);
        lVarArr[3] = new jz5.l("music_profile_tab_type", java.lang.Integer.valueOf(this.f183274d));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("", "page_pull_up_refresh", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.b(V6, kz5.c1.k(lVarArr)), 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f332095v = m158359x1e885992().getIntExtra("key_topic_type", 15);
        super.mo450x3e5a77bb(bundle);
        c7().u().f487351f = (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.V0().r()).intValue() - 1) * 2;
        U6().f516056b.m82690xd3a27e96(false);
        android.view.ViewGroup.LayoutParams layoutParams = U6().f516056b.getLayoutParams();
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c ? (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams : null;
        if (cVar != null) {
            ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin = (int) m158357xbe28deb0(com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
            U6().f516056b.setLayoutParams(cVar);
        }
    }
}
