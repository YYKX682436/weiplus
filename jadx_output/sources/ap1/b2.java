package ap1;

/* loaded from: classes5.dex */
public final class b2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f12615d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f12616e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f12617f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f12618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new ap1.y1(this));
        }
    }
}
