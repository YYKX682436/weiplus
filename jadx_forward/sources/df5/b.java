package df5;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d f313576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(df5.d dVar) {
        super(0);
        this.f313576d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        df5.d dVar = this.f313576d;
        df5.v vVar = dVar.f313597d;
        if (vVar == null || (i17 = vVar.f313774l - vVar.f313773k) < 0) {
            i17 = 0;
        }
        java.util.Iterator it = ((java.util.ArrayList) dVar.f313599f).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            df5.o1 o1Var = (df5.o1) it.next();
            if (o1Var instanceof df5.m1) {
                df5.m1 m1Var = (df5.m1) o1Var;
                i18 = m1Var.f313700a.f313612b.length() - m1Var.f313700a.f313613c;
                if (i18 >= 0) {
                    i19 += i18;
                }
                i18 = 0;
                i19 += i18;
            } else {
                if (!(o1Var instanceof df5.n1)) {
                    if (!(o1Var instanceof df5.l1)) {
                        throw new jz5.j();
                    }
                    i18 = ((df5.l1) o1Var).f313696a;
                    i19 += i18;
                }
                i18 = 0;
                i19 += i18;
            }
        }
        return java.lang.Integer.valueOf(i17 + i19);
    }
}
