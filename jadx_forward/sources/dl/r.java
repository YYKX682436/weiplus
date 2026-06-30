package dl;

/* loaded from: classes3.dex */
public class r implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk0.c f316651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dl.t f316652b;

    public r(dl.t tVar, xk0.c cVar) {
        this.f316652b = tVar;
        this.f316651a = cVar;
    }

    @Override // bn5.e
    public void b() {
        java.lang.String str;
        dl.t tVar = this.f316652b;
        android.graphics.Matrix h17 = tVar.h();
        xk0.c cVar = this.f316651a;
        cVar.f536466f.set(h17);
        if (tVar.d() != null) {
            ((um.d) tVar.d()).mo168218x5a5b64d();
            ((um.d) tVar.d()).add(cVar);
            if (tVar.l() != null) {
                hk0.u0 l17 = tVar.l();
                l17.getClass();
                hk0.z zVar = l17.f363351i;
                zVar.getClass();
                if (zVar.f363391j != zVar.f363390i || zVar.f363392k || zVar.f363393l) {
                    java.lang.String str2 = "CROP_" + java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addCropData >> " + str2);
                    java.util.LinkedList linkedList = zVar.f363382a;
                    hk0.l lVar = hk0.l.f363298f;
                    linkedList.add(new hk0.k(lVar, str2));
                    zVar.f363384c.put(str2, new hk0.d(lVar, cVar, zVar.f363390i, zVar.f363392k));
                    zVar.f363389h.add(str2);
                    zVar.f363391j = zVar.f363390i;
                    zVar.f363392k = false;
                    zVar.f363393l = false;
                    str = str2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "this time no change no to add crop data");
                    str = "CROP_NO_CHANGE";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "add Crop EditData >> ".concat(str));
                hk0.j U6 = l17.U6();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(U6);
                p3325xe03a0797.p3326xc267989b.l.d(l17.f363355p, null, null, new hk0.d0(l17, l17.V6(arrayList), null), 3, null);
            }
        }
    }

    @Override // bn5.e
    /* renamed from: onStart */
    public void mo10932xb05099c3() {
    }
}
