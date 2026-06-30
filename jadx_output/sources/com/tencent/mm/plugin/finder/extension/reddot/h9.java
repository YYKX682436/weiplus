package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.h9 f105556d = new com.tencent.mm.plugin.finder.extension.reddot.h9();

    public h9() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb it = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && !com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(it.getType()));
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[disposeRedDotAtPathIgnoreList]  match,青少年模式且只看关注的模式下只dispose关注的红点展示, ctrlType:" + it.getType());
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
