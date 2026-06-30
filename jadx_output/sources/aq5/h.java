package aq5;

/* loaded from: classes5.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(bw5.wd0 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.h.a(bw5.wd0):java.lang.String");
    }

    public static final java.lang.String b(bw5.ge0 ge0Var) {
        kotlin.jvm.internal.o.g(ge0Var, "<this>");
        return r26.b0.b("\n    MigrateMsgUserInfo {\n      url: \\\"" + ge0Var.getHeadImgUrl() + "\\\",\n      nick_name: \\\"" + ge0Var.getNickName() + "\\\"\n    }");
    }

    public static final java.lang.String c(bw5.yf0 yf0Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(yf0Var, "<this>");
        boolean[] zArr = yf0Var.f35473i;
        boolean z17 = zArr[3];
        if (z17) {
            bw5.wd0 wd0Var = z17 ? yf0Var.f35470f : new bw5.wd0();
            kotlin.jvm.internal.o.d(wd0Var);
            str = a(wd0Var);
        } else {
            str = "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n    NearConnectionInitResult {\n      success: ");
        sb6.append(yf0Var.f35468d);
        sb6.append(",\n      need_send_msg: ");
        sb6.append(yf0Var.f35469e);
        sb6.append(",\n      device_info: ");
        sb6.append(str);
        sb6.append(",\n      error_code: ");
        sb6.append(yf0Var.f35471g);
        sb6.append(",\n      error_msg: \\\"");
        sb6.append(zArr[5] ? yf0Var.f35472h : "");
        sb6.append("\\\"\n    }");
        return r26.b0.b(sb6.toString());
    }
}
