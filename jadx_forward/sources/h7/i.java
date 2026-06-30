package h7;

/* loaded from: classes13.dex */
public class i implements t6.p {

    /* renamed from: b, reason: collision with root package name */
    public final t6.p f360876b;

    public i(t6.p pVar) {
        q7.n.b(pVar);
        this.f360876b = pVar;
    }

    @Override // t6.p
    public w6.z0 a(android.content.Context context, w6.z0 z0Var, int i17, int i18) {
        h7.f fVar = (h7.f) z0Var.get();
        w6.z0 eVar = new d7.e(fVar.f360866d.f360865a.f360893l, com.p147xb1cd08cc.p148x5de23a5.c.b(context).f125455d);
        t6.p pVar = this.f360876b;
        w6.z0 a17 = pVar.a(context, eVar, i17, i18);
        if (!eVar.equals(a17)) {
            eVar.mo14474x408b7293();
        }
        fVar.f360866d.f360865a.c(pVar, (android.graphics.Bitmap) a17.get());
        return z0Var;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f360876b.b(messageDigest);
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof h7.i) {
            return this.f360876b.equals(((h7.i) obj).f360876b);
        }
        return false;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return this.f360876b.hashCode();
    }
}
