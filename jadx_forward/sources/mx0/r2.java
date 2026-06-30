package mx0;

/* loaded from: classes.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.v2 f413814d;

    public r2(mx0.v2 v2Var) {
        this.f413814d = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mx0.v2 v2Var = this.f413814d;
        android.content.Intent intent = v2Var.f413927h;
        if (intent != null) {
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) v2Var.f413926g).N0(intent);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
