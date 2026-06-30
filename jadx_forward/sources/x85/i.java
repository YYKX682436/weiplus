package x85;

/* loaded from: classes10.dex */
public final class i extends x85.d implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public x85.c f534130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(im5.b bVar, java.lang.String lensId, x85.c cVar) {
        super(bVar, lensId, cVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
        this.f534130d = cVar;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, lensId);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, x85.p.class, new x85.h(lensId, this));
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensInfoTask", "dead: ");
        this.f534130d = null;
    }
}
