package com.tencent.mm.app;

/* loaded from: classes13.dex */
public abstract class s2 implements com.tencent.mm.app.t2 {
    com.tencent.mm.app.t2 wrapper = new com.tencent.mm.app.r2(this);

    public void alive() {
        com.tencent.mm.app.w.INSTANCE.a(this.wrapper);
    }

    public void dead() {
        com.tencent.mm.app.w.INSTANCE.p(this.wrapper);
    }

    public android.os.Handler getHandler() {
        return null;
    }
}
