package bg1;

/* loaded from: classes7.dex */
public class f implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.b f19884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19885b;

    public f(bg1.h hVar, zf.b bVar, java.lang.String str) {
        this.f19884a = bVar;
        this.f19885b = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.b bVar = this.f19884a;
        if (bVar != null) {
            bVar.b(this.f19885b, com.tencent.mm.vfs.w6.i(str, false));
        }
    }
}
