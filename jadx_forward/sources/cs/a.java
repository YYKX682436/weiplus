package cs;

/* loaded from: classes4.dex */
public final class a extends bs.b {
    @Override // bs.b
    public java.lang.Object a(aq.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "detectImpl >> start " + java.lang.System.currentTimeMillis() + ' ' + java.lang.Thread.currentThread().getName());
        if (!com.p314xaae8f345.mm.vfs.w6.j(t0Var.f94498a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "video file is no exist");
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new aq.s0(false, 102)));
        } else if (com.p314xaae8f345.mm.vfs.w6.j(t0Var.f94499b)) {
            if (t0Var.f94500c.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "export path is null");
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new aq.s0(false, 103)));
            } else {
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new aq.s0(true, 0)));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoExportCheckFileChain", "cover file is no exist");
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new aq.s0(false, 101)));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }
}
