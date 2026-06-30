package bm2;

/* loaded from: classes3.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f21943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f21944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f21945f;

    public h5(com.tencent.mm.protocal.protobuf.FinderContact finderContact, bm2.m4 m4Var, bm2.n5 n5Var) {
        this.f21943d = finderContact;
        this.f21944e = m4Var;
        this.f21945f = n5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$setAvatar$setClickToOpenSwitchRolePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f21943d;
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        bm2.m4 m4Var = this.f21944e;
        r45.xn1 xn1Var = m4Var.f22101a;
        r0Var.yk(5, (r13 & 2) != 0 ? null : username, (r13 & 4) != 0 ? null : xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        bm2.n5.x(this.f21945f, m4Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$setAvatar$setClickToOpenSwitchRolePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
