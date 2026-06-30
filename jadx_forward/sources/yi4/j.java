package yi4;

/* loaded from: classes11.dex */
public final class j implements xj4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yi4.l f544149a;

    public j(yi4.l lVar) {
        this.f544149a = lVar;
    }

    @Override // xj4.b
    public final void a(int i17, java.lang.String[] strArr, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strArr, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 != 64) {
            return;
        }
        boolean z17 = ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
        yi4.l lVar = this.f544149a;
        yi4.i iVar = lVar.f544153b;
        lVar.f544153b = null;
        lVar.c();
        if (iVar == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = lVar.f544152a;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834) activity : null;
        yz5.l lVar2 = iVar.f544148b;
        if (activityC18678x2dd96834 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: activity gone, resolve null");
            lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        } else if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: granted, continue to CheckInLifeUI");
            lVar.d(activityC18678x2dd96834, iVar.f544147a, lVar2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: denied, resolve null");
            lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
    }
}
