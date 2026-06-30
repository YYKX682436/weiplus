package k71;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f386211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17) {
        super(1);
        this.f386211d = activityC0065xcd7aa112;
        this.f386212e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).fj(this.f386211d);
        int i17 = this.f386212e;
        v61.d.g("export_chat_history_login", i17);
        if (i17 > 0) {
            v61.d.f(i17);
        }
        return jz5.f0.f384359a;
    }
}
