package md;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f407229a = 300;

    /* renamed from: b, reason: collision with root package name */
    public int f407230b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f407231c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f407232d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.OrientationEventListener f407233e;

    public j(android.content.Context context, int i17) {
        this.f407232d = new java.lang.ref.WeakReference(context);
        md.i iVar = new md.i(this, context.getApplicationContext(), i17, new java.lang.ref.WeakReference(this));
        this.f407233e = iVar;
        iVar.enable();
    }
}
