package bi4;

/* loaded from: classes11.dex */
public abstract class s1 {
    public static final void a(bi4.d1 d1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d1Var, "<this>");
        long c17 = c01.id.c();
        d1Var.f436476m = c17;
        d1Var.G = java.lang.String.valueOf(c17);
        java.lang.String str = d1Var.f436474h;
        if (str == null || r26.n0.N(str)) {
            d1Var.f436474h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
        }
        d1Var.F = ((java.lang.Number) qj4.s.f445491a.i(bk4.k1.a(), false).f384366d).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(bi4.d1 d1Var) {
        pj4.o0 o0Var;
        pj4.o0 o0Var2;
        pj4.o0 o0Var3;
        java.util.LinkedList linkedList;
        pj4.g0 g0Var;
        pj4.o0 o0Var4;
        pj4.o0 o0Var5;
        pj4.o0 o0Var6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d1Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isJumpPick] B1=");
        sb6.append(bk4.i.a().J());
        sb6.append(" B2=");
        sb6.append(bk4.i.a().G());
        sb6.append(" isIconValidForSet=");
        bk4.f a17 = bk4.i.a();
        pj4.b0 b0Var = d1Var.f436470d;
        java.lang.String str = null;
        str = null;
        sb6.append(a17.A((b0Var == null || (o0Var6 = b0Var.f436508g) == null) ? null : o0Var6.f436747e));
        sb6.append(" setStatusMode=");
        sb6.append(d1Var.f436482s);
        sb6.append(" iconId=");
        pj4.b0 b0Var2 = d1Var.f436470d;
        sb6.append((b0Var2 == null || (o0Var5 = b0Var2.f436508g) == null) ? null : o0Var5.f436747e);
        sb6.append(",action=");
        bk4.f a18 = bk4.i.a();
        pj4.b0 b0Var3 = d1Var.f436470d;
        pj4.o1 j17 = a18.j((b0Var3 == null || (o0Var4 = b0Var3.f436508g) == null) ? null : o0Var4.f436747e);
        sb6.append((j17 == null || (linkedList = j17.f436763f) == null || (g0Var = (pj4.g0) linkedList.getFirst()) == null) ? null : g0Var.mo12245xcc313de3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SetStatusParam", sb6.toString());
        if (d1Var.f436482s == 1) {
            return false;
        }
        if (bk4.i.a().J()) {
            pj4.b0 b0Var4 = d1Var.f436470d;
            java.lang.String str2 = (b0Var4 == null || (o0Var3 = b0Var4.f436508g) == null) ? null : o0Var3.f436747e;
            if ((str2 == null || str2.length() == 0) != false) {
                pj4.b0 b0Var5 = d1Var.f436470d;
                pj4.o0 o0Var7 = b0Var5 != null ? b0Var5.f436508g : null;
                if (o0Var7 != null) {
                    o0Var7.f436747e = "1080";
                }
                return false;
            }
        }
        if (bk4.i.a().G()) {
            pj4.b0 b0Var6 = d1Var.f436470d;
            java.lang.String str3 = (b0Var6 == null || (o0Var2 = b0Var6.f436508g) == null) ? null : o0Var2.f436747e;
            if ((str3 == null || str3.length() == 0) != false) {
                pj4.b0 b0Var7 = d1Var.f436470d;
                pj4.o0 o0Var8 = b0Var7 != null ? b0Var7.f436508g : null;
                if (o0Var8 != null) {
                    o0Var8.f436747e = "userdefine";
                }
                return false;
            }
        }
        pj4.b0 b0Var8 = d1Var.f436470d;
        if (b0Var8 != null && (o0Var = b0Var8.f436508g) != null) {
            str = o0Var.f436747e;
        }
        return android.text.TextUtils.isEmpty(str) || !bk4.i.a().A(str);
    }

    public static final void c(bi4.d1 d1Var, android.os.ResultReceiver resultReceiver, java.lang.String str, int i17, int i18) {
        pj4.g2 g2Var = new pj4.g2();
        g2Var.f436597f = true;
        pj4.b0 b0Var = d1Var.f436470d;
        if (b0Var.f436515q == 0) {
            b0Var.f436515q = c01.id.e();
        }
        b0Var.f436516r = b0Var.f436515q + 86400;
        if (g2Var.f436597f) {
            bk4.e1 e1Var = bk4.e1.f102993a;
            b0Var.f436522x = e1Var.a(e1Var.c());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            b0Var.f436507f = 0;
        } else {
            b0Var.f436507f = 1;
            g2Var.f436598g = str;
            g2Var.f436599h = str;
            b0Var.f436520v = i17;
            b0Var.f436521w = i18;
            g2Var.f436597f = false;
        }
        if (bi4.v1.j()) {
            b0Var.f436519u |= 64;
        }
        b0Var.f436519u = bk4.e1.f102993a.f(b0Var.f436519u);
        g2Var.f436595d = b0Var;
        java.lang.String str2 = g2Var.f436606r;
        if (str2 == null) {
            str2 = "";
        }
        g2Var.f436606r = str2;
        ((ku5.t0) ku5.t0.f394148d).h(new oj4.k(g2Var), "MicroMsg.TextStatus.UploadPackHelper");
        if (resultReceiver != null) {
            pj4.w wVar = new pj4.w();
            pj4.b0 b0Var2 = g2Var.f436595d;
            wVar.f436845e = b0Var2.f436508g.f436747e;
            wVar.f436844d = b0Var2.f436504J;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("select_status_info", wVar.mo14344x5f01b1f6());
            resultReceiver.send(-1, bundle);
        }
    }
}
