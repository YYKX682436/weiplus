package yn2;

/* loaded from: classes2.dex */
public final class d implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f545501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f545503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f545504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f545506i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f545507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f545508n;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, yn2.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.mb4 mb4Var, in5.s0 s0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f545501d = c15196x85976f5f;
        this.f545502e = mVar;
        this.f545503f = abstractC14490x69736cb5;
        this.f545504g = mb4Var;
        this.f545505h = s0Var;
        this.f545506i = g0Var;
        this.f545507m = g0Var2;
        this.f545508n = c0Var;
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.lang.Object obj;
        long j17;
        long j18;
        long j19;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var;
        java.lang.String str;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = this.f545506i;
        if (g0Var2.f391654d > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f545501d;
            long m61488x7723e6ff = c15196x85976f5f.m61488x7723e6ff();
            long m61469xb7aadf97 = c15196x85976f5f.m61469xb7aadf97();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - g0Var2.f391654d;
            java.lang.Long valueOf = java.lang.Long.valueOf(m61488x7723e6ff);
            if (!(valueOf.longValue() > 0)) {
                valueOf = null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3 = this.f545507m;
            java.lang.Object valueOf2 = valueOf != null ? java.lang.Float.valueOf((((float) g0Var3.f391654d) / ((float) valueOf.longValue())) * 100) : 0;
            java.lang.Long valueOf3 = java.lang.Long.valueOf(m61488x7723e6ff);
            java.lang.Long l17 = (valueOf3.longValue() > 0L ? 1 : (valueOf3.longValue() == 0L ? 0 : -1)) > 0 ? valueOf3 : null;
            java.lang.Number valueOf4 = l17 != null ? java.lang.Float.valueOf((((float) m61469xb7aadf97) / ((float) l17.longValue())) * 100) : 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f545508n;
            boolean z17 = c0Var2.f391645d;
            yn2.m mVar = this.f545502e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f545503f;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = mVar.f545527e;
                if (eVar == null || (str = ((xn2.p0) eVar).f537077b) == null) {
                    str = "";
                }
                java.lang.String u17 = pm0.v.u(abstractC14490x69736cb52.mo2128x1ed62e84());
                c0Var = c0Var2;
                java.lang.String m76829x97edf6c0 = abstractC14490x69736cb52.getFeedObject().getFeedObject().m76829x97edf6c0();
                g0Var = g0Var3;
                j18 = m61469xb7aadf97;
                if (abstractC14490x69736cb52 instanceof zn2.a) {
                    java.lang.String sessionId = ((zn2.a) abstractC14490x69736cb52).f556021i;
                    if (sessionId.length() == 0) {
                        int i17 = qg3.g1.f444353d;
                        sessionId = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
                    }
                    int i18 = qg3.t1.f444400d;
                    com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m169845x21b0d463 = p3380x6a61f93.p3383xf5152754.C30549x21b2b547.m169845x21b0d463();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m169845x21b0d463, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.ReportService");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                    j17 = m61488x7723e6ff;
                    qg3.f1 f1Var = (qg3.f1) p3380x6a61f93.p3383xf5152754.C30549x21b2b547.m169844x21b09c81(((qg3.t1) ((qg3.r1) m169845x21b0d463)).m105978x2737f10(), sessionId);
                    bw5.jd0 jd0Var = new bw5.jd0();
                    jd0Var.f110465e = str;
                    boolean[] zArr = jd0Var.A;
                    zArr[2] = true;
                    jd0Var.f110466f = 281;
                    zArr[3] = true;
                    jd0Var.f110467g = u17;
                    zArr[4] = true;
                    jd0Var.f110470m = (int) currentTimeMillis;
                    zArr[7] = true;
                    abstractC14490x69736cb5 = abstractC14490x69736cb52;
                    obj2 = valueOf2;
                    jd0Var.f110471n = (int) (java.lang.System.currentTimeMillis() - g0Var2.f391654d);
                    zArr[8] = true;
                    jd0Var.f110469i = valueOf4.intValue();
                    zArr[6] = true;
                    jd0Var.f110472o = c15196x85976f5f.m61474x2d827763();
                    zArr[9] = true;
                    jd0Var.f110468h = m76829x97edf6c0;
                    zArr[5] = true;
                    jd0Var.f110474q = 1;
                    zArr[11] = true;
                    if (f1Var != null) {
                        byte[] mo14344x5f01b1f6 = jd0Var.mo14344x5f01b1f6();
                        long m105978x2737f10 = ((qg3.g1) f1Var).m105978x2737f10();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
                        p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169877x21b3857a(m105978x2737f10, mo14344x5f01b1f6);
                    }
                } else {
                    abstractC14490x69736cb5 = abstractC14490x69736cb52;
                    obj2 = valueOf2;
                    j17 = m61488x7723e6ff;
                }
                j19 = currentTimeMillis;
                obj = obj2;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("exit_autoplay", null, kz5.c1.k(new jz5.l("view_id", "long_video_card"), new jz5.l("finder_context_id", str), new jz5.l("comment_scene", 281), new jz5.l("feed_id", u17), new jz5.l("session_buffer", m76829x97edf6c0), new jz5.l("autoplay_duration", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("curr_progress", valueOf4), new jz5.l("start_progress", obj2), new jz5.l("autoplay_start_ts", java.lang.Long.valueOf(g0Var2.f391654d)), new jz5.l("autoplay_end_ts", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), 1, false);
            } else {
                abstractC14490x69736cb5 = abstractC14490x69736cb52;
                obj = valueOf2;
                j17 = m61488x7723e6ff;
                j18 = m61469xb7aadf97;
                j19 = currentTimeMillis;
                c0Var = c0Var2;
                g0Var = g0Var3;
            }
            g0Var2.f391654d = 0L;
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "onVideoPause " + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) + " totalMs=" + j17 + ",curPosMs=" + j18 + "(%" + valueOf4 + "),startProgress=" + g0Var.f391654d + "(%" + obj + "),duration=" + j19 + ",durationExceed1S=" + c0Var.f391645d + '!');
        }
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
        vn2.u0 u0Var = vn2.u0.f519920a;
        boolean h17 = u0Var.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f545501d;
        c15196x85976f5f.mo61320x764d819b(h17);
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if (videoView != null) {
            videoView.mo56709x764d819b(u0Var.h());
        }
        yn2.m mVar = this.f545502e;
        int o17 = mVar.o();
        jz5.g gVar = mVar.f545531i;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f545503f;
        if (abstractC14490x69736cb5 instanceof zn2.a) {
            zn2.a aVar = (zn2.a) abstractC14490x69736cb5;
            int i17 = qg3.g1.f444353d;
            java.lang.String m169879x21b8cb32 = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
            aVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m169879x21b8cb32, "<set-?>");
            aVar.f556021i = m169879x21b8cb32;
        }
        cw2.t4 scalingInfoWrapper = c15196x85976f5f.getScalingInfoWrapper();
        r45.gn2 gn2Var = scalingInfoWrapper != null ? scalingInfoWrapper.f305553a : null;
        boolean z17 = true;
        r45.mb4 mb4Var = this.f545504g;
        if (mb4Var != null && gn2Var != null) {
            float m75938x746dc8a6 = mb4Var.m75938x746dc8a6(4);
            float m75938x746dc8a62 = mb4Var.m75938x746dc8a6(5);
            if (gn2Var.m75933x41a8a7f2(1) && gn2Var.m75938x746dc8a6(4) > gn2Var.m75938x746dc8a6(3)) {
                float m75938x746dc8a63 = m75938x746dc8a62 * (gn2Var.m75938x746dc8a6(4) - gn2Var.m75938x746dc8a6(3));
                float f17 = m75938x746dc8a63 / m75938x746dc8a6;
                if (f17 >= 0.5625f) {
                    o17 = (int) (intValue * (m75938x746dc8a6 / m75938x746dc8a63));
                } else {
                    intValue = (int) (o17 * f17);
                }
            }
        }
        java.lang.Object videoView2 = c15196x85976f5f.getVideoView();
        android.view.View view = videoView2 instanceof android.view.View ? (android.view.View) videoView2 : null;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (layoutParams2.width == o17 && layoutParams2.height == intValue) {
                z17 = false;
            }
            layoutParams2.width = o17;
            layoutParams2.height = intValue;
            layoutParams2.gravity = 17;
            if (z17) {
                view.requestLayout();
            }
        }
        android.view.View p17 = this.f545505h.p(com.p314xaae8f345.mm.R.id.hqu);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$5", "onVideoPlay", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$5", "onVideoPlay", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f545506i;
        g0Var.f391654d = currentTimeMillis;
        long m61469xb7aadf97 = c15196x85976f5f.m61469xb7aadf97();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = this.f545507m;
        g0Var2.f391654d = m61469xb7aadf97;
        this.f545508n.f391645d = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoPlay ");
        sb6.append(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        sb6.append(" startPlay=");
        sb6.append(g0Var.f391654d);
        sb6.append(",startProgress=");
        sb6.append(g0Var2.f391654d);
        sb6.append(",displayW=");
        sb6.append(mVar.o());
        sb6.append(" displayH=");
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        sb6.append(", videoW=");
        sb6.append(mb4Var != null ? java.lang.Float.valueOf(mb4Var.m75938x746dc8a6(4)) : null);
        sb6.append(" H=");
        sb6.append(mb4Var != null ? java.lang.Float.valueOf(mb4Var.m75938x746dc8a6(5)) : null);
        sb6.append(",containerW=");
        android.view.ViewGroup.LayoutParams layoutParams3 = c15196x85976f5f.getLayoutParams();
        sb6.append(layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.width) : null);
        sb6.append(" H=");
        android.view.ViewGroup.LayoutParams layoutParams4 = c15196x85976f5f.getLayoutParams();
        sb6.append(layoutParams4 != null ? java.lang.Integer.valueOf(layoutParams4.height) : null);
        sb6.append("! \n scalingInfo=");
        java.lang.Object obj = mb4Var != null ? (r45.gn2) mb4Var.m75936x14adae67(45) : null;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        java.lang.String sb6;
        if (j18 > 0) {
            if (j17 - this.f545507m.f391654d >= 1000) {
                this.f545508n.f391645d = true;
            }
            in5.s0 s0Var = this.f545505h;
            android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (seekBar != null) {
                seekBar.setVisibility(0);
            }
            android.widget.SeekBar seekBar2 = (android.widget.SeekBar) s0Var.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (seekBar2 != null) {
                seekBar2.setProgress(a06.d.b((((float) j17) * 1000.0f) / ((float) j18)));
            }
            long j19 = (int) ((j18 - j17) / 1000);
            long j27 = j19 / 60;
            long j28 = j19 % 60;
            if (j28 < 10) {
                sb6 = j27 + ":0" + j28;
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(j27);
                sb7.append(':');
                sb7.append(j28);
                sb6 = sb7.toString();
            }
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f565672d55)).setText(sb6);
        }
    }
}
