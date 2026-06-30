package ca2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f39774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39775e;

    public b(in5.s0 s0Var, java.lang.String str) {
        this.f39774d = s0Var;
        this.f39775e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea2.g gVar = com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.f101758w;
        android.content.Context context = this.f39774d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ea2.g.b(gVar, context, this.f39775e, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
