package xc3;

/* loaded from: classes.dex */
public final class a implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(args.length > 0 ? args[0] : "", "//mb")) {
            return false;
        }
        java.lang.String str2 = args.length > 1 ? args[1] : "";
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "demo")) {
            j45.l.j(context, "magicbrush", ".demo.ui.MagicBrushDemoActivity", new android.content.Intent(), null);
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "scl")) {
                return false;
            }
            j45.l.j(context, "magicbrush", ".scldemo.ui.MagicBrushSclDemoUI", new android.content.Intent(), null);
        }
        return true;
    }
}
