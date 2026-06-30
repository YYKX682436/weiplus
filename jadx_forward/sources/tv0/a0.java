package tv0;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(tv0.j0 j0Var) {
        super(0);
        this.f503712d = j0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tv0.j0 j0Var = this.f503712d;
        j0Var.w7().requestLayout();
        j0Var.w7().post(new tv0.z(j0Var));
        return jz5.f0.f384359a;
    }
}
