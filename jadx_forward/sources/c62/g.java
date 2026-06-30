package c62;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f120992a;

    /* renamed from: b, reason: collision with root package name */
    public final yj0.d f120993b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f120994c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f120995d;

    /* renamed from: e, reason: collision with root package name */
    public int f120996e;

    public g() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f120992a = hashMap;
        this.f120993b = new c62.f(this, null);
        this.f120994c = false;
        this.f120995d = null;
        this.f120996e = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("finish", "()V"));
        arrayList.add(android.util.Pair.create("dealContentView", "(Landroid/view/View;)V"));
        arrayList.add(android.util.Pair.create("onKeyDown", "(ILandroid/view/KeyEvent;)Z"));
        hashMap.put("com/tencent/mm/plugin/voip/ui/VideoActivity", arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r6) {
        /*
            r5 = this;
            java.lang.String r0 = "HABBYGE-MALI.VoipFloatSession"
            java.lang.String r1 = "onVoipSessionExit"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r45.c45 r1 = x52.c.e()
            if (r1 != 0) goto L14
            java.lang.String r1 = "_exitVoipSession, 不是合法session !!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            goto L26
        L14:
            java.lang.String r2 = r1.f452803d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "_exitVoipSession, curSession: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r2)
            v52.c r2 = v52.c.g()
            r2.s(r1, r6)
        L26:
            java.lang.String r1 = "mmkv_sionpairD_table_hell"
            byte[] r1 = c52.c.a(r1)
            if (r1 == 0) goto L51
            int r2 = r1.length
            if (r2 != 0) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L38
            goto L51
        L38:
            r45.h16 r2 = new r45.h16
            r2.<init>()
            r2.mo11468x92b714fd(r1)     // Catch: java.io.IOException -> L41
            goto L52
        L41:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "HABBYGE-MALI.SessionPairDao"
            java.lang.String r4 = "SessionPair, _read: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r2)
        L51:
            r2 = 0
        L52:
            if (r2 != 0) goto L55
            return
        L55:
            boolean r1 = r2.f457300h
            if (r1 == 0) goto Lad
            r45.c45 r1 = r2.f457296d
            java.lang.String r2 = r1.f452803d
            java.lang.String r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.b(r2)
            if (r2 != 0) goto L64
            goto Lad
        L64:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "_"
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r45.c45 r2 = x52.c.c(r1, r2, r6)
            java.lang.String r1 = r1.f452803d
            r45.jw3 r1 = b52.b.a(r1)
            if (r1 == 0) goto L99
            java.lang.String r3 = r1.f459692d
            java.lang.String r4 = r1.f459695g
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "restoreLastSesssion, curPage: %s, %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4, r3)
            java.lang.String r0 = r1.f459692d
            int r1 = r1.f459700o
            y52.b.b(r2, r0, r1, r6)
        L99:
            java.lang.String r6 = x52.m.b()
            if (r6 != 0) goto La1
            java.lang.String r6 = ""
        La1:
            r2.f452818v = r6
            x52.c.a(r2)
            v52.c r6 = v52.c.g()
            r6.u(r2)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c62.g.a(long):void");
    }
}
