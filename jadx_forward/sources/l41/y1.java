package l41;

/* loaded from: classes4.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.y1 f397503a = new l41.y1();

    public final void a(android.content.Context context, java.lang.String kfUsername, boolean z17, yz5.l successCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kfUsername, "kfUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successCallback, "successCallback");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        um3.b bVar = (um3.b) a17;
        v65.i.b(bVar.O6(), null, new l41.x1(bVar, kfUsername, z17, successCallback, null), 1, null);
    }
}
