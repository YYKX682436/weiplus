package rh5;

/* loaded from: classes3.dex */
public final class e implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 f477352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf3.g f477353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f477355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg3.h f477356f;

    public e(android.view.View view, com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61, sf3.g gVar, java.lang.String str, mf3.k kVar, cg3.h hVar) {
        this.f477351a = view;
        this.f477352b = c22446x23f86f61;
        this.f477353c = gVar;
        this.f477354d = str;
        this.f477355e = kVar;
        this.f477356f = hVar;
    }

    @Override // oc5.n
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = event.f136194g.f87901a;
        if (this.f477351a != null) {
            com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61 = this.f477352b;
            cg3.d V6 = com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61.V6(c22446x23f86f61, event);
            sf3.g gVar = this.f477353c;
            if (V6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultQRCodeScanComponent", "scan failed, mediaId: " + gVar.f488921b + " imgPath: " + this.f477354d);
                return;
            }
            V6.f122685f = this.f477355e;
            java.util.Map map = c22446x23f86f61.f290660g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((java.util.HashMap) map).put(str, V6);
            java.lang.String str2 = gVar.f488921b;
            cg3.h hVar = this.f477356f;
            if (hVar != null) {
                cg3.g gVar2 = (cg3.g) hVar;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.graphics.PointF pointF : V6.f122683d) {
                    float[] fArr = {pointF.x, pointF.y};
                    V6.f122684e.mapPoints(fArr);
                    arrayList.add(new android.graphics.PointF(fArr[0], fArr[1]));
                }
                gVar2.V6().a().setVisibility(0);
                gVar2.V6().a().m68523x4cb2cb8a(new cg3.e(gVar2, V6));
                gVar2.V6().a().c(0, new java.util.ArrayList(V6.f122681b), new java.util.ArrayList(arrayList), new java.util.ArrayList(V6.f122682c), gVar2.V6().f336233a.getHeight());
            }
        }
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
