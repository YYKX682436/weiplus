package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class e6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f100831a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f100832b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f100833c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100834d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x065d, code lost:
    
        if (r11 == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0714, code lost:
    
        if (r11 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06fc, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "getLabel but locItem is null");
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r12 != 20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        if (r19 == false) goto L64;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x02b1. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.fav.ui.e6 a(android.content.Context r23, o72.r2 r24) {
        /*
            Method dump skipped, instructions count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.e6.a(android.content.Context, o72.r2):com.tencent.mm.plugin.fav.ui.e6");
    }

    public static java.lang.String b(r45.pp0 pp0Var) {
        if (pp0Var != null) {
            return pp0Var.f383274o;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "getPoiname but locItem is null");
        return "";
    }

    public static boolean c(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public static void d(com.tencent.mm.plugin.fav.ui.e6 e6Var, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(o72.x1.I());
        if (str == null) {
            str = "";
        }
        sb6.append(kk.k.g(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        if (c(sb7)) {
            e6Var.f100833c = sb7;
        }
    }
}
