package cj5;

/* loaded from: classes.dex */
public class s extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42230d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42230d = jz5.h.b(new cj5.r(this));
        this.f42231e = jz5.h.b(new cj5.q(activity));
    }

    public static final void U6(cj5.s sVar, wi5.n0 n0Var) {
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSelectContactMvvmListUIC", "handleSelectionFromOtherPage selectUserSet:" + n0Var.f446319o);
        boolean W6 = sVar.W6();
        java.util.LinkedList linkedList = n0Var.f446319o;
        if (W6) {
            sVar.X6().c().f();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sVar.X6().c().d((java.lang.String) it.next());
            }
            return;
        }
        sVar.X6().b().f();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            sVar.X6().b().d((java.lang.String) it6.next());
        }
    }

    public static final void V6(cj5.s sVar, wi5.n0 n0Var) {
        sVar.getClass();
        if (n0Var.f446319o.size() <= 0 || sVar.W6()) {
            return;
        }
        sVar.Y6(com.tencent.mm.ui.zk.e(sVar.getActivity(), com.tencent.mm.R.dimen.f479734dr));
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f42231e).getValue()).booleanValue();
    }

    public final em.l2 X6() {
        return (em.l2) ((jz5.n) this.f42230d).getValue();
    }

    public final void Y6(int i17) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
        j75.f stateCenter;
        if (W6() || (P6 = P6()) == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(i17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.p(this));
    }
}
