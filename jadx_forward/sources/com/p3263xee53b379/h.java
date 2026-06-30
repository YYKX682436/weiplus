package com.p3263xee53b379;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p3263xee53b379.a.f302225s.sendEmptyMessageDelayed(1001, 800L);
            py5.b bVar = new py5.b(com.p3263xee53b379.a.f302224r, qy5.b.b(com.p3263xee53b379.a.m()));
            bVar.a();
            java.lang.String str = bVar.f440630a;
            android.os.Handler handler = com.p3263xee53b379.a.f302225s;
            if (handler != null) {
                android.os.Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 1002;
                obtainMessage.obj = str;
                com.p3263xee53b379.a.f302225s.removeMessages(1001);
                com.p3263xee53b379.a.f302225s.sendMessage(obtainMessage);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
