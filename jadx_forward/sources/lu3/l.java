package lu3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu3.m f402947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f402948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f402949f;

    public l(lu3.m mVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f402947d = mVar;
        this.f402948e = j17;
        this.f402949f = interfaceC29045xdcb5ca57;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("media recorder stop file exist:");
        lu3.m mVar = this.f402947d;
        ht0.s sVar = mVar.f402952o;
        sb6.append(com.p314xaae8f345.mm.vfs.w6.j(sVar != null ? sVar.f366288c : null));
        sb6.append(" cost:");
        sb6.append(java.lang.System.currentTimeMillis() - this.f402948e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", sb6.toString());
        ht0.s sVar2 = mVar.f402952o;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(sVar2 != null ? sVar2.f366288c : null);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f402949f;
        if (!j17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(-2, null)));
            return;
        }
        ht0.s sVar3 = mVar.f402952o;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(sVar3 != null ? sVar3.f366288c : null, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "media result info:" + d17);
        if (d17 == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(-3, null)));
            return;
        }
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        bVar.f303739c = true;
        ht0.s sVar4 = mVar.f402952o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar4);
        java.lang.String str = sVar4.f366288c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFilePath(...)");
        bVar.f303737a = str;
        ht0.s sVar5 = mVar.f402952o;
        java.lang.String str2 = sVar5 != null ? sVar5.f366305t : null;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f303738b = str2;
        bVar.f303740d = 0;
        bVar.f303741e = d17.f243915a;
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(0, bVar)));
    }
}
