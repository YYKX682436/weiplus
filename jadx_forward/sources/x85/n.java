package x85;

/* loaded from: classes9.dex */
public final class n extends x85.k implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public x85.j f534133d;

    public n(int i17, byte[] bArr, byte[] bArr2, im5.b bVar, x85.j jVar) {
        this.f534133d = jVar;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", i17);
        bundle.putByteArray("page_buff", bArr);
        bundle.putByteArray("ctx_buff", bArr2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, x85.r.class, new x85.m(this));
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f534133d = null;
    }
}
