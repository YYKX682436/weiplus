package ep3;

/* loaded from: classes.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f337261e = {l75.n0.m145250x3fdc6f77(ep3.a.f337260r, "OrderCommonMsgXml")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f337262d;

    public b(l75.k0 k0Var) {
        super(k0Var, ep3.a.f337260r, "OrderCommonMsgXml", null);
        this.f337262d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: getAll */
    public android.database.Cursor mo78085xb5882a6b() {
        return this.f337262d.B("select * from OrderCommonMsgXml order by msgId desc", null);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        return super.mo880xb970c2b9((ep3.a) f0Var);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String[] strArr) {
        return super.mo9952xce0038c9((ep3.a) f0Var, strArr);
    }
}
