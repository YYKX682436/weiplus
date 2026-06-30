package com.tencent.mapsdk.core.components.protocol.jce.sso;

/* loaded from: classes13.dex */
public final class Package extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static int f48699a = 0;

    /* renamed from: b, reason: collision with root package name */
    static byte[] f48700b = null;

    /* renamed from: c, reason: collision with root package name */
    static byte[] f48701c = null;

    /* renamed from: d, reason: collision with root package name */
    static java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.sso.Tag> f48702d = null;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f48703e = true;
    public byte[] busiBuff;
    public byte cEncodeType;
    public int eCmd;
    public byte[] head;
    public int iSeqNo;
    public java.lang.String sAppId;
    public short shVer;
    public java.lang.String strSubCmd;
    public java.lang.String uin;
    public java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.sso.Tag> vTag;

    public Package() {
        this.shVer = (short) 0;
        this.eCmd = 0;
        this.strSubCmd = "";
        this.iSeqNo = 0;
        this.cEncodeType = (byte) 0;
        this.sAppId = "";
        this.uin = "";
        this.head = null;
        this.busiBuff = null;
        this.vTag = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "sosomap.Package";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48703e) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.shVer, "shVer");
        kVar.a(this.eCmd, "eCmd");
        kVar.a(this.strSubCmd, "strSubCmd");
        kVar.a(this.iSeqNo, "iSeqNo");
        kVar.a(this.cEncodeType, "cEncodeType");
        kVar.a(this.sAppId, "sAppId");
        kVar.a(this.uin, "uin");
        kVar.a(this.head, "head");
        kVar.a(this.busiBuff, "busiBuff");
        kVar.a((java.util.Collection) this.vTag, "vTag");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.shVer, true);
        kVar.a(this.eCmd, true);
        kVar.a(this.strSubCmd, true);
        kVar.a(this.iSeqNo, true);
        kVar.a(this.cEncodeType, true);
        kVar.a(this.sAppId, true);
        kVar.a(this.uin, true);
        kVar.a(this.head, true);
        kVar.a(this.busiBuff, true);
        kVar.a((java.util.Collection) this.vTag, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mapsdk.core.components.protocol.jce.sso.Package r47 = (com.tencent.mapsdk.core.components.protocol.jce.sso.Package) obj;
        return com.tencent.mapsdk.internal.q.a(this.shVer, r47.shVer) && com.tencent.mapsdk.internal.q.a(this.eCmd, r47.eCmd) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strSubCmd, (java.lang.Object) r47.strSubCmd) && com.tencent.mapsdk.internal.q.a(this.iSeqNo, r47.iSeqNo) && com.tencent.mapsdk.internal.q.a(this.cEncodeType, r47.cEncodeType) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.sAppId, (java.lang.Object) r47.sAppId) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.uin, (java.lang.Object) r47.uin) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.head, (java.lang.Object) r47.head) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.busiBuff, (java.lang.Object) r47.busiBuff) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.vTag, (java.lang.Object) r47.vTag);
    }

    public final byte[] getBusiBuff() {
        return this.busiBuff;
    }

    public final byte[] getHead() {
        return this.head;
    }

    public final int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.shVer = mVar.a(this.shVer, 0, true);
        this.eCmd = mVar.a(this.eCmd, 1, true);
        this.strSubCmd = mVar.b(2, true);
        this.iSeqNo = mVar.a(this.iSeqNo, 3, false);
        this.cEncodeType = mVar.a(this.cEncodeType, 4, false);
        this.sAppId = mVar.b(5, false);
        this.uin = mVar.b(6, false);
        if (f48700b == null) {
            f48700b = r0;
            byte[] bArr = {0};
        }
        this.head = mVar.c(7, false);
        if (f48701c == null) {
            f48701c = r0;
            byte[] bArr2 = {0};
        }
        this.busiBuff = mVar.c(8, false);
        if (f48702d == null) {
            f48702d = new java.util.ArrayList<>();
            f48702d.add(new com.tencent.mapsdk.core.components.protocol.jce.sso.Tag());
        }
        this.vTag = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48702d, 9, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.shVer, 0);
        nVar.a(this.eCmd, 1);
        nVar.a(this.strSubCmd, 2);
        nVar.a(this.iSeqNo, 3);
        nVar.a(this.cEncodeType, 4);
        java.lang.String str = this.sAppId;
        if (str != null) {
            nVar.a(str, 5);
        }
        java.lang.String str2 = this.uin;
        if (str2 != null) {
            nVar.a(str2, 6);
        }
        byte[] bArr = this.head;
        if (bArr != null) {
            nVar.a(bArr, 7);
        }
        byte[] bArr2 = this.busiBuff;
        if (bArr2 != null) {
            nVar.a(bArr2, 8);
        }
        java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.sso.Tag> arrayList = this.vTag;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 9);
        }
    }

    public Package(short s17, int i17, java.lang.String str, int i18, byte b17, java.lang.String str2, java.lang.String str3, byte[] bArr, byte[] bArr2, java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.sso.Tag> arrayList) {
        this.shVer = s17;
        this.eCmd = i17;
        this.strSubCmd = str;
        this.iSeqNo = i18;
        this.cEncodeType = b17;
        this.sAppId = str2;
        this.uin = str3;
        this.head = bArr;
        this.busiBuff = bArr2;
        this.vTag = arrayList;
    }
}
