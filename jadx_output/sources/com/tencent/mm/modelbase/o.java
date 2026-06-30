package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m f70710a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.modelbase.n f70711b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f70712c;

    /* renamed from: d, reason: collision with root package name */
    public int f70713d;

    /* renamed from: e, reason: collision with root package name */
    public int f70714e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f70715f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f70716g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f70717h;

    /* renamed from: i, reason: collision with root package name */
    public final int f70718i;

    /* renamed from: j, reason: collision with root package name */
    public int f70719j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f70720k;

    public o(com.tencent.mm.protobuf.f fVar, com.tencent.mm.protobuf.f fVar2, java.lang.String str, int i17, int i18, int i19, boolean z17, int i27, int i28, boolean z18, int i29, boolean z19, com.tencent.mm.modelbase.k kVar) {
        this.f70710a = null;
        this.f70711b = null;
        this.f70710a = new com.tencent.mm.modelbase.m(fVar, i17, i18, z17 && (fVar instanceof r45.my3), i28);
        this.f70711b = new com.tencent.mm.modelbase.n(fVar2, i19, z17);
        this.f70712c = str;
        this.f70713d = i17;
        this.f70715f = i27;
        this.f70716g = z18;
        this.f70718i = i29;
        this.f70719j = 0;
        this.f70720k = null;
        this.f70717h = z19;
    }

    public final com.tencent.mm.protobuf.f a() {
        return this.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public boolean getIsLongPolling() {
        return this.f70716g;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getLongPollingTimeout() {
        return this.f70718i;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getNewExtFlags() {
        return this.f70719j;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return this.f70714e;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f70710a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f70711b;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getTimeOut() {
        return this.f70715f;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public byte[] getTransHeader() {
        return this.f70720k;
    }

    @Override // com.tencent.mm.network.v0
    public final int getType() {
        return this.f70713d;
    }

    @Override // com.tencent.mm.network.v0
    public final java.lang.String getUri() {
        return this.f70712c;
    }

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public boolean keepAlive() {
        return this.f70717h;
    }

    public void setRsaInfo(o45.pi piVar) {
        this.f70710a.setRsaInfo(piVar);
    }
}
