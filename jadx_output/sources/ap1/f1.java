package ap1;

/* loaded from: classes5.dex */
public final class f1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f12661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12661d = "RoamReport28098UIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new ap1.e1(this));
        }
    }
}
