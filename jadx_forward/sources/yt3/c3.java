package yt3;

/* loaded from: classes10.dex */
public final class c3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.d3 f546926d;

    public c3(yt3.d3 d3Var) {
        this.f546926d = d3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yt3.d3 d3Var = this.f546926d;
        y9.i iVar = new y9.i(d3Var.f546938d.getContext(), 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        android.content.Context context = d3Var.f546938d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f c19569xe327f12f = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19569xe327f12f(context);
        c19569xe327f12f.m75027xa4775d6c(d3Var.f546940f);
        iVar.setContentView(c19569xe327f12f);
        iVar.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
