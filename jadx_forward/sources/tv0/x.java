package tv0;

/* loaded from: classes5.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f503783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(tv0.j0 j0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
        super(0);
        this.f503782d = j0Var;
        this.f503783e = c4181x2248e1a3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float width;
        int width2;
        tv0.j0 j0Var = this.f503782d;
        yw0.p m76 = j0Var.m7();
        m76.f548113c = yw0.o.f548110e;
        ((yw0.l) m76.f548120a).a();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f503783e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o17 = c4181x2248e1a3.o1();
        java.lang.Float valueOf = o17 != null ? java.lang.Float.valueOf((float) o17.f129896b) : null;
        if (valueOf != null) {
            float floatValue = valueOf.floatValue();
            yw0.b n76 = j0Var.n7();
            n76.f548059d = floatValue;
            yw0.l lVar = (yw0.l) n76.f548120a;
            lVar.f548102a.f548104a.requestLayout();
            float f17 = n76.f548059d;
            float f18 = n76.f548062g;
            float f19 = n76.f548063h;
            boolean z17 = f18 / f19 < f17;
            android.graphics.RectF rectF = n76.f548060e;
            if (z17) {
                int i17 = n76.f548057b;
                float f27 = f18 - (i17 * 2);
                if (f27 > 0.0f) {
                    float f28 = f27 / f17;
                    float f29 = (f19 - f28) / 2.0f;
                    float f37 = i17;
                    rectF.set(f37, f29, f27 + f37, f28 + f29);
                }
            } else {
                int i18 = n76.f548058c;
                float f38 = f19 - (i18 * 2);
                if (f38 > 0.0f) {
                    float f39 = f17 * f38;
                    float f47 = (f18 - f39) / 2.0f;
                    float f48 = i18;
                    rectF.set(f47, f48, f39 + f47, f38 + f48);
                }
            }
            lVar.a();
            j0Var.f503745y.set(j0Var.r7());
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o18 = c4181x2248e1a3.o1();
        java.lang.Float valueOf2 = o18 != null ? java.lang.Float.valueOf((float) o18.f129896b) : null;
        if (valueOf2 != null) {
            float floatValue2 = valueOf2.floatValue();
            android.view.ViewGroup w76 = j0Var.w7();
            if (floatValue2 < j0Var.u7()) {
                width = j0Var.r7().height();
                width2 = w76.getHeight();
            } else {
                width = j0Var.r7().width();
                width2 = w76.getWidth();
            }
            j0Var.B = width / width2;
        }
        p3325xe03a0797.p3326xc267989b.l.d(j0Var.m158345xefc66565(), null, null, new tv0.w(j0Var, c4181x2248e1a3, null), 3, null);
        return jz5.f0.f384359a;
    }
}
