package cj4;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.h0 f42012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f42014f;

    public p(bi4.h0 h0Var, cj4.a0 a0Var, mj4.h hVar) {
        this.f42012d = h0Var;
        this.f42013e = a0Var;
        this.f42014f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleAuthor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.a0 a0Var = this.f42013e;
        bi4.h0 h0Var = this.f42012d;
        if (h0Var != null) {
            h0Var.b(a0Var.w());
        }
        qj4.s.m(qj4.s.f363958a, a0Var.w(), 61L, null, this.f42014f, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleAuthor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
