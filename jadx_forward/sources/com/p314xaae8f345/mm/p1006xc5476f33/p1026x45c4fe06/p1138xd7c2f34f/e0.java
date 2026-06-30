package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f166115d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f166115d = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public void run() {
        rj1.n nVar = (rj1.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(rj1.n.class);
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f166115d;
            java.lang.String appId = c11809xbc286be4.f158811d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor m145256x1d3f4980 = nVar.m145256x1d3f4980("select * from TipsMsgInfo where appId = '" + appId + '\'', new java.lang.String[0]);
            while (m145256x1d3f4980.moveToNext()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557();
                    c12627x488d3557.mo9015xbf5d97fd(m145256x1d3f4980);
                    if (c12627x488d3557.f67163x876650f1 < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                        rj1.m.b(c12627x488d3557, 4);
                        rj1.m.a(c12627x488d3557);
                    } else {
                        arrayList.add(c12627x488d3557);
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(m145256x1d3f4980, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(m145256x1d3f4980, null);
            if (arrayList.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().O(c11809xbc286be4.f158811d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d0(this, arrayList));
            }
        }
    }
}
