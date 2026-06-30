package xg;

/* loaded from: classes7.dex */
public class a extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f535878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xg.c f535879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xg.c cVar, android.content.Context context, android.view.WindowManager windowManager) {
        super(context);
        this.f535879b = cVar;
        this.f535878a = windowManager;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int rotation = this.f535878a.getDefaultDisplay().getRotation();
        xg.c cVar = this.f535879b;
        if (cVar.f535881b == rotation) {
            return;
        }
        java.util.Iterator it = cVar.f535883d.iterator();
        while (it.hasNext()) {
            ((xg.b) it.next()).mo34740x55a71e07(rotation);
        }
        cVar.f535881b = rotation;
    }
}
