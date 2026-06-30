package cl2;

/* loaded from: classes10.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f124456b;

    public e(java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d) {
        this.f124455a = str;
        this.f124456b = c22628xfde5d61d;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mn2.h3) aVar.f375106a).mo148084xb5887639(), this.f124455a) || bitmap == null) {
            return;
        }
        pm0.v.X(new cl2.d(this.f124456b, bitmap));
    }
}
