package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class u implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final fb1.h f158272d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f158273e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f158274f;

    public u(fb1.h onStatusChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onStatusChange, "onStatusChange");
        this.f158272d = onStatusChange;
        this.f158273e = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        fb1.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageMainService", "onStatusChange, value: " + ((java.lang.Boolean) obj));
        java.util.Iterator it = this.f158273e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) obj2).a()) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i) obj2;
        boolean z17 = iVar != null;
        if (this.f158274f != z17) {
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                cVar = new fb1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.s.a(iVar.f158243a));
            } else {
                cVar = fb1.b.f342361a;
            }
            this.f158272d.a(cVar);
            this.f158274f = z17;
        }
    }
}
