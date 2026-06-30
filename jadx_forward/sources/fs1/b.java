package fs1;

/* loaded from: classes5.dex */
public final class b implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f347809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f347810b;

    public b(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f347809a = lVar;
        this.f347810b = interfaceC29045xdcb5ca57;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        this.f347809a.mo146xb9724478(str);
        this.f347810b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
    }
}
