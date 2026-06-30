package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f217625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow2.h f217626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f217628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(float f17, ow2.h hVar, in5.s0 s0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833) {
        super(0);
        this.f217625d = f17;
        this.f217626e = hVar;
        this.f217627f = s0Var;
        this.f217628g = z17;
        this.C = c15477xbd78f833;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f217625d;
        boolean z17 = f17 == 1.0f;
        ow2.h hVar = this.f217626e;
        if (z17) {
            in5.s0 s0Var = this.f217627f;
            hVar.f(s0Var, this.f217628g);
            this.C.b(s0Var);
        } else {
            hVar.h(f17);
        }
        return jz5.f0.f384359a;
    }
}
