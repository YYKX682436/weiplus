package z41;

/* loaded from: classes8.dex */
public class c extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public z41.a f551623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f551624b;

    /* renamed from: c, reason: collision with root package name */
    public final z41.b f551625c;

    public c(android.content.Context context, z41.b bVar) {
        super(context);
        this.f551623a = z41.a.NONE;
        this.f551624b = 45;
        this.f551625c = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OrientationListenerHelper", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // android.view.OrientationEventListener
    public void disable() {
        super.disable();
        this.f551623a = z41.a.NONE;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 == -1) {
            return;
        }
        z41.a aVar = this.f551623a;
        int i18 = this.f551624b;
        z41.a aVar2 = ((i17 < 360 - i18 || i17 >= 360) && (i17 < 0 || i17 > i18 + 0)) ? (i17 < 270 - i18 || i17 > i18 + 270) ? (i17 < 180 - i18 || i17 > i18 + 180) ? (i17 < 90 - i18 || i17 > i18 + 90) ? aVar : z41.a.REVERSE_LANDSCAPE : z41.a.REVERSE_PORTRAIT : z41.a.LANDSCAPE : z41.a.PORTRAIT;
        if (aVar2 != aVar) {
            z41.b bVar = this.f551625c;
            if (bVar != null && aVar != z41.a.NONE) {
                bVar.a(aVar, aVar2);
            }
            this.f551623a = aVar2;
        }
    }
}
