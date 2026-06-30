package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class GetCDNDnsResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.GetCDNDnsResponse DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.GetCDNDnsResponse();
    private com.tencent.mars.cdn.proto.CDNDnsInfo AppDnsInfo;
    private com.tencent.mars.cdn.proto.BaseResponse BaseResponse;
    private com.tencent.mars.cdn.proto.CDNDnsInfo C2cRoamDnsInfo;
    private com.tencent.mars.cdn.proto.SKBuiltinBuffer_t CDNDnsRuleBuf;
    private com.tencent.mars.cdn.proto.WxUserIdcInfo CdnUserIdcInfo;
    private com.tencent.mars.cdn.proto.CDNClientConfig DefaultConfig;
    private com.tencent.mars.cdn.proto.CDNClientConfig DisasterConfig;
    private com.tencent.mars.cdn.proto.CDNDnsInfo DnsInfo;
    private com.tencent.mars.cdn.proto.SKBuiltinBuffer_t FakeCDNDnsRuleBuf;
    private com.tencent.mars.cdn.proto.CDNDnsInfo FakeDnsInfo;
    private int GetCdnDnsIntervalMS;
    private int NextIpv6;
    private com.tencent.mars.cdn.proto.CDNDnsInfo SnsDnsInfo;
    private int VCodec1Limit;
    private final boolean[] hasSetFields = new boolean[15];

    public static com.tencent.mars.cdn.proto.GetCDNDnsResponse create() {
        return new com.tencent.mars.cdn.proto.GetCDNDnsResponse();
    }

    public static com.tencent.mars.cdn.proto.GetCDNDnsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.GetCDNDnsResponse newBuilder() {
        return new com.tencent.mars.cdn.proto.GetCDNDnsResponse();
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.GetCDNDnsResponse)) {
            return false;
        }
        com.tencent.mars.cdn.proto.GetCDNDnsResponse getCDNDnsResponse = (com.tencent.mars.cdn.proto.GetCDNDnsResponse) fVar;
        return n51.f.a(this.BaseResponse, getCDNDnsResponse.BaseResponse) && n51.f.a(this.DnsInfo, getCDNDnsResponse.DnsInfo) && n51.f.a(this.SnsDnsInfo, getCDNDnsResponse.SnsDnsInfo) && n51.f.a(this.AppDnsInfo, getCDNDnsResponse.AppDnsInfo) && n51.f.a(this.CDNDnsRuleBuf, getCDNDnsResponse.CDNDnsRuleBuf) && n51.f.a(this.FakeCDNDnsRuleBuf, getCDNDnsResponse.FakeCDNDnsRuleBuf) && n51.f.a(this.FakeDnsInfo, getCDNDnsResponse.FakeDnsInfo) && n51.f.a(java.lang.Integer.valueOf(this.GetCdnDnsIntervalMS), java.lang.Integer.valueOf(getCDNDnsResponse.GetCdnDnsIntervalMS)) && n51.f.a(this.DefaultConfig, getCDNDnsResponse.DefaultConfig) && n51.f.a(this.DisasterConfig, getCDNDnsResponse.DisasterConfig) && n51.f.a(java.lang.Integer.valueOf(this.NextIpv6), java.lang.Integer.valueOf(getCDNDnsResponse.NextIpv6)) && n51.f.a(this.C2cRoamDnsInfo, getCDNDnsResponse.C2cRoamDnsInfo) && n51.f.a(this.CdnUserIdcInfo, getCDNDnsResponse.CdnUserIdcInfo) && n51.f.a(java.lang.Integer.valueOf(this.VCodec1Limit), java.lang.Integer.valueOf(getCDNDnsResponse.VCodec1Limit));
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo getAppDnsInfo() {
        return this.hasSetFields[4] ? this.AppDnsInfo : com.tencent.mars.cdn.proto.CDNDnsInfo.create();
    }

    public com.tencent.mars.cdn.proto.BaseResponse getBaseResponse() {
        return this.hasSetFields[1] ? this.BaseResponse : com.tencent.mars.cdn.proto.BaseResponse.create();
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo getC2cRoamDnsInfo() {
        return this.hasSetFields[12] ? this.C2cRoamDnsInfo : com.tencent.mars.cdn.proto.CDNDnsInfo.create();
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getCDNDnsRuleBuf() {
        return this.hasSetFields[5] ? this.CDNDnsRuleBuf : new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public com.tencent.mars.cdn.proto.WxUserIdcInfo getCdnUserIdcInfo() {
        return this.hasSetFields[13] ? this.CdnUserIdcInfo : com.tencent.mars.cdn.proto.WxUserIdcInfo.create();
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig getDefaultConfig() {
        return this.hasSetFields[9] ? this.DefaultConfig : com.tencent.mars.cdn.proto.CDNClientConfig.create();
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig getDisasterConfig() {
        return this.hasSetFields[10] ? this.DisasterConfig : com.tencent.mars.cdn.proto.CDNClientConfig.create();
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo getDnsInfo() {
        return this.hasSetFields[2] ? this.DnsInfo : com.tencent.mars.cdn.proto.CDNDnsInfo.create();
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getFakeCDNDnsRuleBuf() {
        return this.hasSetFields[6] ? this.FakeCDNDnsRuleBuf : new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo getFakeDnsInfo() {
        return this.hasSetFields[7] ? this.FakeDnsInfo : com.tencent.mars.cdn.proto.CDNDnsInfo.create();
    }

    public int getGetCdnDnsIntervalMS() {
        return this.GetCdnDnsIntervalMS;
    }

    public int getNextIpv6() {
        return this.NextIpv6;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo getSnsDnsInfo() {
        return this.hasSetFields[3] ? this.SnsDnsInfo : com.tencent.mars.cdn.proto.CDNDnsInfo.create();
    }

    public int getVCodec1Limit() {
        return this.VCodec1Limit;
    }

    public boolean hasAppDnsInfo() {
        return hasFieldNumber(4);
    }

    public boolean hasBaseResponse() {
        return hasFieldNumber(1);
    }

    public boolean hasC2cRoamDnsInfo() {
        return hasFieldNumber(12);
    }

    public boolean hasCDNDnsRuleBuf() {
        return hasFieldNumber(5);
    }

    public boolean hasCdnUserIdcInfo() {
        return hasFieldNumber(13);
    }

    public boolean hasDefaultConfig() {
        return hasFieldNumber(9);
    }

    public boolean hasDisasterConfig() {
        return hasFieldNumber(10);
    }

    public boolean hasDnsInfo() {
        return hasFieldNumber(2);
    }

    public boolean hasFakeCDNDnsRuleBuf() {
        return hasFieldNumber(6);
    }

    public boolean hasFakeDnsInfo() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasGetCdnDnsIntervalMS() {
        return hasFieldNumber(8);
    }

    public boolean hasNextIpv6() {
        return hasFieldNumber(11);
    }

    public boolean hasSnsDnsInfo() {
        return hasFieldNumber(3);
    }

    public boolean hasVCodec1Limit() {
        return hasFieldNumber(14);
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.GetCDNDnsResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.BaseResponse baseResponse = this.BaseResponse;
            if (baseResponse != null && this.hasSetFields[1]) {
                fVar.i(1, baseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo = this.DnsInfo;
            if (cDNDnsInfo != null && this.hasSetFields[2]) {
                fVar.i(2, cDNDnsInfo.computeSize());
                this.DnsInfo.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo2 = this.SnsDnsInfo;
            if (cDNDnsInfo2 != null && this.hasSetFields[3]) {
                fVar.i(3, cDNDnsInfo2.computeSize());
                this.SnsDnsInfo.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo3 = this.AppDnsInfo;
            if (cDNDnsInfo3 != null && this.hasSetFields[4]) {
                fVar.i(4, cDNDnsInfo3.computeSize());
                this.AppDnsInfo.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t = this.CDNDnsRuleBuf;
            if (sKBuiltinBuffer_t != null && this.hasSetFields[5]) {
                fVar.i(5, sKBuiltinBuffer_t.computeSize());
                this.CDNDnsRuleBuf.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t2 = this.FakeCDNDnsRuleBuf;
            if (sKBuiltinBuffer_t2 != null && this.hasSetFields[6]) {
                fVar.i(6, sKBuiltinBuffer_t2.computeSize());
                this.FakeCDNDnsRuleBuf.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo4 = this.FakeDnsInfo;
            if (cDNDnsInfo4 != null && this.hasSetFields[7]) {
                fVar.i(7, cDNDnsInfo4.computeSize());
                this.FakeDnsInfo.writeFields(fVar);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.GetCdnDnsIntervalMS);
            }
            com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig = this.DefaultConfig;
            if (cDNClientConfig != null && this.hasSetFields[9]) {
                fVar.i(9, cDNClientConfig.computeSize());
                this.DefaultConfig.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig2 = this.DisasterConfig;
            if (cDNClientConfig2 != null && this.hasSetFields[10]) {
                fVar.i(10, cDNClientConfig2.computeSize());
                this.DisasterConfig.writeFields(fVar);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.NextIpv6);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo5 = this.C2cRoamDnsInfo;
            if (cDNDnsInfo5 != null && this.hasSetFields[12]) {
                fVar.i(12, cDNDnsInfo5.computeSize());
                this.C2cRoamDnsInfo.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.WxUserIdcInfo wxUserIdcInfo = this.CdnUserIdcInfo;
            if (wxUserIdcInfo != null && this.hasSetFields[13]) {
                fVar.i(13, wxUserIdcInfo.computeSize());
                this.CdnUserIdcInfo.writeFields(fVar);
            }
            if (!this.hasSetFields[14]) {
                return 0;
            }
            fVar.e(14, this.VCodec1Limit);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.BaseResponse baseResponse2 = this.BaseResponse;
            int i18 = (baseResponse2 == null || !this.hasSetFields[1]) ? 0 : b36.f.i(1, baseResponse2.computeSize()) + 0;
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo6 = this.DnsInfo;
            if (cDNDnsInfo6 != null && this.hasSetFields[2]) {
                i18 += b36.f.i(2, cDNDnsInfo6.computeSize());
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo7 = this.SnsDnsInfo;
            if (cDNDnsInfo7 != null && this.hasSetFields[3]) {
                i18 += b36.f.i(3, cDNDnsInfo7.computeSize());
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo8 = this.AppDnsInfo;
            if (cDNDnsInfo8 != null && this.hasSetFields[4]) {
                i18 += b36.f.i(4, cDNDnsInfo8.computeSize());
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t3 = this.CDNDnsRuleBuf;
            if (sKBuiltinBuffer_t3 != null && this.hasSetFields[5]) {
                i18 += b36.f.i(5, sKBuiltinBuffer_t3.computeSize());
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t4 = this.FakeCDNDnsRuleBuf;
            if (sKBuiltinBuffer_t4 != null && this.hasSetFields[6]) {
                i18 += b36.f.i(6, sKBuiltinBuffer_t4.computeSize());
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo9 = this.FakeDnsInfo;
            if (cDNDnsInfo9 != null && this.hasSetFields[7]) {
                i18 += b36.f.i(7, cDNDnsInfo9.computeSize());
            }
            if (this.hasSetFields[8]) {
                i18 += b36.f.e(8, this.GetCdnDnsIntervalMS);
            }
            com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig3 = this.DefaultConfig;
            if (cDNClientConfig3 != null && this.hasSetFields[9]) {
                i18 += b36.f.i(9, cDNClientConfig3.computeSize());
            }
            com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig4 = this.DisasterConfig;
            if (cDNClientConfig4 != null && this.hasSetFields[10]) {
                i18 += b36.f.i(10, cDNClientConfig4.computeSize());
            }
            if (this.hasSetFields[11]) {
                i18 += b36.f.e(11, this.NextIpv6);
            }
            com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo10 = this.C2cRoamDnsInfo;
            if (cDNDnsInfo10 != null && this.hasSetFields[12]) {
                i18 += b36.f.i(12, cDNDnsInfo10.computeSize());
            }
            com.tencent.mars.cdn.proto.WxUserIdcInfo wxUserIdcInfo2 = this.CdnUserIdcInfo;
            if (wxUserIdcInfo2 != null && this.hasSetFields[13]) {
                i18 += b36.f.i(13, wxUserIdcInfo2.computeSize());
            }
            return this.hasSetFields[14] ? i18 + b36.f.e(14, this.VCodec1Limit) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.BaseResponse baseResponse3 = new com.tencent.mars.cdn.proto.BaseResponse();
                    if (bArr != null && bArr.length > 0) {
                        baseResponse3.parseFrom(bArr);
                    }
                    this.BaseResponse = baseResponse3;
                }
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo11 = new com.tencent.mars.cdn.proto.CDNDnsInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        cDNDnsInfo11.parseFrom(bArr2);
                    }
                    this.DnsInfo = cDNDnsInfo11;
                }
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo12 = new com.tencent.mars.cdn.proto.CDNDnsInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        cDNDnsInfo12.parseFrom(bArr3);
                    }
                    this.SnsDnsInfo = cDNDnsInfo12;
                }
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo13 = new com.tencent.mars.cdn.proto.CDNDnsInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        cDNDnsInfo13.parseFrom(bArr4);
                    }
                    this.AppDnsInfo = cDNDnsInfo13;
                }
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t5 = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
                    if (bArr5 != null && bArr5.length > 0) {
                        sKBuiltinBuffer_t5.parseFrom(bArr5);
                    }
                    this.CDNDnsRuleBuf = sKBuiltinBuffer_t5;
                }
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t6 = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
                    if (bArr6 != null && bArr6.length > 0) {
                        sKBuiltinBuffer_t6.parseFrom(bArr6);
                    }
                    this.FakeCDNDnsRuleBuf = sKBuiltinBuffer_t6;
                }
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo14 = new com.tencent.mars.cdn.proto.CDNDnsInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        cDNDnsInfo14.parseFrom(bArr7);
                    }
                    this.FakeDnsInfo = cDNDnsInfo14;
                }
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.GetCdnDnsIntervalMS = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig5 = new com.tencent.mars.cdn.proto.CDNClientConfig();
                    if (bArr8 != null && bArr8.length > 0) {
                        cDNClientConfig5.parseFrom(bArr8);
                    }
                    this.DefaultConfig = cDNClientConfig5;
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig6 = new com.tencent.mars.cdn.proto.CDNClientConfig();
                    if (bArr9 != null && bArr9.length > 0) {
                        cDNClientConfig6.parseFrom(bArr9);
                    }
                    this.DisasterConfig = cDNClientConfig6;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.NextIpv6 = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo15 = new com.tencent.mars.cdn.proto.CDNDnsInfo();
                    if (bArr10 != null && bArr10.length > 0) {
                        cDNDnsInfo15.parseFrom(bArr10);
                    }
                    this.C2cRoamDnsInfo = cDNDnsInfo15;
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.tencent.mars.cdn.proto.WxUserIdcInfo wxUserIdcInfo3 = new com.tencent.mars.cdn.proto.WxUserIdcInfo();
                    if (bArr11 != null && bArr11.length > 0) {
                        wxUserIdcInfo3.parseFrom(bArr11);
                    }
                    this.CdnUserIdcInfo = wxUserIdcInfo3;
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.VCodec1Limit = aVar2.g(intValue);
                this.hasSetFields[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setAppDnsInfo(com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo) {
        this.AppDnsInfo = cDNDnsInfo;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setBaseResponse(com.tencent.mars.cdn.proto.BaseResponse baseResponse) {
        this.BaseResponse = baseResponse;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setC2cRoamDnsInfo(com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo) {
        this.C2cRoamDnsInfo = cDNDnsInfo;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setCDNDnsRuleBuf(com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.CDNDnsRuleBuf = sKBuiltinBuffer_t;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setCdnUserIdcInfo(com.tencent.mars.cdn.proto.WxUserIdcInfo wxUserIdcInfo) {
        this.CdnUserIdcInfo = wxUserIdcInfo;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setDefaultConfig(com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig) {
        this.DefaultConfig = cDNClientConfig;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setDisasterConfig(com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig) {
        this.DisasterConfig = cDNClientConfig;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setDnsInfo(com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo) {
        this.DnsInfo = cDNDnsInfo;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setFakeCDNDnsRuleBuf(com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.FakeCDNDnsRuleBuf = sKBuiltinBuffer_t;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setFakeDnsInfo(com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo) {
        this.FakeDnsInfo = cDNDnsInfo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setGetCdnDnsIntervalMS(int i17) {
        this.GetCdnDnsIntervalMS = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setNextIpv6(int i17) {
        this.NextIpv6 = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setSnsDnsInfo(com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo) {
        this.SnsDnsInfo = cDNDnsInfo;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse setVCodec1Limit(int i17) {
        this.VCodec1Limit = i17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.GetCDNDnsResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.GetCDNDnsResponse parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.GetCDNDnsResponse) super.parseFrom(bArr);
    }
}
