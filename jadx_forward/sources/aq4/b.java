package aq4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c f94736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f94738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f94739g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c c18825x1657575c, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17) {
        this.f94736d = c18825x1657575c;
        this.f94737e = str;
        this.f94738f = interfaceC29045xdcb5ca57;
        this.f94739g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c c18825x1657575c = this.f94736d;
        java.lang.String str = c18825x1657575c.f257641o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deal result in async thread >> ");
        java.lang.String str2 = this.f94737e;
        sb6.append(str2);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        jz5.l i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.i(c18825x1657575c, str2);
        boolean booleanValue = ((java.lang.Boolean) i18.f384366d).booleanValue();
        dm.q0 q0Var = (dm.q0) i18.f384367e;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f94738f;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18825x1657575c.f257641o, "work result is lose");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
            aq4.a.f94734a.a(str2);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q0Var);
        c18825x1657575c.getClass();
        int i19 = q0Var.f68035xdb9e6ea3;
        if (i19 == 4002 || i19 == 4004) {
            java.lang.String str3 = q0Var.f68019xae81df62;
            java.lang.String str4 = q0Var.f68017xa8a162e7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "dealFileByLastWorkType >> " + i19 + "videoPath:  " + str3 + " thumbPath: " + str4 + " realVideoPath: " + com.p314xaae8f345.mm.vfs.w6.i(str3, false) + "realThumbPath: " + com.p314xaae8f345.mm.vfs.w6.i(str4, false));
            com.p314xaae8f345.mm.vfs.w6.h(str3);
            com.p314xaae8f345.mm.vfs.w6.h(str4);
        }
        aq4.a aVar = aq4.a.f94734a;
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_SnsBackgroundRemuxError_Int, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxBackgroundManager", "getSnsBackgroundRemuxError >> " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18825x1657575c.f257641o, "hardcode error");
            i17 = 1013;
        } else {
            i17 = this.f94739g;
        }
        if (i17 != 0 || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18825x1657575c.f257641o, "remux error " + i17 + ", " + z17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.j(c18825x1657575c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7536x419518a9, i17, str2, q0Var);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new a5.v()));
            return;
        }
        byte[] field_video_param = q0Var.f68030xbe236004;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_video_param, "field_video_param");
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d k17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.k(c18825x1657575c, field_video_param);
        vp4.s sVar = vp4.s.f520607a;
        boolean z18 = q0Var.f68014x600bb092;
        boolean z19 = q0Var.f68013xd84b7d96;
        java.lang.String str5 = q0Var.f68019xae81df62;
        java.lang.String str6 = q0Var.f68026x8cb5fc08;
        boolean z27 = q0Var.f68011x651deb60;
        java.lang.String str7 = q0Var.f68017xa8a162e7;
        int i27 = k17.f152737t;
        boolean z28 = q0Var.f68010xdff75492;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
        vp4.s.b(sVar, z18, str7, i27, str6, str5, z19, z28, z27, null, true, 256, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.j(c18825x1657575c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7534x97f3504d, i17, str2, q0Var);
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a5.y.a()));
    }
}
