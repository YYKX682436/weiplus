package fk2;

/* loaded from: classes3.dex */
public final class s1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f345005m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f345005m = "CommentItemLocalLocation";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf zfVar, int i17) {
        dk2.zf msg = zfVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        jz5.f0 f0Var = null;
        if (!(msg instanceof dk2.ja)) {
            msg = null;
        }
        if (msg != null) {
            dk2.ja jaVar = (dk2.ja) msg;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.doj) + ' ' + jaVar.j();
            ((ke0.e) xVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, q(), 0.0f, 0.0f, 6, null);
            java.lang.String q17 = q();
            float f17 = gm2.w.f355044k;
            f0Var2.c(new gm2.v(a17, new gm2.w(q17, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96), gm2.w.f355043j, 0.0f, 128, null)), 0, q().length() + 0, 33);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
            c22624x85d69039.b(f0Var2);
            c22624x85d69039.m84185x3abfd950(this.f526780h);
            c22624x85d69039.setVisibility(0);
            holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
            android.view.View view = holder.f103463h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalLocation", "onBinderLocationMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalLocation", "onBinderLocationMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewParent parent = c22624x85d69039.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
            relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
            c22624x85d69039.m84175x8dd5167d(1);
            c22624x85d69039.m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
            c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e68, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.doj));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Bk(1, jaVar);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345005m, "[onBinderLocationMsg]  msg is not location");
        }
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        r45.ze2 i17 = this.f526773a.i();
        if (i17 != null) {
            return new dk2.ja(msg, i17);
        }
        return null;
    }

    @Override // we2.o
    public int n() {
        return 10018;
    }

    public final java.lang.String q() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.doj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
