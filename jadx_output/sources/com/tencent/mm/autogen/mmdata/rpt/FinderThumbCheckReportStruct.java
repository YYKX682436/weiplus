package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderThumbCheckReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f57912d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f57913e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f57914f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f57915g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f57916h = 0;

    @Override // jx3.a
    public int g() {
        return 26304;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57912d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57913e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57914f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57915g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57916h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ThumbTimeStamp:");
        stringBuffer.append(this.f57912d);
        stringBuffer.append("\r\nCheckThumbDuration:");
        stringBuffer.append(this.f57913e);
        stringBuffer.append("\r\nCoverTimeStamp:");
        stringBuffer.append(this.f57914f);
        stringBuffer.append("\r\nUseAlgorithmCheckBlackFrame:");
        stringBuffer.append(this.f57915g);
        stringBuffer.append("\r\nReplaceUserDefaultThumb:");
        stringBuffer.append(this.f57916h);
        return stringBuffer.toString();
    }
}
