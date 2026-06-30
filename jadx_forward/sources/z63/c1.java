package z63;

/* loaded from: classes5.dex */
public class c1 extends z63.b1 {
    public c1(z63.f1 f1Var, android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, z63.u0 u0Var) {
        super(context, n3Var, u0Var);
    }

    @Override // z63.b1, java.lang.Runnable
    public void run() {
        try {
            android.util.Pair j17 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(this.f551903g, 1, this.f551904h);
            if (((java.lang.Integer) j17.first).intValue() > x63.g.w()) {
                return;
            }
            if (((java.lang.Integer) j17.first).intValue() >= 1) {
                z63.u0 u0Var = this.f551901e;
                y63.a aVar = (y63.a) j17.second;
                z63.f1 f1Var = (z63.f1) u0Var;
                if (f1Var.f551930r == null) {
                    f1Var.f551930r = aVar;
                } else if (aVar == null) {
                    f1Var.f551930r = null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "setCopyGroupSolitaire repeat");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "CheckRunnable run() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
