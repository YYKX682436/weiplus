package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class f8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f105521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(java.lang.String str, int i17, yz5.l lVar) {
        super(1);
        this.f105519d = str;
        this.f105520e = i17;
        this.f105521f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.finder.extension.reddot.jb it = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.F0(this.f105519d)) {
            int i17 = it.field_ctrInfo.f388487e;
            int i18 = this.f105520e;
            if ((i17 == i18 || i18 == Integer.MIN_VALUE) && ((java.lang.Boolean) this.f105521f.invoke(it)).booleanValue()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
