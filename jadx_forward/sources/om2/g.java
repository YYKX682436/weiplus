package om2;

/* loaded from: classes10.dex */
public final class g extends mm2.e {
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 A;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 B;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 C;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 D;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 E;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 F;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 G;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 H;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f427835f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f427836g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f427837h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f427838i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f427839m;

    /* renamed from: n, reason: collision with root package name */
    public om2.i f427840n;

    /* renamed from: o, reason: collision with root package name */
    public om2.s f427841o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x84 f427842p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f427843q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f427844r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f427845s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f427846t;

    /* renamed from: u, reason: collision with root package name */
    public int f427847u;

    /* renamed from: v, reason: collision with root package name */
    public long f427848v;

    /* renamed from: w, reason: collision with root package name */
    public int f427849w;

    /* renamed from: x, reason: collision with root package name */
    public int f427850x;

    /* renamed from: y, reason: collision with root package name */
    public int f427851y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f427852z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new om2.v());
        this.f427835f = a17;
        this.f427836g = a17;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(10, 0, null, 6, null);
        this.f427837h = b17;
        this.f427838i = b17;
        this.f427839m = "";
        java.util.List _dispatchSongList = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f427843q = _dispatchSongList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(_dispatchSongList, "_dispatchSongList");
        this.f427844r = _dispatchSongList;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f427845s = a18;
        this.f427846t = a18;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f427852z = a19;
        this.A = a19;
        this.B = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.C = a27;
        this.D = a27;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a28 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new jz5.l(0, 0));
        this.E = a28;
        this.F = a28;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a29 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.G = a29;
        this.H = a29;
    }

    public final boolean N6(java.util.LinkedList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (list.size() >= 2) {
            r45.yx1 yx1Var = (r45.yx1) kz5.n0.a0(list, 0);
            r45.yx1 yx1Var2 = (r45.yx1) kz5.n0.a0(list, 1);
            if (yx1Var != null && yx1Var2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yx1Var.f473002r, yx1Var2.f473002r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yx1Var2.f473002r, ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).m8())) {
                pm0.v.X(om2.f.f427834d);
                return true;
            }
        }
        return false;
    }

    public final void O6(om2.a state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", "emitAnchorOptionState: " + state.f427801a);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f427845s).k(state);
    }

    public final void P6(om2.d0 newState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f427835f;
        om2.d0 d0Var = (om2.d0) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb();
        if (d0Var == null) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(newState);
            return;
        }
        if (d0Var.getClass() != newState.getClass()) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(newState);
            return;
        }
        if (!z17) {
            if (!(newState.a(d0Var))) {
                return;
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(newState);
    }

    public final r45.yx1 Q6() {
        java.util.List list = this.f427844r;
        if (list != null) {
            return (r45.yx1) kz5.n0.a0(list, 0);
        }
        return null;
    }

    public final om2.i R6() {
        return this.f427840n;
    }

    public final boolean S6() {
        r45.yx1 Q6 = Q6();
        java.lang.String str = Q6 != null ? Q6.f473002r : null;
        if (str == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).m8());
    }

    public final boolean T6(r45.yx1 yx1Var) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yx1Var != null ? yx1Var.f473002r : null, ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).m8());
    }

    public final void U6(int i17) {
        if (i17 == 0) {
            this.f427851y = 600;
        } else {
            this.f427851y = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", "update stayTrtcRoomTimeAfterStopSinging: " + this.f427851y + " value: " + i17);
    }

    public final void V6(java.lang.String source, java.util.LinkedList list, int i17) {
        r45.ay1 ay1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (this.f427847u > i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveKTVSingSlice", "updateDispatchSongList version invalid, source : " + source + " version: " + i17 + " firstSongVersion: " + this.f427847u);
            return;
        }
        if (!((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).b7()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDispatchSongList no ktv mode: ");
            r45.q12 q12Var = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410522s;
            sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.m75939xb282bd08(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveKTVSingSlice", sb6.toString());
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.yx1 yx1Var = (r45.yx1) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yx1Var, "<this>");
            java.lang.String str = yx1Var.f472991d;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            yx1Var.f472991d = str;
            java.lang.String str3 = yx1Var.f472992e;
            if (str3 == null) {
                str3 = "";
            }
            yx1Var.f472992e = str3;
            java.lang.String str4 = yx1Var.f473000p;
            if (str4 == null) {
                str4 = "";
            }
            yx1Var.f473000p = str4;
            java.lang.String str5 = yx1Var.f473002r;
            if (str5 != null) {
                str2 = str5;
            }
            yx1Var.f473002r = str2;
        }
        if (i17 != this.f427847u) {
            N6(list);
        }
        java.util.List list2 = this.f427843q;
        list2.clear();
        list2.addAll(list);
        this.f427847u = i17;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f427852z).k(list);
        om2.i iVar = this.f427840n;
        int i18 = 0;
        if (iVar != null) {
            r45.yx1 yx1Var2 = (r45.yx1) kz5.n0.Z(list);
            r45.ia4 ia4Var = iVar.f427856c;
            if (yx1Var2 != null) {
                java.lang.String str6 = yx1Var2.f472992e;
                r45.yx1 yx1Var3 = iVar.f427854a;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, yx1Var3 != null ? yx1Var3.f472992e : null) && ia4Var != null) {
                    ia4Var.f458407i = 4;
                }
            }
            if (ia4Var != null && ia4Var.f458407i == 4) {
                iVar.a(yx1Var2);
            } else {
                iVar.f427864k = null;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateDispatchSongList source: ");
        sb7.append(source);
        sb7.append(" dispatchVersion: ");
        sb7.append(this.f427847u);
        sb7.append(", infoList: ");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append("songList size: " + list.size() + " value = \n ");
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.yx1 yx1Var4 = (r45.yx1) obj;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(" index: ");
            sb9.append(i18);
            sb9.append(" info: ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yx1Var4, "<this>");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[song_mid: ");
            sb10.append(yx1Var4.f472991d);
            sb10.append(" unique_id: ");
            sb10.append(yx1Var4.f472992e);
            sb10.append(" mic_sdk_user_id: ");
            sb10.append(yx1Var4.f473002r);
            sb10.append(" song_name: ");
            r45.by1 by1Var = yx1Var4.f472999o;
            sb10.append((by1Var == null || (ay1Var = by1Var.f452676d) == null) ? null : ay1Var.f451884e);
            sb10.append(" resource_info: ");
            r45.by1 by1Var2 = yx1Var4.f472999o;
            sb10.append(by1Var2 != null ? by1Var2.f452677e : null);
            sb10.append(" ]");
            sb9.append(sb10.toString());
            sb9.append(" \n");
            sb8.append(sb9.toString());
            i18 = i19;
        }
        java.lang.String sb11 = sb8.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb11, "toString(...)");
        sb7.append(sb11);
        sb7.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", sb7.toString());
    }

    public final void W6(java.lang.String source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", "updateSongListVersion source: " + source + " new: " + j17 + " songListVersion: " + this.f427848v);
        if (this.f427848v < j17) {
            this.f427848v = j17;
        }
    }

    public final void X6(java.lang.String source, r45.qx1 qx1Var) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.B).k(qx1Var);
        W6("updateWaitPlayerList", qx1Var != null ? qx1Var.f465867f : -1L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWaitPlayerList source: ");
        sb6.append(source);
        sb6.append(" waitList: ");
        sb6.append((qx1Var == null || (linkedList = qx1Var.f465866e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(" all: ");
        sb6.append(qx1Var != null ? java.lang.Integer.valueOf(qx1Var.f465865d) : null);
        sb6.append(" version: ");
        sb6.append(qx1Var != null ? java.lang.Long.valueOf(qx1Var.f465867f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", sb6.toString());
    }

    public final void Y6(java.lang.String source, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f427849w = i17;
        this.f427850x = i18;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.E).k(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingSlice", "updateWaitSongCount source: " + source + " selfToSingSize: " + i17 + " totalToSingSize: " + i18);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f427842p = null;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f427845s).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f427852z).k(null);
        this.f427843q.clear();
        this.f427840n = null;
        this.f427841o = null;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f427835f).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.B).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.C).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.E).k(new jz5.l(0, 0));
        this.f427847u = 0;
        this.f427848v = 0L;
        this.f427849w = 0;
        this.f427850x = 0;
        U6(0);
        this.f427839m = "";
    }
}
