package fk2;

/* loaded from: classes3.dex */
public class f2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final we2.a f344914m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f344915n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f344916o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f344917p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(we2.a liveBuContext) {
        super(liveBuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        this.f344914m = liveBuContext;
        this.f344915n = jz5.h.b(fk2.b2.f344850d);
        this.f344916o = "(.*?)<_wc_custom_img_.+?src\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*.*?/>(.*?)";
        this.f344917p = jz5.h.b(new fk2.e2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    @Override // we2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r25, bm2.h1 r26, dk2.zf r27, int r28) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.f2.d(android.content.Context, bm2.h1, dk2.zf, int):void");
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.k5(msg);
    }

    @Override // we2.o
    public int n() {
        return 20074;
    }

    @Override // we2.o
    public void p(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
    }

    public final void q(android.content.Context context, bm2.h1 h1Var, dk2.zf zfVar, boolean z17) {
        android.view.View view = h1Var.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify", "specialBindNotifyMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify", "specialBindNotifyMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xn1 r17 = zfVar.r();
        java.util.LinkedList m75941xfb821914 = r17 != null ? r17.m75941xfb821914(11) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("badgeInfo size = ");
        sb6.append(m75941xfb821914 != null ? m75941xfb821914.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemNotify", sb6.toString());
        ((fk2.y2) ((jz5.n) this.f344917p).mo141623x754a37bb()).r(zfVar, context, h1Var, zfVar.j(), z17 ? m75941xfb821914 : null);
    }
}
