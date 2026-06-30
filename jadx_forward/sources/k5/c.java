package k5;

/* loaded from: classes13.dex */
public class c extends k5.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5.w f385652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f385654g;

    public c(b5.w wVar, java.lang.String str, boolean z17) {
        this.f385652e = wVar;
        this.f385653f = str;
        this.f385654g = z17;
    }

    @Override // k5.d
    public void b() {
        b5.w wVar = this.f385652e;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = wVar.f99430c;
        abstractC1265x5c5aefcc.c();
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((j5.g0) abstractC1265x5c5aefcc.n()).g(this.f385653f)).iterator();
            while (it.hasNext()) {
                a(wVar, (java.lang.String) it.next());
            }
            abstractC1265x5c5aefcc.h();
            abstractC1265x5c5aefcc.f();
            if (this.f385654g) {
                b5.g.a(wVar.f99429b, wVar.f99430c, wVar.f99432e);
            }
        } catch (java.lang.Throwable th6) {
            abstractC1265x5c5aefcc.f();
            throw th6;
        }
    }
}
