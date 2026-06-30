package m12;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Rect f404348a;

    /* renamed from: b, reason: collision with root package name */
    public int f404349b;

    /* renamed from: c, reason: collision with root package name */
    public int f404350c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f404351d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f404352e;

    public a(java.lang.String inputPath, java.lang.String outputPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f404348a = new android.graphics.Rect();
    }

    public boolean a() {
        if (this.f404349b <= 0 || this.f404350c <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicoMsg.EmojiGenerator", "emoji size invalid");
            return false;
        }
        if (this.f404348a.width() <= 0 || this.f404348a.height() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicoMsg.EmojiGenerator", "crop size invalid");
            return false;
        }
        android.graphics.Rect rect = this.f404348a;
        if (rect.left + rect.width() > this.f404349b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicoMsg.EmojiGenerator", "crop width large than output size");
            return false;
        }
        android.graphics.Rect rect2 = this.f404348a;
        if (rect2.top + rect2.height() <= this.f404350c) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicoMsg.EmojiGenerator", "crop height large than output size");
        return false;
    }

    public final void b(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        byte[] bytes = k17.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.w6.a(filePath, bytes);
    }

    public abstract java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
