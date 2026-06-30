package dl4;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o11.g f316895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, long j17, android.graphics.Bitmap bitmap, java.lang.String str2, o11.g gVar) {
        super(0);
        this.f316892d = str;
        this.f316893e = bitmap;
        this.f316894f = str2;
        this.f316895g = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.d1.f316918c.remove(this.f316892d);
        if (arrayList != null) {
            android.graphics.Bitmap bitmap = this.f316893e;
            if (bitmap != null) {
                bitmap.getWidth();
            }
            if (bitmap != null) {
                bitmap.getHeight();
            }
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p11.k) it.next()).a(this.f316894f, null, bitmap, this.f316895g.D);
            }
        }
        return jz5.f0.f384359a;
    }
}
