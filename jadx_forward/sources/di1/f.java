package di1;

/* loaded from: classes8.dex */
public final class f implements zh1.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f314162a;

    /* renamed from: b, reason: collision with root package name */
    public final bi1.g f314163b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f314164c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f314165d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f314166e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f314167f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f314168g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f314169h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f314170i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f314171j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f314172k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f314173l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f314174m;

    public f(long j17, bi1.g _openMaterialScene, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_openMaterialScene, "_openMaterialScene");
        this.f314162a = j17;
        this.f314163b = _openMaterialScene;
        this.f314164c = c12473xe2bfc4b5;
        jz5.i iVar = jz5.i.f384364f;
        this.f314165d = jz5.h.a(iVar, di1.d.f314160d);
        this.f314166e = jz5.h.a(iVar, di1.e.f314161d);
        this.f314167f = jz5.h.a(iVar, di1.b.f314158d);
        this.f314168g = jz5.h.a(iVar, new di1.a(this));
        this.f314169h = jz5.h.a(iVar, new di1.c(this));
        this.f314170i = new java.util.HashSet();
        this.f314171j = new java.util.HashSet();
        if (str == null) {
            str = c01.n2.a("OpenMaterial#" + _openMaterialScene.name());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "buildSessionId(...)");
        }
        this.f314173l = str;
        this.f314174m = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + this.f314173l;
    }

    public long a() {
        int ordinal = this.f314163b.ordinal();
        if (ordinal == 0) {
            return 1L;
        }
        if (ordinal == 1) {
            return 2L;
        }
        if (ordinal == 2) {
            return 3L;
        }
        if (ordinal == 3) {
            return 4L;
        }
        if (ordinal == 4) {
            return 5L;
        }
        if (ordinal == 5) {
            return 6L;
        }
        throw new jz5.j();
    }

    public final long b() {
        return ((java.lang.Number) this.f314168g.mo141623x754a37bb()).longValue();
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc c() {
        return (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc) this.f314165d.mo141623x754a37bb();
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onBottomSheetListPageEntranceExposure");
        if (this.f314172k) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc c17 = c();
        c17.p(this.f314173l);
        c17.f144437k = this.f314162a;
        c17.f144431e = 2L;
        c17.f144432f = a();
        c17.f144433g = b();
        c17.f144434h = 0L;
        c17.k();
        this.f314172k = true;
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onBottomSheetMoreClick");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc c17 = c();
        c17.p(this.f314173l);
        c17.f144437k = this.f314162a;
        c17.f144431e = 3L;
        c17.f144432f = a();
        c17.f144433g = b();
        c17.f144434h = 0L;
        c17.k();
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 openMaterialDetailModel) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialDetailModel, "openMaterialDetailModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onListPageAppBrandClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = this.f314164c;
        long indexOf = ((c12473xe2bfc4b5 == null || (list = c12473xe2bfc4b5.f167785g) == null) ? 0 : list.indexOf(openMaterialDetailModel)) + 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7174xc46da8c0 c7174xc46da8c0 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7174xc46da8c0) this.f314166e.mo141623x754a37bb();
        c7174xc46da8c0.f144732d = c7174xc46da8c0.b("session", this.f314173l, true);
        c7174xc46da8c0.f144737i = this.f314162a;
        c7174xc46da8c0.f144738j = 2L;
        c7174xc46da8c0.f144733e = ((java.lang.Number) this.f314169h.mo141623x754a37bb()).longValue();
        c7174xc46da8c0.f144734f = indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = openMaterialDetailModel.f167788d;
        c7174xc46da8c0.f144735g = c7174xc46da8c0.b("weapp_ID", c12475x7cfc32b2.f167795d, true);
        java.lang.String str = c12475x7cfc32b2.f167800i;
        if (str == null) {
            str = "";
        }
        c7174xc46da8c0.f144736h = c7174xc46da8c0.b("weapp_name", str, true);
        c7174xc46da8c0.k();
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 openMaterialModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialModel, "openMaterialModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onListPageAppBrandExposure");
        java.util.HashSet hashSet = this.f314171j;
        if (hashSet.contains(openMaterialModel)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6 c7175x339f1fd6 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6) this.f314167f.mo141623x754a37bb();
        c7175x339f1fd6.f144742d = c7175x339f1fd6.b("session", this.f314173l, true);
        c7175x339f1fd6.f144747i = this.f314162a;
        c7175x339f1fd6.f144748j = 2L;
        c7175x339f1fd6.f144743e = 2L;
        c7175x339f1fd6.f144744f = c7175x339f1fd6.b("weapp_id", openMaterialModel.f167795d, true);
        java.lang.String str = openMaterialModel.f167800i;
        if (str == null) {
            str = "";
        }
        c7175x339f1fd6.f144745g = c7175x339f1fd6.b("weapp_name", str, true);
        c7175x339f1fd6.k();
        hashSet.add(openMaterialModel);
    }

    public void h(long j17, java.lang.String str, java.lang.String str2, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onListPageItemClick " + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7174xc46da8c0 c7174xc46da8c0 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7174xc46da8c0) this.f314166e.mo141623x754a37bb();
        c7174xc46da8c0.f144732d = c7174xc46da8c0.b("session", this.f314173l, true);
        c7174xc46da8c0.f144737i = this.f314162a;
        c7174xc46da8c0.f144738j = j17;
        c7174xc46da8c0.f144739k = c7174xc46da8c0.b("device_ID", str, true);
        c7174xc46da8c0.f144740l = c7174xc46da8c0.b("display_name", str2, true);
        c7174xc46da8c0.f144741m = j18;
        c7174xc46da8c0.k();
    }

    public void i(long j17, java.lang.String str, java.lang.String str2, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314174m, "onListPageItemExposure " + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6 c7175x339f1fd6 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7175x339f1fd6) this.f314167f.mo141623x754a37bb();
        c7175x339f1fd6.f144742d = c7175x339f1fd6.b("session", this.f314173l, true);
        c7175x339f1fd6.f144747i = this.f314162a;
        c7175x339f1fd6.f144748j = j17;
        c7175x339f1fd6.f144743e = 2L;
        c7175x339f1fd6.f144749k = c7175x339f1fd6.b("device_ID", str, true);
        c7175x339f1fd6.f144750l = c7175x339f1fd6.b("display_name", str2, true);
        c7175x339f1fd6.f144751m = j18;
        c7175x339f1fd6.k();
    }

    public /* synthetic */ f(long j17, bi1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, gVar, (i17 & 4) != 0 ? null : c12473xe2bfc4b5, (i17 & 8) != 0 ? null : str);
    }
}
