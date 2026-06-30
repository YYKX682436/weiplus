package ga3;

/* loaded from: classes15.dex */
public class p implements j35.b0 {
    public p(ga3.v vVar) {
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 80) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission requestCode is not for microphone");
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission system permission denied");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission permission is granted");
        }
    }
}
