package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class o5 extends com.p314xaae8f345.mm.app.l5 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f135096c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f135097d;

    public o5(int i17, java.lang.String str, java.lang.String str2) {
        super(null);
        this.f135095b = i17;
        this.f135096c = str;
        this.f135097d = str2;
    }

    @Override // com.p314xaae8f345.mm.app.l5
    public void a() {
        java.lang.String str = this.f135097d;
        java.lang.String str2 = this.f135038a;
        java.lang.String str3 = this.f135096c;
        int i17 = this.f135095b;
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        } else if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        } else {
            if (i17 != 6) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", str3, str2, str);
        }
    }
}
