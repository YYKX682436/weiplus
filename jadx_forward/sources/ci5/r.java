package ci5;

/* loaded from: classes12.dex */
public final class r implements ek4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123310b;

    public r(ci5.b0 b0Var, java.lang.String str) {
        this.f123309a = b0Var;
        this.f123310b = str;
    }

    @Override // ek4.y
    public void a(int i17, dn.h hVar) {
        dn.m mVar = (dn.m) ((java.util.LinkedHashMap) this.f123309a.f123253f).get(this.f123310b);
        if (mVar == null) {
            return;
        }
        mVar.f323320f = null;
    }
}
