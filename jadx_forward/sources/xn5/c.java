package xn5;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f537185a;

    /* renamed from: b, reason: collision with root package name */
    public final int f537186b;

    public c(xn5.g gVar, java.lang.String name, xn5.d type, long j17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        name = (i18 & 1) != 0 ? "" : name;
        type = (i18 & 2) != 0 ? xn5.d.f537192d : type;
        j17 = (i18 & 4) != 0 ? java.lang.System.nanoTime() : j17;
        i17 = (i18 & 8) != 0 ? -1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f537185a = j17;
        this.f537186b = i17;
    }
}
