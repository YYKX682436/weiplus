package cj5;

/* loaded from: classes.dex */
public final class h3 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42134d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42135e;

    /* renamed from: f, reason: collision with root package name */
    public int f42136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f42137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42134d = jz5.h.b(new cj5.e3(activity));
        this.f42135e = jz5.h.b(new cj5.g3(this));
        this.f42137g = "";
    }

    public static final int U6(cj5.h3 h3Var) {
        return ((java.lang.Number) ((jz5.n) h3Var.f42134d).getValue()).intValue();
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f42135e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.f3(this));
    }
}
