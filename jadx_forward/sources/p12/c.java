package p12;

/* loaded from: classes10.dex */
public final class c extends p12.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f432549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f previewLayout, java.lang.String mediaPath) {
        super(activity, previewLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewLayout, "previewLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        this.f432549h = mediaPath;
    }

    @Override // p12.b, p12.h
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return d(this.f432549h, interfaceC29045xdcb5ca57);
    }
}
