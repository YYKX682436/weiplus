package ux0;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.b f513309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f513310e;

    public a(ux0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f513309d = bVar;
        this.f513310e = interfaceC29045xdcb5ca57;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f513309d.f513314g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ByteBufferVideoFrameSender", "captureFrame: imageReader is null");
            this.f513310e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f513310e;
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3982x6f8c7f2f c3982x6f8c7f2f = this.f513309d.f513312e;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c3982x6f8c7f2f != null ? new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3982x6f8c7f2f(c3982x6f8c7f2f.mo32474x755bd410(), c3982x6f8c7f2f.mo32468x1c4fb41d(), c3982x6f8c7f2f.m32472x3bc92a9d(), c3982x6f8c7f2f.m32470x9149e7c9(), c3982x6f8c7f2f.m32465x12f2b736().duplicate(), c3982x6f8c7f2f.mo32467xdcde8d28(), c3982x6f8c7f2f.mo32473x2b69a60()) : null));
        }
    }
}
