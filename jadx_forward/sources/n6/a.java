package n6;

/* loaded from: classes16.dex */
public class a implements m6.c {

    /* renamed from: a, reason: collision with root package name */
    public n6.b f416701a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f416702b;

    @Override // m6.c
    /* renamed from: getDuration */
    public int mo146856x51e8b0a() {
        try {
            m6.b bVar = ((m6.e) this.f416702b.get(r0.size() - 1)).f405882a;
            return "continuous".equals(bVar.f405874a) ? bVar.f405875b + bVar.f405876c : bVar.f405875b + 22;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // m6.c
    /* renamed from: getVersion */
    public int mo146857x52c258a2() {
        this.f416701a.getClass();
        return 1;
    }
}
