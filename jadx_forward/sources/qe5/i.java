package qe5;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f443656d;

    public i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f443656d = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC$initUploadingPb$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f443656d;
        if (f9Var != null) {
            v05.b bVar = new v05.b();
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                j17 = "";
            }
            bVar.m126728xdc93280d(j17);
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String g17 = ez.v0.f339310a.g(bVar);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.x(m124847x74d37ac6, Q0, g17 != null ? g17 : "");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC$initUploadingPb$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
