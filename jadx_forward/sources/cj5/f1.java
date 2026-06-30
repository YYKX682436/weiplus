package cj5;

/* loaded from: classes.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h1 f123650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(cj5.h1 h1Var) {
        super(1);
        this.f123650d = h1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            java.util.LinkedList userNameList = state.f527852o;
            cj5.h1 h1Var = this.f123650d;
            h1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectContactConfirmResultUIC", "setResult() called with: action = 1, userNameList = " + userNameList.size());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = h1Var.m158354x19263085();
            android.content.Intent intent = new android.content.Intent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = userNameList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((java.lang.String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            intent.putExtra("INTENT_KEY_ACTION", 1);
            m158354x19263085.setResult(-1, intent);
            h1Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
