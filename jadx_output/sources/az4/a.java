package az4;

@j95.b
/* loaded from: classes8.dex */
public class a extends i95.w implements uy4.u {
    @Override // uy4.w
    public void Wc(android.app.Activity activity, java.lang.String str) {
        ((sy4.n) ((uy4.y) i95.n0.c(uy4.y.class))).getClass();
        yy4.a b17 = sy4.m.f413884c.b(str);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str2 = b17.field_WeAppUser;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str2;
        nxVar.f7467b = b17.field_WeAppPath;
        nxVar.f7469d = 1051;
        nxVar.f7468c = b17.field_WeAppDebugMode;
        nxVar.f7470e = java.lang.String.format("%s:%s:%s:%s", (java.lang.String) gm0.j1.u().c().l(2, null), b17.field_expId, b17.field_LabsAppId, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        startAppBrandUIFromOuterEvent.e();
    }

    @Override // uy4.w
    public java.lang.String ra(java.lang.String str) {
        return null;
    }

    @Override // uy4.w
    public java.lang.String xe(java.lang.String str) {
        return null;
    }
}
