package bg1;

/* loaded from: classes7.dex */
public class d implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.b f19879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19880b;

    public d(bg1.h hVar, zf.b bVar, java.lang.String str) {
        this.f19879a = bVar;
        this.f19880b = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.b bVar = this.f19879a;
        if (bVar != null) {
            bVar.b(this.f19880b, str);
        }
    }
}
