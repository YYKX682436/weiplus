package gb1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f351508a = new java.util.concurrent.ConcurrentHashMap(5);

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 a(java.lang.String str) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) this.f351508a.get(str);
    }

    public void b(java.lang.String str) {
        this.f351508a.remove(str);
    }
}
