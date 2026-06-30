package i33;

/* loaded from: classes.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f369776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f369776d = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f369776d.getSystemService("vibrator");
        if (systemService instanceof android.os.Vibrator) {
            return (android.os.Vibrator) systemService;
        }
        return null;
    }
}
