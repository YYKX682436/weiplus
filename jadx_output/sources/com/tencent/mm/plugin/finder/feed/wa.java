package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(int i17, int i18) {
        super(0);
        this.f110963d = i17;
        this.f110964e = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127807la).getValue()).r()).intValue();
        if (intValue >= 1) {
            int i17 = this.f110964e;
            if ((intValue == 2 && this.f110963d == 155) || intValue == 3) {
                return new cw2.f8(i17);
            }
        }
        return null;
    }
}
