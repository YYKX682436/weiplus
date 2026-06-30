package bj5;

/* loaded from: classes.dex */
public final class k0 extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f21194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new bj5.j0(this));
        jz5.h.b(new bj5.i0(this));
        this.f21194d = jz5.h.b(new bj5.g0(this, activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (j93.n1) ((jz5.n) this.f21194d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), bj5.h0.f21188d);
        }
    }
}
