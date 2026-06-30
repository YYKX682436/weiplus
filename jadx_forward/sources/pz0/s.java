package pz0;

/* loaded from: classes5.dex */
public final class s implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bl6 f440699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f440701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f440702g;

    public s(r45.bl6 bl6Var, java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f440699d = bl6Var;
        this.f440700e = str;
        this.f440701f = r6Var;
        this.f440702g = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        r45.bl6 bl6Var = this.f440699d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, bl6Var.f452393f);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f440702g;
        java.lang.String str2 = this.f440700e;
        if (b17) {
            boolean z17 = false;
            if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MusicVideoResManager", "onC2CDownloadCompleted: " + bl6Var.f452393f + " download successful at " + str2 + ", size: " + this.f440701f.C());
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str2));
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted: resource ");
        sb6.append(bl6Var.f452393f);
        sb6.append(" download error error code: ");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.MusicVideoResManager", sb6.toString());
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
