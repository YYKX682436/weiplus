package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class fh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f103382e;

    public fh(android.content.Context context, kotlin.jvm.internal.h0 h0Var) {
        this.f103381d = context;
        this.f103382e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f103381d;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(context);
        if (a17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder like FINDER_NEW_INTERACTION_EASTER_EGG ");
        kotlin.jvm.internal.h0 h0Var = this.f103382e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedLikeConvert", sb6.toString());
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
        if (iEmojiInfo2 != null) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.om7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ox2.g0 g0Var = ox2.h0.f349661g;
            java.lang.String string2 = a17.getString(com.tencent.mm.R.string.okh);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            ox2.h0 h0Var2 = new ox2.h0(a17, iEmojiInfo2, string, ox2.g0.a(g0Var, a17, string2, (char) 0, 0, 0, 0, 0, 0, 252, null), null, null, 48, null);
            com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = h0Var2.f349666e;
            if (centerInteractionEasterEggDarkPreview != null) {
                centerInteractionEasterEggDarkPreview.setThumbLike(false);
            }
            h0Var2.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
