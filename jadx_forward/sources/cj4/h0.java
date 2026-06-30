package cj4;

/* loaded from: classes11.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123470e;

    public h0(mj4.h hVar, cj4.i1 i1Var) {
        this.f123469d = hVar;
        this.f123470e = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleErrorLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oj4.j.f427348a.d(this.f123469d);
        this.f123470e.V(false);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleErrorLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
