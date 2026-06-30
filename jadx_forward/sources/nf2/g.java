package nf2;

/* loaded from: classes10.dex */
public final class g implements of2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f418270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf2.w f418271b;

    public g(int i17, nf2.w wVar) {
        this.f418270a = i17;
        this.f418271b = wVar;
    }

    public void a(nf2.a componentLayoutMode, nf2.l1 colorStyle) {
        nf2.k1 k1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentLayoutMode, "componentLayoutMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorStyle, "colorStyle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsController", "onStylePreview: layout=" + componentLayoutMode + ", color=" + colorStyle);
        nf2.d1 d1Var = this.f418271b.f418341m;
        if (d1Var == null || !d1Var.f418236x) {
            return;
        }
        nf2.f1 f1Var = d1Var.f418215c;
        int ordinal = componentLayoutMode.ordinal();
        if (ordinal == 0) {
            k1Var = nf2.k1.f418300d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            k1Var = nf2.k1.f418301e;
        }
        boolean z17 = true;
        nf2.f1 a17 = nf2.f1.a(f1Var, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, componentLayoutMode, k1Var, null, 0L, colorStyle, 106495, null);
        if (d1Var.f418215c.f418265n == componentLayoutMode) {
            z17 = false;
        }
        d1Var.D = new jz5.l(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(d1Var.A));
        d1Var.j(a17);
        if (!z17) {
            d1Var.l(0.5f, d1Var.A);
        }
        android.view.View view = d1Var.f418221i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "applyPreviewStyle", "(Lcom/tencent/mm/plugin/finder/live/controller/lyrics/ComponentLayoutMode;Lcom/tencent/mm/plugin/finder/live/controller/lyrics/LyricsTextColorStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "applyPreviewStyle", "(Lcom/tencent/mm/plugin/finder/live/controller/lyrics/ComponentLayoutMode;Lcom/tencent/mm/plugin/finder/live/controller/lyrics/LyricsTextColorStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "applyPreviewStyle: layout=" + componentLayoutMode + ", color=" + colorStyle);
    }
}
