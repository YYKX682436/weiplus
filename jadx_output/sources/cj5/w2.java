package cj5;

/* loaded from: classes.dex */
public class w2 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42263d = jz5.h.b(new cj5.v2(this));
        jz5.h.b(new cj5.m2(activity));
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f42263d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.u2(this));
    }
}
