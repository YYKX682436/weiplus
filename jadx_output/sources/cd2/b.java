package cd2;

/* loaded from: classes10.dex */
public abstract class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final cd2.c f40655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40656e;

    public b(cd2.c mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
        this.f40655d = mention;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f40655d.i();
    }
}
