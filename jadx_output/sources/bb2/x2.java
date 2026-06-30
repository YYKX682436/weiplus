package bb2;

/* loaded from: classes5.dex */
public final class x2 extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f19073a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f19074b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f19075c;

    public x2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f19073a = context;
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof bb2.v2;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 0;
    }

    @Override // yp.p
    public void l(int i17, yp.o viewHolder, wp.i danmaku) {
        android.text.SpannableString i18;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        java.lang.Object obj = danmaku.f448354y;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar = (bb2.o) obj;
        bb2.b bVar = (bb2.b) viewHolder;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R().r()).intValue();
        android.content.Context context = this.f19073a;
        int color = intValue != 1 ? intValue != 2 ? intValue != 3 ? context.getResources().getColor(com.tencent.mm.R.color.f479246ty) : context.getResources().getColor(com.tencent.mm.R.color.f479245tx) : context.getResources().getColor(com.tencent.mm.R.color.f479244al4) : context.getResources().getColor(com.tencent.mm.R.color.f479243tv);
        com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView = bVar.f18806f;
        danmakuStrokeTextView.setStrokeColor(color);
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127672e5).getValue()).r()).intValue();
        if (intValue2 <= 0) {
            intValue2 = 17;
        }
        danmakuStrokeTextView.setTextSize(0, ym5.x.a(context, intValue2));
        com.tencent.mars.xlog.Log.i("TextDanmakuRender", "onBindViewHolder: bulletTextSize=" + intValue2);
        java.lang.String string = oVar.f18926a.getString(2);
        int integer = oVar.f18926a.getInteger(6);
        android.widget.ImageView imageView = bVar.f18805e;
        com.tencent.mm.plugin.finder.view.DanmakuStrokeTextView danmakuStrokeTextView2 = bVar.f18806f;
        if (integer == 1) {
            imageView.setVisibility(8);
            danmakuStrokeTextView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            danmakuStrokeTextView2.setNeedStroke(false);
        } else if (integer != 2) {
            imageView.setVisibility(8);
            danmakuStrokeTextView2.setTextColor(-1);
            danmakuStrokeTextView2.setNeedStroke(true);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(com.tencent.mm.R.drawable.c3x);
            imageView.getLayoutParams().width = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479706d1);
            danmakuStrokeTextView2.setTextColor(-1);
            danmakuStrokeTextView2.setNeedStroke(true);
        }
        bb2.v2 v2Var = danmaku instanceof bb2.v2 ? (bb2.v2) danmaku : null;
        if (v2Var == null || (i18 = v2Var.f19024J) == null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string);
        }
        danmakuStrokeTextView.setText(i18);
        bVar.g(oVar);
        bVar.f18809i.setOnClickListener(new bb2.w2(this, danmaku));
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f19073a).inflate(com.tencent.mm.R.layout.bxe, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        bb2.b bVar = new bb2.b(inflate);
        com.tencent.mm.ui.bk.r0(bVar.f18806f.getPaint(), 0.8f);
        com.tencent.mars.xlog.Log.i("TextDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return bVar;
    }

    @Override // yp.p, yp.a
    /* renamed from: n */
    public void g(wp.i iVar, xp.d dVar, float f17, float f18, android.view.View view) {
        super.g(iVar, dVar, f17, f18, view);
        if (iVar instanceof bb2.c) {
            bb2.c cVar = (bb2.c) iVar;
            if (cVar.K) {
                int h17 = cVar.h();
                cq.k1.a();
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (cVar.D < h17 * (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127982v6).getValue()).r()).floatValue() + 0.02f)) {
                    yp.o oVar = cVar.H;
                    bb2.b bVar = oVar instanceof bb2.b ? (bb2.b) oVar : null;
                    if (bVar != null) {
                        hc2.f1.e(bVar.f18804d);
                        cVar.K = false;
                    }
                }
            }
        }
    }

    @Override // yp.p
    public void o(wp.i iVar, xp.d dVar) {
        yz5.p pVar;
        java.lang.Object obj = iVar != null ? iVar.f448354y : null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar == null || (pVar = this.f19074b) == null) {
            return;
        }
        pVar.invoke(java.lang.Long.valueOf(oVar.a()), oVar.f18926a.getString(11));
    }
}
