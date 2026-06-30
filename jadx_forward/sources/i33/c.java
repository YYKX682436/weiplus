package i33;

/* loaded from: classes10.dex */
public abstract class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f369699d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f369700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369699d = jz5.h.b(new i33.a(this));
        this.f369700e = jz5.h.b(new i33.b(this));
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 T6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f369699d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d U6() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) ((jz5.n) this.f369700e).mo141623x754a37bb();
    }

    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
    }
}
