package t22;

/* loaded from: classes10.dex */
public final class m implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureCommand", "processCommand: ".concat(kz5.z.d0(args, " ", null, null, 0, null, null, 62, null)));
        if (args.length <= 1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(args[1], "sticker") || args.length <= 2) {
            return false;
        }
        java.lang.String str = args[2];
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "clean")) {
            v85.e eVar = v85.e.f515636a;
            v85.e.f515641f.f465243d.clear();
            eVar.b();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "assets")) {
            p05.a3.f431972a.a();
        }
        return true;
    }
}
