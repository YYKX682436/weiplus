package lc;

/* loaded from: classes14.dex */
public final class a implements nc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f399324a;

    public a(lc.g gVar) {
        this.f399324a = gVar;
    }

    public final void a() {
        nc.c cVar = nc.b.f417624a;
        if (cVar.f417625a != null) {
            cVar.f417625a = null;
        }
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        dVar.getClass();
        lc.g gVar = this.f399324a;
        gVar.f399351s = true;
        mc.p.f407064a.b("AuthingFragment", "start prepare auth");
        mc.c cVar2 = mc.d.f407048a;
        lc.f fVar = new lc.f(gVar);
        cVar2.getClass();
        android.content.Context a17 = dVar.a();
        if (a17 != null) {
            android.content.res.Resources resources = a17.getResources();
            cVar2.f407040k = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.and);
            cVar2.f407041l = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ana);
            cVar2.f407042m = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.an_);
            cVar2.f407043n = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.an9);
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e17 = dVar.e();
            if (e17 != null) {
                if (e17.m21781xf7ab85b6() != 0) {
                    cVar2.f407040k = e17.m21781xf7ab85b6();
                }
                if (e17.m21783xc651390e() != 0) {
                    cVar2.f407041l = e17.m21783xc651390e();
                }
                if (e17.m21777xd1abd569() != 0) {
                    cVar2.f407042m = e17.m21777xd1abd569();
                }
                if (e17.m21776x616698c7() != 0) {
                    cVar2.f407043n = e17.m21776x616698c7();
                }
            }
        }
        cVar2.f407030a = fVar;
        cVar2.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.PREPARE, null);
        cVar2.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.AUTH_ACTION, null);
    }
}
