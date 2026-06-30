package xn4;

/* loaded from: classes11.dex */
public final class b0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f537134a;

    public b0(r45.mm6 mm6Var) {
        this.f537134a = mm6Var;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        xn4.c0.f537140d = false;
        r45.mm6 mm6Var = this.f537134a;
        if (num != null && num.intValue() == 0) {
            xn4.c0 c0Var = xn4.c0.f537137a;
            java.lang.String cdnUrl = mm6Var.f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
            xn4.c0.a(c0Var, c0Var.g(cdnUrl), new xn4.a0(mm6Var));
            java.lang.String cdnUrl2 = mm6Var.f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
            c0Var.i(cdnUrl2, 4);
            return null;
        }
        xn4.c0 c0Var2 = xn4.c0.f537137a;
        java.lang.String cdnUrl3 = mm6Var.f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl3, "cdnUrl");
        java.lang.String cdnUrl4 = mm6Var.f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl4, "cdnUrl");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").putInt(cdnUrl3, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(cdnUrl4, 0) + 1);
        java.lang.String cdnUrl5 = mm6Var.f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl5, "cdnUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(cdnUrl5, 0) < 2) {
            java.lang.String cdnUrl6 = mm6Var.f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl6, "cdnUrl");
            c0Var2.i(cdnUrl6, 0);
            return null;
        }
        xn4.e0 e0Var = xn4.e0.f537147d;
        java.lang.String newApkMd5 = mm6Var.f462204g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newApkMd5, "newApkMd5");
        e0Var.c(newApkMd5);
        java.lang.String cdnUrl7 = mm6Var.f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl7, "cdnUrl");
        c0Var2.i(cdnUrl7, 2);
        return null;
    }
}
