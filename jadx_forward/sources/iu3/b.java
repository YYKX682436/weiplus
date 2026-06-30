package iu3;

/* loaded from: classes5.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu3.e f376519a;

    public b(iu3.e eVar) {
        this.f376519a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
        this.f376519a.f376530m.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", info);
        this.f376519a.f376525e.w(ju3.c0.f383402b2, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        if (lyricsInfos.isEmpty()) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16998x3e4182e2(lyricsInfos));
        bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z17);
        this.f376519a.f376525e.w(ju3.c0.Z, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void d() {
        ju3.d0.k(this.f376519a.f376525e, ju3.c0.f383403c2, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z17);
        this.f376519a.f376525e.w(ju3.c0.X, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceTabID, "sourceTabID");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        iu3.e eVar = this.f376519a;
        if (c16997xb0aa383a == null) {
            eVar.f376527g.setVisibility(8);
            eVar.f376531n = null;
            eVar.f376530m.a();
            android.view.View view = eVar.f376528h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            view.setTag(com.p314xaae8f345.mm.R.id.f564306nl, i65.a.r(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571504h0));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            eVar.f376525e.w(ju3.c0.Z, bundle);
            eVar.f376525e.w(ju3.c0.f383444x, null);
            return;
        }
        if (c16997xb0aa383a.f237251o == 2) {
            eVar.f376530m.a();
            return;
        }
        eVar.f376527g.setVisibility(0);
        eVar.f376531n = c16997xb0aa383a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("EDIT_SELECT_MUSIC_PARCELABLE", c16997xb0aa383a);
        eVar.f376525e.w(ju3.c0.Y, bundle2);
        eVar.f376530m.b(c16997xb0aa383a);
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_MUSIC_ID_STRING", c16997xb0aa383a.e());
        iVar.n("KEY_MUSIC_INDEX_INT", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p == 4 ? 0 : c16997xb0aa383a.f237259w + 1));
        iVar.n("KEY_MUSIC_REQ_ID_INT", java.lang.Long.valueOf(c16997xb0aa383a.f237260x));
        iVar.n("KEY_SEARCH_MUSIC_INT", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p == 4 ? 1 : 0));
        java.lang.String str = c16997xb0aa383a.D;
        if (str == null) {
            str = "";
        }
        iVar.n("KEY_MUSIC_SESSION_BUFFER", str);
        android.view.View view2 = eVar.f376528h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
        view2.setTag(com.p314xaae8f345.mm.R.id.f564306nl, i65.a.r(view2.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571503gz));
        wt3.u uVar = wt3.v.f531037h;
        wt3.v vVar = wt3.v.f531038i;
        if (vVar != null) {
            vVar.d(c16997xb0aa383a.f237244e, c16997xb0aa383a.f237252p);
        }
    }
}
