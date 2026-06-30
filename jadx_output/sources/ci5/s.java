package ci5;

/* loaded from: classes12.dex */
public final class s implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41779b;

    public s(ci5.b0 b0Var, java.lang.String str) {
        this.f41778a = b0Var;
        this.f41779b = str;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        dn.m mVar = (dn.m) ((java.util.LinkedHashMap) this.f41778a.f41720f).get(this.f41779b);
        if (mVar == null) {
            return;
        }
        mVar.f241787f = null;
    }
}
