package yt3;

/* loaded from: classes10.dex */
public final class n1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f547079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f547080e;

    public n1(yt3.o1 o1Var, ju3.d0 d0Var) {
        this.f547079d = o1Var;
        this.f547080e = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, startTime:");
        yt3.o1 o1Var = this.f547079d;
        sb6.append(o1Var.f547100o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", sb6.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = o1Var.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.a(o1Var.f547100o, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMRecordUI", "%d on error what %d extra %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "video onPrepared");
        yt3.o1 o1Var = this.f547079d;
        if (o1Var.f547102q) {
            com.p314xaae8f345.mm.ui.bl.b(o1Var.f547095g);
            lt3.n nVar = lt3.n.f402793a;
            android.graphics.Rect rect = lt3.n.f402796d;
            int i17 = vt3.q.f521570a;
            rect.set(new android.graphics.Rect(0, 0, vt3.q.f521570a, vt3.q.f521571b));
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = o1Var.f547092d;
            if (c19745xad58a1a4 != null) {
                c19745xad58a1a4.invalidate();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a42 = o1Var.f547092d;
            if (c19745xad58a1a42 != null) {
                c19745xad58a1a42.post(new yt3.k1(o1Var));
            }
        }
        o1Var.f547096h = -1L;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a43 = o1Var.f547092d;
        if (c19745xad58a1a43 != null) {
            c19745xad58a1a43.mo69330x68ac462();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a44 = o1Var.f547092d;
        if (c19745xad58a1a44 != null) {
            c19745xad58a1a44.mo69317x764cf626(true);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a45 = o1Var.f547092d;
        ju3.d0 d0Var = this.f547080e;
        if (c19745xad58a1a45 != null) {
            c19745xad58a1a45.mo69322xfae314df(new yt3.m1(o1Var, d0Var));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (o1Var.f547101p - o1Var.f547100o > o1Var.f547098m + 750) {
            bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
        }
        d0Var.w(ju3.c0.C1, bundle);
        int i18 = o1Var.f547101p - o1Var.f547100o;
        int i19 = o1Var.f547098m;
        if (i18 > i19 + 750) {
            o1Var.f547101p = i19 + 250;
            ju3.d0.k(d0Var, ju3.c0.f383445x0, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0) >= 1000) goto L6;
     */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q(int r7, int r8) {
        /*
            r6 = this;
            yt3.o1 r7 = r6.f547079d
            long r0 = r7.f547096h
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L17
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 < 0) goto L2f
        L17:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            if (r8 == 0) goto L1e
            r8.mo69311xc00617a4()
        L1e:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            if (r8 == 0) goto L25
            r8.mo69307x9746038c()
        L25:
            int r8 = r7.f547101p
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f547096h = r0
        L2f:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            boolean r8 = r8.mo69311xc00617a4()
            if (r8 == 0) goto Le0
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            int r8 = r8.mo69307x9746038c()
            int r0 = r7.f547101p
            if (r8 < r0) goto L9c
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            int r8 = r8.mo69286x51e8b0a()
            if (r0 >= r8) goto L9c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "currentPosition:"
            r8.<init>(r0)
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = r7.f547092d
            if (r0 == 0) goto L66
            int r0 = r0.mo69307x9746038c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L67
        L66:
            r0 = 0
        L67:
            r8.append(r0)
            java.lang.String r0 = " reach endTime:"
            r8.append(r0)
            int r0 = r7.f547101p
            r8.append(r0)
            java.lang.String r0 = ", seekTo startTime:"
            r8.append(r0)
            int r0 = r7.f547100o
            r8.append(r0)
            java.lang.String r0 = ", isClipMode:"
            r8.append(r0)
            boolean r0 = r7.f547099n
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "MicroMsg.EditVideoPlayPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f547092d
            if (r8 == 0) goto L9c
            int r0 = r7.f547100o
            double r0 = (double) r0
            r4 = 1
            r8.a(r0, r4)
        L9c:
            boolean r8 = r7.f547099n
            ju3.d0 r0 = r6.f547080e
            java.lang.String r1 = "EDIT_CROP_VIDEO_CURRENT_TIME_INT"
            if (r8 == 0) goto Lbb
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r7 = r7.f547092d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            int r7 = r7.mo69307x9746038c()
            r8.putInt(r1, r7)
            ju3.c0 r7 = ju3.c0.f383418l1
            r0.w(r7, r8)
            goto Le0
        Lbb:
            long r4 = java.lang.System.currentTimeMillis()
            r7.getClass()
            long r4 = r4 - r2
            int r8 = r7.f547103r
            long r2 = (long) r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto Le0
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r7 = r7.f547092d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            int r7 = r7.mo69307x9746038c()
            r8.putInt(r1, r7)
            ju3.c0 r7 = ju3.c0.f383418l1
            r0.w(r7, r8)
        Le0:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.n1.q(int, int):int");
    }
}
