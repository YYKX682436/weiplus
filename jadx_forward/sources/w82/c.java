package w82;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.d f525360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f525361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w82.l f525362f;

    public c(w82.d dVar, int i17, w82.l lVar) {
        this.f525360d = dVar;
        this.f525361e = i17;
        this.f525362f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.d dVar = this.f525360d;
        int i17 = dVar.f525368f;
        dVar.f525368f = this.f525361e;
        if (i17 != -1) {
            dVar.m8147xed6e4d18(i17);
        }
        dVar.m8147xed6e4d18(dVar.f525368f);
        dVar.f525367e.mo146xb9724478(this.f525362f);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
