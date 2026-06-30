package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.bb f105424d = new com.tencent.mm.plugin.finder.extension.reddot.bb();

    public bb() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb _info = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(_info, "_info");
        boolean a17 = com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(_info.getType()));
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "[ctrlInfoAtPathFillterList] teenMode fill reslut:" + a17);
        return java.lang.Boolean.valueOf(a17);
    }
}
