package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.console.d0(this), true).c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
