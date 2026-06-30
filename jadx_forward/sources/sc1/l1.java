package sc1;

/* loaded from: classes10.dex */
public class l1 extends com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver {
    @Override // com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.V2TXLivePremierObserver
    /* renamed from: onLog */
    public void mo31697x64f5ce5(int i17, java.lang.String str) {
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Live", str);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Live", str);
        } else if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Live", str);
        } else {
            if (i17 != 5) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.AppBrand.Live", str);
        }
    }
}
