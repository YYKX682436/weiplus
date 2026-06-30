package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SystemServiceHookStatusStruct extends jx3.a {

    /* renamed from: n, reason: collision with root package name */
    public int f61038n;

    /* renamed from: o, reason: collision with root package name */
    public long f61039o;

    /* renamed from: p, reason: collision with root package name */
    public int f61040p;

    /* renamed from: d, reason: collision with root package name */
    public int f61028d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61029e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61030f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61031g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61032h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f61033i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61034j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61035k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61036l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f61037m = "";

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f61041q = "";

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f61042r = "";

    @Override // jx3.a
    public int g() {
        return 24550;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61028d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61029e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61030f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61031g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61032h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61033i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61034j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61035k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61036l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61037m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61038n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61039o);
        stringBuffer.append(",");
        stringBuffer.append(this.f61040p);
        stringBuffer.append(",");
        stringBuffer.append(this.f61041q);
        stringBuffer.append(",");
        stringBuffer.append(this.f61042r);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("HookResult:");
        stringBuffer.append(this.f61028d);
        stringBuffer.append("\r\nServiceName:");
        stringBuffer.append(this.f61029e);
        stringBuffer.append("\r\nMethodName:");
        stringBuffer.append(this.f61030f);
        stringBuffer.append("\r\nCurrentActivity:");
        stringBuffer.append(this.f61031g);
        stringBuffer.append("\r\nMethodStack:");
        stringBuffer.append(this.f61032h);
        stringBuffer.append("\r\nMethodTimeStamp:");
        stringBuffer.append(this.f61033i);
        stringBuffer.append("\r\nMethodOffsetTime:");
        stringBuffer.append(this.f61034j);
        stringBuffer.append("\r\nIsPermissionGranted:0\r\nProcessName:");
        stringBuffer.append(this.f61035k);
        stringBuffer.append("\r\nErrStack:");
        stringBuffer.append(this.f61036l);
        stringBuffer.append("\r\nRequirePermission:");
        stringBuffer.append(this.f61037m);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f61038n);
        stringBuffer.append("\r\nhookDuration:");
        stringBuffer.append(this.f61039o);
        stringBuffer.append("\r\nhookSuccessCount:");
        stringBuffer.append(this.f61040p);
        stringBuffer.append("\r\nbusinessTypeByStack:");
        stringBuffer.append(this.f61041q);
        stringBuffer.append("\r\nbussinessTypeByActivity:");
        stringBuffer.append(this.f61042r);
        stringBuffer.append("\r\nisBusinessMatch:0");
        return stringBuffer.toString();
    }
}
