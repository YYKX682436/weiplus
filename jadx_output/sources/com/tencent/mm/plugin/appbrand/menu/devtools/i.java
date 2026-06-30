package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {
    public i(com.tencent.mm.plugin.appbrand.menu.devtools.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.Thread.sleep(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
