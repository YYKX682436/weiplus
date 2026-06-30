package fo1;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.m f346415a = new fo1.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f346416b = jz5.h.b(fo1.l.f346414d);

    public final void a(java.lang.String tag, bw5.w0 roamPackage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roamPackage, "roamPackage");
    }

    public final void b(java.lang.String tag, java.util.ArrayList inserted) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inserted, "inserted");
    }

    public final void c(java.lang.String tag, java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f346416b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9) mo141623x754a37bb).e(tag, format, java.util.Arrays.copyOf(args, args.length));
    }

    public final java.lang.String d(bw5.u0 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return "svrId=" + msg.f115210m + ", createTime=" + msg.f115208h + ", type=" + msg.f115204d;
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return "svrId=" + msg.I0() + ", createTime=" + msg.mo78012x3fdd41df() + ", type=" + msg.mo78013xfb85f7b0() + ", id=" + msg.m124847x74d37ac6();
    }

    public final void f(java.lang.String tag, java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f346416b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9) mo141623x754a37bb).i(tag, format, java.util.Arrays.copyOf(args, args.length));
    }

    public final void g(java.lang.String tag, long j17, java.lang.String convId, fo1.e action, java.lang.String log) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convId, "convId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f346416b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9) mo141623x754a37bb).i(tag, "pkg=" + j17 + ", conv=" + convId + ", action=" + action + ", " + log, new java.lang.Object[0]);
    }
}
