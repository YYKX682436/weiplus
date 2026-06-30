package qe5;

/* loaded from: classes3.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.f8 f443634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f443636f;

    public f1(c01.f8 f8Var, qe5.n1 n1Var, android.os.Bundle bundle) {
        this.f443634d = f8Var;
        this.f443635e = n1Var;
        this.f443636f = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initJumpChat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yv1.b1) this.f443634d).Ai(this.f443635e.m80379x76847179(), this.f443636f);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initJumpChat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
