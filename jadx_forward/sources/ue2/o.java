package ue2;

/* loaded from: classes3.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 implements io0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f508360y = "Finder.FinderLiveChatAnchorPluginLayout@" + new ue2.a(null).hashCode();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f508361d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f508362e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f508363f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f508364g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f508365h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f508366i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f508367m;

    /* renamed from: n, reason: collision with root package name */
    public wm2.n f508368n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f508369o;

    /* renamed from: p, reason: collision with root package name */
    public ue2.e0 f508370p;

    /* renamed from: q, reason: collision with root package name */
    public ue2.h0 f508371q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f508372r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f508373s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f508374t;

    /* renamed from: u, reason: collision with root package name */
    public tn0.w0 f508375u;

    /* renamed from: v, reason: collision with root package name */
    public ue2.x f508376v;

    /* renamed from: w, reason: collision with root package name */
    public final int f508377w;

    /* renamed from: x, reason: collision with root package name */
    public final int f508378x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f508377w = 17;
        this.f508378x = 3;
    }

    /* renamed from: getCameraOpManager */
    private final hn0.f m167888x767452b1() {
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            return w0Var.f502306t;
        }
        return null;
    }

    /* renamed from: getContextRotate */
    private final int m167889xb6bd7c34() {
        int i17;
        android.content.Context context = getContext();
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCoreAnchor", "Context is not Activity, using default rotation");
            return 0;
        }
        android.app.Activity activity = (android.app.Activity) context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            i17 = 90;
        } else if (rotation == 2) {
            i17 = 180;
        } else {
            if (rotation != 3) {
                return 0;
            }
            i17 = 270;
        }
        return i17;
    }

    /* renamed from: getCurrentPullSource */
    private final int m167890xe6ffd863() {
        android.content.Intent intent;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289 = m57689x106f9289();
        android.os.Bundle m7436x8619eaa0 = m57689x106f9289 != null ? m57689x106f9289.m7436x8619eaa0() : null;
        if (m7436x8619eaa0 == null || (intent = (android.content.Intent) m7436x8619eaa0.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT")) == null) {
            return 1;
        }
        int intExtra = intent.getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_PULL_SOURCE", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "getCurrentPullSource: pullSource=" + intExtra);
        return intExtra;
    }

    /* renamed from: getEntranceId */
    private final long m167891x50f37667() {
        android.content.Intent intent;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m57689x106f9289 = m57689x106f9289();
        android.os.Bundle m7436x8619eaa0 = m57689x106f9289 != null ? m57689x106f9289.m7436x8619eaa0() : null;
        if (m7436x8619eaa0 == null || (intent = (android.content.Intent) m7436x8619eaa0.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT")) == null) {
            return 0L;
        }
        long longExtra = intent.getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "getEntranceId: entranceId=" + longExtra);
        return longExtra;
    }

    /* renamed from: getSelfContact */
    private final ya2.b2 m167892xaa12a5fe() {
        return ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
    }

    public static final void r(ue2.o oVar) {
        rg2.a aVar;
        oVar.getClass();
        w(oVar, 13L, null, 2, null);
        if (!(oVar.m57689x106f9289() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) || (aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) oVar.m57689x106f9289()).f193185n) == null) {
            return;
        }
        ((sp2.u2) aVar).f492762a.b(null);
    }

    public static final void s(ue2.o oVar) {
        rg2.a aVar;
        oVar.getClass();
        w(oVar, 4L, null, 2, null);
        if (!(oVar.m57689x106f9289() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) || (aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) oVar.m57689x106f9289()).f193185n) == null) {
            return;
        }
        sp2.u2 u2Var = (sp2.u2) aVar;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.y3 y3Var = ml2.y3.f409814s;
        y4Var.m(y3Var);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        y4Var.f409824c0 = y3Var;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = u2Var.f492763b;
        sp2.d3 d3Var = u2Var.f492762a;
        d3Var.b(new sp2.t2(abstractActivityC21394xb3d2c0cf, d3Var, u2Var.f492764c, u2Var.f492765d));
    }

    /* renamed from: setupDialogButtonListeners */
    private final void m167893x8a56ba48(android.view.ViewGroup viewGroup) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.spd);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.sp7);
        linearLayout.setOnClickListener(new ue2.l(this));
        button.setOnClickListener(new ue2.m(this));
    }

    public static void t(ue2.o oVar, boolean z17, int i17, java.lang.Object obj) {
        kn0.p c17;
        kn0.p c18;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeCamera");
        }
        mm2.c1 c1Var = (mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class);
        int i18 = (int) ((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).f410399q;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        c1Var.p8(i18 | 256);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("closeCamera", (int) ((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).f410399q);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
        hn0.f m167888x767452b1 = oVar.m167888x767452b1();
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", (m167888x767452b1 == null || (c18 = ((hn0.p) m167888x767452b1).c()) == null) ? false : c18.f391122i);
        oVar.mo46557x60d69242(qo0.b.f446899i4, bundle);
        hn0.f m167888x767452b12 = oVar.m167888x767452b1();
        if (m167888x767452b12 != null && (c17 = ((hn0.p) m167888x767452b12).c()) != null) {
            c17.l();
        }
        oVar.D();
        oVar.E();
        if (oVar.f508369o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "closeCamera: 从视频模式切换到音频模式，当前正在显示美颜面板，需要隐藏");
            oVar.B();
        }
    }

    public static /* synthetic */ void w(ue2.o oVar, long j17, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017");
        }
        if ((i17 & 2) != 0) {
            map = null;
        }
        oVar.v(j17, map);
    }

    public final void A() {
        hn0.f fVar;
        ue2.e0 e0Var = this.f508370p;
        if (e0Var != null && e0Var.f508341h) {
            return;
        }
        java.lang.String str = f508360y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showChatDialogAndStartPreview: 开始显示弹窗和预览");
        w(this, 3L, null, 2, null);
        ue2.e0 e0Var2 = this.f508370p;
        if (e0Var2 != null) {
            e0Var2.b();
        }
        if (this.f508372r) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreviewIfNeeded: 开始预览初始化");
        if (((mm2.o4) m57635xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb() == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = ((mm2.e1) m57635xbba4bfc0(mm2.e1.class)).f410520q.f461834n;
            if (str2 == null) {
                str2 = "DEFAULT_ANCHOR_USER_ID";
            }
            arrayList.add(new jo0.a(str2, new hn5.b(0.0f, 0.0f, 1.0f, 1.0f), false));
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f508373s;
            if (c10849x610a91e1 != null) {
                c10849x610a91e1.d(arrayList, new android.graphics.Rect(0, 0, b17.x, b17.y), false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "createDefaultAnchorView: 创建默认主播视图，userId=".concat(str2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreview: fromMiniWindow=false, checkMode=false");
        tn0.w0 w0Var = this.f508375u;
        if (w0Var != null && (fVar = w0Var.f502306t) != null) {
            ((hn0.p) fVar).i(dk2.ef.f314905a.F());
        }
        int m167889xb6bd7c34 = m167889xb6bd7c34();
        tn0.w0 w0Var2 = this.f508375u;
        if (w0Var2 != null) {
            w0Var2.D0(this.f508373s, ko0.c0.f391358a.b().f401529e, m167889xb6bd7c34);
        }
        in0.q e17 = dk2.ef.f314905a.e();
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l.f197120a.a(m167889xb6bd7c34, (e17 == null || e17.W()) ? false : true, ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).O7());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "preview cameraRotate: " + a17 + ", contextRotate: " + m167889xb6bd7c34);
        tn0.w0 w0Var3 = this.f508375u;
        if (w0Var3 != null) {
            w0Var3.y0(a17);
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e12 = this.f508373s;
        if (c10849x610a91e12 != null) {
            c10849x610a91e12.post(new ue2.n(this));
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e13 = this.f508373s;
        if (c10849x610a91e13 != null) {
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = c10849x610a91e13.renderRatioLayout;
            c10844x4ce18327.getClass();
            c10844x4ce18327.f150109o.d(false);
        }
        this.f508372r = true;
    }

    public final void B() {
        java.lang.String str = f508360y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showDialog: 显示dialog并隐藏美颜面板");
        boolean z17 = false;
        this.f508369o = false;
        wm2.n nVar = this.f508368n;
        if (nVar != null) {
            nVar.a(true, false);
        }
        android.view.View view = this.f508367m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "showDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "showDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = this.f508363f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showDialog: 美颜面板已隐藏，切换回dialog模式");
        ue2.h0 h0Var = this.f508371q;
        if (h0Var != null) {
            h0Var.a();
        }
        ue2.e0 e0Var = this.f508370p;
        if (e0Var != null && e0Var.f508341h) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (e0Var != null) {
            e0Var.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showChatDialog: 内部弹窗已显示");
    }

    public final void C(boolean z17) {
        r45.kz0 kz0Var;
        p012xc85e97e9.p093xedfae76a.c1 m57635xbba4bfc0 = m57635xbba4bfc0(mm2.c1.class);
        ya2.b2 b2Var = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
        if (m57635xbba4bfc0 == null || b2Var == null) {
            return;
        }
        mm2.c1 c1Var = (mm2.c1) m57635xbba4bfc0;
        if (z17) {
            int i17 = (int) b2Var.f69320xb21ed244;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            b2Var.f69320xb21ed244 = i17 | 256;
        } else {
            int i18 = (int) b2Var.f69320xb21ed244;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            b2Var.f69320xb21ed244 = i18 & (-257);
        }
        ya2.h.f542017a.o(b2Var);
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        long m75942xfb822ef2 = (I1 == null || (kz0Var = I1.f68702x723e3d5f) == null) ? 0L : kz0Var.m75942xfb822ef2(0);
        c1Var.Z9(z17 ? ((int) m75942xfb822ef2) | 256 : ((int) m75942xfb822ef2) & (-257));
    }

    public final void D() {
        boolean l76 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).l7();
        android.view.View view = this.f508364g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.shj) : null;
        if (l76) {
            android.view.View view2 = this.f508364g;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.3f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.setAlpha(0.3f);
            return;
        }
        android.view.View view3 = this.f508364g;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setAlpha(1.0f);
    }

    public final void E() {
        boolean l76 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).l7();
        android.view.View view = this.f508365h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.vbn) : null;
        android.view.View view2 = this.f508365h;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.vbo) : null;
        if (l76) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81305x77c10876);
            }
            if (textView == null) {
                return;
            }
            textView.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opm));
            return;
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81299xe97aa5a6);
        }
        if (textView == null) {
            return;
        }
        textView.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opn));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: bindData */
    public void mo57463x37f82187(km2.m data) {
        int i17;
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.mo57463x37f82187(data);
        this.f508374t = findViewById(com.p314xaae8f345.mm.R.id.f566127th2);
        java.lang.String str = f508360y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bindData: 开始初始化直播预览组件");
        if (in0.q.f374302b2 == null) {
            in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
        }
        in0.q qVar = in0.q.f374302b2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        this.f508375u = qVar;
        qVar.z0(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupConfig selfContact.anchorStatus:");
        ya2.b2 m167892xaa12a5fe = m167892xaa12a5fe();
        sb6.append(m167892xaa12a5fe != null ? java.lang.Long.valueOf(m167892xaa12a5fe.f69320xb21ed244) : null);
        sb6.append(" switchFlag:");
        ya2.b2 m167892xaa12a5fe2 = m167892xaa12a5fe();
        sb6.append(m167892xaa12a5fe2 != null ? java.lang.Long.valueOf(m167892xaa12a5fe2.f69326x798040b1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        mm2.c1 c1Var = (mm2.c1) m57635xbba4bfc0(mm2.c1.class);
        ya2.g gVar = ya2.h.f542017a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c1Var.J4 = gVar.b(xy2.c.e(context));
        mm2.c1 c1Var2 = (mm2.c1) m57635xbba4bfc0(mm2.c1.class);
        if (((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410405r > 0) {
            i17 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410405r;
        } else {
            ya2.b2 b2Var = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
            i17 = (int) (b2Var != null ? b2Var.f69320xb21ed244 : 0L);
        }
        c1Var2.p8(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("onBindData", (int) ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410399q);
        ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).D8(0);
        ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).p8(((int) ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410399q) & (-257));
        C(false);
        zl2.r4 r4Var = zl2.r4.f555483a;
        ya2.b2 m167892xaa12a5fe3 = m167892xaa12a5fe();
        if (!pm0.v.z((int) (m167892xaa12a5fe3 != null ? m167892xaa12a5fe3.f69326x798040b1 : 0L), 8) || !r4Var.j()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            mo46557x60d69242(qo0.b.f446899i4, bundle);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeCoreComponents: 核心组件初始化完成，enableAudioMode=" + ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).l7());
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById(com.p314xaae8f345.mm.R.id.icy);
        if (c10849x610a91e1 != null) {
            c10849x610a91e1.m46529x742f459a(this);
        } else {
            c10849x610a91e1 = null;
        }
        this.f508373s = c10849x610a91e1;
        this.f508361d = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.l3x);
        this.f508362e = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f566126th1);
        this.f508363f = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f564965au0);
        this.f508364g = findViewById(com.p314xaae8f345.mm.R.id.shi);
        this.f508365h = findViewById(com.p314xaae8f345.mm.R.id.vbm);
        this.f508367m = findViewById(com.p314xaae8f345.mm.R.id.shk);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567172ig1);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ifw);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ify);
        ya2.b2 b2Var2 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
        if (b2Var2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            textView = textView2;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (textView != null) {
                textView.setText(b2Var2.w0());
            }
            if (imageView != null) {
                java.lang.String u07 = ((mm2.d) m57635xbba4bfc0(mm2.d.class)).f410475f || m57663xfb7e5820().f390662d.f150085v == 4 ? b2Var2.u0() : b2Var2.y0();
                if (u07.length() > 0) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.a().c(new mn2.n(u07, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                } else {
                    imageView.setImageDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
                }
            }
        } else {
            textView = textView2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initializeTitleBar: 标题栏初始化完成 - 主播昵称: ");
        sb7.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.enu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f508376v = new ue2.x((android.view.ViewGroup) findViewById2, this);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.tgi);
        this.f508366i = c1073x7e08a787;
        if (c1073x7e08a787 != null) {
            wm2.n nVar = new wm2.n(c1073x7e08a787);
            this.f508368n = nVar;
            nVar.f528792i = new ue2.f(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeBeautyPanel: 美颜面板初始化完成");
        }
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ue2.e0 e0Var = new ue2.e0(context2);
        e0Var.m167886x53e6f53b(new ue2.g(this));
        this.f508370p = e0Var;
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        this.f508371q = new ue2.h0(context3, this.f508361d, this.f508370p, this.f508374t, this.f508362e);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9e, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        ue2.e0 e0Var2 = this.f508370p;
        if (e0Var2 != null) {
            e0Var2.m167885x590ab8fc(viewGroup);
        }
        m167893x8a56ba48(viewGroup);
        android.view.View view = this.f508374t;
        android.view.ViewGroup viewGroup2 = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f508370p);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeInternalDialog: 内部弹窗初始化完成（外部定义UI内容）");
        android.view.View view2 = this.f508364g;
        if (view2 != null) {
            view2.setOnClickListener(new ue2.h(this));
        }
        android.view.View view3 = this.f508365h;
        if (view3 != null) {
            view3.setOnClickListener(new ue2.i(this));
        }
        if (((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).l7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 初始化为音频模式");
            t(this, false, 1, null);
        } else {
            u();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 初始化为视频模式");
        }
        D();
        if (ko0.l.f391403a.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 当前资源可用，无需下载");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 当前资源不可用，启动协程下载资源");
            p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f9(), null, null, new ue2.c(this, null), 3, null);
        }
        z(1, 1);
        z(1, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: UI组件初始化完成");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bindData: 直播预览组件初始化完成");
    }

    /* renamed from: getDisplayMode */
    public final int m167894x4001dc4f() {
        return this.f508378x;
    }

    /* renamed from: getEntranceType */
    public final int m167895xe1f4d586() {
        return this.f508377w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public int mo11219xd0598cf8() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: getRelativeLayoutId */
    public int mo46545x959e1c47() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9b;
    }

    @Override // io0.a
    /* renamed from: getSelfUserId */
    public java.lang.String mo56927xa888f8a8() {
        java.lang.String m86 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: getTRTCLiveCore */
    public tn0.w0 mo57476xdd07d18e() {
        return this.f508375u;
    }

    @Override // no0.g
    /* renamed from: onBattleApply */
    public void mo57492xee3c7e37() {
    }

    @Override // no0.g
    /* renamed from: onBattleClose */
    public void mo57493xee56d8c1() {
    }

    @Override // no0.g
    /* renamed from: onBattleDismiss */
    public void mo57494xe4011f13() {
    }

    @Override // no0.g
    /* renamed from: onBattleEnd */
    public void mo57495xe114a1e4() {
    }

    @Override // no0.g
    /* renamed from: onBattleStart */
    public void mo57496xef3bbf2b() {
    }

    @Override // com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: onCallStateChanged */
    public void mo46550x22910660(int i17, java.lang.String incomingNumber) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(incomingNumber, "incomingNumber");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "onCallStateChanged: state=" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ue2.e0 e0Var = this.f508370p;
        boolean z17 = false;
        if (e0Var != null && e0Var.f508341h) {
            z17 = true;
        }
        java.lang.String str = f508360y;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onConfigurationChanged: 配置变化，重新调整内部弹窗");
            ue2.e0 e0Var2 = this.f508370p;
            if (e0Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "onConfigurationChanged: 配置变化，重新调整弹窗");
                android.view.ViewGroup viewGroup = e0Var2.f508338e;
                if (viewGroup != null) {
                    viewGroup.post(new ue2.a0(e0Var2));
                }
            }
        }
        if (this.f508369o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onConfigurationChanged: 配置变化，重新调整美颜面板");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: onLiveEventCallback */
    public void mo57499x5609e754(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "onLiveEventCallback: errorCode=" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: release */
    public void mo57508x41012807() {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "release: 释放资源");
        ue2.e0 e0Var = this.f508370p;
        if (e0Var != null) {
            e0Var.a(false);
        }
        ue2.e0 e0Var2 = this.f508370p;
        if (e0Var2 != null) {
            if (e0Var2.f508341h || e0Var2.f508342i) {
                e0Var2.a(false);
            }
            e0Var2.removeAllViews();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatInternalDialog", "release: 内部弹窗资源已释放");
        }
        this.f508370p = null;
        ue2.h0 h0Var = this.f508371q;
        if (h0Var != null && (frameLayout = h0Var.f508350b) != null) {
            frameLayout.setTranslationY(0.0f);
            frameLayout.setTranslationX(0.0f);
            frameLayout.setElevation(0.0f);
        }
        this.f508371q = null;
        ue2.x xVar = this.f508376v;
        if (xVar != null) {
            xVar.K0(8);
            xVar.f508400q.setImageDrawable(null);
        }
        this.f508376v = null;
        this.f508372r = false;
        dk2.ef.S(dk2.ef.f314905a, "chatAnchorRelease", false, m57679xf93be2fe(), java.lang.Boolean.TRUE, m57667xfd78d498(), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: statusChange */
    public void mo46557x60d69242(qo0.b status, android.os.Bundle bundle) {
        ue2.x xVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.mo46557x60d69242(status, bundle);
        if (ue2.b.f508328a[status.ordinal()] == 1) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z17 + ", isShareMode:" + z18);
            ue2.x xVar2 = this.f508376v;
            if (xVar2 != null) {
                xVar2.M0(status, bundle);
            }
            if (!z18 || (xVar = this.f508376v) == null) {
                return;
            }
            xVar.K0(4);
        }
    }

    public final void u() {
        kn0.p c17;
        kn0.p c18;
        mm2.c1 c1Var = (mm2.c1) m57635xbba4bfc0(mm2.c1.class);
        int i17 = (int) ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410399q;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        c1Var.p8(i17 & (-257));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("openCamera", (int) ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410399q);
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        hn0.f m167888x767452b1 = m167888x767452b1();
        if (m167888x767452b1 != null && (c18 = ((hn0.p) m167888x767452b1).c()) != null) {
            z17 = c18.f391122i;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z17);
        mo46557x60d69242(qo0.b.f446899i4, bundle);
        hn0.f m167888x767452b12 = m167888x767452b1();
        if (m167888x767452b12 != null && (c17 = ((hn0.p) m167888x767452b12).c()) != null) {
            c17.m();
        }
        D();
        E();
        if (this.f508369o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "openCamera: 从音频模式切换到视频模式，当前正在显示美颜面板");
        }
    }

    public final void v(long j17, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = this.f508377w;
        jSONObject.put("entrance_type", i17);
        jSONObject.put("entrance_id", m167891x50f37667());
        int i18 = this.f508378x;
        jSONObject.put("display_mode", i18);
        jSONObject.put("pull_source", m167890xe6ffd863());
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, j17, jSONObject.toString(), null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f508360y, "report21017 entranceType=" + i17 + ", entranceId=" + m167891x50f37667() + ", displayMode=" + i18 + ", pullSource=" + m167890xe6ffd863());
    }

    public final void z(int i17, int i18) {
        v(70L, kz5.c1.k(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("element", java.lang.String.valueOf(i18))));
    }
}
