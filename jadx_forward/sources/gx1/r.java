package gx1;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix1.l f358857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx1.s f358858e;

    public r(gx1.s sVar, ix1.l lVar) {
        this.f358858e = sVar;
        this.f358857d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gx1.s sVar = this.f358858e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = sVar.f358859e;
        ix1.l lVar = this.f358857d;
        c13158x154ec45a.m54599xe08d546d(lVar.f376871s);
        sVar.f358859e.x();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = sVar.f358859e;
        synchronized (c13158x154ec45a2) {
            c13158x154ec45a2.f178135u = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a3 = sVar.f358859e;
        synchronized (c13158x154ec45a3) {
            c13158x154ec45a3.f178135u = false;
        }
        sVar.f358859e.B();
        if (lVar.f376845b) {
            int i17 = lVar.f376846c;
            if (i17 == -1 || i17 >= sVar.f358859e.getText().toString().length()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a4 = sVar.f358859e;
                c13158x154ec45a4.setSelection(c13158x154ec45a4.getText().toString().length());
            } else {
                sVar.f358859e.setSelection(lVar.f376846c);
            }
            sVar.f358859e.requestFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new gx1.q(this), 500L);
        } else if (sVar.f358859e.hasFocus()) {
            sVar.f358859e.clearFocus();
        }
        if (lVar.f376852i) {
            lVar.f376852i = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a5 = sVar.f358859e;
            c13158x154ec45a5.D = true;
            c13158x154ec45a5.onTextContextMenuItem(android.R.id.paste);
        }
    }
}
