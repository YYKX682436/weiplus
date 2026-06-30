package t62;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f497534h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483 c13498x68291483, long j17, java.lang.Integer num, boolean z17, java.lang.String[] strArr) {
        super(j17, num, z17);
        this.f497534h = strArr;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        java.lang.String[] strArr = this.f497534h;
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5390xc1883adc c5390xc1883adc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5390xc1883adc();
            am.a8 a8Var = c5390xc1883adc.f135725g;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[0], 0);
            a8Var.getClass();
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[2];
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[3], 0);
            c5390xc1883adc.f273897d = new t62.e(this, c5390xc1883adc);
            if (!c5390xc1883adc.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi publish getWifiListEvent fail");
                c(8);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderOpenApi", "exception in connectWifi syncTaskInt.", e17);
            c(12);
        }
        return 0;
    }
}
