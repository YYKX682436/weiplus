package hi4;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.j f363080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hi4.j jVar) {
        super(0);
        this.f363080d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String str;
        hj4.b i18 = ai4.m0.f86706a.i();
        if (i18.a() != 0 && ((java.lang.Number) ((jz5.n) this.f363080d.f363084d).mo141623x754a37bb()).intValue() != 0) {
            if (i18.f363194b > 0) {
                str = i18.f363195c;
            } else {
                hj4.a aVar = i18.f363193a;
                if (aVar == null || (str = aVar.f363192a) == null) {
                    str = "";
                }
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(str)) {
                i17 = 1;
                return java.lang.Integer.valueOf(i17);
            }
        }
        i17 = 0;
        return java.lang.Integer.valueOf(i17);
    }
}
