package jo4;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f382435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f382436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f382437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f382435d = h0Var;
        this.f382436e = lVar;
        this.f382437f = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b = (com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b) this.f382435d.f391656d;
        if (c25659xe2dfb08b != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f382437f;
            int i17 = f0Var.f391649d;
            int m96495x959526a8 = c25659xe2dfb08b.m96495x959526a8();
            if (i17 < m96495x959526a8) {
                i17 = m96495x959526a8;
            }
            f0Var.f391649d = i17;
        }
        this.f382436e.mo146xb9724478(java.lang.Float.valueOf(floatValue));
        return jz5.f0.f384359a;
    }
}
