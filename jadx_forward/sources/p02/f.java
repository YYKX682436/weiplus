package p02;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p02.l f431909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p02.g f431910e;

    public f(p02.g gVar, p02.l lVar) {
        this.f431910e = gVar;
        this.f431909d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rawUrl", this.f431909d.f431951p);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(this.f431910e.f431928x.f431929d, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
