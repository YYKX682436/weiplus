package or2;

/* loaded from: classes13.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or2.f f429153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Display.Mode f429154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Display.Mode f429155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(or2.f fVar, android.view.Display.Mode mode, android.view.Display.Mode mode2) {
        super(1);
        this.f429153d = fVar;
        this.f429154e = mode;
        this.f429155f = mode2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent event = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        event.getAction();
        or2.f fVar = this.f429153d;
        fVar.Q6(this.f429154e);
        jz5.g gVar = fVar.f429156d;
        ((android.os.Handler) gVar.mo141623x754a37bb()).removeCallbacksAndMessages(null);
        jz5.g gVar2 = fVar.f429157e;
        ((or2.b) gVar2.mo141623x754a37bb()).f429149d = this.f429155f;
        ((android.os.Handler) gVar.mo141623x754a37bb()).postDelayed((or2.b) gVar2.mo141623x754a37bb(), 2000L);
        return jz5.f0.f384359a;
    }
}
