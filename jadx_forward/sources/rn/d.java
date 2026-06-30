package rn;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479131d;

    public d(rn.e eVar, java.lang.String str) {
        this.f479131d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        java.lang.String str = this.f479131d;
        Bi.getClass();
        try {
            i17 = Bi.f479135d.mo70514xb06685ab("GroupTodo", "createtime<? and username=?", new java.lang.String[]{(c01.id.c() - rn.e.f479132e.longValue()) + "", str});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.GroupTodoStorage", "deleteExpireData Exception：[%s %s]", e17.getClass().getSimpleName(), e17.getMessage());
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoStorage", "onNotifyChange delete expire data : %s", java.lang.Boolean.valueOf(i17 > 0));
    }
}
