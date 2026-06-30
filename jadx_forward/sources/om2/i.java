package om2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yx1 f427854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427855b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.ia4 f427856c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ha4 f427857d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ga4 f427858e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f427859f;

    /* renamed from: g, reason: collision with root package name */
    public int f427860g;

    /* renamed from: h, reason: collision with root package name */
    public int f427861h;

    /* renamed from: i, reason: collision with root package name */
    public int f427862i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f427863j;

    /* renamed from: k, reason: collision with root package name */
    public om2.h f427864k;

    /* renamed from: l, reason: collision with root package name */
    public final mm2.a f427865l;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.a f427866m;

    /* renamed from: n, reason: collision with root package name */
    public final mm2.a f427867n;

    /* renamed from: o, reason: collision with root package name */
    public final mm2.a f427868o;

    /* renamed from: p, reason: collision with root package name */
    public final mm2.a f427869p;

    /* renamed from: q, reason: collision with root package name */
    public int f427870q;

    public i(r45.yx1 songInfo, int i17, r45.ia4 ktvState, r45.ha4 ktvProgress, r45.ga4 ktvNote, java.lang.String actUniqueId, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvState, "ktvState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvProgress, "ktvProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvNote, "ktvNote");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actUniqueId, "actUniqueId");
        this.f427854a = songInfo;
        this.f427855b = i17;
        this.f427856c = ktvState;
        this.f427857d = ktvProgress;
        this.f427858e = ktvNote;
        this.f427859f = actUniqueId;
        this.f427865l = new mm2.a("bluetoothDuration");
        this.f427866m = new mm2.a("wiredDuration");
        this.f427867n = new mm2.a("soundcardDuration");
        this.f427868o = new mm2.a("speakerphoneDuration");
        this.f427869p = new mm2.a("eapiceDuration");
    }

    public final void a(r45.yx1 yx1Var) {
        r45.ay1 ay1Var;
        java.lang.String str;
        java.lang.String str2;
        r45.ay1 ay1Var2;
        r45.ia4 ia4Var = this.f427856c;
        java.lang.String str3 = "";
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ia4Var != null ? ia4Var.f458403e : null, yx1Var != null ? yx1Var.f472992e : null)) {
            java.lang.String str4 = ia4Var != null ? ia4Var.f458404f : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = ia4Var != null ? ia4Var.f458403e : null;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = ia4Var != null ? ia4Var.f458402d : null;
            if (str6 == null) {
                str6 = "";
            }
            java.lang.String str7 = ia4Var != null ? ia4Var.f458405g : null;
            if (str7 == null) {
                str7 = "";
            }
            this.f427864k = new om2.h(str4, str5, str6, str7);
        }
        if (yx1Var != null) {
            if (ia4Var != null) {
                java.lang.String str8 = yx1Var.f473002r;
                if (str8 == null) {
                    str8 = "";
                }
                ia4Var.f458404f = str8;
            }
            if (ia4Var != null) {
                java.lang.String str9 = yx1Var.f472992e;
                if (str9 == null) {
                    str9 = "";
                }
                ia4Var.f458403e = str9;
            }
            if (ia4Var != null) {
                r45.by1 by1Var = yx1Var.f472999o;
                if (by1Var == null || (ay1Var2 = by1Var.f452676d) == null || (str2 = ay1Var2.f451883d) == null) {
                    str2 = "";
                }
                ia4Var.f458402d = str2;
            }
            if (ia4Var == null) {
                return;
            }
            r45.by1 by1Var2 = yx1Var.f472999o;
            if (by1Var2 != null && (ay1Var = by1Var2.f452676d) != null && (str = ay1Var.f451884e) != null) {
                str3 = str;
            }
            ia4Var.f458405g = str3;
        }
    }

    public final int b() {
        int i17;
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            if (ia4Var.B && (i17 = this.f427870q) > 0) {
                return ia4Var.f458408m / i17;
            }
            int i18 = ia4Var.f458408m;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ia4Var.f458414s);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            return i18 / (valueOf != null ? valueOf.intValue() : 1);
        }
    }

    public final java.lang.String c() {
        java.lang.String str;
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            str = ia4Var != null ? ia4Var.f458403e : null;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public final java.lang.String d() {
        java.lang.String str;
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            str = ia4Var != null ? ia4Var.f458404f : null;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public final void e() {
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            if (ia4Var != null) {
                ia4Var.f458410o = true;
            }
        }
        g();
    }

    public final void f(int i17) {
        h(i17);
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            if (ia4Var != null) {
                ia4Var.f458410o = false;
            }
        }
    }

    public final void g() {
        mm2.a.b(this.f427868o, false, 1, null);
        mm2.a.b(this.f427869p, false, 1, null);
        mm2.a.b(this.f427866m, false, 1, null);
        mm2.a.b(this.f427865l, false, 1, null);
        mm2.a.b(this.f427867n, false, 1, null);
    }

    public final void h(int i17) {
        java.lang.System.currentTimeMillis();
        if (i17 == 0) {
            this.f427868o.c();
            return;
        }
        if (i17 == 1) {
            this.f427869p.c();
            return;
        }
        if (i17 == 2) {
            this.f427866m.c();
        } else if (i17 == 3) {
            this.f427865l.c();
        } else {
            if (i17 != 4) {
                return;
            }
            this.f427867n.c();
        }
    }

    public final java.lang.String i(int i17) {
        return i17 >= 95 ? "SSS" : i17 >= 90 ? "SS" : i17 >= 85 ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a : i17 >= 65 ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f : i17 >= 45 ? "B" : "C";
    }

    public final void j(r45.y84 state, r45.yx1 yx1Var) {
        java.lang.String str;
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        synchronized (this.f427856c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSingerSEIData", "updateSingState " + state.ordinal() + " nextSongInfo: " + yx1Var);
            r45.y84 y84Var = r45.y84.LIVE_KTV_SING_STATE_ADVANCE;
            if (state != y84Var || yx1Var != null) {
                r45.ia4 ia4Var = this.f427856c;
                if (ia4Var != null) {
                    ia4Var.f458407i = state.ordinal();
                }
                if (state == r45.y84.LIVE_KTV_SING_STATE_END) {
                    r45.ia4 ia4Var2 = this.f427856c;
                    if (ia4Var2 != null) {
                        ia4Var2.f458409n = i(b());
                    }
                    r45.ia4 ia4Var3 = this.f427856c;
                    if (ia4Var3 != null) {
                        if (yx1Var == null || (by1Var = yx1Var.f472999o) == null || (ay1Var = by1Var.f452676d) == null || (str = ay1Var.f451884e) == null) {
                            str = "";
                        }
                        ia4Var3.f458413r = str;
                    }
                }
                if (state == y84Var) {
                    a(yx1Var);
                }
            }
        }
    }

    public final void k(int i17, int i18, float f17, int i19) {
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            if (ia4Var != null) {
                ia4Var.f458408m = i18;
            }
            if (ia4Var != null) {
                ia4Var.f458412q = i17;
            }
            if (ia4Var != null) {
                ia4Var.f458414s = i19;
            }
            boolean z17 = false;
            if (ia4Var != null && ia4Var.f458407i == 3) {
                z17 = true;
            }
            if (z17 && ia4Var != null) {
                ia4Var.f458409n = i(b());
            }
        }
    }

    public final void l(boolean z17) {
        int i17;
        synchronized (this.f427856c) {
            r45.ia4 ia4Var = this.f427856c;
            if (ia4Var != null) {
                if (z17) {
                    int i18 = ia4Var.f458416u;
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    i17 = i18 | 1;
                } else {
                    int i19 = ia4Var.f458416u;
                    java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                    i17 = i19 & (-2);
                }
                ia4Var.f458416u = i17;
            }
        }
    }
}
