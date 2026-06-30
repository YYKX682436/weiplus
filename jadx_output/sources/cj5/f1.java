package cj5;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h1 f42117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(cj5.h1 h1Var) {
        super(1);
        this.f42117d = h1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            java.util.LinkedList userNameList = state.f446319o;
            cj5.h1 h1Var = this.f42117d;
            h1Var.getClass();
            kotlin.jvm.internal.o.g(userNameList, "userNameList");
            com.tencent.mars.xlog.Log.i("SelectContactConfirmResultUIC", "setResult() called with: action = 1, userNameList = " + userNameList.size());
            androidx.appcompat.app.AppCompatActivity activity = h1Var.getActivity();
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
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            intent.putExtra("INTENT_KEY_ACTION", 1);
            activity.setResult(-1, intent);
            h1Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
