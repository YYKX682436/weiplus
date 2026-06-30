package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class vc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc f281658d;

    public vc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar) {
        this.f281658d = qcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = this.f281658d;
        int size = ((java.util.ArrayList) qcVar.f281302n).size();
        while (true) {
            size--;
            if (size < 20) {
                qcVar.f281301m.m8154xdb81fc7f(20, ((java.util.ArrayList) qcVar.f281302n).size() - 20);
                return;
            } else {
                rn.c cVar = (rn.c) ((java.util.ArrayList) qcVar.f281302n).remove(size);
                if (cVar != null) {
                    qcVar.f281303o.remove(cVar);
                }
            }
        }
    }
}
