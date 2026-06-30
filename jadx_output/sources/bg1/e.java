package bg1;

/* loaded from: classes7.dex */
public class e implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.a f19881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f19882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19883c;

    public e(bg1.h hVar, zf.a aVar, sf.f fVar, java.lang.String str) {
        this.f19881a = aVar;
        this.f19882b = fVar;
        this.f19883c = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.a aVar = this.f19881a;
        if (aVar != null) {
            java.lang.String str2 = this.f19883c;
            if (str != null) {
                aVar.b(str2, com.tencent.mm.vfs.w6.i(str, false));
                return;
            }
            this.f19882b.a(jc1.g.f298941m);
            aVar.a(str2);
        }
    }
}
