package xd;

/* loaded from: classes7.dex */
public class c extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public final xd.g f535145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xd.g bufferConfig) {
        super(bufferConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferConfig, "bufferConfig");
        this.f535145a = bufferConfig;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "NativeBuffer";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return r26.i0.A((java.lang.String) obj, "nativebuffer://", false, 2, null);
        }
        return false;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        h8.b bVar = new h8.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.Integer h17 = r26.h0.h(r26.n0.l0((java.lang.String) obj, new e06.k(15, r5.length() - 1)));
        if (h17 != null) {
            java.lang.ref.WeakReference weakReference = ((wd.e) this.f535145a).f526216a;
            java.nio.ByteBuffer j07 = (weakReference.get() != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).C0().getF229341e().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class) : null).j0(h17.intValue(), false);
            if (j07 == null) {
                ah.i.f86248a.w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: can not found buffer in buffer addon", new java.lang.Object[0]);
                bVar.f361045b = "Not found native buffer in buffer addon!";
            } else {
                j07.position(0);
                byte[] bArr = new byte[j07.remaining()];
                j07.get(bArr);
                bVar.f361044a = new java.io.ByteArrayInputStream(bArr);
            }
        } else {
            ah.i.f86248a.w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: not providing int as native buffer key!", new java.lang.Object[0]);
            bVar.f361045b = "Not invalid native buffer key!";
        }
        return bVar;
    }
}
