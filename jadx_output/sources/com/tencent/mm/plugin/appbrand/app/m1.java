package com.tencent.mm.plugin.appbrand.app;

@j95.b
/* loaded from: classes7.dex */
public final class m1 extends i95.w implements bf.i {
    @Override // bf.i
    public void Oa(bf.h callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.app.j1.class, new com.tencent.mm.plugin.appbrand.app.l1(this, callback));
    }

    @Override // bf.i
    public android.graphics.drawable.Drawable S7() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getDrawable(com.tencent.mm.R.drawable.bhm);
    }

    @Override // bf.i
    public java.lang.String fi() {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.app.k1.class);
        if (iPCString != null) {
            return iPCString.f68406d;
        }
        return null;
    }
}
