package cj4;

/* loaded from: classes11.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41931d;

    public g(cj4.k kVar) {
        this.f41931d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.k kVar = this.f41931d;
        mj4.h hVar = kVar.H;
        if (hVar != null) {
            bi4.m0 m0Var = kVar.V;
            if (m0Var != null) {
                m0Var.a(4, null);
            }
            pj4.o0 a17 = xe0.j0.a(hVar, false, 1, null);
            java.lang.String str = kVar.f41978g;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("userName", str);
            bundle.putInt("STATUS_EXPOSED_SCENE", kVar.f41975d.f21067g);
            android.content.Context j17 = kVar.j();
            wi4.a.d(a17);
            bi4.h0 d17 = kVar.d();
            if (d17 != null) {
                d17.d(j17, bundle);
            }
            qj4.s.m(qj4.s.f363958a, kVar.j(), 23L, null, kVar.H, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
