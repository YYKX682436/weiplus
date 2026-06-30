package gx0;

/* loaded from: classes5.dex */
public final class j6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358106d;

    public j6(gx0.w8 w8Var) {
        this.f358106d = w8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        gx0.fd fdVar = (gx0.fd) obj;
        java.util.Objects.toString(fdVar);
        gx0.w8 w8Var = this.f358106d;
        android.content.res.Resources a17 = j65.q.a(w8Var.m80379x76847179());
        if ((fdVar == null ? -1 : gx0.i6.f358061a[fdVar.ordinal()]) != 1) {
            android.widget.ImageView imageView = w8Var.G;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playButton");
                throw null;
            }
            imageView.setContentDescription(a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbu));
            android.widget.ImageView imageView2 = w8Var.G;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playButton");
                throw null;
            }
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            imageView2.setImageDrawable(d3.l.a(a17, com.p314xaae8f345.mm.R.C30861xcebc809e.cn8, null));
            return;
        }
        android.widget.ImageView imageView3 = w8Var.G;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playButton");
            throw null;
        }
        imageView3.setContentDescription(a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbt));
        android.widget.ImageView imageView4 = w8Var.G;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playButton");
            throw null;
        }
        java.lang.ThreadLocal threadLocal2 = d3.q.f307641a;
        imageView4.setImageDrawable(d3.l.a(a17, com.p314xaae8f345.mm.R.C30861xcebc809e.cll, null));
        if (w8Var.v7().f150877f.f150177d) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb l76 = w8Var.W6().l7();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c rootView = w8Var.w7();
            gx0.s8 s8Var = new gx0.s8(w8Var);
            gx0.t8 t8Var = new gx0.t8(w8Var);
            gx0.u8 u8Var = new gx0.u8(w8Var);
            ou0.s sVar = w8Var.f358645J;
            sVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
            if (l76 != null) {
                java.lang.String P0 = l76.P0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P0, "getTitle(...)");
                if (!(P0.length() == 0)) {
                    return;
                }
            }
            if (sVar.f430441a == null) {
                android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.q8r);
                if (findViewById == null) {
                    sVar.f430441a = null;
                    return;
                }
                sVar.f430441a = new zu0.j(findViewById);
                s8Var.mo152xb9724478();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager", "tryAddMovieMovieTitleTip", "(Lcom/tencent/maas/moviecomposing/segments/MovieTitleSegment;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager", "tryAddMovieMovieTitleTip", "(Lcom/tencent/maas/moviecomposing/segments/MovieTitleSegment;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener(new ou0.q(t8Var));
                rootView.findViewById(com.p314xaae8f345.mm.R.id.q7t).setOnClickListener(new ou0.r(u8Var, sVar, l76));
            }
        }
    }
}
