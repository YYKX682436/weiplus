package ca2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121308e;

    public b(in5.s0 s0Var, java.lang.String str) {
        this.f121307d = s0Var;
        this.f121308e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea2.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.f183291w;
        android.content.Context context = this.f121307d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ea2.g.b(gVar, context, this.f121308e, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
