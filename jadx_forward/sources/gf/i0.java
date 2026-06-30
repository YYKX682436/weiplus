package gf;

/* loaded from: classes7.dex */
public final class i0 implements com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 {
    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
    /* renamed from: afterLoad */
    public boolean mo95909x3cbcf0e2() {
        return false;
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
    /* renamed from: beforeLoad */
    public boolean mo95910x1ee4a105() {
        return false;
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
    /* renamed from: load */
    public boolean mo95911x32c4e6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineBoot", "load libName:" + str);
        if (str == null) {
            return false;
        }
        try {
            fp.d0.n(str);
            return true;
        } catch (java.lang.Error e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.SkylineBoot", "load fail: " + str + ", e: " + e17);
            return true;
        }
    }
}
