package fk2;

/* loaded from: classes3.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f344884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.f3 f344885e;

    public d3(dk2.zf zfVar, fk2.f3 f3Var) {
        this.f344884d = zfVar;
        this.f344885e = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSysInfo$onBindSysMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.oj1 oj1Var = ((dk2.mf) ((dk2.bg) this.f344884d)).f315314i;
        if (oj1Var != null) {
            we2.a aVar = this.f344885e.f526773a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            aVar.b(view, oj1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSysInfo$onBindSysMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
