package lg4;

/* loaded from: classes5.dex */
public final class c implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final lg4.b f400111a = new lg4.b(null);

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        lg4.b bVar = f400111a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(args.length > 0 ? args[0] : "", "//surface")) {
            return false;
        }
        java.lang.String str = args.length > 1 ? args[1] : "";
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "ui")) {
            android.content.Intent intent = new android.content.Intent();
            if (args.length > 2) {
                intent.putStringArrayListExtra("appIds", nf.e.e(kz5.v.s(args, 2, args.length)));
            }
            j45.l.j(context, "surface", ".test.TestUI", intent, null);
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "downloadPkg")) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "clearpkg")) {
                if (!(r26.n0.B("mainProcess", str, false) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "preloadPs") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "mainScriptParallel"))) {
                    return false;
                }
                if (args.length > 2) {
                    boolean y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(args[2], false);
                    java.lang.String command = args.length > 1 ? args[1] : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MagicBrushDebugStorage").putBoolean("MagicBrushTestSwitch_".concat(command), y17);
                }
            } else if (com.p314xaae8f345.mm.vfs.w6.g(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Di().concat("mbpkgs/"), true)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572451b90);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                lg4.b.a(bVar, string);
            } else {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                lg4.b.a(bVar, string2);
            }
        }
        return true;
    }
}
