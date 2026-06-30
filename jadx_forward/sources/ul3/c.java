package ul3;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c {

    /* renamed from: a, reason: collision with root package name */
    public final n01.f f510133a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f510134b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f510135c;

    public c(n01.f fVar) {
        this.f510133a = fVar;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
    /* renamed from: createDataSource */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo93698xb8a7ce81() {
        java.nio.ByteBuffer byteBuffer = this.f510134b;
        return byteBuffer != null ? new ul3.a(byteBuffer, this.f510135c) : new ul3.b(this.f510133a);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
    /* renamed from: createNativeDataSource */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 mo93699xd6f504f8() {
        return null;
    }

    public c(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        this.f510134b = byteBuffer;
        this.f510135c = str;
    }
}
