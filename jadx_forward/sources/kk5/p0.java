package kk5;

/* loaded from: classes.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q0 f390210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kk5.q0 q0Var) {
        super(1);
        this.f390210d = q0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f527815b, 0)) != null) {
            kk5.q0 q0Var = this.f390210d;
            android.content.Intent intent = new android.content.Intent(q0Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = q0Var.m158354x19263085();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            q0Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
