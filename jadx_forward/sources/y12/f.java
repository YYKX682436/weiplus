package y12;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f540392a = 0;

    static {
        o11.f fVar = new o11.f();
        fVar.f423610a = true;
        fVar.f423618i = 1;
        fVar.f423628s = false;
        fVar.a();
    }

    public static o11.g a(java.lang.String str, java.lang.String str2, int i17, java.lang.Object... objArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423615f = str2;
        fVar.f423620k = i17;
        fVar.f423619j = i17;
        fVar.f423635z = objArr;
        return fVar.a();
    }

    public static o11.g b(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.o(n22.m.g(), str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f423610a = true;
        fVar.f423611b = true;
        fVar.f423615f = o17;
        fVar.f423635z = objArr;
        return fVar.a();
    }

    public static o11.g c(java.lang.String str, java.lang.String str2, boolean z17, java.lang.Object... objArr) {
        java.lang.String d17 = gm0.j1.u().d();
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.o(n22.m.g(), str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f423610a = true;
        fVar.f423611b = true;
        fVar.f423615f = o17;
        fVar.f423616g = d17;
        fVar.f423635z = objArr;
        return fVar.a();
    }
}
