package vp4;

/* loaded from: classes10.dex */
public final class j extends m55.b {

    /* renamed from: b, reason: collision with root package name */
    public final st3.r f520569b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0.b f520570c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f520571d;

    /* renamed from: e, reason: collision with root package name */
    public rp4.a f520572e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f520573f;

    /* renamed from: g, reason: collision with root package name */
    public final ru3.f f520574g;

    /* renamed from: h, reason: collision with root package name */
    public final rp4.x f520575h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.s f520576i;

    public j(st3.r encode, ct0.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, rp4.a aVar, android.content.Context context, ru3.f fVar, rp4.x xVar, st3.s editConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encode, "encode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editConfig, "editConfig");
        this.f520569b = encode;
        this.f520570c = bVar;
        this.f520571d = c16993xacc19624;
        this.f520572e = aVar;
        this.f520573f = context;
        this.f520574g = fVar;
        this.f520575h = xVar;
        this.f520576i = editConfig;
    }

    public static final void f(vp4.j jVar, boolean z17, boolean z18, java.lang.String str, int i17, st3.r rVar, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, rp4.x xVar, st3.s sVar, java.lang.String str2, yz5.p pVar) {
        boolean z19;
        rs0.q a17;
        jVar.getClass();
        r45.h70 f17 = vp4.s.f520607a.f(c16993xacc19624, sVar, xVar, z17, z18, str, i17);
        if (f17 == null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, 1009);
            return;
        }
        dw3.k.f325752a.d(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/");
        sb6.append("sns_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBackgroundRemuxChain", "create dir:" + sb7 + " result:" + com.p314xaae8f345.mm.vfs.w6.u(sb7));
        java.util.LinkedList tracks = f17.f457430d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
        java.util.Iterator it = tracks.iterator();
        while (true) {
            z19 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.ho6 ho6Var = (r45.ho6) it.next();
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(ho6Var.f457866d);
            java.lang.String str3 = a18.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                }
            }
            java.lang.String str4 = a18.f294812f;
            int lastIndexOf = str4.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str4 = str4.substring(lastIndexOf + 1);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getName(...)");
            java.lang.String str5 = sb7 + '/' + str4;
            com.p314xaae8f345.mm.vfs.w6.c(ho6Var.f457866d, str5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBackgroundRemuxChain", "file copy form:" + ho6Var.f457866d + " to:" + str5);
            ho6Var.f457866d = str5;
            if (xVar != null) {
                r45.vl5 cropRect = ho6Var.f457877r.f460060e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cropRect, "cropRect");
                android.graphics.Rect rect = xVar.f480237i;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(rect, cropRect);
                r45.vl5 contentRect = ho6Var.f457877r.f460062g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentRect, "contentRect");
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(rect, contentRect);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        try {
            h0Var.f391656d = f17.mo14344x5f01b1f6();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
            c16993xacc19624.f237209n.writeToParcel(obtain, 0);
            h0Var2.f391656d = obtain.marshall();
            obtain.recycle();
            vp4.a aVar = new vp4.a(pVar);
            zv3.c e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.e(f17);
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
            ((zv3.f) e17).e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.d(f17, c22979xbb268bc);
            d17.p(e17);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
                java.util.Iterator it6 = d17.f257130c.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it6.next();
                    if (i1Var.f257150b == 2 && (a17 = rs0.r.f480849a.a(i1Var.f257149a)) != null) {
                        d17.b(a17.f480846b, a17.f480847c, a17.f480848d);
                    }
                }
            }
            d17.l(f17.f457435i.f458309e, new vp4.i(e17, c22979xbb268bc, c16993xacc19624, aVar, f17, jVar));
            android.os.Bundle bundle = c16993xacc19624.M;
            if (bundle != null && bundle.getBoolean("key_save_composition_info")) {
                z19 = true;
            }
            if (z19) {
                ut3.f.f512709c.f512711b.putByteArray("key_composition_info", f17.mo14344x5f01b1f6());
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vp4.b(str2, c16993xacc19624, i17, i18, str, jVar, rVar, h0Var, h0Var2, f17, null), 3, null);
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoBackgroundRemuxChain", "parse byte error");
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, 1009);
        }
    }

    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new vp4.h(this, dVar, null), interfaceC29045xdcb5ca57);
    }
}
