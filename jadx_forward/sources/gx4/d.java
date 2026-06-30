package gx4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final int f358933j;

    /* renamed from: a, reason: collision with root package name */
    public gx4.b f358934a;

    /* renamed from: b, reason: collision with root package name */
    public final gx4.c f358935b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f358936c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.PointF f358937d = new android.graphics.PointF();

    /* renamed from: e, reason: collision with root package name */
    public boolean f358938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f358939f;

    /* renamed from: g, reason: collision with root package name */
    public int f358940g;

    /* renamed from: h, reason: collision with root package name */
    public int f358941h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f358942i;

    static {
        int i17 = gx4.e.f358948f;
        f358933j = i17 * i17;
    }

    public d(gx4.c cVar) {
        this.f358935b = cVar;
        android.view.WindowManager windowManager = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.flags = 40;
        layoutParams.gravity = 85;
        int i17 = gx4.e.f358949g;
        layoutParams.width = i17;
        layoutParams.height = i17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        gx4.b bVar = new gx4.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f358934a = bVar;
        try {
            bVar.setVisibility(8);
            windowManager.addView(this.f358934a, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BagCancelController", "showCanceller add failed %s", e17);
        }
    }
}
