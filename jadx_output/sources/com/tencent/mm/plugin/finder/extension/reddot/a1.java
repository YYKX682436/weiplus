package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, int i17, java.lang.String str2) {
        super(1);
        this.f105334d = str;
        this.f105335e = i17;
        this.f105336f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        r45.f03 it = (r45.f03) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f105334d;
        boolean z17 = (str.length() > 0) && kz5.n0.O(com.tencent.mm.plugin.finder.extension.reddot.e1.f105481g, it.f373892i) && (i17 = this.f105335e) != 3 && i17 != 6;
        if (z17) {
            com.tencent.mars.xlog.Log.w(this.f105336f, it.f373892i + " must be remove for account block! " + str);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
