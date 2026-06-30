package ut2;

/* loaded from: classes3.dex */
public final class y4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f512696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f512697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(ut2.j5 j5Var, float f17, float f18) {
        super(0);
        this.f512695d = j5Var;
        this.f512696e = f17;
        this.f512697f = f18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ut2.j5 j5Var = this.f512695d;
        android.view.ViewGroup.LayoutParams layoutParams = j5Var.g().getLayoutParams();
        layoutParams.width = (int) this.f512696e;
        layoutParams.height = (int) this.f512697f;
        j5Var.g().setLayoutParams(layoutParams);
        j5Var.g().setVisibility(0);
        return jz5.f0.f384359a;
    }
}
