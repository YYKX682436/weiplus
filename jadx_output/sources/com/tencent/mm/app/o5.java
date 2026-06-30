package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class o5 extends com.tencent.mm.app.l5 {

    /* renamed from: b, reason: collision with root package name */
    public final int f53562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f53563c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53564d;

    public o5(int i17, java.lang.String str, java.lang.String str2) {
        super(null);
        this.f53562b = i17;
        this.f53563c = str;
        this.f53564d = str2;
    }

    @Override // com.tencent.mm.app.l5
    public void a() {
        java.lang.String str = this.f53564d;
        java.lang.String str2 = this.f53505a;
        java.lang.String str3 = this.f53563c;
        int i17 = this.f53562b;
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        } else {
            if (i17 != 6) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        }
    }
}
