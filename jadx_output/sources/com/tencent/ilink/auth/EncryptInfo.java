package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class EncryptInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.EncryptInfo DEFAULT_INSTANCE = new com.tencent.ilink.auth.EncryptInfo();
    private java.lang.String checkstr;
    private java.lang.String deviceid;
    private java.lang.String randstr;
    private int tmstamp;
    private java.util.LinkedList<com.tencent.ilink.auth.LiveActionType> actions = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[6];

    public static com.tencent.ilink.auth.EncryptInfo create() {
        return new com.tencent.ilink.auth.EncryptInfo();
    }

    public static com.tencent.ilink.auth.EncryptInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.EncryptInfo newBuilder() {
        return new com.tencent.ilink.auth.EncryptInfo();
    }

    public com.tencent.ilink.auth.EncryptInfo addAllElementActions(java.util.Collection<com.tencent.ilink.auth.LiveActionType> collection) {
        this.actions.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo addElementActions(com.tencent.ilink.auth.LiveActionType liveActionType) {
        this.actions.add(liveActionType);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.EncryptInfo)) {
            return false;
        }
        com.tencent.ilink.auth.EncryptInfo encryptInfo = (com.tencent.ilink.auth.EncryptInfo) fVar;
        return n51.f.a(this.deviceid, encryptInfo.deviceid) && n51.f.a(this.actions, encryptInfo.actions) && n51.f.a(java.lang.Integer.valueOf(this.tmstamp), java.lang.Integer.valueOf(encryptInfo.tmstamp)) && n51.f.a(this.randstr, encryptInfo.randstr) && n51.f.a(this.checkstr, encryptInfo.checkstr);
    }

    public java.util.LinkedList<com.tencent.ilink.auth.LiveActionType> getActions() {
        return this.actions;
    }

    public java.lang.String getCheckstr() {
        return this.hasSetFields[5] ? this.checkstr : "";
    }

    public java.lang.String getDeviceid() {
        return this.hasSetFields[1] ? this.deviceid : "";
    }

    public java.lang.String getRandstr() {
        return this.hasSetFields[4] ? this.randstr : "";
    }

    public int getTmstamp() {
        return this.tmstamp;
    }

    public boolean hasActions() {
        return hasFieldNumber(2);
    }

    public boolean hasCheckstr() {
        return hasFieldNumber(5);
    }

    public boolean hasDeviceid() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRandstr() {
        return hasFieldNumber(4);
    }

    public boolean hasTmstamp() {
        return hasFieldNumber(3);
    }

    public com.tencent.ilink.auth.EncryptInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.EncryptInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.deviceid;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator<com.tencent.ilink.auth.LiveActionType> it = this.actions.iterator();
            while (it.hasNext()) {
                linkedList.add(java.lang.Integer.valueOf(it.next().value));
            }
            fVar.g(2, 2, linkedList);
            if (this.hasSetFields[3]) {
                fVar.e(3, this.tmstamp);
            }
            java.lang.String str2 = this.randstr;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.checkstr;
            if (str3 != null && this.hasSetFields[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.deviceid;
            if (str4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator<com.tencent.ilink.auth.LiveActionType> it6 = this.actions.iterator();
            while (it6.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(it6.next().value));
            }
            int g17 = i18 + b36.f.g(2, 2, linkedList2);
            if (this.hasSetFields[3]) {
                g17 += b36.f.e(3, this.tmstamp);
            }
            java.lang.String str5 = this.randstr;
            if (str5 != null && this.hasSetFields[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.checkstr;
            return (str6 == null || !this.hasSetFields[5]) ? g17 : g17 + b36.f.j(5, str6);
        }
        if (i17 == 2) {
            this.actions.clear();
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
        if (intValue == 1) {
            this.deviceid = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.actions.add(com.tencent.ilink.auth.LiveActionType.forNumber(aVar2.g(intValue)));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.tmstamp = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.randstr = aVar2.k(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.checkstr = aVar2.k(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.auth.EncryptInfo setActions(java.util.LinkedList<com.tencent.ilink.auth.LiveActionType> linkedList) {
        this.actions = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo setCheckstr(java.lang.String str) {
        this.checkstr = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo setDeviceid(java.lang.String str) {
        this.deviceid = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo setRandstr(java.lang.String str) {
        this.randstr = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo setTmstamp(int i17) {
        this.tmstamp = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.EncryptInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.EncryptInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.EncryptInfo) super.parseFrom(bArr);
    }
}
