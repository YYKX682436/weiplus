package bg1;

/* loaded from: classes7.dex */
public class e implements xf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf.a f101414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f101415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101416c;

    public e(bg1.h hVar, zf.a aVar, sf.f fVar, java.lang.String str) {
        this.f101414a = aVar;
        this.f101415b = fVar;
        this.f101416c = str;
    }

    @Override // xf1.e
    public void a(java.lang.String str) {
        zf.a aVar = this.f101414a;
        if (aVar != null) {
            java.lang.String str2 = this.f101416c;
            if (str != null) {
                aVar.b(str2, com.p314xaae8f345.mm.vfs.w6.i(str, false));
                return;
            }
            this.f101415b.a(jc1.g.f380474m);
            aVar.a(str2);
        }
    }
}
