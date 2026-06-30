package rt1;

/* loaded from: classes7.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(rt1.p1 p1Var, java.lang.String str) {
        super(0);
        this.f480939d = p1Var;
        this.f480940e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        rt1.p1 p1Var = this.f480939d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = p1Var.b().f176156d;
        if (c13026x8642c3d7 != null && (arrayList = c13026x8642c3d7.f176137d) != null) {
            arrayList.remove(this.f480940e);
        }
        rt1.b1 b1Var = p1Var.f481006b;
        if (b1Var != null) {
            b1Var.b(p1Var.b().f176156d);
        }
        return jz5.f0.f384359a;
    }
}
