package pf4;

/* loaded from: classes4.dex */
public abstract class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18473x88f71108 f435407d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f435408e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f435409f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f435410g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f435411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pf4.q f435412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pf4.q qVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f435412i = qVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.nkz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f435407d = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18473x88f71108) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nl8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f435408e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568657nl2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f435409f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568655nl0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f435410g = findViewById4;
        this.f435411h = i();
    }

    public abstract android.view.View i();

    public void j(int i17, gf4.a comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        android.view.View view = this.f3639x46306858;
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.CommentItemView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) view).m71396xe9e4779d(comment);
        }
        android.view.View view2 = this.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f3639x46306858.post(new pf4.i(this));
        this.f435410g.setOnClickListener(new pf4.j(this.f435412i));
        if (this.f3639x46306858 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) {
            boolean z17 = comment.f352868f;
            android.view.View view3 = this.f435411h;
            if (z17) {
                view3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(this.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560055a3), android.graphics.PorterDuff.Mode.SRC_ATOP));
            } else {
                view3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(this.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7g), android.graphics.PorterDuff.Mode.SRC_ATOP));
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = comment.f352863a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = this.f435408e;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(comment.f352872j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str2 = g28 != null ? g28 : "";
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str2, textSize2);
        if (comment.f352874l != 0) {
            j17 = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0) + ' ' + ((java.lang.Object) j18);
        }
        textView.setText(j17);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = this.f435409f;
        android.content.Context context3 = textView2.getContext();
        float textSize3 = textView2.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, comment.f352864b, textSize3));
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18473x88f71108 c18473x88f71108 = this.f435407d;
        wVar.Ni(c18473x88f71108, str);
        ef4.w.f334001t.g().P0(str).t0();
        c18473x88f71108.getClass();
        if (!android.text.TextUtils.equals(c18473x88f71108.f253413d, str)) {
            c18473x88f71108.f253413d = str;
        }
        c18473x88f71108.m71388xfbfb82e(comment.f352869g ? c18473x88f71108.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7g) : 0);
        c18473x88f71108.setOnClickListener(new pf4.k(comment, this));
    }
}
