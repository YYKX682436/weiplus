package ci5;

/* loaded from: classes12.dex */
public final class r implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41777b;

    public r(ci5.b0 b0Var, java.lang.String str) {
        this.f41776a = b0Var;
        this.f41777b = str;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        dn.m mVar = (dn.m) ((java.util.LinkedHashMap) this.f41776a.f41720f).get(this.f41777b);
        if (mVar == null) {
            return;
        }
        mVar.f241787f = null;
    }
}
