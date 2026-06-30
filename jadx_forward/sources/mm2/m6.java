package mm2;

/* loaded from: classes10.dex */
public final class m6 extends mm2.e {

    /* renamed from: z6, reason: collision with root package name */
    public static volatile java.lang.Boolean f410772z6;
    public int A;
    public int B;
    public boolean C;
    public java.lang.String D;
    public boolean E;
    public int F;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 G;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 H;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 I;

    /* renamed from: J, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410773J;

    /* renamed from: f, reason: collision with root package name */
    public final dk2.s f410774f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f410775g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f410776h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f410777i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f410778m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f410779n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f410780o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f410781p;

    /* renamed from: q, reason: collision with root package name */
    public final dk2.t f410782q;

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410783r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410784s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410785t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f410786u;

    /* renamed from: v, reason: collision with root package name */
    public final int f410787v;

    /* renamed from: w, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410788w;

    /* renamed from: x, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410789x;

    /* renamed from: y, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410790y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f410791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        java.lang.Boolean bool = f410772z6;
        f410772z6 = null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSingSongSlice", "consume pending isNewVersionSongList on init, value=" + booleanValue);
            this.f410781p = booleanValue;
        }
        this.f410774f = new dk2.s();
        this.f410775g = new p012xc85e97e9.p093xedfae76a.j0("");
        this.f410776h = new p012xc85e97e9.p093xedfae76a.j0("");
        this.f410777i = new p012xc85e97e9.p093xedfae76a.j0(null);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.f410778m = new p012xc85e97e9.p093xedfae76a.j0(bool2);
        this.f410779n = new p012xc85e97e9.p093xedfae76a.j0(bool2);
        this.f410780o = new java.util.LinkedList();
        this.f410782q = new dk2.t();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(mm2.g6.f410626a);
        this.f410783r = a17;
        this.f410784s = a17;
        this.f410785t = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(mm2.k6.f410732d);
        this.f410786u = new java.util.LinkedList();
        this.f410787v = 10;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(bool2);
        this.f410788w = a18;
        this.f410789x = a18;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(bool2);
        this.f410790y = a19;
        this.f410791z = a19;
        this.A = 50;
        this.B = 50;
        this.D = "#FFFFFFFF";
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(0);
        this.G = a27;
        this.H = a27;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a28 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.I = a28;
        this.f410773J = a28;
    }

    public final java.lang.String N6() {
        mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410784s).mo144003x754a37bb();
        if (j6Var instanceof mm2.g6 ? true : j6Var instanceof mm2.h6) {
            return null;
        }
        if (j6Var instanceof mm2.i6) {
            return ((mm2.i6) j6Var).f410674a.f473165i;
        }
        throw new jz5.j();
    }

    public final p012xc85e97e9.p093xedfae76a.j0 O6() {
        return this.f410779n;
    }

    public final r45.z22 P6(r45.z22 z22Var) {
        java.lang.Integer valueOf;
        java.util.ArrayList arrayList = this.f410782q.f315618a;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z22Var == null) {
            java.lang.Object mo144003x754a37bb = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410784s).mo144003x754a37bb();
            mm2.i6 i6Var = mo144003x754a37bb instanceof mm2.i6 ? (mm2.i6) mo144003x754a37bb : null;
            z22Var = i6Var != null ? i6Var.f410674a : null;
        }
        int i17 = -1;
        if (z22Var != null) {
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.z22 z22Var2 = (r45.z22) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z22Var2.f473160d, z22Var.f473160d) && z22Var2.f473161e == z22Var.f473161e) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        }
        int ordinal = ((mm2.k6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410785t).mo144003x754a37bb()).ordinal();
        if (ordinal == 0) {
            if (i17 < 0 || i17 >= arrayList.size() - 1) {
                return null;
            }
            return (r45.z22) arrayList.get(i17 + 1);
        }
        if (ordinal == 1) {
            if (i17 >= 0) {
                return (r45.z22) arrayList.get(i17);
            }
            return null;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        e06.k g17 = kz5.c0.g(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : g17) {
            if (!this.f410786u.contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            valueOf = (java.lang.Integer) kz5.n0.v0(arrayList2, c06.e.f119249d);
        } else if (arrayList.size() <= 1 || i17 < 0) {
            e06.k g18 = kz5.c0.g(arrayList);
            c06.d random = c06.e.f119249d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(random, "random");
            valueOf = g18.mo126615x7aab3243() ? null : java.lang.Integer.valueOf(c06.f.c(random, g18));
        } else {
            e06.k g19 = kz5.c0.g(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : g19) {
                if (((java.lang.Number) obj2).intValue() != i17) {
                    arrayList3.add(obj2);
                }
            }
            valueOf = (java.lang.Integer) kz5.n0.w0(arrayList3, c06.e.f119249d);
        }
        if (valueOf != null) {
            return (r45.z22) arrayList.get(valueOf.intValue());
        }
        return null;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 Q6() {
        return this.f410776h;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 R6() {
        return this.f410778m;
    }

    public final void S6() {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.G).k(0);
    }

    public final void T6(boolean z17) {
        this.f410781p = z17;
    }

    public final void U6(mm2.j6 newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (newState instanceof mm2.i6) {
            r45.z22 songInfo = ((mm2.i6) newState).f410674a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
            java.util.Iterator it = this.f410782q.f315618a.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                r45.z22 z22Var = (r45.z22) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z22Var.f473160d, songInfo.f473160d) && z22Var.f473161e == songInfo.f473161e) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                java.util.LinkedList linkedList = this.f410786u;
                if (!linkedList.contains(java.lang.Integer.valueOf(i17))) {
                    linkedList.addLast(java.lang.Integer.valueOf(i17));
                    while (linkedList.size() > this.f410787v) {
                        linkedList.removeFirst();
                    }
                }
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410783r).k(newState);
    }

    public final void V6(r45.z22 songInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        java.lang.String str = songInfo.f473162f;
        if (str == null) {
            return;
        }
        dk2.t tVar = this.f410782q;
        java.util.Iterator it = tVar.f315618a.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it.next()).f473162f, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0) {
            tVar.f315618a.set(i17, songInfo);
        } else {
            tVar.f315618a.add(songInfo);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410783r).k(mm2.g6.f410626a);
        S6();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.I).k(null);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f410788w;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(bool);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410790y).k(bool);
        this.f410786u.clear();
    }
}
