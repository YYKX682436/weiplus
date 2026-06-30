package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp */
/* loaded from: classes13.dex */
public final class C4367x94692e8a extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: iFileSize */
    public int f17240xa8141726;

    /* renamed from: iFileUpdated */
    public int f17241xee7a1b76;

    /* renamed from: iRet */
    public int f17242x30fb78;

    /* renamed from: iVersion */
    public int f17243x13891c2f;

    /* renamed from: sMd5 */
    public java.lang.String f17244x35740b;

    /* renamed from: sName */
    public java.lang.String f17245x6797d9e;

    /* renamed from: sUpdateUrl */
    public java.lang.String f17246xc04164b3;

    public C4367x94692e8a() {
        this.f17245x6797d9e = "";
        this.f17242x30fb78 = 0;
        this.f17243x13891c2f = 0;
        this.f17241xee7a1b76 = 0;
        this.f17246xc04164b3 = "";
        this.f17244x35740b = "";
        this.f17240xa8141726 = 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "MapConfProtocol.FileUpdateRsp";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17245x6797d9e = mVar.b(0, true);
        this.f17242x30fb78 = mVar.a(this.f17242x30fb78, 1, true);
        this.f17243x13891c2f = mVar.a(this.f17243x13891c2f, 2, true);
        this.f17241xee7a1b76 = mVar.a(this.f17241xee7a1b76, 3, false);
        this.f17246xc04164b3 = mVar.b(4, false);
        this.f17244x35740b = mVar.b(5, false);
        this.f17240xa8141726 = mVar.a(this.f17240xa8141726, 6, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: toString */
    public final java.lang.String mo36075x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileUpdateRsp{sName='");
        stringBuffer.append(this.f17245x6797d9e);
        stringBuffer.append("', iRet=");
        stringBuffer.append(this.f17242x30fb78);
        stringBuffer.append(", iVersion=");
        stringBuffer.append(this.f17243x13891c2f);
        stringBuffer.append(", iFileUpdated=");
        stringBuffer.append(this.f17241xee7a1b76);
        stringBuffer.append(", sUpdateUrl='");
        stringBuffer.append(this.f17246xc04164b3);
        stringBuffer.append("', sMd5='");
        stringBuffer.append(this.f17244x35740b);
        stringBuffer.append("', iFileSize=");
        stringBuffer.append(this.f17240xa8141726);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17245x6797d9e, 0);
        nVar.a(this.f17242x30fb78, 1);
        nVar.a(this.f17243x13891c2f, 2);
        nVar.a(this.f17241xee7a1b76, 3);
        java.lang.String str = this.f17246xc04164b3;
        if (str != null) {
            nVar.a(str, 4);
        }
        java.lang.String str2 = this.f17244x35740b;
        if (str2 != null) {
            nVar.a(str2, 5);
        }
        nVar.a(this.f17240xa8141726, 6);
    }

    public C4367x94692e8a(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, int i27) {
        this.f17245x6797d9e = str;
        this.f17242x30fb78 = i17;
        this.f17243x13891c2f = i18;
        this.f17241xee7a1b76 = i19;
        this.f17246xc04164b3 = str2;
        this.f17244x35740b = str3;
        this.f17240xa8141726 = i27;
    }
}
