package cj5;

/* loaded from: classes.dex */
public final class c5 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42087d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42087d = jz5.h.b(new cj5.b5(this));
    }

    public final em.l2 T6() {
        return (em.l2) ((jz5.n) this.f42087d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.a5(this));
    }
}
