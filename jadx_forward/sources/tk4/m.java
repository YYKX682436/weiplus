package tk4;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f501530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q11.b f501531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, bw5.d2 d2Var, q11.b bVar) {
        super(0);
        this.f501529d = c18711x7115b73a;
        this.f501530e = d2Var;
        this.f501531f = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        q11.b bVar = this.f501531f;
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f441067d : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501529d;
        long j17 = c18711x7115b73a.f256180i;
        bw5.d2 d2Var = this.f501530e;
        c18711x7115b73a.i(d2Var, j17);
        if (c18711x7115b73a.c()) {
            c18711x7115b73a.i(d2Var, c18711x7115b73a.f256183l);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map j18 = c18711x7115b73a.j(d2Var);
            ((java.util.HashMap) j18).put("view_id", "tyt_push_bubble");
            ((cy1.a) rVar).yj("view_exp", null, j18, 5, false);
            java.lang.Object mo141623x754a37bb = ((jz5.n) c18711x7115b73a.f256191t).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.content.Context context = (android.content.Context) mo141623x754a37bb;
            bw5.e2 e2Var = d2Var.f107820n[7] ? d2Var.f107819m : new bw5.e2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e2Var, "getShowInfo(...)");
            tk4.c0 c0Var = c18711x7115b73a.f256192u;
            tk4.k kVar = new tk4.k(c18711x7115b73a, d2Var, c0Var);
            tk4.l lVar = new tk4.l(c18711x7115b73a, d2Var, c0Var);
            c0Var.getClass();
            if (c0Var.f501496a == null) {
                java.lang.Object systemService = context.getSystemService("window");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                c0Var.f501496a = new cl5.a((android.view.WindowManager) systemService);
            }
            if (c0Var.f501497b == null) {
                c0Var.f501499d = new android.view.GestureDetector(context, c0Var.f501504i);
                c0Var.f501497b = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.doq, (android.view.ViewGroup) null, false);
            }
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
            layoutParams.flags = 2621992;
            layoutParams.format = -3;
            layoutParams.packageName = context.getPackageName();
            layoutParams.gravity = 49;
            layoutParams.width = -2;
            layoutParams.height = -2;
            android.view.View view = c0Var.f501497b;
            if (view != null) {
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568855r52);
                android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568853r50);
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.rbf);
                android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
                if (paint != null) {
                    paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                }
                android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
                if (paint2 != null) {
                    paint2.setStrokeWidth(0.8f);
                }
                boolean[] zArr = e2Var.f108226g;
                textView.setText(zArr[1] ? e2Var.f108223d : "");
                textView2.setText(zArr[2] ? e2Var.f108224e : "");
                imageView.setImageBitmap(bitmap);
                view.setOnTouchListener(new tk4.v(c0Var, view));
                view.setOnClickListener(new tk4.w(lVar));
                ((android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f568854r51)).setOnClickListener(new tk4.x(kVar));
            }
            android.view.View view2 = c0Var.f501497b;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager", "show", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/AudioPushShowInfo;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager", "show", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/AudioPushShowInfo;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewManager viewManager = c0Var.f501496a;
                if (viewManager != null) {
                    viewManager.addView(view2, layoutParams);
                }
                view2.post(new tk4.a0(c0Var, view2));
            }
            new tk4.b0(c0Var).sendEmptyMessageDelayed(0, 8000L);
        } else {
            c18711x7115b73a.i(d2Var, c18711x7115b73a.f256182k);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18711x7115b73a.f256172a, "tryShowPushTips fail, isFeatureAvailable = false");
        }
        return jz5.f0.f384359a;
    }
}
