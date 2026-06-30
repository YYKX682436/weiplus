package yo4;

/* loaded from: classes5.dex */
public final class e extends no4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f545728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545729j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ju3.d0 d0Var, yo4.p pVar, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 i0Var) {
        super(bundle, i0Var);
        this.f545728i = d0Var;
        this.f545729j = pVar;
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
        this.f545729j.D();
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f545728i.w(ju3.c0.f383402b2, bundle);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        android.os.Bundle bundle = new android.os.Bundle();
        if (lyricsInfos.isEmpty()) {
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
        } else {
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z17);
            bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16998x3e4182e2(lyricsInfos));
        }
        this.f545728i.w(ju3.c0.Z, bundle);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void d() {
        ju3.d0.k(this.f545728i, ju3.c0.f383403c2, null, 2, null);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        super.g(z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f545728i.w(ju3.c0.X, bundle);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        super.m(c16997xb0aa383a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPickerReportCallback", "onAudioSelected:" + c16997xb0aa383a);
        yo4.p pVar = this.f545729j;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f545820r, c16997xb0aa383a)) {
            if (pVar.f545820r != null) {
                pVar.G();
                return;
            }
            return;
        }
        android.widget.ImageView imageView = pVar.f545814i;
        ju3.d0 d0Var = this.f545728i;
        if (c16997xb0aa383a == null) {
            pVar.f545825w = 0L;
            pVar.f545820r = c16997xb0aa383a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "unSelectAudio: ");
            imageView.setVisibility(8);
            pVar.f545820r = null;
            pVar.D();
            pVar.M("");
            ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            d0Var.w(ju3.c0.Z, bundle);
            d0Var.w(ju3.c0.f383444x, null);
            return;
        }
        if (c16997xb0aa383a.f237251o == 2) {
            ju3.d0.k(d0Var, ju3.c0.U, null, 2, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPickerReportCallback", "play music:" + c16997xb0aa383a.f237245f + " cached:" + c16997xb0aa383a.f237249m + " cachePath:" + c16997xb0aa383a.f237248i + "  cacheFile:" + com.p314xaae8f345.mm.vfs.w6.j(c16997xb0aa383a.f237248i) + ", soundTrack=" + c16997xb0aa383a.f237252p);
        if ((c16997xb0aa383a.f237249m && android.text.TextUtils.isEmpty(c16997xb0aa383a.f237248i)) || (!c16997xb0aa383a.f237249m && android.text.TextUtils.isEmpty(c16997xb0aa383a.f237245f))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6956xa8f71486 c6956xa8f71486 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6956xa8f71486();
            c6956xa8f71486.f142619g = 2020;
            c6956xa8f71486.f142618f = c6956xa8f71486.b("MsgExt", "null music url", true);
            c6956xa8f71486.k();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = pVar.f545820r;
        if (c16997xb0aa383a2 != null) {
            java.lang.String a17 = c16997xb0aa383a2.a();
            java.lang.String a18 = c16997xb0aa383a.a();
            if (a18 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, a18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "[syncMusicClipStateOnAudioSelected] switch music, clear trim previousMusicId=" + c16997xb0aa383a2.f237244e + ", newMusicId=" + c16997xb0aa383a.f237244e);
                    c16997xb0aa383a2.G = null;
                    c16997xb0aa383a2.H = null;
                    c16997xb0aa383a.G = null;
                    c16997xb0aa383a.H = null;
                } else if (c16997xb0aa383a2 != c16997xb0aa383a) {
                    if (c16997xb0aa383a2.g()) {
                        c16997xb0aa383a.G = c16997xb0aa383a2.G;
                        c16997xb0aa383a.H = c16997xb0aa383a2.H;
                    } else {
                        c16997xb0aa383a.G = null;
                        c16997xb0aa383a.H = null;
                    }
                }
            }
        }
        pVar.M(c16997xb0aa383a.f237256t);
        imageView.setVisibility(0);
        pVar.f545820r = c16997xb0aa383a;
        ju3.d0.k(d0Var, ju3.c0.Y, null, 2, null);
        pVar.f545818p.b(c16997xb0aa383a);
        pVar.f545825w = c16997xb0aa383a.f237253q;
        java.util.Iterator it = ((java.util.ArrayList) pVar.f545826x).iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_MUSIC_INDEX_INT", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p == 4 ? 0 : c16997xb0aa383a.f237259w + 1));
        iVar.n("KEY_MUSIC_REQ_ID_INT", java.lang.Long.valueOf(c16997xb0aa383a.f237260x));
        iVar.n("KEY_SEARCH_MUSIC_INT", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p == 4 ? 1 : 0));
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.d(c16997xb0aa383a.f237244e, c16997xb0aa383a.f237252p);
        }
    }
}
