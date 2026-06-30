package va;

/* loaded from: classes16.dex */
public abstract class d implements va.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f515713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515714b;

    /* renamed from: c, reason: collision with root package name */
    public final va.h f515715c;

    public d(java.lang.Object obj, int i17, va.h hVar) {
        this.f515713a = obj;
        this.f515714b = i17;
        this.f515715c = hVar;
    }

    @Override // va.h
    public va.h b() {
        return this.f515715c;
    }

    @Override // va.h
    public int c() {
        return this.f515714b;
    }

    @Override // va.h
    /* renamed from: getKey */
    public java.lang.Object mo171334xb5884f29() {
        return this.f515713a;
    }
}
