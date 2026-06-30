package c23;

/* loaded from: classes10.dex */
public final class q extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(getActivity(), new c23.p(this));
        }
    }
}
