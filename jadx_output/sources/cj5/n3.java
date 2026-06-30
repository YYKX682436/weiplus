package cj5;

/* loaded from: classes.dex */
public final class n3 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f42201d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42202e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42202e = jz5.h.b(new cj5.m3(this));
        this.f42203f = jz5.h.b(new cj5.l3(activity));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        S6(new cj5.j3(this));
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.k3(this));
    }
}
