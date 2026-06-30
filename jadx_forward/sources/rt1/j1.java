package rt1;

/* loaded from: classes7.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(rt1.p1 p1Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f480962d = p1Var;
        this.f480963e = str;
        this.f480964f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rt1.p1 p1Var = this.f480962d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e b17 = p1Var.b();
        java.lang.String oldPlate = this.f480963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldPlate, "oldPlate");
        java.lang.String newPlate = this.f480964f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newPlate, "newPlate");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, b17.f176156d)) {
            b17.a(newPlate);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = b17.f176156d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13026x8642c3d7);
            java.util.ArrayList arrayList = c13026x8642c3d7.f176137d;
            int indexOf = arrayList.indexOf(oldPlate);
            if (indexOf >= 0) {
                arrayList.add(indexOf + 1, newPlate);
                arrayList.remove(indexOf);
            } else {
                arrayList.add(newPlate);
            }
        }
        rt1.b1 b1Var = p1Var.f481006b;
        if (b1Var != null) {
            b1Var.b(p1Var.b().f176156d);
        }
        return jz5.f0.f384359a;
    }
}
