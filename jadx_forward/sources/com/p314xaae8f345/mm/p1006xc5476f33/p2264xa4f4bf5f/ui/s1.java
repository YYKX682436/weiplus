package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 f255790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var, android.content.Context context) {
        super(0);
        this.f255790d = w1Var;
        this.f255791e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = this.f255790d;
        final java.lang.String m71911x7520bed6 = w1Var.m71911x7520bed6();
        final android.content.Context context = this.f255791e;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i1(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.MultipleStatusCardView$buildItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 1) {
                    return new ij4.c();
                }
                bi4.m0 m71903x49981788 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.this.m71903x49981788();
                java.lang.String str = m71911x7520bed6;
                java.util.ArrayList<java.lang.String> m71909x2ab3ae82 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.this.m71909x2ab3ae82();
                if (m71909x2ab3ae82 == null) {
                    m71909x2ab3ae82 = new java.util.ArrayList<>();
                }
                return new ij4.h(m71903x49981788, str, m71909x2ab3ae82, context, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1.this.m71905x178658e9());
            }
        }, new java.util.ArrayList());
    }
}
