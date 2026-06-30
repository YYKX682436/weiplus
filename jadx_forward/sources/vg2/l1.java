package vg2;

/* loaded from: classes3.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(vg2.r1 r1Var) {
        super(0);
        this.f518072d = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vg2.r1 r1Var = this.f518072d;
        android.view.View findViewById = r1Var.f518097e.findViewById(com.p314xaae8f345.mm.R.id.cpg);
        findViewById.setOnClickListener(new vg2.k1(r1Var));
        return findViewById;
    }
}
