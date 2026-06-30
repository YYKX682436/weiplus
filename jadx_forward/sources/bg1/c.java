package bg1;

/* loaded from: classes7.dex */
public class c implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.b f101410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101411b;

    public c(bg1.h hVar, zf.b bVar, java.lang.String str) {
        this.f101410a = bVar;
        this.f101411b = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.b bVar = this.f101410a;
        if (bVar != null) {
            bVar.b(this.f101411b, str);
        }
    }
}
