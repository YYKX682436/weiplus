package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class o5 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e f225236a;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e c16203x735a887e) {
        this.f225236a = c16203x735a887e;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: error */
    public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f225236a.f224975e.b(java.lang.String.format("invoke getImageLocalInfo failed. code: %s, message: %s", str, str2));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: notImplemented */
    public void mo65719xbc9fa82f() {
        this.f225236a.f224975e.b("getImageLocalInfo notImplemented");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: success */
    public void mo65720x90b54003(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiRecognizeQRCode", obj.toString());
        boolean z17 = obj instanceof java.util.ArrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e c16203x735a887e = this.f225236a;
        if (z17) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (arrayList.size() == 1) {
                java.lang.String str = (java.lang.String) ((java.util.HashMap) arrayList.get(0)).get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
                c16203x735a887e.f225019g.mo48813x58998cd();
                c16203x735a887e.f225020h.mo48813x58998cd();
                long nanoTime = java.lang.System.nanoTime();
                am.aq aqVar = c5884x4c2d9184.f136192g;
                aqVar.f87707a = nanoTime;
                aqVar.f87708b = str;
                c5884x4c2d9184.e();
                return;
            }
        }
        c16203x735a887e.f224975e.b("invoke getImageLocalInfo failed");
    }
}
