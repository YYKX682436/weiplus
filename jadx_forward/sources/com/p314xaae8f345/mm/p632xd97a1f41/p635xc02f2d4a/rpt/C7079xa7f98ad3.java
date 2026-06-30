package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct */
/* loaded from: classes7.dex */
public final class C7079xa7f98ad3 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f143870e;

    /* renamed from: f, reason: collision with root package name */
    public cm.j f143871f;

    /* renamed from: g, reason: collision with root package name */
    public long f143872g;

    /* renamed from: i, reason: collision with root package name */
    public cm.k f143874i;

    /* renamed from: l, reason: collision with root package name */
    public long f143877l;

    /* renamed from: m, reason: collision with root package name */
    public long f143878m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143869d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143873h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f143875j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f143876k = "";

    @Override // jx3.a
    public int g() {
        return 19280;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143869d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143870e);
        stringBuffer.append(",");
        cm.j jVar = this.f143871f;
        stringBuffer.append(jVar != null ? jVar.f124646d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143872g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143873h);
        stringBuffer.append(",0,");
        cm.k kVar = this.f143874i;
        stringBuffer.append(kVar != null ? kVar.f124654d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143875j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143876k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143877l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f143878m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143869d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143870e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143871f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143872g);
        stringBuffer.append("\r\nPluginAppid:");
        stringBuffer.append(this.f143873h);
        stringBuffer.append("\r\nPluginVersion:0\r\nPluginState:");
        stringBuffer.append(this.f143874i);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f143875j);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f143876k);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143877l);
        stringBuffer.append("\r\nupdateScene:0\r\nupdateResult:");
        stringBuffer.append(this.f143878m);
        return stringBuffer.toString();
    }
}
