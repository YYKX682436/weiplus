package jx2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f383934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383935e;

    public b(jx2.k kVar, jx2.h hVar) {
        this.f383934d = kVar;
        this.f383935e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.l lVar = (jx2.l) this.f383934d;
        lVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String m75945x2fec8307 = lVar.f383970b.m75945x2fec8307(7);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        intent.putExtra("rawUrl", m75945x2fec8307);
        j45.l.j(lVar.f383969a, "webview", ".ui.tools.WebViewUI", intent, null);
        yz5.a aVar = this.f383935e.f383963k;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
