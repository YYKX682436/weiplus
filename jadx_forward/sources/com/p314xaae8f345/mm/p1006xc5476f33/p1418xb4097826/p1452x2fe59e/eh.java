package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class eh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f06.g f188184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f188185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f188186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f188187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(f06.g gVar, r45.v71 v71Var, r45.h32 h32Var, zy2.i5 i5Var) {
        super(0);
        this.f188184d = gVar;
        this.f188185e = v71Var;
        this.f188186f = h32Var;
        this.f188187g = i5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ((yz5.a) this.f188184d).mo152xb9724478();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188635b != null) {
            r45.aa2 aa2Var = (r45.aa2) this.f188185e.m75936x14adae67(2);
            int i17 = 3;
            if (aa2Var != null && aa2Var.m75939xb282bd08(3) == 2) {
                i17 = 4;
            } else {
                r45.h32 h32Var = this.f188186f;
                if (h32Var.m75939xb282bd08(7) != 1) {
                    i17 = h32Var.m75939xb282bd08(7) == 3 ? 10 : h32Var.m75939xb282bd08(1) == 1 ? 5 : 8;
                }
            }
            this.f188187g.a(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188635b = null;
        }
        return jz5.f0.f384359a;
    }
}
