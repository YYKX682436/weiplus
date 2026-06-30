package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FlutterEngineCreateInfoStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58153e;

    /* renamed from: f, reason: collision with root package name */
    public long f58154f;

    /* renamed from: g, reason: collision with root package name */
    public long f58155g;

    /* renamed from: h, reason: collision with root package name */
    public long f58156h;

    /* renamed from: i, reason: collision with root package name */
    public long f58157i;

    /* renamed from: k, reason: collision with root package name */
    public long f58159k;

    /* renamed from: l, reason: collision with root package name */
    public long f58160l;

    /* renamed from: m, reason: collision with root package name */
    public long f58161m;

    /* renamed from: n, reason: collision with root package name */
    public long f58162n;

    /* renamed from: o, reason: collision with root package name */
    public long f58163o;

    /* renamed from: p, reason: collision with root package name */
    public long f58164p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58152d = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58158j = "";

    @Override // jx3.a
    public int g() {
        return 28393;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58152d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58153e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58154f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58155g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58156h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58157i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58158j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58159k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58160l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58161m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58162n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58163o);
        stringBuffer.append(",0,0,0,0,0,");
        stringBuffer.append(this.f58164p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EngineId:");
        stringBuffer.append(this.f58152d);
        stringBuffer.append("\r\nIsRootEngine:");
        stringBuffer.append(this.f58153e);
        stringBuffer.append("\r\nCreateCost:");
        stringBuffer.append(this.f58154f);
        stringBuffer.append("\r\nSinceEngineGroupCreate:");
        stringBuffer.append(this.f58155g);
        stringBuffer.append("\r\nAllEngineCount:");
        stringBuffer.append(this.f58156h);
        stringBuffer.append("\r\nLiveEngineCount:");
        stringBuffer.append(this.f58157i);
        stringBuffer.append("\r\nRoute:");
        stringBuffer.append(this.f58158j);
        stringBuffer.append("\r\nSnapshotCost:");
        stringBuffer.append(this.f58159k);
        stringBuffer.append("\r\nSnapshotAttach:");
        stringBuffer.append(this.f58160l);
        stringBuffer.append("\r\nSnapshotTimeout:");
        stringBuffer.append(this.f58161m);
        stringBuffer.append("\r\nDetachCost:");
        stringBuffer.append(this.f58162n);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58163o);
        stringBuffer.append("\r\nFirstAttachToView:0\r\nLastDetachFromView:0\r\nLiveTime:0\r\nisEnableImpeller:0\r\nisEnableWideGamut:0\r\nisEnableImageSnapshot:");
        stringBuffer.append(this.f58164p);
        return stringBuffer.toString();
    }
}
