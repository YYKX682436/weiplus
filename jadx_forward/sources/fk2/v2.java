package fk2;

/* loaded from: classes3.dex */
public final class v2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f345034m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f345034m = "https://channels.weixin.qq.com/platform/live/liveBuild";
    }

    @Override // we2.o
    public yz5.l c(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new fk2.t2(this);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.String j17 = msg.j();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        c22624x85d69039.b(j17);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6y, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= string2.length()) {
            spannableString.setSpan(new fk2.u2(context, this), L, string.length() + L, 33);
        }
        c22624x85d69039.b(spannableString);
        android.view.View view = holder.f103463h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cu_));
    }

    @Override // we2.o
    public int n() {
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.f55299x87635d9e;
    }
}
