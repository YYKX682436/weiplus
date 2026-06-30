package di3;

/* loaded from: classes10.dex */
public class d extends android.view.OrientationEventListener implements r90.k {

    /* renamed from: d, reason: collision with root package name */
    public int f314219d;

    /* renamed from: e, reason: collision with root package name */
    public int f314220e;

    /* renamed from: f, reason: collision with root package name */
    public long f314221f;

    /* renamed from: g, reason: collision with root package name */
    public r90.j f314222g;

    /* renamed from: h, reason: collision with root package name */
    public int f314223h;

    public d(android.content.Context context) {
        super(context);
        this.f314219d = -1;
        this.f314220e = -1;
        this.f314221f = 0L;
        this.f314223h = -1;
    }

    public int a() {
        if (di3.w.f314300a) {
            return this.f314220e;
        }
        return 0;
    }

    public int b() {
        int a17 = a();
        if (a17 <= 60 || a17 >= 300) {
            return 0;
        }
        if (a17 <= 120) {
            return 90;
        }
        return a17 <= 210 ? 180 : 270;
    }

    public boolean c() {
        if (!di3.w.f314300a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOrientationListener", "isLandscape,  orientation: %s", java.lang.Integer.valueOf(this.f314220e));
        int i17 = this.f314220e;
        if (i17 < 0) {
            return false;
        }
        return i17 == 90 || i17 == 270;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", java.lang.Boolean.valueOf(di3.w.f314300a));
        if (di3.w.f314300a) {
            super.enable();
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (this.f314223h == -1) {
            this.f314223h = i17;
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f314223h = 0;
                }
            } else if (i17 <= 150) {
                if (i17 <= 120) {
                    this.f314223h = 90;
                }
            } else if (i17 > 240) {
                this.f314223h = 270;
            } else if (i17 <= 210) {
                this.f314223h = 180;
            }
            r90.j jVar = this.f314222g;
            if (jVar != null) {
                jVar.mo47333x15072581(this.f314223h);
            }
        }
        if (di3.w.f314300a && i17 >= 0 && i17 <= 360) {
            if (java.lang.Math.abs(this.f314219d - i17) < 30) {
                long j17 = this.f314221f;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                    return;
                }
            }
            this.f314219d = i17;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f314221f = android.os.SystemClock.elapsedRealtime();
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f314220e = 0;
                }
            } else if (i17 < 30 || i17 > 150) {
                if (i17 < 120 || i17 > 240) {
                    if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                        this.f314220e = 270;
                    }
                } else if (i17 >= 150 && i17 <= 210) {
                    this.f314220e = 180;
                }
            } else if (i17 >= 60 && i17 <= 120) {
                this.f314220e = 90;
            }
            r90.j jVar2 = this.f314222g;
            if (jVar2 != null) {
                jVar2.mo47333x15072581(this.f314220e);
            }
        }
    }

    public d(android.content.Context context, int i17) {
        super(context, i17);
        this.f314219d = -1;
        this.f314220e = -1;
        this.f314221f = 0L;
        this.f314223h = -1;
    }
}
