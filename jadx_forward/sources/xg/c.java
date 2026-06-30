package xg;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f535880a;

    /* renamed from: b, reason: collision with root package name */
    public int f535881b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.OrientationEventListener f535882c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f535883d = new java.util.ArrayList();

    public c(android.content.Context context) {
        this.f535880a = context;
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        this.f535881b = windowManager.getDefaultDisplay().getRotation();
        this.f535882c = new xg.a(this, context, windowManager);
    }
}
