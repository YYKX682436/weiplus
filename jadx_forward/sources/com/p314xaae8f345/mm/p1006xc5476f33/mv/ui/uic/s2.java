package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        super(0);
        this.f232966d = i17;
        this.f232967e = i18;
        this.f232968f = c16668xffb9dd68;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm3.l0 l0Var;
        if (this.f232966d >= 0 && this.f232967e >= 0 && (l0Var = this.f232968f.f232522v) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232968f;
            int i17 = this.f232966d;
            int i18 = this.f232967e;
            java.lang.String str = c16668xffb9dd68.f232507d;
            int i19 = l0Var.f345623c;
            int i27 = l0Var.f345625e;
            if (i17 < i19) {
                l0Var.f345625e = i27 + 1;
            }
            l0Var.f345623c = i17;
            l0Var.f345624d = (int) ((100 * i17) / i18);
        }
        return jz5.f0.f384359a;
    }
}
