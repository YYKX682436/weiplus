package cj5;

/* loaded from: classes.dex */
public class k4 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42164d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42165e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42166f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f42167g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f42168h;

    /* renamed from: i, reason: collision with root package name */
    public xm3.t0 f42169i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f42170m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42171n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f42172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42164d = jz5.h.b(new cj5.j4(this));
        this.f42165e = jz5.h.b(new cj5.g4(activity));
        this.f42166f = jz5.h.b(new cj5.h4(this));
        this.f42167g = jz5.h.b(new cj5.i4(activity));
        this.f42172o = jz5.h.b(new cj5.f4(this));
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f42164d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), cj5.y3.f42280d);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.d4(this));
    }
}
