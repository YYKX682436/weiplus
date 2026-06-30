package qb2;

/* loaded from: classes8.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String str) {
        super(1);
        this.f442804d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qb2.z0 it = (qb2.z0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map map = it.f442852b;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.content.task_id");
        if (str == null) {
            str = "";
        }
        boolean z17 = false;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.content.action_type"), 0);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f442804d) && D1 == 1) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
