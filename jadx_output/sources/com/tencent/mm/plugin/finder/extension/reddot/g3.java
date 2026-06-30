package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class g3 implements zy2.da {
    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(ctrInfo);
        if (!jbVar.f1()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderRedDotConverter", "LongVideoReddot before save1 " + jbVar + '}');
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC;
        byte[] byteArray = ctrInfo.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        c17.x(u3Var, new java.lang.String(byteArray, r26.c.f368867c));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }
}
