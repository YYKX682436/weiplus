package uu2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final uu2.b f512802a = new uu2.b();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoEditorConfig", "getAlbumProvider");
        hp.b bVar = new hp.b();
        bVar.e(true);
        bVar.g(true);
        bVar.c(false);
        bVar.b(true);
        bVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk, 0, "", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.d("", "");
        d17.F = 11;
        d17.f237210o = bVar.f364437a;
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d K2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K2();
        d17.f237209n = K2;
        d17.f237212q = 3;
        d17.f237218w = K2.f152728h * 1000;
        bVar.h(false);
        b(d17, false);
        return d17;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, boolean z17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_use_timeline_editor, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoEditorConfig", "useTimelineEditor: " + fj6);
        if (fj6) {
            c16993xacc19624.a(4, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18817x80f27e43.class.getName());
        } else {
            c16993xacc19624.a(4, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.class.getName());
        }
        c16993xacc19624.a(3, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.class.getName());
        c16993xacc19624.a(1, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.class.getName());
        c16993xacc19624.a(0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14.class.getName());
        if (z17) {
            ts2.a aVar = ts2.a.f503153a;
            if (!py0.b.f440504a.a()) {
                c16993xacc19624.a(0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14.class.getName());
            } else {
                c16993xacc19624.a(0, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.class.getName());
                c16993xacc19624.M.putInt("key_camera_instance", 3);
            }
        }
    }
}
