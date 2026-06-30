package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class f9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f105522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(int[] iArr) {
        super(1);
        this.f105522d = iArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        int[] iArr = this.f105522d;
        return java.lang.Boolean.valueOf(iArr == null || kz5.z.F(iArr, ctrlInfo.getType()));
    }
}
