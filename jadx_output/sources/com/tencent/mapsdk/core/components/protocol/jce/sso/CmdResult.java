package com.tencent.mapsdk.core.components.protocol.jce.sso;

/* loaded from: classes13.dex */
public final class CmdResult extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f48696a = true;
    public int iErrCode;
    public int iSubErrCode;
    public java.lang.String strErrDesc;

    public CmdResult() {
        this.iErrCode = 0;
        this.strErrDesc = "";
        this.iSubErrCode = 0;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "sosomap.CmdResult";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48696a) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.iErrCode, "iErrCode");
        kVar.a(this.strErrDesc, "strErrDesc");
        kVar.a(this.iSubErrCode, "iSubErrCode");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.iErrCode, true);
        kVar.a(this.strErrDesc, true);
        kVar.a(this.iSubErrCode, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult cmdResult = (com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult) obj;
        return com.tencent.mapsdk.internal.q.a(this.iErrCode, cmdResult.iErrCode) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strErrDesc, (java.lang.Object) cmdResult.strErrDesc) && com.tencent.mapsdk.internal.q.a(this.iSubErrCode, cmdResult.iSubErrCode);
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
        this.iErrCode = mVar.a(this.iErrCode, 0, true);
        this.strErrDesc = mVar.b(1, true);
        this.iSubErrCode = mVar.a(this.iSubErrCode, 2, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.iErrCode, 0);
        nVar.a(this.strErrDesc, 1);
        nVar.a(this.iSubErrCode, 2);
    }

    public CmdResult(int i17, java.lang.String str, int i18) {
        this.iErrCode = i17;
        this.strErrDesc = str;
        this.iSubErrCode = i18;
    }
}
