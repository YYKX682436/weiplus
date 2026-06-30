package x51;

/* loaded from: classes5.dex */
public class x implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.a f533641a;

    public x(m3.a aVar) {
        this.f533641a = aVar;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        int i18 = iArr[0];
        m3.a aVar = this.f533641a;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] onPermissionGranted");
            aVar.mo3938xab27b508(java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[-] onPermissionGranted");
            aVar.mo3938xab27b508(java.lang.Boolean.FALSE);
        }
    }
}
