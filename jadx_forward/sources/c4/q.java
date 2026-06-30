package c4;

/* loaded from: classes15.dex */
public class q extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f119866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c4.s sVar, java.lang.Object obj, c4.a0 a0Var) {
        super(obj);
        this.f119866e = a0Var;
    }

    @Override // c4.z
    public void a() {
        this.f119866e.f119795a.detach();
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.List<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939> list = (java.util.List) obj;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            for (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939 c0039xb81f0939 : list) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                c0039xb81f0939.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f119866e.a(arrayList);
    }
}
