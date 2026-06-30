package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class CDNDnsInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CDNDnsInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CDNDnsInfo();
    private com.tencent.mars.cdn.proto.SKBuiltinBuffer_t AuthKey;
    private int ExpireTime;
    private int FakeUin;
    private int FrontID;
    private int FrontIPCount;
    private int FrontIPPortCount;
    private com.tencent.mars.cdn.proto.SKBuiltinBuffer_t NewAuthKey;
    private int Uin;
    private int Ver;
    private java.lang.String ZoneDomain;
    private int ZoneID;
    private int ZoneIPCount;
    private int ZoneIPPortCount;
    private java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> FrontIPList = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> ZoneIPList = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> FrontIPPortList = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> ZoneIPPortList = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[18];

    public static com.tencent.mars.cdn.proto.CDNDnsInfo create() {
        return new com.tencent.mars.cdn.proto.CDNDnsInfo();
    }

    public static com.tencent.mars.cdn.proto.CDNDnsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CDNDnsInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.CDNDnsInfo();
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addAllElementFrontIPList(java.util.Collection<com.tencent.mars.cdn.proto.SKBuiltinString_t> collection) {
        this.FrontIPList.addAll(collection);
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addAllElementFrontIPPortList(java.util.Collection<com.tencent.mars.cdn.proto.CDNDnsPortInfo> collection) {
        this.FrontIPPortList.addAll(collection);
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addAllElementZoneIPList(java.util.Collection<com.tencent.mars.cdn.proto.SKBuiltinString_t> collection) {
        this.ZoneIPList.addAll(collection);
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addAllElementZoneIPPortList(java.util.Collection<com.tencent.mars.cdn.proto.CDNDnsPortInfo> collection) {
        this.ZoneIPPortList.addAll(collection);
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addElementFrontIPList(com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t) {
        this.FrontIPList.add(sKBuiltinString_t);
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addElementFrontIPPortList(com.tencent.mars.cdn.proto.CDNDnsPortInfo cDNDnsPortInfo) {
        this.FrontIPPortList.add(cDNDnsPortInfo);
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addElementZoneIPList(com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t) {
        this.ZoneIPList.add(sKBuiltinString_t);
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo addElementZoneIPPortList(com.tencent.mars.cdn.proto.CDNDnsPortInfo cDNDnsPortInfo) {
        this.ZoneIPPortList.add(cDNDnsPortInfo);
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CDNDnsInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CDNDnsInfo cDNDnsInfo = (com.tencent.mars.cdn.proto.CDNDnsInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.Ver), java.lang.Integer.valueOf(cDNDnsInfo.Ver)) && n51.f.a(java.lang.Integer.valueOf(this.Uin), java.lang.Integer.valueOf(cDNDnsInfo.Uin)) && n51.f.a(java.lang.Integer.valueOf(this.ExpireTime), java.lang.Integer.valueOf(cDNDnsInfo.ExpireTime)) && n51.f.a(java.lang.Integer.valueOf(this.FrontID), java.lang.Integer.valueOf(cDNDnsInfo.FrontID)) && n51.f.a(java.lang.Integer.valueOf(this.FrontIPCount), java.lang.Integer.valueOf(cDNDnsInfo.FrontIPCount)) && n51.f.a(this.FrontIPList, cDNDnsInfo.FrontIPList) && n51.f.a(this.ZoneDomain, cDNDnsInfo.ZoneDomain) && n51.f.a(this.AuthKey, cDNDnsInfo.AuthKey) && n51.f.a(java.lang.Integer.valueOf(this.ZoneID), java.lang.Integer.valueOf(cDNDnsInfo.ZoneID)) && n51.f.a(java.lang.Integer.valueOf(this.ZoneIPCount), java.lang.Integer.valueOf(cDNDnsInfo.ZoneIPCount)) && n51.f.a(this.ZoneIPList, cDNDnsInfo.ZoneIPList) && n51.f.a(this.FrontIPPortList, cDNDnsInfo.FrontIPPortList) && n51.f.a(this.ZoneIPPortList, cDNDnsInfo.ZoneIPPortList) && n51.f.a(java.lang.Integer.valueOf(this.FrontIPPortCount), java.lang.Integer.valueOf(cDNDnsInfo.FrontIPPortCount)) && n51.f.a(java.lang.Integer.valueOf(this.ZoneIPPortCount), java.lang.Integer.valueOf(cDNDnsInfo.ZoneIPPortCount)) && n51.f.a(java.lang.Integer.valueOf(this.FakeUin), java.lang.Integer.valueOf(cDNDnsInfo.FakeUin)) && n51.f.a(this.NewAuthKey, cDNDnsInfo.NewAuthKey);
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getAuthKey() {
        return this.hasSetFields[8] ? this.AuthKey : new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public int getExpireTime() {
        return this.ExpireTime;
    }

    public int getFakeUin() {
        return this.FakeUin;
    }

    public int getFrontID() {
        return this.FrontID;
    }

    public int getFrontIPCount() {
        return this.FrontIPCount;
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> getFrontIPList() {
        return this.FrontIPList;
    }

    public int getFrontIPPortCount() {
        return this.FrontIPPortCount;
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> getFrontIPPortList() {
        return this.FrontIPPortList;
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getNewAuthKey() {
        return this.hasSetFields[17] ? this.NewAuthKey : new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public int getUin() {
        return this.Uin;
    }

    public int getVer() {
        return this.Ver;
    }

    public java.lang.String getZoneDomain() {
        return this.hasSetFields[7] ? this.ZoneDomain : "";
    }

    public int getZoneID() {
        return this.ZoneID;
    }

    public int getZoneIPCount() {
        return this.ZoneIPCount;
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> getZoneIPList() {
        return this.ZoneIPList;
    }

    public int getZoneIPPortCount() {
        return this.ZoneIPPortCount;
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> getZoneIPPortList() {
        return this.ZoneIPPortList;
    }

    public boolean hasAuthKey() {
        return hasFieldNumber(8);
    }

    public boolean hasExpireTime() {
        return hasFieldNumber(3);
    }

    public boolean hasFakeUin() {
        return hasFieldNumber(16);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFrontID() {
        return hasFieldNumber(4);
    }

    public boolean hasFrontIPCount() {
        return hasFieldNumber(5);
    }

    public boolean hasFrontIPList() {
        return hasFieldNumber(6);
    }

    public boolean hasFrontIPPortCount() {
        return hasFieldNumber(14);
    }

    public boolean hasFrontIPPortList() {
        return hasFieldNumber(12);
    }

    public boolean hasNewAuthKey() {
        return hasFieldNumber(17);
    }

    public boolean hasUin() {
        return hasFieldNumber(2);
    }

    public boolean hasVer() {
        return hasFieldNumber(1);
    }

    public boolean hasZoneDomain() {
        return hasFieldNumber(7);
    }

    public boolean hasZoneID() {
        return hasFieldNumber(9);
    }

    public boolean hasZoneIPCount() {
        return hasFieldNumber(10);
    }

    public boolean hasZoneIPList() {
        return hasFieldNumber(11);
    }

    public boolean hasZoneIPPortCount() {
        return hasFieldNumber(15);
    }

    public boolean hasZoneIPPortList() {
        return hasFieldNumber(13);
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CDNDnsInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.Ver);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.Uin);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.ExpireTime);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.FrontID);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.FrontIPCount);
            }
            fVar.g(6, 8, this.FrontIPList);
            java.lang.String str = this.ZoneDomain;
            if (str != null && this.hasSetFields[7]) {
                fVar.j(7, str);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t = this.AuthKey;
            if (sKBuiltinBuffer_t != null && this.hasSetFields[8]) {
                fVar.i(8, sKBuiltinBuffer_t.computeSize());
                this.AuthKey.writeFields(fVar);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.ZoneID);
            }
            if (this.hasSetFields[10]) {
                fVar.e(10, this.ZoneIPCount);
            }
            fVar.g(11, 8, this.ZoneIPList);
            fVar.g(12, 8, this.FrontIPPortList);
            fVar.g(13, 8, this.ZoneIPPortList);
            if (this.hasSetFields[14]) {
                fVar.e(14, this.FrontIPPortCount);
            }
            if (this.hasSetFields[15]) {
                fVar.e(15, this.ZoneIPPortCount);
            }
            if (this.hasSetFields[16]) {
                fVar.e(16, this.FakeUin);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t2 = this.NewAuthKey;
            if (sKBuiltinBuffer_t2 != null && this.hasSetFields[17]) {
                fVar.i(17, sKBuiltinBuffer_t2.computeSize());
                this.NewAuthKey.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? b36.f.e(1, this.Ver) + 0 : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.Uin);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.ExpireTime);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.FrontID);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.FrontIPCount);
            }
            int g17 = e17 + b36.f.g(6, 8, this.FrontIPList);
            java.lang.String str2 = this.ZoneDomain;
            if (str2 != null && this.hasSetFields[7]) {
                g17 += b36.f.j(7, str2);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t3 = this.AuthKey;
            if (sKBuiltinBuffer_t3 != null && this.hasSetFields[8]) {
                g17 += b36.f.i(8, sKBuiltinBuffer_t3.computeSize());
            }
            if (this.hasSetFields[9]) {
                g17 += b36.f.e(9, this.ZoneID);
            }
            if (this.hasSetFields[10]) {
                g17 += b36.f.e(10, this.ZoneIPCount);
            }
            int g18 = g17 + b36.f.g(11, 8, this.ZoneIPList) + b36.f.g(12, 8, this.FrontIPPortList) + b36.f.g(13, 8, this.ZoneIPPortList);
            if (this.hasSetFields[14]) {
                g18 += b36.f.e(14, this.FrontIPPortCount);
            }
            if (this.hasSetFields[15]) {
                g18 += b36.f.e(15, this.ZoneIPPortCount);
            }
            if (this.hasSetFields[16]) {
                g18 += b36.f.e(16, this.FakeUin);
            }
            com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t4 = this.NewAuthKey;
            return (sKBuiltinBuffer_t4 == null || !this.hasSetFields[17]) ? g18 : g18 + b36.f.i(17, sKBuiltinBuffer_t4.computeSize());
        }
        if (i17 == 2) {
            this.FrontIPList.clear();
            this.ZoneIPList.clear();
            this.FrontIPPortList.clear();
            this.ZoneIPPortList.clear();
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
                this.Ver = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.Uin = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.ExpireTime = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.FrontID = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.FrontIPCount = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t = new com.tencent.mars.cdn.proto.SKBuiltinString_t();
                    if (bArr != null && bArr.length > 0) {
                        sKBuiltinString_t.parseFrom(bArr);
                    }
                    this.FrontIPList.add(sKBuiltinString_t);
                }
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.ZoneDomain = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t5 = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
                    if (bArr2 != null && bArr2.length > 0) {
                        sKBuiltinBuffer_t5.parseFrom(bArr2);
                    }
                    this.AuthKey = sKBuiltinBuffer_t5;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.ZoneID = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.ZoneIPCount = aVar2.g(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t2 = new com.tencent.mars.cdn.proto.SKBuiltinString_t();
                    if (bArr3 != null && bArr3.length > 0) {
                        sKBuiltinString_t2.parseFrom(bArr3);
                    }
                    this.ZoneIPList.add(sKBuiltinString_t2);
                }
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.mars.cdn.proto.CDNDnsPortInfo cDNDnsPortInfo = new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        cDNDnsPortInfo.parseFrom(bArr4);
                    }
                    this.FrontIPPortList.add(cDNDnsPortInfo);
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    com.tencent.mars.cdn.proto.CDNDnsPortInfo cDNDnsPortInfo2 = new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        cDNDnsPortInfo2.parseFrom(bArr5);
                    }
                    this.ZoneIPPortList.add(cDNDnsPortInfo2);
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.FrontIPPortCount = aVar2.g(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.ZoneIPPortCount = aVar2.g(intValue);
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.FakeUin = aVar2.g(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t6 = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
                    if (bArr6 != null && bArr6.length > 0) {
                        sKBuiltinBuffer_t6.parseFrom(bArr6);
                    }
                    this.NewAuthKey = sKBuiltinBuffer_t6;
                }
                this.hasSetFields[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setAuthKey(com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.AuthKey = sKBuiltinBuffer_t;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setExpireTime(int i17) {
        this.ExpireTime = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFakeUin(int i17) {
        this.FakeUin = i17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFrontID(int i17) {
        this.FrontID = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFrontIPCount(int i17) {
        this.FrontIPCount = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFrontIPList(java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> linkedList) {
        this.FrontIPList = linkedList;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFrontIPPortCount(int i17) {
        this.FrontIPPortCount = i17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setFrontIPPortList(java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> linkedList) {
        this.FrontIPPortList = linkedList;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setNewAuthKey(com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.NewAuthKey = sKBuiltinBuffer_t;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setUin(int i17) {
        this.Uin = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setVer(int i17) {
        this.Ver = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneDomain(java.lang.String str) {
        this.ZoneDomain = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneID(int i17) {
        this.ZoneID = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneIPCount(int i17) {
        this.ZoneIPCount = i17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneIPList(java.util.LinkedList<com.tencent.mars.cdn.proto.SKBuiltinString_t> linkedList) {
        this.ZoneIPList = linkedList;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneIPPortCount(int i17) {
        this.ZoneIPPortCount = i17;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo setZoneIPPortList(java.util.LinkedList<com.tencent.mars.cdn.proto.CDNDnsPortInfo> linkedList) {
        this.ZoneIPPortList = linkedList;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CDNDnsInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CDNDnsInfo) super.parseFrom(bArr);
    }
}
