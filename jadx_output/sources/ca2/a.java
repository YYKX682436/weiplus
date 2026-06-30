package ca2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f39772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z92.a f39773e;

    public a(in5.s0 s0Var, z92.a aVar) {
        this.f39772d = s0Var;
        this.f39773e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea2.g gVar = com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.f101758w;
        android.content.Context context = this.f39772d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.a(context, this.f39773e.f470861d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
