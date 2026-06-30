package sf2;

/* loaded from: classes10.dex */
public abstract class j0 {

    /* renamed from: c */
    public static final java.lang.String f488706c = com.p314xaae8f345.mm.vfs.q7.c("finder_live_ktv_audition_temp") + '/';

    /* renamed from: a */
    public final sf2.f0 f488707a;

    /* renamed from: b */
    public com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver f488708b;

    public j0(sf2.f0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f488707a = scene;
    }

    public static final r45.yx1 a(sf2.j0 j0Var, hn2.d dVar, r45.cy1 cy1Var) {
        j0Var.getClass();
        r45.yx1 yx1Var = new r45.yx1();
        yx1Var.f472991d = dVar.f364038a;
        r45.by1 by1Var = new r45.by1();
        r45.ay1 ay1Var = new r45.ay1();
        ay1Var.f451883d = dVar.f364038a;
        ay1Var.f451884e = dVar.f364039b;
        ay1Var.f451885f = dVar.f364040c;
        ay1Var.f451886g = dVar.f364041d;
        ay1Var.f451887h = dVar.f364042e;
        ay1Var.f451888i = dVar.f364043f;
        ay1Var.f451889m = dVar.f364044g;
        ay1Var.f451890n = dVar.f364045h;
        by1Var.f452676d = ay1Var;
        by1Var.f452677e = cy1Var;
        yx1Var.f472999o = by1Var;
        return yx1Var;
    }

    public static /* synthetic */ boolean l(sf2.j0 j0Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAudition");
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        return j0Var.k(str, z17, z18);
    }

    public abstract void b();

    public final int c() {
        int ordinal = this.f488707a.ordinal();
        if (ordinal == 0) {
            return 99999;
        }
        if (ordinal == 1) {
            return 99998;
        }
        throw new jz5.j();
    }

    public abstract mm2.j5 d();

    public abstract android.content.Context e();

    public abstract tn0.w0 f();

    public abstract mm2.k5 g();

    public abstract p3325xe03a0797.p3326xc267989b.y0 h();

    public abstract void i();

    public final void j(hn2.d songInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        sf2.h0 h0Var = new sf2.h0(this, songInfo);
        java.lang.String str = songInfo.f364038a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        r45.zr5 b17 = songInfo.b();
        r45.cy1 cy1Var = songInfo.f364051n;
        if (cy1Var != null && b17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(h(), null, null, new sf2.g0(this, str2, b17, songInfo, cy1Var, h0Var, null), 3, null);
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.or9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        h0Var.mo147xb9724478(java.lang.Boolean.FALSE, null, string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveBaseSongAuditionHelper", "[" + this.f488707a + "] No valid resource type found for song: " + str2);
    }

    public final boolean k(java.lang.String songMid, boolean z17, boolean z18) {
        nm2.a aVar;
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c;
        sf2.f0 f0Var = this.f488707a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        try {
            tn0.w0 f17 = f();
            if (f17 != null && (T = f17.T()) != null && (mo30282x5f1b9a9c = T.mo30282x5f1b9a9c()) != null) {
                mo30282x5f1b9a9c.mo29069x17324d6f(c());
                mo30282x5f1b9a9c.mo29055xe624d2d9(c(), null);
            }
            if ((songMid.length() == 0) && (aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d().f410715g).mo144003x754a37bb()) != null) {
                nm2.a aVar2 = aVar.b().length() > 0 ? aVar : null;
                if (aVar2 != null) {
                    songMid = aVar2.b();
                    z17 = aVar2.d();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBaseSongAuditionHelper", "[" + f0Var + "] stopAudition for songMid: " + songMid + ", result: " + d().R6(songMid, z17));
            if (z18) {
                i();
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveBaseSongAuditionHelper", "[" + f0Var + "] stopAudition error", e17);
            if (z18) {
                i();
            }
            return false;
        }
    }
}
