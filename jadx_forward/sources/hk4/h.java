package hk4;

/* loaded from: classes10.dex */
public final class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk4.n f363478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f363479b;

    public h(hk4.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f363478a = nVar;
        this.f363479b = interfaceC29045xdcb5ca57;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363478a.f363489k, "loadImageBitmap finished, url:" + aVar + ", resource:" + bitmap);
        this.f363479b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bitmap));
    }
}
