package nf;

/* loaded from: classes7.dex */
public class h implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf.k f418130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf.g f418131b;

    public h(nf.g gVar, nf.k kVar) {
        this.f418131b = gVar;
        this.f418130a = kVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        this.f418131b.f418117c.remove(this);
        return this.f418130a.a(i17, i18, intent);
    }
}
