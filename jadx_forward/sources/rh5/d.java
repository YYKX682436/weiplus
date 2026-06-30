package rh5;

/* loaded from: classes3.dex */
public final class d implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 f477350b;

    public d(android.view.View view, com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61, java.lang.String str) {
        this.f477349a = view;
        this.f477350b = c22446x23f86f61;
    }

    @Override // oc5.n
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event) {
        com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61;
        cg3.d V6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = event.f136194g.f87901a;
        if (this.f477349a == null || (V6 = com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61.V6((c22446x23f86f61 = this.f477350b), event)) == null) {
            return;
        }
        java.util.Map map = c22446x23f86f61.f290660g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        ((java.util.HashMap) map).put(str, V6);
        am.cq cqVar = V6.f122680a.f136194g;
        java.util.Objects.toString(cqVar != null ? cqVar.f87903c : null);
    }

    @Override // oc5.n
    public void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // oc5.n
    public void c(java.lang.String imagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
    }
}
