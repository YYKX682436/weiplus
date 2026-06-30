package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppPluginAutoUpdateStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f62337e;

    /* renamed from: f, reason: collision with root package name */
    public cm.j f62338f;

    /* renamed from: g, reason: collision with root package name */
    public long f62339g;

    /* renamed from: i, reason: collision with root package name */
    public cm.k f62341i;

    /* renamed from: l, reason: collision with root package name */
    public long f62344l;

    /* renamed from: m, reason: collision with root package name */
    public long f62345m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62336d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62340h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62342j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62343k = "";

    @Override // jx3.a
    public int g() {
        return 19280;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62336d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62337e);
        stringBuffer.append(",");
        cm.j jVar = this.f62338f;
        stringBuffer.append(jVar != null ? jVar.f43113d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62339g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62340h);
        stringBuffer.append(",0,");
        cm.k kVar = this.f62341i;
        stringBuffer.append(kVar != null ? kVar.f43121d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62342j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62343k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62344l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62345m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62336d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62337e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62338f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62339g);
        stringBuffer.append("\r\nPluginAppid:");
        stringBuffer.append(this.f62340h);
        stringBuffer.append("\r\nPluginVersion:0\r\nPluginState:");
        stringBuffer.append(this.f62341i);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62342j);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62343k);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62344l);
        stringBuffer.append("\r\nupdateScene:0\r\nupdateResult:");
        stringBuffer.append(this.f62345m);
        return stringBuffer.toString();
    }
}
