package bg2;

/* loaded from: classes3.dex */
public final class m implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f101827e;

    public m(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, java.util.List list, v65.n nVar) {
        this.f101823a = arrayList;
        this.f101824b = arrayList2;
        this.f101825c = i17;
        this.f101826d = list;
        this.f101827e = nVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            java.util.ArrayList arrayList = this.f101823a;
            java.util.ArrayList arrayList2 = this.f101824b;
            int i17 = this.f101825c;
            java.util.List list = this.f101826d;
            v65.n nVar2 = this.f101827e;
            synchronized (arrayList) {
                int i18 = no0.i.f420260a;
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i18, i18, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
                arrayList.add(createScaledBitmap);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                if (arrayList.size() == list.size()) {
                    nVar2.a(new jz5.l(arrayList, arrayList2));
                }
            }
        }
    }
}
