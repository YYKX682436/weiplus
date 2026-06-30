package cl;

/* loaded from: classes7.dex */
public class h3 implements cl.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f42656a;

    public h3(cl.l3 l3Var) {
        this.f42656a = l3Var;
    }

    @Override // cl.u
    public void bufferStoreBindTo(long j17, long j18) {
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = ((com.tencent.mm.plugin.appbrand.z9) this.f42656a.f42687c).f92451a.f92382b;
        if (vVar != null) {
            vVar.bufferStoreBindTo(j17, j18);
        }
    }

    @Override // cl.u
    public int generateId() {
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = ((com.tencent.mm.plugin.appbrand.z9) this.f42656a.f42687c).f92451a.f92382b;
        if (vVar != null) {
            return vVar.K();
        }
        return 0;
    }

    @Override // cl.u
    public java.nio.ByteBuffer getBuffer(int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = ((com.tencent.mm.plugin.appbrand.z9) this.f42656a.f42687c).f92451a.f92382b;
        if (vVar != null) {
            return vVar.j0(i17, false);
        }
        return null;
    }

    @Override // cl.u
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // cl.u
    public void setBuffer(int i17, java.nio.ByteBuffer byteBuffer) {
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = ((com.tencent.mm.plugin.appbrand.z9) this.f42656a.f42687c).f92451a.f92382b;
        if (vVar != null) {
            vVar.U(i17, byteBuffer);
        }
    }

    @Override // cl.u
    public boolean supportBufferStoreBindTo() {
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = ((com.tencent.mm.plugin.appbrand.z9) this.f42656a.f42687c).f92451a.f92382b;
        if (vVar != null) {
            return vVar.supportBufferStoreBindTo();
        }
        return false;
    }
}
