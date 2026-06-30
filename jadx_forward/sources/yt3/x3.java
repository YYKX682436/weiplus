package yt3;

/* loaded from: classes10.dex */
public final class x3 implements yt3.r2, r90.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f547250d;

    /* renamed from: e, reason: collision with root package name */
    public final di3.d f547251e;

    /* renamed from: f, reason: collision with root package name */
    public int f547252f;

    /* renamed from: g, reason: collision with root package name */
    public r90.j f547253g;

    public x3(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f547250d = context;
        di3.d dVar = new di3.d(context, 2);
        this.f547251e = dVar;
        dVar.f314222g = this;
    }

    public final boolean a() {
        return (this.f547252f + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % 180 != 0;
    }

    public final void b(int i17) {
        this.f547252f = i17;
        r90.j jVar = this.f547253g;
        if (jVar != null) {
            jVar.mo47333x15072581(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOrientationPlugin", "notifyDegree: " + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @Override // r90.j
    /* renamed from: onOrientationChange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo47333x15072581(int r9) {
        /*
            r8 = this;
            if (r9 >= 0) goto L3
            return
        L3:
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 30
            r2 = 60
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            r5 = 1
            r6 = 0
            if (r9 <= r2) goto L67
            r7 = 300(0x12c, float:4.2E-43)
            if (r9 < r7) goto L17
            goto L67
        L17:
            if (r1 > r9) goto L1f
            r1 = 151(0x97, float:2.12E-43)
            if (r9 >= r1) goto L1f
            r1 = r5
            goto L20
        L1f:
            r1 = r6
        L20:
            if (r1 == 0) goto L2f
            if (r2 > r9) goto L2a
            r1 = 121(0x79, float:1.7E-43)
            if (r9 >= r1) goto L2a
            r9 = r5
            goto L2b
        L2a:
            r9 = r6
        L2b:
            if (r9 == 0) goto L67
            r9 = r4
            goto L68
        L2f:
            r1 = 120(0x78, float:1.68E-43)
            if (r1 > r9) goto L39
            r1 = 241(0xf1, float:3.38E-43)
            if (r9 >= r1) goto L39
            r1 = r5
            goto L3a
        L39:
            r1 = r6
        L3a:
            if (r1 == 0) goto L4b
            r1 = 150(0x96, float:2.1E-43)
            if (r1 > r9) goto L46
            r1 = 211(0xd3, float:2.96E-43)
            if (r9 >= r1) goto L46
            r9 = r5
            goto L47
        L46:
            r9 = r6
        L47:
            if (r9 == 0) goto L67
            r9 = r0
            goto L68
        L4b:
            r1 = 210(0xd2, float:2.94E-43)
            if (r1 > r9) goto L55
            r1 = 331(0x14b, float:4.64E-43)
            if (r9 >= r1) goto L55
            r1 = r5
            goto L56
        L55:
            r1 = r6
        L56:
            if (r1 == 0) goto L67
            r1 = 240(0xf0, float:3.36E-43)
            if (r1 > r9) goto L62
            r1 = 301(0x12d, float:4.22E-43)
            if (r9 >= r1) goto L62
            r9 = r5
            goto L63
        L62:
            r9 = r6
        L63:
            if (r9 == 0) goto L67
            r9 = r3
            goto L68
        L67:
            r9 = r6
        L68:
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            android.content.Context r2 = r8.f547250d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r2, r1)
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.WindowManager r1 = r2.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r1 == r5) goto L89
            r2 = 2
            if (r1 == r2) goto L8a
            r0 = 3
            if (r1 == r0) goto L87
            r0 = r6
            goto L8a
        L87:
            r0 = r3
            goto L8a
        L89:
            r0 = r4
        L8a:
            int r9 = r9 + r0
            int r9 = r9 + 360
            int r9 = r9 % 360
            if (r9 == r4) goto L95
            if (r9 == r3) goto L95
            r4 = r9
            goto L9a
        L95:
            if (r9 != r3) goto L98
            goto L9a
        L98:
            r4 = -90
        L9a:
            int r9 = r8.f547252f
            if (r4 == r9) goto La1
            r8.b(r4)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.x3.mo47333x15072581(int):void");
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        this.f547251e.disable();
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        this.f547251e.enable();
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        di3.d dVar = this.f547251e;
        dVar.f314222g = null;
        dVar.disable();
    }
}
