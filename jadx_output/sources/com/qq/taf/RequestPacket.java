package com.qq.taf;

/* loaded from: classes13.dex */
public final class RequestPacket extends com.qq.taf.jce.JceStruct {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static java.util.Map<java.lang.String, java.lang.String> cache_context;
    static byte[] cache_sBuffer;
    public byte cPacketType;
    public java.util.Map<java.lang.String, java.lang.String> context;
    public int iMessageType;
    public int iRequestId;
    public int iTimeout;
    public short iVersion;
    public byte[] sBuffer;
    public java.lang.String sFuncName;
    public java.lang.String sServantName;
    public java.util.Map<java.lang.String, java.lang.String> status;

    public RequestPacket() {
        this.iVersion = (short) 0;
        this.cPacketType = (byte) 0;
        this.iMessageType = 0;
        this.iRequestId = 0;
        this.sServantName = null;
        this.sFuncName = null;
        this.iTimeout = 0;
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display(this.iVersion, "iVersion");
        jceDisplayer.display(this.cPacketType, "cPacketType");
        jceDisplayer.display(this.iMessageType, "iMessageType");
        jceDisplayer.display(this.iRequestId, "iRequestId");
        jceDisplayer.display(this.sServantName, "sServantName");
        jceDisplayer.display(this.sFuncName, "sFuncName");
        jceDisplayer.display(this.sBuffer, "sBuffer");
        jceDisplayer.display(this.iTimeout, "iTimeout");
        jceDisplayer.display((java.util.Map) this.context, "context");
        jceDisplayer.display((java.util.Map) this.status, "status");
    }

    public boolean equals(java.lang.Object obj) {
        com.qq.taf.RequestPacket requestPacket = (com.qq.taf.RequestPacket) obj;
        return com.qq.taf.jce.JceUtil.equals(1, (int) requestPacket.iVersion) && com.qq.taf.jce.JceUtil.equals(1, (int) requestPacket.cPacketType) && com.qq.taf.jce.JceUtil.equals(1, requestPacket.iMessageType) && com.qq.taf.jce.JceUtil.equals(1, requestPacket.iRequestId) && com.qq.taf.jce.JceUtil.equals((java.lang.Object) 1, (java.lang.Object) requestPacket.sServantName) && com.qq.taf.jce.JceUtil.equals((java.lang.Object) 1, (java.lang.Object) requestPacket.sFuncName) && com.qq.taf.jce.JceUtil.equals((java.lang.Object) 1, (java.lang.Object) requestPacket.sBuffer) && com.qq.taf.jce.JceUtil.equals(1, requestPacket.iTimeout) && com.qq.taf.jce.JceUtil.equals((java.lang.Object) 1, (java.lang.Object) requestPacket.context) && com.qq.taf.jce.JceUtil.equals((java.lang.Object) 1, (java.lang.Object) requestPacket.status);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        try {
            this.iVersion = jceInputStream.read(this.iVersion, 1, true);
            this.cPacketType = jceInputStream.read(this.cPacketType, 2, true);
            this.iMessageType = jceInputStream.read(this.iMessageType, 3, true);
            this.iRequestId = jceInputStream.read(this.iRequestId, 4, true);
            this.sServantName = jceInputStream.readString(5, true);
            this.sFuncName = jceInputStream.readString(6, true);
            if (cache_sBuffer == null) {
                cache_sBuffer = new byte[1];
            }
            this.sBuffer = jceInputStream.read(cache_sBuffer, 7, true);
            this.iTimeout = jceInputStream.read(this.iTimeout, 8, true);
            if (cache_context == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                cache_context = hashMap;
                hashMap.put("", "");
            }
            this.context = (java.util.Map) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_context, 9, true);
            if (cache_context == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                cache_context = hashMap2;
                hashMap2.put("", "");
            }
            this.status = (java.util.Map) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_context, 10, true);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.iVersion, 1);
        jceOutputStream.write(this.cPacketType, 2);
        jceOutputStream.write(this.iMessageType, 3);
        jceOutputStream.write(this.iRequestId, 4);
        jceOutputStream.write(this.sServantName, 5);
        jceOutputStream.write(this.sFuncName, 6);
        jceOutputStream.write(this.sBuffer, 7);
        jceOutputStream.write(this.iTimeout, 8);
        jceOutputStream.write((java.util.Map) this.context, 9);
        jceOutputStream.write((java.util.Map) this.status, 10);
    }

    public RequestPacket(short s17, byte b17, int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, int i19, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.iVersion = s17;
        this.cPacketType = b17;
        this.iMessageType = i17;
        this.iRequestId = i18;
        this.sServantName = str;
        this.sFuncName = str2;
        this.sBuffer = bArr;
        this.iTimeout = i19;
        this.context = map;
        this.status = map2;
    }
}
