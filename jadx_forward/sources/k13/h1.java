package k13;

/* loaded from: classes10.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i13.c f384753e;

    public h1(k13.l1 l1Var, i13.c cVar) {
        this.f384752d = l1Var;
        this.f384753e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        k13.l1 l1Var = this.f384752d;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(l1Var.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", "updateMsgItem no permission, return");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMsgItem called, id=");
        i13.c cVar = this.f384753e;
        sb6.append(cVar.f368808d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", sb6.toString());
        java.util.ArrayList arrayList = l1Var.f384772q;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            str = cVar.f368808d;
            if (!hasNext) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((i13.c) it.next()).f368808d, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", "updateMsgItem item id=" + str + " doesn't exist, skip update");
            return;
        }
        if (i17 < arrayList.size()) {
            arrayList.set(i17, cVar);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = l1Var.f384769n;
            if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8147xed6e4d18(i17);
            }
            cVar.p();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotify.MsgWindow", "updateMsgItem item id=" + str + " exists, update it");
    }
}
