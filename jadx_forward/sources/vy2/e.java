package vy2;

/* loaded from: classes2.dex */
public final class e extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public int f522994w;

    /* renamed from: x, reason: collision with root package name */
    public final zx2.y f522995x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f522995x = new vy2.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new vy2.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void k7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        java.lang.String[] strArr = vy2.a.f522987m;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 2) {
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
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.w2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        int N6 = ((ey2.w2) a17).N6("Finder.FinderMsgNotifyUIC_findTabIndex", 3, r17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMsgNotifyUIC", "[findTabIndex] index=" + N6);
        this.f522994w = N6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, N6, false, 2, null);
    }
}
