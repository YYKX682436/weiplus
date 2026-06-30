package ry5;

/* renamed from: ry5.c$$c */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30153x2d8ca0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry5.c f483251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f483252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f483253c;

    public /* synthetic */ C30153x2d8ca0(ry5.c cVar, android.app.Activity activity, long j17) {
        this.f483251a = cVar;
        this.f483252b = activity;
        this.f483253c = j17;
    }

    public final void a(java.lang.String str) {
        ry5.c cVar = this.f483251a;
        cVar.getClass();
        if (!android.text.TextUtils.isEmpty(str)) {
            wy5.e eVar = new wy5.e();
            eVar.b(str);
            if (cVar.b(eVar, this.f483252b, this.f483253c)) {
                return;
            }
        }
        cVar.c();
    }
}
