package rr;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final rr.s f480682a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f480683b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f480684c;

    static {
        rr.s sVar = new rr.s();
        f480682a = sVar;
        f480683b = sVar.c();
        f480684c = "_cover";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFileUtil", "vfs root " + sVar.c());
    }

    public final java.lang.String a() {
        return lp0.b.h() + "emoji/";
    }

    public final java.lang.String b() {
        return a() + "emoji_anim/";
    }

    public final java.lang.String c() {
        return com.p314xaae8f345.mm.vfs.q7.c("emoji") + '/';
    }

    public final java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return f480683b + str + f480684c;
    }
}
