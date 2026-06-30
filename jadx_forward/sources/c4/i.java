package c4;

/* loaded from: classes15.dex */
public class i extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.n f119835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 f119839i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33, java.lang.Object obj, c4.n nVar, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super(obj);
        this.f119839i = abstractServiceC1134x1ae0da33;
        this.f119835e = nVar;
        this.f119836f = str;
        this.f119837g = bundle;
        this.f119838h = bundle2;
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = this.f119839i;
        x.b bVar = abstractServiceC1134x1ae0da33.f93238g;
        c4.n nVar = this.f119835e;
        if (bVar.m174751x4aabfc28(((c4.m0) nVar.f119858g).a(), null) != nVar) {
            int i17 = p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33.f93234m;
            return;
        }
        int i18 = this.f119885d & 1;
        android.os.Bundle bundle = this.f119837g;
        if (i18 != 0) {
            list = abstractServiceC1134x1ae0da33.a(list, bundle);
        }
        try {
            ((c4.m0) nVar.f119858g).b(this.f119836f, list, bundle, this.f119838h);
        } catch (android.os.RemoteException unused) {
        }
    }
}
