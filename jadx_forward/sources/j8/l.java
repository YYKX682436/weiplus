package j8;

/* loaded from: classes15.dex */
public class l extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8.n f379652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j8.n nVar, android.content.Context context, int i17) {
        super(context, i17);
        this.f379652a = nVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        j8.h hVar = j8.h.Unknown;
        j8.n nVar = this.f379652a;
        if (i17 == -1) {
            nVar.getClass();
        } else {
            int i18 = i17 + 45;
            android.content.Context context = nVar.f379657a;
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            android.content.res.Configuration configuration = context.getResources().getConfiguration();
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (((((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? (char) 2 : (char) 1) == 2) {
                i18 += 90;
            }
            int i19 = (i18 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 90;
            if (i19 == 0) {
                hVar = j8.h.PortraitUp;
            } else if (i19 == 1) {
                hVar = j8.h.LandscapeRight;
            } else if (i19 == 2) {
                hVar = j8.h.PortraitDown;
            } else if (i19 == 3) {
                hVar = j8.h.LandscapeLeft;
            }
        }
        if (hVar.equals(nVar.f379661e)) {
            return;
        }
        nVar.f379661e = hVar;
        nVar.f379658b.a(hVar);
    }
}
