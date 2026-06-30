package cj5;

/* loaded from: classes.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h1 f123642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(cj5.h1 h1Var) {
        super(1);
        this.f123642d = h1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f123642d.m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        java.util.LinkedList linkedList = state.f527852o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
                intent.putExtra("INTENT_KEY_ACTION", 0);
                m158354x19263085.setResult(-1, intent);
                return jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList.add(next);
            }
        }
    }
}
