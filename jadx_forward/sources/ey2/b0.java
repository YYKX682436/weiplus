package ey2;

/* loaded from: classes2.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f338857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_OPEN_FINDER_ENTRANCE", false);
        this.f338857d = m158359x1e885992().getBooleanExtra("KEY_OPEN_FINDER_ENTRANCE_FROM_PROFILE_GUIDE", false);
        m158359x1e885992().removeExtra("KEY_OPEN_FINDER_ENTRANCE");
        m158359x1e885992().removeExtra("KEY_OPEN_FINDER_ENTRANCE_FROM_PROFILE_GUIDE");
        if (booleanExtra) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea) a17).O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba(0, "EntranceDialog", new ey2.x(this)));
        }
    }
}
