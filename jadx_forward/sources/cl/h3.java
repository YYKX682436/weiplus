package cl;

/* loaded from: classes7.dex */
public class h3 implements cl.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f124189a;

    public h3(cl.l3 l3Var) {
        this.f124189a = l3Var;
    }

    @Override // cl.u
    /* renamed from: bufferStoreBindTo */
    public void mo15016x2418f779(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) this.f124189a.f124220c).f173984a.f173915b;
        if (vVar != null) {
            vVar.mo51554x2418f779(j17, j18);
        }
    }

    @Override // cl.u
    /* renamed from: generateId */
    public int mo15017x12389570() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) this.f124189a.f124220c).f173984a.f173915b;
        if (vVar != null) {
            return vVar.K();
        }
        return 0;
    }

    @Override // cl.u
    /* renamed from: getBuffer */
    public java.nio.ByteBuffer mo15018x12f2b736(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) this.f124189a.f124220c).f173984a.f173915b;
        if (vVar != null) {
            return vVar.j0(i17, false);
        }
        return null;
    }

    @Override // cl.u
    /* renamed from: releaseDirectByteBuffer */
    public void mo15019x3b42e258(java.nio.ByteBuffer byteBuffer) {
    }

    @Override // cl.u
    /* renamed from: setBuffer */
    public void mo15020x627eb42(int i17, java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) this.f124189a.f124220c).f173984a.f173915b;
        if (vVar != null) {
            vVar.U(i17, byteBuffer);
        }
    }

    @Override // cl.u
    /* renamed from: supportBufferStoreBindTo */
    public boolean mo15021xa0ce6f6a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9) this.f124189a.f124220c).f173984a.f173915b;
        if (vVar != null) {
            return vVar.mo51555xa0ce6f6a();
        }
        return false;
    }
}
