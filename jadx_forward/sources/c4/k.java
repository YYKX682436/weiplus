package c4;

/* loaded from: classes15.dex */
public class k extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f119849e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33, java.lang.Object obj, p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c) {
        super(obj);
        this.f119849e = c0050x5b3754c;
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        int i17 = this.f119885d & 4;
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = this.f119849e;
        if (i17 != 0 || list == null) {
            c0050x5b3754c.b(-1, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArray("search_results", (android.os.Parcelable[]) list.toArray(new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939[0]));
        c0050x5b3754c.b(0, bundle);
    }
}
