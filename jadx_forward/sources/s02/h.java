package s02;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s02.i f483493d;

    public h(s02.i iVar) {
        this.f483493d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/widget/GameDownloadTipBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f483493d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/widget/GameDownloadTipBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
