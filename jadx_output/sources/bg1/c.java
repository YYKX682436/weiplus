package bg1;

/* loaded from: classes7.dex */
public class c implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.b f19877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19878b;

    public c(bg1.h hVar, zf.b bVar, java.lang.String str) {
        this.f19877a = bVar;
        this.f19878b = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.b bVar = this.f19877a;
        if (bVar != null) {
            bVar.b(this.f19878b, str);
        }
    }
}
