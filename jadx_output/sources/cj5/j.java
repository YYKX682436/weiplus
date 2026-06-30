package cj5;

/* loaded from: classes.dex */
public class j extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42147d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42147d = jz5.h.b(new cj5.i(this));
        this.f42148e = jz5.h.b(new cj5.g(this));
    }

    public final android.widget.EditText U6() {
        return (android.widget.EditText) ((jz5.n) this.f42148e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.h(this));
    }
}
