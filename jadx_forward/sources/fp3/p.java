package fp3;

/* loaded from: classes9.dex */
public class p implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp3.q f346859b;

    public p(fp3.q qVar, int i17) {
        this.f346859b = qVar;
        this.f346858a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        fp3.q qVar = this.f346859b;
        dp3.o oVar = (dp3.o) ((java.util.ArrayList) qVar.f346860d.f234388g).get(this.f346858a);
        if (oVar != null) {
            qVar.f346860d.V6(oVar.f323757d, oVar.A, 1);
        }
    }
}
