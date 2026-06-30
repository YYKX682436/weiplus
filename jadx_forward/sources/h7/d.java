package h7;

/* loaded from: classes13.dex */
public final class d implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final x6.d f360863a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f360864b;

    public d(x6.d dVar, x6.b bVar) {
        this.f360863a = dVar;
        this.f360864b = bVar;
    }

    public byte[] a(int i17) {
        x6.b bVar = this.f360864b;
        return bVar == null ? new byte[i17] : (byte[]) ((x6.l) bVar).c(i17, byte[].class);
    }
}
