package xh1;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh1.g f536024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xh1.g gVar) {
        super(0);
        this.f536024d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.he heVar = new r45.he();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = this.f536024d.f536042d.u0();
        heVar.f457611e = u07 != null ? u07.f128812x0 : 0;
        heVar.f457613g = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        java.lang.String k17 = wo.w0.k();
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        byte[] bytes = k17.getBytes(UTF_8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
        b17.f(java.lang.Math.min(b17.f273689a.length, 16));
        heVar.f457612f = b17;
        java.lang.String str = "android-" + android.os.Build.VERSION.SDK_INT;
        java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
        byte[] bytes2 = str.getBytes(UTF_82);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b18 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes2);
        b18.f(java.lang.Math.min(b18.f273689a.length, 132));
        heVar.f457614h = b18;
        heVar.f457610d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
        heVar.f457615i = 0;
        return heVar;
    }
}
