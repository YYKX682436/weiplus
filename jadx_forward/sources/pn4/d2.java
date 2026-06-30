package pn4;

/* loaded from: classes4.dex */
public class d2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.e2 f438608d;

    public d2(pn4.e2 e2Var) {
        this.f438608d = e2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        pn4.e2 e2Var = this.f438608d;
        if (e2Var.f438628e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkingTranslate", "this work is time out, index: %s", java.lang.Integer.valueOf(e2Var.f438631h));
            e2Var.f438629f = null;
            e2Var.f438628e = false;
            ((pn4.q1) e2Var.f438630g).b(e2Var.f438631h, 1, -1, null, e2Var.f438627d, null);
        }
        return false;
    }
}
