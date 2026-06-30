package hk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.d f363418a = new hk2.d();

    public final void a(gk2.e liveBuContext, xs2.m0 holder, dk2.zf finderLiveMsg) {
        jz5.l q17;
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveMsg, "finderLiveMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuItemEmoji", "fillItem emoji msg: " + finderLiveMsg.hashCode());
        holder.f537889h.setVisibility(8);
        android.view.View view = holder.f537891j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "fillItem", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "fillItem", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hk2.b.f363412a.c(finderLiveMsg, holder.f537892k);
        android.view.View view2 = holder.f537885d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.findViewById(com.p314xaae8f345.mm.R.id.f566145ti3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 c14309x7fd7c1d9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9) view2.findViewById(com.p314xaae8f345.mm.R.id.f566144ti2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f566146ti4);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view2.findViewById(com.p314xaae8f345.mm.R.id.f566147ti5);
        if (viewGroup == null || c14309x7fd7c1d9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuItemEmoji", "emojiContainer or emojiView is null");
            return;
        }
        viewGroup.setVisibility(0);
        dk2.fg fgVar = finderLiveMsg instanceof dk2.fg ? (dk2.fg) finderLiveMsg : null;
        if (fgVar == null || (q17 = fgVar.q()) == null || (obj = q17.f384366d) == null || (obj2 = q17.f384367e) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj2;
        java.lang.String str = (java.lang.String) obj;
        android.content.Context context = c14309x7fd7c1d9.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        java.lang.Integer num = ((mm2.j2) liveBuContext.a(mm2.j2.class)).E;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = dimensionPixelSize;
        }
        viewGroup.requestLayout();
        if (linearLayout != null) {
            linearLayout.requestLayout();
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6 n6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = n6Var != null ? ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) n6Var).Bi(str, gVar) : null;
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuItemEmoji", "emojiInfo is null");
            return;
        }
        c14309x7fd7c1d9.m43712xc040f7d2(Bi);
        c14309x7fd7c1d9.m57287x86c391e1(dimensionPixelSize);
        c14309x7fd7c1d9.m57288x93dd6bcf(0);
        c14309x7fd7c1d9.requestLayout();
        c14309x7fd7c1d9.m43715x36e51bc8(new hk2.c(Bi, linearLayout, progressBar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuItemEmoji", "loadEmoji: md5=" + str + ", emojiMaxSize=" + dimensionPixelSize);
    }
}
