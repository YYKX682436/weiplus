package ww1;

/* loaded from: classes15.dex */
public class j2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f531754d;

    public j2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanMaterialCodeListener", "scan material code type: %s", java.lang.Integer.valueOf(c5967xa7660a29.f136264g.f89665c));
        am.us usVar = c5967xa7660a29.f136264g;
        java.lang.ref.WeakReference weakReference = usVar.f89666d;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanMaterialCodeListener", "context has destroyed");
            ((e04.w0) usVar.f89667e).run();
        } else {
            android.content.Context context = (android.content.Context) usVar.f89666d.get();
            int i17 = usVar.f89665c;
            if (i17 == 0) {
                this.f531754d = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, false, null);
                ww1.q1 q1Var = new ww1.q1(usVar.f89663a, usVar.f89664b);
                gm0.j1.d().a(1800, new ww1.h2(this, c5967xa7660a29, context));
                gm0.j1.d().g(q1Var);
            } else if (i17 == 1) {
                this.f531754d = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, false, null);
                xw1.e eVar = new xw1.e(usVar.f89663a, usVar.f89664b);
                gm0.j1.d().a(2811, new ww1.i2(this, c5967xa7660a29, context));
                gm0.j1.d().g(eVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanMaterialCodeListener", "unknown type: %d", java.lang.Integer.valueOf(i17));
            }
        }
        return false;
    }
}
