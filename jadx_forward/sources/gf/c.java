package gf;

/* loaded from: classes13.dex */
public final class c implements com.p314xaae8f345.p2936x80def495.InterfaceC25567xc6445f7a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f352560a;

    public c(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        this.f352560a = yVar;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25567xc6445f7a
    /* renamed from: updateMapCustomCallout */
    public void mo95657x8ef2166c(int i17, long j17, double d17, double d18, int i18, byte[] bitmapBytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapBytes, "bitmapBytes");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", "updateMapCustomCallout mapId:" + i17 + " markerId:" + j17 + "  anchorX:" + d17 + " anchorY:" + d18 + " display:" + i18 + " bitmapBytes:" + bitmapBytes);
        java.lang.String mo48798x74292566 = this.f352560a.mo48798x74292566();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0 = this.f352560a.V0();
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(V0.mo50260x9f1221c2());
        sb6.append("&");
        sb6.append(valueOf);
        vc1.a3 b17 = vc1.h3.b(mo48798x74292566, sb6.toString());
        if (!(!(bitmapBytes.length == 0))) {
            if (b17 != null) {
                java.lang.String valueOf2 = java.lang.String.valueOf(j17);
                vc1.p1 p1Var = (vc1.p1) b17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeMarkerCallout markerId:%s", p1Var, valueOf2);
                vc1.o1 z17 = p1Var.z(valueOf2);
                if (z17 == null || z17.f516565e == null) {
                    return;
                }
                z17.f516558b.f516681s = null;
                p1Var.J(z17);
                synchronized (p1Var.f516637w) {
                    z17.f516565e = null;
                }
                return;
            }
            return;
        }
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bitmapBytes);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMapCustomCallout mapView:");
        sb7.append(b17);
        sb7.append(" bitmap:");
        sb7.append(G != null ? java.lang.Integer.valueOf(G.getWidth()) : null);
        sb7.append("  ");
        sb7.append(G != null ? java.lang.Integer.valueOf(G.getHeight()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", sb7.toString());
        if (b17 != null) {
            java.lang.String valueOf3 = java.lang.String.valueOf(j17);
            vc1.q2 q2Var = new vc1.q2();
            if (G != null) {
                int c17 = ik1.w.c((int) d17);
                int c18 = ik1.w.c((int) d18);
                vc1.o2 o2Var = new vc1.o2();
                q2Var.f516681s = o2Var;
                o2Var.f516585s = G;
                o2Var.f516580n = i18;
                o2Var.f516582p = c17;
                o2Var.f516583q = c18;
            }
            ik1.h0.b(new vc1.c0((vc1.p1) b17, valueOf3, q2Var, (o91.d) this.f352560a.q(o91.d.class)));
        }
    }
}
