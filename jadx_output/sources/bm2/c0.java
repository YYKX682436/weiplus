package bm2;

/* loaded from: classes2.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v42 f21805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21806e;

    public c0(r45.v42 v42Var, android.content.Context context) {
        this.f21805d = v42Var;
        this.f21806e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f21805d.getCustom(5);
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = this.f21806e;
            kotlin.jvm.internal.o.d(context);
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
