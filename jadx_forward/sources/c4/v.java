package c4;

/* loaded from: classes15.dex */
public class v extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f119877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.x f119879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c4.x xVar, java.lang.Object obj, c4.a0 a0Var, android.os.Bundle bundle) {
        super(obj);
        this.f119879g = xVar;
        this.f119877e = a0Var;
        this.f119878f = bundle;
    }

    @Override // c4.z
    public void a() {
        this.f119877e.f119795a.detach();
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939> list = (java.util.List) obj;
        c4.a0 a0Var = this.f119877e;
        if (list == null) {
            a0Var.a(null);
            return;
        }
        if ((this.f119885d & 1) != 0) {
            list = this.f119879g.f119881f.a(list, this.f119878f);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939 c0039xb81f0939 : list) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            c0039xb81f0939.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        a0Var.a(arrayList);
    }
}
