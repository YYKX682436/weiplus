package cj5;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h1 f42109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(cj5.h1 h1Var) {
        super(1);
        this.f42109d = h1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = this.f42109d.getActivity();
        android.content.Intent intent = new android.content.Intent();
        java.util.LinkedList linkedList = state.f446319o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
                intent.putExtra("INTENT_KEY_ACTION", 0);
                activity.setResult(-1, intent);
                return jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList.add(next);
            }
        }
    }
}
