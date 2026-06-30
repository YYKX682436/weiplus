package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f178194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178195e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1, boolean z17) {
        this.f178195e = abstractActivityC13156x6363e8e1;
        this.f178194d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178195e;
        boolean z17 = this.f178194d;
        if (z17 && !abstractActivityC13156x6363e8e1.f178042s) {
            abstractActivityC13156x6363e8e1.mo26063x7b383410();
        } else if (z17 || !abstractActivityC13156x6363e8e1.f178042s) {
            return;
        } else {
            abstractActivityC13156x6363e8e1.mo48674x36654fab();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility postDelayed setShow[%b]", java.lang.Boolean.valueOf(z17));
        abstractActivityC13156x6363e8e1.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.w0(this), 100L);
    }
}
