package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f152424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152425f;

    public b2(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var, int i17, dn.m mVar) {
        this.f152425f = h2Var;
        this.f152423d = i17;
        this.f152424e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var = this.f152425f;
        dn.m mVar = this.f152424e;
        int i17 = this.f152423d;
        if (i17 != -1) {
            ((java.util.HashMap) h2Var.f152529t).put(mVar.f69601xaca5bdda, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", mVar.f69601xaca5bdda);
        ((java.util.LinkedList) h2Var.f152526q).add(mVar.f69601xaca5bdda);
        ((java.util.HashMap) h2Var.f152527r).put(mVar.f69601xaca5bdda, mVar);
        h2Var.j(false);
    }

    /* renamed from: toString */
    public java.lang.String m48068x9616526c() {
        return super.toString() + "|addRecvTask";
    }
}
