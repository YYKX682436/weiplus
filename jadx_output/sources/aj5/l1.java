package aj5;

/* loaded from: classes.dex */
public final class l1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5474d = jz5.h.b(aj5.j1.f5455d);
    }

    public final java.lang.String T6() {
        return (java.lang.String) ((jz5.n) this.f5474d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateGroupStrictDupReportUIC", "createGroupSessionId: " + T6());
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), aj5.k1.f5463d);
    }
}
