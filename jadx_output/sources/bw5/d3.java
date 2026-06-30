package bw5;

/* loaded from: classes2.dex */
public enum d3 implements com.tencent.mm.protobuf.h {
    CDN_QUALITY_HD(0),
    CDN_QUALITY_SD1(1),
    CDN_QUALITY_SD2(2),
    CDN_QUALITY_SM(3),
    CDN_QUALITY_SB(4),
    CDN_QUALITY_HEVC(5),
    CDN_QUALITY_UL(6),
    CDN_QUALITY_AUTO_CLIQOS(101),
    CDN_QUALITY_AUTO_SVRML(102);


    /* renamed from: d, reason: collision with root package name */
    public final int f26302d;

    d3(int i17) {
        this.f26302d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26302d;
    }
}
