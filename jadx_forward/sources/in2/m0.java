package in2;

/* loaded from: classes10.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f374394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(in2.n0 n0Var, android.view.View view) {
        super(0);
        this.f374394d = n0Var;
        this.f374395e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in2.n0 n0Var = this.f374394d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = n0Var.N;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.post(new in2.l0(n0Var, this.f374395e));
        }
        return jz5.f0.f384359a;
    }
}
