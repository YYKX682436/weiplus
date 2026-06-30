package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView */
/* loaded from: classes7.dex */
public class C12043xd4517e35 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 implements tb1.b0 {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f161722l1 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.Surface f161723y0;

    public C12043xd4517e35(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 e(android.content.Context context, int i17, int i18) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53(context, this.f161723y0, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610
    public tb1.m j(java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b)) ? super.j(str) : new tb1.v0(this);
    }

    @Override // tb1.b0
    /* renamed from: setCustomSurface */
    public void mo50766x1e648aba(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerCameraView", "setCustomSurface:%s", surface);
        this.f161723y0 = surface;
    }

    public C12043xd4517e35(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
