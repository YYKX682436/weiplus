package sn2;

/* loaded from: classes11.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf f491661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491663c;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf, java.lang.String str, java.lang.String str2) {
        this.f491661a = serviceC14434x2b82fbf;
        this.f491662b = str;
        this.f491663c = str2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            d75.b.g(new sn2.d(this.f491661a, bitmap, this.f491662b, this.f491663c));
        }
    }
}
