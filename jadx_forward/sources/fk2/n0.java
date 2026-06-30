package fk2;

/* loaded from: classes3.dex */
public final class n0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f344972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(we2.a liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f344972m = "CommentItemGameJump";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = msg instanceof dk2.s9;
        java.lang.String str = this.f344972m;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#onBinderGameLiveJumpMsg msg is not an gameJump info");
            return;
        }
        int m75939xb282bd08 = ((dk2.s9) msg).f315603k.m75939xb282bd08(2);
        if (m75939xb282bd08 == 1) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlr) + ' ' + msg.j();
            ((ke0.e) xVar).getClass();
            f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, q(), 0.0f, 0.0f, 6, null);
            java.lang.String q17 = q();
            float f17 = gm2.w.f355044k;
            f0Var.c(new gm2.v(a17, new gm2.w(q17, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96), gm2.w.f355043j, 0.0f, 128, null)), 0, q().length() + 0, 33);
        } else {
            if (m75939xb282bd08 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onBinderGameLiveJumpMsg failed,wrong type");
                return;
            }
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlu) + ' ' + msg.j();
            ((ke0.e) xVar2).getClass();
            f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
            android.graphics.drawable.Drawable a18 = gm2.u.a(gm2.v.f355031f, r(), 0.0f, 0.0f, 6, null);
            java.lang.String r17 = r();
            float f18 = gm2.w.f355044k;
            f0Var.c(new gm2.v(a18, new gm2.w(r17, f18, f18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96), gm2.w.f355043j, 0.0f, 128, null)), 0, r().length() + 0, 33);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        c22624x85d69039.b(f0Var);
        c22624x85d69039.m84185x3abfd950(this.f526780h);
        c22624x85d69039.setVisibility(0);
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        android.view.View view = holder.f103463h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameJump", "onBinderGameLiveJumpMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameJump", "onBinderGameLiveJumpMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewParent parent = c22624x85d69039.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        c22624x85d69039.m84175x8dd5167d(1);
        c22624x85d69039.m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
    }

    @Override // we2.o
    public int n() {
        return 20040;
    }

    public final java.lang.String q() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String r() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
