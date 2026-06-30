package go5;

/* loaded from: classes14.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go5.c0 f355649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go5.b f355650b;

    public a0(go5.c0 c0Var, go5.b bVar) {
        this.f355649a = c0Var;
        this.f355650b = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b
    public final int a(byte[] bArr, int i17) {
        go5.c0 c0Var = this.f355649a;
        if (c0Var.f355658b.capacity() < i17) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
            c0Var.f355658b = allocateDirect;
        }
        c0Var.f355658b.clear();
        java.nio.ByteBuffer buffer = c0Var.f355658b;
        ((go5.t) this.f355650b).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        buffer.clear();
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.h(buffer, i17) >= 0)) {
            return -1;
        }
        c0Var.f355658b.get(bArr);
        return 0;
    }
}
