package bm2;

/* loaded from: classes10.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f21822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f21824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn2.d f21825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(bm2.t6 t6Var, bm2.k7 k7Var, r45.yx1 yx1Var, hn2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21822d = t6Var;
        this.f21823e = k7Var;
        this.f21824f = yx1Var;
        this.f21825g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.c7(this.f21822d, this.f21823e, this.f21824f, this.f21825g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bm2.c7 c7Var = (bm2.c7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bm2.t6 t6Var = this.f21822d;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = t6Var.f22328s;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMProcessBar, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        mMProcessBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.button.WeButton weButton = t6Var.f22321i;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        bm2.k7 k7Var = this.f21823e;
        k7Var.getClass();
        r45.yx1 yx1Var = this.f21824f;
        boolean z18 = yx1Var.f391464m == 3;
        hn2.d dVar = this.f21825g;
        k7Var.K(weButton, z18 && !dVar.c());
        android.widget.TextView textView = t6Var.f22329t;
        kotlin.jvm.internal.o.f(textView, "<get-tvHasReqeusted>(...)");
        if ((yx1Var.f391464m == 3) && dVar.c()) {
            z17 = true;
        }
        k7Var.K(textView, z17);
        return jz5.f0.f302826a;
    }
}
