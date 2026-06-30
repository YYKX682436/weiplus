package ej4;

/* loaded from: classes11.dex */
public class a0 extends ej4.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String userName, bi4.s0 statusUpdate, java.lang.String statusId) {
        super(statusUpdate, userName, statusId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusUpdate, "statusUpdate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
    }

    @Override // ej4.r
    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("StatusCardListener onChange username=");
        java.lang.String str = this.f334907a;
        sb6.append(str);
        sb6.append(", statusId=");
        java.lang.String str2 = this.f334908b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusCardListener", sb6.toString());
        java.lang.Object obj = a().get();
        bi4.s0 s0Var = obj instanceof bi4.s0 ? (bi4.s0) obj : null;
        if (s0Var == null) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            s0Var.b4(str);
        } else {
            s0Var.I5(str2);
        }
    }

    public /* synthetic */ a0(java.lang.String str, bi4.s0 s0Var, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, s0Var, (i17 & 4) != 0 ? "" : str2);
    }
}
