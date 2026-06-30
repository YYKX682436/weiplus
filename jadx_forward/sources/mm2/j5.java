package mm2;

/* loaded from: classes10.dex */
public final class j5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410714f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new nm2.d("", false));
        this.f410714f = a17;
        this.f410715g = a17;
    }

    public final boolean N6(nm2.a aVar, nm2.a aVar2) {
        if (aVar instanceof nm2.c) {
            if (aVar2 instanceof nm2.b) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nm2.b) aVar2).a(), ((nm2.c) aVar).a());
            }
            if (aVar2 instanceof nm2.d) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nm2.d) aVar2).a(), ((nm2.c) aVar).a());
            }
            if (aVar2 instanceof nm2.c) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nm2.c) aVar2).a(), ((nm2.c) aVar).a());
            }
            return false;
        }
        if (!(aVar instanceof nm2.b)) {
            if (!(aVar instanceof nm2.d) || (aVar2 instanceof nm2.b)) {
                return false;
            }
            return (aVar2 instanceof nm2.d) || (aVar2 instanceof nm2.c);
        }
        if (aVar2 instanceof nm2.b) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nm2.b) aVar2).a(), ((nm2.b) aVar).a());
        }
        if (aVar2 instanceof nm2.d) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((nm2.d) aVar2).a(), ((nm2.b) aVar).a());
        }
        boolean z17 = aVar2 instanceof nm2.c;
        return false;
    }

    public final void O6(nm2.a aVar) {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410714f).k(aVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setState: ");
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRequestSongAuditionSlice", sb6.toString());
    }

    public final boolean P6(java.lang.String songMid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        nm2.c cVar = new nm2.c(songMid, 0, z17);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = this.f410715g;
        if (N6((nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb(), cVar)) {
            O6(cVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloading failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to LoadingAuditionState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    public final boolean Q6(java.lang.String songMid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        nm2.b bVar = new nm2.b(songMid, z17);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = this.f410715g;
        if (N6((nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb(), bVar)) {
            O6(bVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startListening failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to ListeningAuditionState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    public final boolean R6(java.lang.String songMid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        nm2.d dVar = new nm2.d(songMid, z17);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = this.f410715g;
        if (N6((nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb(), dVar)) {
            O6(dVar);
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAudition failed: cannot transfer from ");
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb();
        sb6.append(aVar != null ? aVar.getClass().getSimpleName() : null);
        sb6.append(" to NoneAuditionState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveRequestSongAuditionSlice", sb6.toString());
        return false;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        java.lang.String str;
        super.mo528x82b764cd();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = this.f410715g;
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb();
        if (aVar == null || (str = aVar.b()) == null) {
            str = "";
        }
        nm2.a aVar2 = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).mo144003x754a37bb();
        R6(str, aVar2 != null ? aVar2.d() : false);
    }
}
