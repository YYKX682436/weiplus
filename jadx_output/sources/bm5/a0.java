package bm5;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final bm5.b0 a(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        bm5.b0 b0Var = new bm5.b0();
        b0Var.f22532a = bm5.y.f22756i.a(f9Var, null);
        java.lang.String z07 = f9Var != null ? f9Var.z0() : null;
        if (z07 == null) {
            z07 = "";
        }
        b0Var.f22533b = z07;
        if (str == null) {
            str = "";
        }
        b0Var.f22534c = str;
        boolean A = r26.i0.A(str, "SERVERID://", false, 2, null);
        bm5.a0 a0Var = bm5.b0.f22531e;
        if (A) {
            b0Var.f22534c = a0Var.b(b0Var.f22534c, false);
        }
        if (str2 == null) {
            str2 = "";
        }
        b0Var.f22535d = str2;
        if (r26.i0.A(str2, "SERVERID://", false, 2, null)) {
            b0Var.f22535d = a0Var.b(b0Var.f22535d, true);
        }
        return b0Var;
    }

    public final java.lang.String b(java.lang.String svrIdName, boolean z17) {
        kotlin.jvm.internal.o.g(svrIdName, "svrIdName");
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            byte[] bytes = svrIdName.concat("_hd").getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        byte[] bytes2 = svrIdName.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        sb7.append(kk.k.g(bytes2));
        sb7.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        return sb7.toString();
    }
}
