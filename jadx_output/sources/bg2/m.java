package bg2;

/* loaded from: classes3.dex */
public final class m implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f20290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f20291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f20294e;

    public m(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, java.util.List list, v65.n nVar) {
        this.f20290a = arrayList;
        this.f20291b = arrayList2;
        this.f20292c = i17;
        this.f20293d = list;
        this.f20294e = nVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            java.util.ArrayList arrayList = this.f20290a;
            java.util.ArrayList arrayList2 = this.f20291b;
            int i17 = this.f20292c;
            java.util.List list = this.f20293d;
            v65.n nVar2 = this.f20294e;
            synchronized (arrayList) {
                int i18 = no0.i.f338727a;
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i18, i18, true);
                kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
                arrayList.add(createScaledBitmap);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                if (arrayList.size() == list.size()) {
                    nVar2.a(new jz5.l(arrayList, arrayList2));
                }
            }
        }
    }
}
