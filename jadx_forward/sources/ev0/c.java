package ev0;

/* loaded from: classes5.dex */
public final class c extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f338371p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f338372q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(c16993xacc19624, context, ignoreBackgroundTouchEvent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f338371p = "MicroMsg.MovieComposingMusicPicker";
    }

    @Override // cu0.x
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        if (c16997xb0aa383a != null) {
            return c16997xb0aa383a.f237242J;
        }
        return false;
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new ev0.f(this.f303884a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f338371p;
    }

    @Override // cu0.x
    public void k() {
        if (this.f338372q) {
            super.k();
        } else {
            if (l()) {
                return;
            }
            this.f303886c.d();
        }
    }

    @Override // cu0.x
    public boolean l() {
        return ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10933xa4cfa6f3) g().e()).s();
    }

    @Override // cu0.x
    public void n(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.t3(m7Var, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303888e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = this.f303888e;
        if (z17 && c16997xb0aa383a2 == null) {
            g().mo68204x3720c068(false);
        }
    }

    public final java.util.List o(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zu0.a aVar = (zu0.a) it.next();
            java.lang.String m33753x8dc9649f = aVar.f557194a.m33759x7f025288() == qg.c.Image ? aVar.f557194a.m33753x8dc9649f() : null;
            if (m33753x8dc9649f != null) {
                arrayList.add(m33753x8dc9649f);
            }
        }
        return arrayList;
    }

    public final void p(java.util.List mediaItems, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        java.lang.String str;
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItems, "mediaItems");
        java.util.Iterator it = mediaItems.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((zu0.a) obj).f557194a.m33759x7f025288() == qg.c.Video) {
                    break;
                }
            }
        }
        zu0.a aVar = (zu0.a) obj;
        if (aVar != null && (c4094x2bd762a1 = aVar.f557194a) != null) {
            str = c4094x2bd762a1.m33753x8dc9649f();
        }
        if (str == null) {
            str = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.length() > 0) {
            this.f338372q = true;
            arrayList.addAll(o(mediaItems));
            r6 = c4128x879fba0a != null ? (long) c4128x879fba0a.m33987xd22e7c2d() : 0L;
            z18 = false;
            z17 = true;
        } else {
            arrayList.addAll(o(mediaItems));
            z17 = false;
            z18 = true;
        }
        cu0.y g17 = g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerDrawerImpl");
        ev0.f fVar = (ev0.f) g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPickerDrawerImpl", "setup: ");
        st3.k kVar = new st3.k();
        kVar.f494084f = st3.v.f494142h;
        kVar.f494080b = z17;
        kVar.f494082d = z17;
        boolean z19 = z18;
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10933xa4cfa6f3) fVar.e()).x(new yu3.b(new yu3.a(10, true, str, arrayList, 0L, r6, z19, 2, null, null, 768, null), (str.length() == 0) && (arrayList.isEmpty() ^ true), kVar, false), z19);
    }
}
