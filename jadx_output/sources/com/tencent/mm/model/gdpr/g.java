package com.tencent.mm.model.gdpr;

/* loaded from: classes7.dex */
public abstract class g {
    public static boolean a() {
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (n17) {
            return new com.tencent.mm.model.gdpr.f(null).invoke(iPCVoid).f68400d;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCVoid, com.tencent.mm.model.gdpr.f.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }
}
