package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f70166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f70167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0.g f70168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f70169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f70170h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70171i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(yz5.p pVar, float f17, i0.g gVar, long j17, boolean z17, java.lang.String str, d0.z zVar) {
        super(2);
        this.f70166d = pVar;
        this.f70167e = f17;
        this.f70168f = gVar;
        this.f70169g = j17;
        this.f70170h = z17;
        this.f70171i = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        this.f70166d.invoke(oVar, 0);
        float f17 = this.f70167e;
        if (f17 < 0.0f || f17 >= 100.0f) {
            if (this.f70170h) {
                java.lang.String str = this.f70171i;
                if (!kotlin.jvm.internal.o.b(str, "")) {
                    n0.y0 y0Var2 = (n0.y0) oVar;
                    y0Var2.U(631822475);
                    int i17 = z0.t.f468922q1;
                    int i18 = z0.d.f468903a;
                    z0.d dVar = z0.a.f468896h;
                    boolean z17 = androidx.compose.ui.platform.f3.f10562a;
                    com.tencent.mm.mj_template.sns.compose.widget.a7.j(new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d), str, y0Var2, 0, 0);
                    y0Var2.o(false);
                }
            }
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(631822725);
            y0Var3.o(false);
        } else {
            n0.y0 y0Var4 = (n0.y0) oVar;
            y0Var4.U(631822220);
            com.tencent.mm.mj_template.sns.compose.widget.a7.i(this.f70167e, this.f70168f, this.f70169g, null, y0Var4, 0, 8);
            y0Var4.o(false);
        }
        return jz5.f0.f302826a;
    }
}
