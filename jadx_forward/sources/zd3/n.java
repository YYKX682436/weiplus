package zd3;

/* loaded from: classes7.dex */
public final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.o f553157d;

    public n(zd3.o oVar) {
        this.f553157d = oVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        int i17 = c16466x1a72912b.f229692d;
        zd3.o oVar = this.f553157d;
        if (i17 == 0) {
            rk0.c.c("MB_External_surface", "unRegisterExternalTexture success", new java.lang.Object[0]);
            oVar.s().mo146xb9724478(oVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unRegisterExternalTexture failed, errCode: ");
        int i18 = c16466x1a72912b.f229692d;
        sb6.append(i18);
        sb6.append(", errMsg: ");
        java.lang.String str = c16466x1a72912b.f229693e;
        sb6.append(str);
        rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
        lc3.z zVar = lc3.x.f399469c;
        if (i18 != -1) {
            if (i18 == 0) {
                zVar = lc3.x.f399467a;
            } else if (i18 == 2) {
                zVar = lc3.w.f399466a;
            }
        }
        yz5.l s17 = oVar.s();
        if (str == null) {
            str = "unknown error";
        }
        s17.mo146xb9724478(oVar.j(zVar, str));
    }
}
