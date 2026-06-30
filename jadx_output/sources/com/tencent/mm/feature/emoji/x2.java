package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class x2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f66547f;

    public x2(com.tencent.mm.feature.emoji.c4 c4Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.f66542a = c4Var;
        this.f66543b = context;
        this.f66544c = str;
        this.f66545d = str2;
        this.f66546e = str3;
        this.f66547f = j17;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i(this.f66542a.f66207d, "OpenLiteApp expose fail");
        this.f66542a.Di(this.f66543b, this.f66544c, this.f66545d, this.f66546e, this.f66547f);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f66542a.f66207d, "OpenLiteApp expose success");
    }
}
