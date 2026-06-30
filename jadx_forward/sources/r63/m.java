package r63;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr63/m;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-generic-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null && (byteArray = bundle.getByteArray("finderReportAppProcessEvent")) != null) {
            r45.v8 v8Var = new r45.v8();
            v8Var.mo11468x92b714fd(byteArray);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "CallMainProcess " + v8Var.f469512g + " infoList = " + v8Var.f469513h.size());
            if (v8Var.f469512g) {
                r63.n nVar = r63.n.f474575a;
                r45.f83 activityRecord = v8Var.f469510e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityRecord, "activityRecord");
                nVar.i(activityRecord, v8Var.f469511f);
            } else {
                r63.n nVar2 = r63.n.f474575a;
                r45.f83 activityRecord2 = v8Var.f469510e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityRecord2, "activityRecord");
                long j17 = v8Var.f469511f;
                java.lang.String processName = v8Var.f469509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(processName, "processName");
                nVar2.k(activityRecord2, j17, processName);
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
