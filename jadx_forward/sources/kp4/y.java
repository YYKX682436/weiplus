package kp4;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.z f392690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.b0 f392691e;

    public y(kp4.z zVar, kp4.b0 b0Var) {
        this.f392690d = zVar;
        this.f392691e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kp4.z zVar = this.f392690d;
        int i17 = zVar.f392697g;
        zVar.f392697g = this.f392691e.m8183xf806b362();
        java.lang.String str = zVar.f392696f;
        if (i17 != zVar.f392697g) {
            zVar.m8147xed6e4d18(i17);
            zVar.m8147xed6e4d18(zVar.f392697g);
            ((kp4.q0) zVar.f392695e).a((bg0.y) zVar.f392694d.get(zVar.f392697g), zVar.f392697g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
