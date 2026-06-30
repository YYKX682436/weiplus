package fj5;

/* loaded from: classes.dex */
public class i extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        wi5.n0 n0Var;
        super.mo2275x62f76871(intent);
        j75.f Q6 = Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null || !n0Var.e()) {
            return;
        }
        java.util.LinkedList linkedList = n0Var.f527852o;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","));
        m158354x19263085().setResult(-1, intent2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new fj5.h(this));
        }
    }
}
