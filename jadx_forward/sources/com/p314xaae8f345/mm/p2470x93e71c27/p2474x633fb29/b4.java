package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes4.dex */
public class b4 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f270775a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a4 f270776b;

    public b4(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a4 a4Var) {
        super(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenshotObserver", "observer  " + str);
        this.f270776b = a4Var;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null || i17 != 8) {
            return;
        }
        java.lang.String str2 = this.f270775a;
        if (str2 == null || !str.equalsIgnoreCase(str2)) {
            this.f270775a = str;
            this.f270776b.a(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenshotObserver", "Send event to listener. ".concat(str));
        }
    }
}
