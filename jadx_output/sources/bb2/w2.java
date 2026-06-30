package bb2;

/* loaded from: classes5.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.x2 f19059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.i f19060e;

    public w2(bb2.x2 x2Var, wp.i iVar) {
        this.f19059d = x2Var;
        this.f19060e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/bullet/TextDanmakuRender$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f19059d.f19075c;
        if (lVar != null) {
            lVar.invoke(this.f19060e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/bullet/TextDanmakuRender$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
