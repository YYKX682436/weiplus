package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class systemAuthorizationStatusStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63162d;

    /* renamed from: e, reason: collision with root package name */
    public long f63163e;

    /* renamed from: f, reason: collision with root package name */
    public long f63164f;

    /* renamed from: g, reason: collision with root package name */
    public long f63165g;

    /* renamed from: h, reason: collision with root package name */
    public long f63166h;

    /* renamed from: i, reason: collision with root package name */
    public long f63167i;

    /* renamed from: j, reason: collision with root package name */
    public long f63168j;

    /* renamed from: k, reason: collision with root package name */
    public long f63169k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f63170l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f63171m;

    @Override // jx3.a
    public int g() {
        return 33203;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63162d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63163e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63164f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63165g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63166h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63167i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63168j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63169k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63170l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63171m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("notificationType:");
        stringBuffer.append(this.f63162d);
        stringBuffer.append("\r\nphotoLibraryStatus:");
        stringBuffer.append(this.f63163e);
        stringBuffer.append("\r\ncameraStatus:");
        stringBuffer.append(this.f63164f);
        stringBuffer.append("\r\ncontactsStatus:");
        stringBuffer.append(this.f63165g);
        stringBuffer.append("\r\nmicrophoneStatus:");
        stringBuffer.append(this.f63166h);
        stringBuffer.append("\r\nlocationStatus:");
        stringBuffer.append(this.f63167i);
        stringBuffer.append("\r\nbluetoothStatus:");
        stringBuffer.append(this.f63168j);
        stringBuffer.append("\r\nhealthKitStatus:");
        stringBuffer.append(this.f63169k);
        stringBuffer.append("\r\ncurrentPrivacyFullStatus:");
        stringBuffer.append(this.f63170l);
        stringBuffer.append("\r\nfloatStatus:");
        stringBuffer.append(this.f63171m);
        return stringBuffer.toString();
    }
}
