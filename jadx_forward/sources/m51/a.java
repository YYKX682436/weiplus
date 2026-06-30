package m51;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h51.j f405057a;

    /* renamed from: b, reason: collision with root package name */
    public final h51.j f405058b;

    /* renamed from: c, reason: collision with root package name */
    public final long f405059c;

    public a(h51.j jVar, h51.j jVar2, long j17) {
        this.f405057a = jVar;
        this.f405058b = jVar2;
        this.f405059c = j17;
    }

    /* renamed from: equals */
    public boolean m146831xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m51.a.class != obj.getClass()) {
            return false;
        }
        m51.a aVar = (m51.a) obj;
        h51.j jVar = aVar.f405058b;
        h51.j jVar2 = this.f405058b;
        if (jVar2 == null) {
            if (jVar != null) {
                return false;
            }
        } else if (!jVar2.m132892xb2c87fbf(jVar)) {
            return false;
        }
        h51.j jVar3 = aVar.f405057a;
        h51.j jVar4 = this.f405057a;
        if (jVar4 == null) {
            if (jVar3 != null) {
                return false;
            }
        } else if (!jVar4.m132892xb2c87fbf(jVar3)) {
            return false;
        }
        return this.f405059c == aVar.f405059c;
    }

    /* renamed from: hashCode */
    public int m146832x8cdac1b() {
        h51.j jVar = this.f405058b;
        int m132893x8cdac1b = ((jVar == null ? 0 : jVar.m132893x8cdac1b()) + 31) * 31;
        h51.j jVar2 = this.f405057a;
        int m132893x8cdac1b2 = jVar2 != null ? jVar2.m132893x8cdac1b() : 0;
        long j17 = this.f405059c;
        return ((m132893x8cdac1b + m132893x8cdac1b2) * 31) + ((int) (j17 ^ (j17 >>> 32)));
    }
}
