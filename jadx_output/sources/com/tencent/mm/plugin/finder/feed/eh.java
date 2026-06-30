package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class eh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f06.g f106651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f106652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f106653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(f06.g gVar, r45.v71 v71Var, r45.h32 h32Var, zy2.i5 i5Var) {
        super(0);
        this.f106651d = gVar;
        this.f106652e = v71Var;
        this.f106653f = h32Var;
        this.f106654g = i5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((yz5.a) this.f106651d).invoke();
        if (com.tencent.mm.plugin.finder.feed.jh.f107102b != null) {
            r45.aa2 aa2Var = (r45.aa2) this.f106652e.getCustom(2);
            int i17 = 3;
            if (aa2Var != null && aa2Var.getInteger(3) == 2) {
                i17 = 4;
            } else {
                r45.h32 h32Var = this.f106653f;
                if (h32Var.getInteger(7) != 1) {
                    i17 = h32Var.getInteger(7) == 3 ? 10 : h32Var.getInteger(1) == 1 ? 5 : 8;
                }
            }
            this.f106654g.a(java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.finder.feed.jh.f107102b = null;
        }
        return jz5.f0.f302826a;
    }
}
