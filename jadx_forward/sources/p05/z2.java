package p05;

/* loaded from: classes5.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.z2 f432275d = new p05.z2();

    public z2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        p05.a3 a3Var = p05.a3.f431972a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(assets);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("xlab/");
        java.lang.String str = p05.a3.f431977f;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str2 = p05.a3.f431974c;
        sb8.append(str2);
        sb8.append('/');
        sb8.append(str);
        a3Var.b(assets, sb7, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("xlab/");
        java.lang.String str3 = p05.a3.f431979h;
        sb9.append(str3);
        a3Var.b(assets, sb9.toString(), str2 + '/' + str3);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("xlab/");
        java.lang.String str4 = p05.a3.f431980i;
        sb10.append(str4);
        a3Var.b(assets, sb10.toString(), str2 + '/' + str4);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("xlab/");
        java.lang.String str5 = p05.a3.f431975d;
        sb11.append(str5);
        a3Var.b(assets, sb11.toString(), str2 + '/' + str5);
        return jz5.f0.f384359a;
    }
}
