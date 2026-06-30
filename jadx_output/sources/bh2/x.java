package bh2;

/* loaded from: classes10.dex */
public abstract class x implements bh2.b {

    /* renamed from: d, reason: collision with root package name */
    public final bh2.b f20908d;

    public x(bh2.b bVar) {
        this.f20908d = bVar;
    }

    @Override // bh2.b
    public void g1(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.g1(songUniqueId);
        }
    }

    @Override // bh2.b
    public void o2(java.lang.String songUniqueId) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.o2(songUniqueId);
        }
    }
}
