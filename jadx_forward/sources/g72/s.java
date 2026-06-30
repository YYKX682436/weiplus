package g72;

/* loaded from: classes14.dex */
public class s implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 f350777d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614) {
        this.f350777d = activityC13521xbef6f614;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "service connected %s", componentName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = this.f350777d;
        activityC13521xbef6f614.f181618v = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 c13518xbbec6ce6 = ((f72.e) iBinder).f341575d;
        activityC13521xbef6f614.f181616t = c13518xbbec6ce6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectManager", "bindService process name: %s, hashCode: %d", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid()), java.lang.Integer.valueOf(yVar.hashCode()));
        yVar.f181576d = c13518xbbec6ce6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "FaceDetectUI service hashCode: %d", java.lang.Integer.valueOf(this.f350777d.f181616t.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f6142 = this.f350777d;
        activityC13521xbef6f6142.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "start");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "startFaceDetect ");
        android.view.WindowManager.LayoutParams attributes = activityC13521xbef6f6142.getWindow().getAttributes();
        if (attributes.screenBrightness < 0.9f) {
            attributes.screenBrightness = 0.9f;
            activityC13521xbef6f6142.getWindow().setAttributes(attributes);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13532x4b66ef9e c13532x4b66ef9e = activityC13521xbef6f6142.f181614r;
        c13532x4b66ef9e.f181701y = i72.v.INIT;
        i72.v vVar = i72.v.OPENED;
        android.view.View view = c13532x4b66ef9e.f181700x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c13532x4b66ef9e.f181683d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c2a);
        c13532x4b66ef9e.f181700x.startAnimation(c13532x4b66ef9e.f181697u);
        for (android.widget.ImageView imageView : c13532x4b66ef9e.f181692p) {
            imageView.clearAnimation();
            imageView.setBackgroundColor(c13532x4b66ef9e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        c13532x4b66ef9e.f181701y = vVar;
        activityC13521xbef6f6142.f181613q.f181653e.f181646d = false;
        activityC13521xbef6f6142.f181614r.setVisibility(0);
        activityC13521xbef6f6142.f181614r.getTop();
        activityC13521xbef6f6142.f181614r.getRight();
        activityC13521xbef6f6142.f181614r.getLeft();
        activityC13521xbef6f6142.f181614r.getBottom();
        activityC13521xbef6f6142.f181608i = true;
        activityC13521xbef6f6142.f181609m = false;
        g72.a0 a0Var = activityC13521xbef6f6142.f181607h;
        synchronized (a0Var) {
            a0Var.f350757a = false;
        }
        if (activityC13521xbef6f6142.f181608i) {
            activityC13521xbef6f6142.f181620x = new g72.t(activityC13521xbef6f6142);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: start preview");
            i72.z zVar = activityC13521xbef6f6142.f181620x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = activityC13521xbef6f6142.f181613q;
            c13528xdd12ba45.f181652d.H(new i72.r(c13528xdd12ba45, zVar));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "service disconnected %s", componentName.toString());
        this.f350777d.f181618v = false;
    }
}
