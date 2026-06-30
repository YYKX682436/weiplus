package ca2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z92.a f121306e;

    public a(in5.s0 s0Var, z92.a aVar) {
        this.f121305d = s0Var;
        this.f121306e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea2.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.f183291w;
        android.content.Context context = this.f121305d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.a(context, this.f121306e.f552394d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
