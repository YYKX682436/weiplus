package gx0;

/* loaded from: classes5.dex */
public final class wb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f358663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f358664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(gx0.ac acVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f358662d = acVar;
        this.f358663e = h0Var;
        this.f358664f = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ex0.q vm6 = (ex0.q) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vm6, "vm");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = vm6.f338695q;
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.N1(c4189xeb0c3951, D);
        }
        vm6.H();
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4189xeb0c3951.D();
        java.lang.String N1 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.N1(c4189xeb0c3951, D2) : null;
        if (N1 != null) {
            c4189xeb0c3951.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4189xeb0c3951.D();
            java.lang.String z17 = D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.z1(c4189xeb0c3951, D3) : null;
            if (z17 != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = vm6.f338700a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                this.f358662d.h8((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713, N1, z17);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f358663e;
                if (h0Var.f391656d == null) {
                    h0Var.f391656d = N1;
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, N1)) {
                    this.f358664f.f391645d = true;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
