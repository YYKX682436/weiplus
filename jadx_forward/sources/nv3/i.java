package nv3;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d f422210a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.yv0 f422211b;

    /* renamed from: c, reason: collision with root package name */
    public final im5.b f422212c;

    /* renamed from: d, reason: collision with root package name */
    public final long f422213d;

    /* renamed from: e, reason: collision with root package name */
    public jv3.a f422214e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f422215f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d searchComponent, r45.yv0 finderCgiType, im5.b lifeCycleKeeper, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchComponent, "searchComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderCgiType, "finderCgiType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f422210a = searchComponent;
        this.f422211b = finderCgiType;
        this.f422212c = lifeCycleKeeper;
        this.f422213d = j17;
    }

    public final void a(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c1 searchType, java.lang.String str2) {
        pq5.g l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchType, "searchType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetSearchBgmListHelper", "doSearch " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d dVar = this.f422210a;
        if (!z17) {
            this.f422215f = null;
            dVar.F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", str);
            dVar.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237780g, bundle);
        }
        java.lang.String str3 = str == null ? "" : str;
        android.app.Activity mo68350x19263085 = dVar.mo68350x19263085();
        jv3.a aVar = this.f422214e;
        if (aVar != null) {
            aVar.j();
        }
        this.f422214e = new jv3.a(this.f422211b.f472932d, 30, this.f422215f, this.f422213d, null, null, null, nv3.d.a(nv3.f.f422191l, mo68350x19263085, null, 2, null).toString(), str3, str2, 0, 0, 0, null, 15472, null);
        long c17 = c01.id.c();
        jv3.a aVar2 = this.f422214e;
        if (aVar2 == null || (l17 = aVar2.l()) == null) {
            return;
        }
        l17.f(this.f422212c);
        l17.h(new nv3.h(c17, str3, str, this, z17, searchType));
    }
}
