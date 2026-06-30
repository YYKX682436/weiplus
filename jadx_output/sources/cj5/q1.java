package cj5;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(cj5.l2 l2Var) {
        super(0);
        this.f42218d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cj5.l2 l2Var = this.f42218d;
        em.l2 Y6 = l2Var.Y6();
        if (Y6.f254548e == null) {
            Y6.f254548e = (android.widget.LinearLayout) Y6.f254544a.findViewById(com.tencent.mm.R.id.t07);
        }
        android.widget.LinearLayout linearLayout = Y6.f254548e;
        linearLayout.setOnClickListener(new cj5.p1(l2Var));
        return linearLayout;
    }
}
