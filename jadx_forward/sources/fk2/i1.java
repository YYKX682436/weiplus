package fk2;

/* loaded from: classes3.dex */
public final class i1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.j1 f344937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344939f;

    public i1(fk2.j1 j1Var, java.lang.String str, android.content.Context context) {
        this.f344937d = j1Var;
        this.f344938e = str;
        this.f344939f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        android.content.Context context;
        mm2.e1 e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        fk2.j1 j1Var = this.f344937d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = j1Var.f526773a.p();
        if ((p17 == null || (e1Var = (mm2.e1) p17.m57635xbba4bfc0(mm2.e1.class)) == null) ? false : e1Var.b7()) {
            java.lang.String str = this.f344938e;
            j1Var.q(2, str);
            j1Var.f526773a.s(str);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (p17 != null && (context = p17.getContext()) != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            android.content.res.Resources resources = context.getResources();
            e4Var.f293309c = resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nva) : null;
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344939f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
