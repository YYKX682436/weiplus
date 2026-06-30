package go5;

/* loaded from: classes14.dex */
public final class j implements tl.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go5.k f355670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go5.d f355671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go5.e f355672c;

    public j(go5.k kVar, go5.d dVar, go5.e eVar) {
        this.f355670a = kVar;
        this.f355671b = dVar;
        this.f355672c = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        if (i18 == 15) {
            if (fp.h.c(31)) {
                ((ku5.t0) ku5.t0.f394148d).B(new go5.g(this.f355672c));
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new go5.i(this.f355672c));
            }
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (bArr != null) {
            go5.k kVar = this.f355670a;
            if (kVar.f355674b.capacity() < bArr.length) {
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
                kVar.f355674b = allocateDirect;
            }
            kVar.f355674b.clear();
            kVar.f355674b.put(bArr);
            kVar.f355674b.limit(bArr.length);
            java.nio.ByteBuffer buf = kVar.f355674b;
            ((go5.u) this.f355671b).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buf, "buf");
            buf.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.A(buf, buf.capacity());
        }
    }
}
