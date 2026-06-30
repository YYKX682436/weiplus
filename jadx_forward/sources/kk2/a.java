package kk2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.d f390014d;

    public a(kk2.d dVar) {
        this.f390014d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveNoticeGuidePanel", "onclick: leave");
        kk2.d dVar = this.f390014d;
        java.lang.String m75945x2fec8307 = dVar.f390019i.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        dVar.y(2, 1, m75945x2fec8307);
        dVar.a();
        ((df2.wv) dVar.f390018h).a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel$openPanel$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
