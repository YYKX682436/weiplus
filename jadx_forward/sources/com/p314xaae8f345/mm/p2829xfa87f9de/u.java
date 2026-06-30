package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 f296422d;

    public u(com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 c22987x97ad1828) {
        this.f296422d = c22987x97ad1828;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6;
        com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 c22987x97ad1828 = this.f296422d;
        com.p314xaae8f345.mm.p2829xfa87f9de.x xVar = c22987x97ad1828.f296347m;
        if (xVar != null) {
            com.p314xaae8f345.mm.p2829xfa87f9de.l lVar = (com.p314xaae8f345.mm.p2829xfa87f9de.l) xVar;
            lVar.getClass();
            long j17 = 0;
            try {
                if (com.p314xaae8f345.mm.p2829xfa87f9de.q.b(lVar.f296381a) && (interfaceC26164x73fc6bc6 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.f296410h) != null) {
                    int mo100916xb7d72d0e = interfaceC26164x73fc6bc6.mo100916xb7d72d0e();
                    if (mo100916xb7d72d0e != 7 && mo100916xb7d72d0e != 8 && mo100916xb7d72d0e != 9) {
                        j17 = interfaceC26164x73fc6bc6.mo100915xddd35a52();
                    }
                    j17 = interfaceC26164x73fc6bc6.mo100917x37a7fa50();
                }
            } catch (java.lang.Throwable th6) {
                th6.getMessage();
            }
            if (c22987x97ad1828.f296346i.a(((float) j17) / ((float) c22987x97ad1828.f296342e), false)) {
                c22987x97ad1828.f296341d = j17;
                c22987x97ad1828.f296343f.setText(c22987x97ad1828.a(j17));
            }
        }
    }
}
