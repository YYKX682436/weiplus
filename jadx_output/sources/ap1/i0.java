package ap1;

/* loaded from: classes5.dex */
public class i0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public j75.f f12683d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f12684e;

    /* renamed from: f, reason: collision with root package name */
    public ap1.z f12685f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f12686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12684e = jz5.h.b(new ap1.h0(this));
    }

    public java.lang.Object T6(kotlin.coroutines.Continuation continuation) {
        return kz5.p0.f313996d;
    }

    public final j75.f U6() {
        j75.f fVar = this.f12683d;
        if (fVar != null) {
            return fVar;
        }
        j75.f Q6 = Q6();
        this.f12683d = Q6;
        return Q6;
    }

    public void V6() {
        pf5.e.launch$default(this, null, null, new ap1.d0(this, com.tencent.mm.ui.widget.dialog.u3.f(getActivity(), getString(com.tencent.mm.R.string.mwe), true, 3, new ap1.e0(this)), null), 3, null);
    }

    public void W6(ap1.a0 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        V6();
        j75.f U6 = U6();
        if (U6 != null) {
            U6.z3(getActivity(), new ap1.f0(this));
        }
        j75.f U62 = U6();
        if (U62 != null) {
            U62.L2(getActivity(), new ap1.g0(this));
        }
    }
}
