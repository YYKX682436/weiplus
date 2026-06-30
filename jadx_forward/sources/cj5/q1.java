package cj5;

/* loaded from: classes.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(cj5.l2 l2Var) {
        super(0);
        this.f123751d = l2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cj5.l2 l2Var = this.f123751d;
        em.l2 Y6 = l2Var.Y6();
        if (Y6.f336081e == null) {
            Y6.f336081e = (android.widget.LinearLayout) Y6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.t07);
        }
        android.widget.LinearLayout linearLayout = Y6.f336081e;
        linearLayout.setOnClickListener(new cj5.p1(l2Var));
        return linearLayout;
    }
}
