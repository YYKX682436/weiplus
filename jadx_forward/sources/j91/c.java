package j91;

/* loaded from: classes7.dex */
public abstract class c {
    public static final boolean a(java.lang.String chatToolMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "allPage") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "subpackage");
    }

    public static final boolean b(boolean z17, java.util.List list, java.lang.String str) {
        if (z17) {
            return true;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatToolUtil", "chatToolInfos is null, path:" + str + " return false");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatToolUtil", "targetPath:" + str + " is null, return false");
            return false;
        }
        java.lang.String n17 = u46.l.n(nf.z.a(str), ".html");
        ph1.i0 i0Var = ph1.i0.f435865a;
        java.lang.String[] e17 = i0Var.e(n17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String root = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1) it.next()).f158936d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(root, "root");
            if (i0Var.f(e17, i0Var.e(root))) {
                return true;
            }
        }
        return false;
    }
}
