package j8;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f379651a;

    public k(android.content.Context context) {
        this.f379651a = context;
    }

    public j8.h a() {
        android.content.Context context = this.f379651a;
        int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i17 = context.getResources().getConfiguration().orientation;
        j8.h hVar = rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? j8.h.Unknown : j8.h.LandscapeRight : j8.h.PortraitDown : j8.h.LandscapeLeft : j8.h.PortraitUp;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchedOrientationReader", "getOrientation, orientation:" + i17 + ", rotation:" + rotation + ", returnOrientation:" + hVar);
        return hVar;
    }
}
