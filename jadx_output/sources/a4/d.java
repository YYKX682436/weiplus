package a4;

/* loaded from: classes13.dex */
public class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.loader.content.e f1161d;

    /* renamed from: e, reason: collision with root package name */
    public final a4.a f1162e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1163f = false;

    public d(androidx.loader.content.e eVar, a4.a aVar) {
        this.f1161d = eVar;
        this.f1162e = aVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        this.f1162e.onLoadFinished(this.f1161d, obj);
        this.f1163f = true;
    }

    public java.lang.String toString() {
        return this.f1162e.toString();
    }
}
