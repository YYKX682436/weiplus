package fk2;

/* loaded from: classes3.dex */
public final class d1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final fk2.c1 f344877m = new fk2.c1(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemHighlightComment", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemHighlightComment", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c22624x85d69039, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) c22624x85d69039;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fk2.c1 c1Var = f344877m;
        sb6.append(c1Var.a());
        sb6.append(' ');
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        we2.a aVar = this.f526773a;
        int f17 = aVar.f();
        boolean h17 = aVar.h(i17);
        android.view.ViewParent parent = c14315xbe4ed405.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        c14315xbe4ed405.m84185x3abfd950(this.f526780h);
        c14315xbe4ed405.setVisibility(0);
        if (f17 > 0) {
            c14315xbe4ed405.o(sb7, 5, f17, h17, new fk2.b1(1), true, true);
        } else {
            c14315xbe4ed405.b(c1Var.b(sb7, 1));
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new fk2.a1(c14315xbe4ed405, sb7, viewGroup, f17, h17, null), 2, null);
        }
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e68, c1Var.a());
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.mf(msg);
    }

    @Override // we2.o
    public int n() {
        return 100004;
    }
}
