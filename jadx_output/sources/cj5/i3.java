package cj5;

/* loaded from: classes.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n3 f42144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(cj5.n3 n3Var) {
        super(0);
        this.f42144d = n3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cj5.n3 n3Var = this.f42144d;
        android.view.View inflate = android.view.LayoutInflater.from(n3Var.getActivity()).inflate(com.tencent.mm.R.layout.a0c, (android.view.ViewGroup) null);
        if (inflate == null) {
            return null;
        }
        n3Var.f42201d = inflate;
        return inflate;
    }
}
