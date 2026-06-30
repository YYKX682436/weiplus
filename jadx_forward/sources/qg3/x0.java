package qg3;

/* loaded from: classes2.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.od0 f444418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(bw5.od0 od0Var, android.app.Activity activity) {
        super(0);
        this.f444418d = od0Var;
        this.f444419e = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (!this.f444418d.f112602h) {
            android.app.Activity activity = this.f444419e;
            if (!((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).isFinishing()) {
                vn2.u0.f519920a.c(activity);
            }
        }
        return jz5.f0.f384359a;
    }
}
