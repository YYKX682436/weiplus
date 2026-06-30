package j4;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f379082a;

    /* renamed from: b, reason: collision with root package name */
    public final j4.h f379083b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f379084c;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f379085d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f379086e = false;

    /* renamed from: f, reason: collision with root package name */
    public j4.b[] f379087f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f379088g;

    public a(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, j4.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) {
        byte[] bArr;
        this.f379082a = executor;
        this.f379083b = hVar;
        this.f379085d = file;
        switch (android.os.Build.VERSION.SDK_INT) {
            case 24:
            case 25:
                bArr = j4.o.f379119e;
                break;
            case 26:
                bArr = j4.o.f379118d;
                break;
            case 27:
                bArr = j4.o.f379117c;
                break;
            case 28:
            case 29:
            case 30:
                bArr = j4.o.f379116b;
                break;
            case 31:
                bArr = j4.o.f379115a;
                break;
            default:
                bArr = null;
                break;
        }
        this.f379084c = bArr;
    }

    public final void a(final int i17, final java.lang.Object obj) {
        this.f379082a.execute(new java.lang.Runnable() { // from class: j4.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                j4.a.this.f379083b.a(i17, obj);
            }
        });
    }
}
