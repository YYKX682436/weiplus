package sm3;

/* loaded from: classes10.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final sm3.f0 f491395a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f491396b;

    /* renamed from: c, reason: collision with root package name */
    public float f491397c;

    /* renamed from: d, reason: collision with root package name */
    public float f491398d;

    /* renamed from: e, reason: collision with root package name */
    public float f491399e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f491400f;

    /* renamed from: g, reason: collision with root package name */
    public final int f491401g;

    /* renamed from: h, reason: collision with root package name */
    public final int f491402h;

    /* renamed from: i, reason: collision with root package name */
    public float f491403i;

    /* renamed from: j, reason: collision with root package name */
    public float f491404j;

    /* renamed from: k, reason: collision with root package name */
    public int f491405k = 0;

    /* renamed from: l, reason: collision with root package name */
    public android.view.GestureDetector f491406l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f491407m;

    public g0(android.content.Context context, sm3.f0 f0Var) {
        this.f491395a = f0Var;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f491401g = viewConfiguration.getScaledTouchSlop() * 2;
        this.f491402h = viewConfiguration.getScaledTouchSlop() * 4;
        if (context.getApplicationInfo().targetSdkVersion > 18) {
            this.f491396b = true;
            if (this.f491406l == null) {
                this.f491406l = new android.view.GestureDetector(context, new sm3.e0(this), null);
            }
        }
    }

    public final boolean a() {
        return this.f491405k != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm3.g0.b(android.view.MotionEvent):boolean");
    }
}
