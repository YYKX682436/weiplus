package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fp extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public int f215950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        gy2.d dVar = new gy2.d();
        int intExtra = m158359x1e885992().getIntExtra("key_mention_business_type", 0);
        this.f215950w = intExtra;
        if (intExtra == 1) {
            dVar.m63016x76506300(kz5.c0.d(new gy2.b(com.p314xaae8f345.mm.R.C30867xcad56011.erx, intExtra), new gy2.b(com.p314xaae8f345.mm.R.C30867xcad56011.erv, this.f215950w), new gy2.b(com.p314xaae8f345.mm.R.C30867xcad56011.erz, this.f215950w)));
        }
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void k7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        java.lang.String[] strArr = this.f215950w == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kq.f216513i : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kq.f216514m;
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            zx2.i b76 = b7(i18);
            if (b76 instanceof gy2.b) {
                ((gy2.b) b76).r("", false);
            }
            i17++;
            i18 = i19;
        }
    }

    @Override // zx2.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        this.f215950w = m158359x1e885992().getIntExtra("key_mention_business_type", 0);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210107t;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15031xc8d49129.f210111x == 1 ? 2 : 1;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.f2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        int N6 = ((ey2.f2) a17).N6("Finder.FinderMsgNotifyUIC", i17, xy2.c.e(m80379x76847179()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMsgNotifyUIC", "[findTabIndex] tabStateType:" + i17 + ",index=" + N6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, N6, false, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.a(m80379x76847179(), 3);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("FinderMessageEntryRight", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cp.f215563d, false, xy2.c.e(m80379x76847179()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("AuthorProfileNotify", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dp.f215688d, false, xy2.c.e(m80379x76847179()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            c15436x4c00d79.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ep(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        x7(X6());
    }

    public final java.lang.String w7(int i17) {
        return this.f215950w == 1 ? i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "MemberNotificationCenterJoin" : "MemberNotificationCenterComment" : "MemberNotificationCenterLike" : i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike";
    }

    public final void x7(int i17) {
        int i18 = this.f215950w == 1 ? i17 + 4 : i17 + 1;
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(m80379x76847179());
        lVarArr[0] = new jz5.l("finder_context_id", e17 != null ? e17.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(m80379x76847179());
        lVarArr[1] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(m80379x76847179());
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f216913n) : null);
        lVarArr[3] = new jz5.l("finder_message_tab", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("finder_message_tab_list", "view_unexp", kz5.c1.k(lVarArr), 25496);
    }
}
