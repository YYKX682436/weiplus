package la1;

/* loaded from: classes7.dex */
public final class e implements de.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c f399028a;

    public e(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c interfaceC29791x2ddf4c2c) {
        this.f399028a = interfaceC29791x2ddf4c2c;
    }

    @Override // de.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, final yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f399028a.mo155622x299f1cd8(new org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener(callback) { // from class: la1.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f399029a;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                this.f399029a = callback;
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener
            /* renamed from: onCapture */
            public final /* synthetic */ void mo145457x7095c867(android.graphics.Bitmap bitmap) {
                this.f399029a.mo146xb9724478(bitmap);
            }
        });
    }
}
