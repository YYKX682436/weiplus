package tl1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public tl1.b f501733d;

    public final tl1.b b(boolean z17) {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar;
        tl1.b bVar = this.f501733d;
        if (bVar != null) {
            return bVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k) this;
        try {
            viewGroup = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) kVar.f164275f.get()).mo51311x3eebbc35()).f168290a;
        } catch (java.lang.NullPointerException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiPickerHandler", "getInvokerView: return a null invoker view");
            viewGroup = null;
        }
        if (viewGroup == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(viewGroup)) == null) {
            return null;
        }
        int i17 = tl1.b.f501732w;
        tl1.b bVar2 = (tl1.b) d17.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564722z2);
        if (bVar2 == null && z17) {
            bVar2 = new tl1.b(viewGroup.getContext());
            java.lang.ref.WeakReference weakReference = kVar.f164275f;
            if (weakReference != null && (tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) weakReference.get()) != null) {
                bVar2.m166749xbc2fc2b9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k.f164273i.a(tVar));
            }
        }
        d17.a(bVar2, true);
        return bVar2;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f c(java.lang.Class cls) {
        cls.getSimpleName();
        tl1.b b17 = b(true);
        this.f501733d = b17;
        if (b17 == null) {
            return null;
        }
        try {
            b17.m166750xc7a9edd0((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f) cls.getDeclaredConstructor(android.content.Context.class).newInstance(b17.getContext()));
            return b17.m166746x2a2c2b84();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
