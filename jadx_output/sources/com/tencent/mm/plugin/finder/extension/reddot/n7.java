package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.n7 f105726d = new com.tencent.mm.plugin.finder.extension.reddot.n7();

    public n7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("FinderTimelineRedDotHelper", "dropTimelineRedDot 1:".concat(path));
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0(path);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(path);
        nk6.N(path);
        if (I0 != null) {
            com.tencent.mm.plugin.finder.report.x2.l(com.tencent.mm.plugin.finder.report.x2.f125429a, L0, I0, 13, null, 0L, 24, null);
        }
        com.tencent.mars.xlog.Log.i("FinderTimelineRedDotHelper", "dropTimelineRedDot 2:".concat(path));
        return jz5.f0.f302826a;
    }
}
