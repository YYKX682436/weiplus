package iu3;

/* loaded from: classes5.dex */
public final class i implements iu3.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f376539a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f376540b;

    /* renamed from: c, reason: collision with root package name */
    public kk4.v f376541c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Float f376542e;

    /* renamed from: f, reason: collision with root package name */
    public pk4.v f376543f;

    /* renamed from: g, reason: collision with root package name */
    public long f376544g;

    public i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f376539a = context;
        this.f376540b = "MicroMsg.EditMusicController" + hashCode();
        this.f376544g = 100L;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376540b, "pause music");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = nu3.i.f421754d;
        c6927x849d3564.f142412n = c6927x849d3564.b("MusicId", "", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d35642 = nu3.i.f421754d;
        c6927x849d35642.f142413o = 0L;
        c6927x849d35642.f142415q = 0L;
        nu3.i.f421757g.f142486m = 0L;
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.c();
        }
        kk4.v vVar2 = this.f376541c;
        if (vVar2 != null) {
            kk4.b.i(vVar2, false, false, 3, null);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        java.lang.String str = this.f376540b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "play music");
        try {
            c(c16997xb0aa383a);
            e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "play music " + c16997xb0aa383a + " fail:" + e17.getLocalizedMessage());
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        kk4.v vVar;
        a();
        if (c16997xb0aa383a == null) {
            return;
        }
        java.lang.String str = c16997xb0aa383a.f237245f;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String valueOf = java.lang.String.valueOf(c16997xb0aa383a.f237244e);
        java.lang.String str3 = c16997xb0aa383a.f237248i;
        dk4.a aVar = new dk4.a(valueOf, str3 == null ? "" : str3, str2, 0, 0);
        aVar.f316001e = c16997xb0aa383a.f237249m;
        aVar.f316000d = c16997xb0aa383a.f237257u;
        if (c16997xb0aa383a.f237262z) {
            aVar.f316014r = "A0";
        }
        kk4.v vVar2 = this.f376541c;
        if (vVar2 != null) {
            vVar2.mo143591x360802();
        }
        kk4.v vVar3 = this.f376541c;
        if (vVar3 != null) {
            vVar3.mo143590x408b7293();
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kk4.v vVar4 = new kk4.v(context);
        this.f376541c = vVar4;
        vVar4.M = true;
        vVar4.f390118j = true;
        vVar4.A(true);
        kk4.v vVar5 = this.f376541c;
        if (vVar5 != null) {
            vVar5.C(false);
        }
        kk4.v vVar6 = this.f376541c;
        if (vVar6 != null) {
            vVar6.B(aVar);
        }
        kk4.v vVar7 = this.f376541c;
        jz5.l lVar = null;
        kk4.h hVar = vVar7 != null ? vVar7.f390113e : null;
        if (hVar != null) {
            hVar.f390084m = new iu3.g(c16997xb0aa383a, this);
        }
        if (c16997xb0aa383a.g()) {
            long c17 = c16997xb0aa383a.c();
            lVar = new jz5.l(java.lang.Long.valueOf(c17), java.lang.Long.valueOf(c16997xb0aa383a.b() + c17));
        }
        if (lVar != null) {
            long longValue = ((java.lang.Number) lVar.f384366d).longValue();
            long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
            kk4.v vVar8 = this.f376541c;
            if (vVar8 != null) {
                vVar8.A(true);
            }
            kk4.v vVar9 = this.f376541c;
            if (vVar9 != null) {
                vVar9.H(longValue, longValue2);
            }
        }
        java.lang.Float f17 = this.f376542e;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            kk4.v vVar10 = this.f376541c;
            if (vVar10 != null) {
                vVar10.K(floatValue);
            }
        }
        pk4.v vVar11 = this.f376543f;
        if (vVar11 == null || (vVar = this.f376541c) == null) {
            return;
        }
        vVar.I(vVar11, this.f376544g);
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376540b, "release");
        kk4.v vVar = this.f376541c;
        if (vVar != null) {
            vVar.mo143591x360802();
        }
        kk4.v vVar2 = this.f376541c;
        if (vVar2 != null) {
            vVar2.mo143590x408b7293();
        }
        this.f376541c = null;
    }

    public void e() {
        kk4.v vVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376540b, "resume music");
        kk4.v vVar2 = this.f376541c;
        if (vVar2 != null) {
            vVar2.O();
        }
        android.content.Context context = this.f376539a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) context).a7() || (vVar = this.f376541c) == null) {
            return;
        }
        vVar.C(true);
    }

    public final void f(long j17) {
        kk4.c cVar;
        kk4.v vVar = this.f376541c;
        long max = java.lang.Math.max(0L, (vVar == null || (cVar = vVar.f390110b) == null) ? 0L : ((kk4.f0) cVar).mo100917x37a7fa50());
        long j18 = (j17 == 0 || max == 0 || j17 < max) ? j17 : j17 % max;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376540b, "seek music to " + j17 + ", durationMs " + max + ", seek to " + j18);
        kk4.v vVar2 = this.f376541c;
        if (vVar2 != null) {
            kk4.b.f(vVar2, (int) j18, false, null, 6, null);
        }
    }
}
