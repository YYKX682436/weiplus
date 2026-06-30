package bj5;

/* loaded from: classes.dex */
public final class c0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f21171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new bj5.b0(this));
        this.f21171d = jz5.h.b(new bj5.a0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), bj5.z.f21256d);
        }
        b93.l.a(b93.l.f18596a, ((java.lang.Number) ((jz5.n) this.f21171d).getValue()).intValue(), 2, 0, 0, 0, 28, null);
    }
}
