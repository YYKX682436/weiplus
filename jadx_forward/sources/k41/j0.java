package k41;

/* loaded from: classes9.dex */
public final class j0 {
    public j0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final k41.k0 a(java.lang.String str) {
        int L;
        if (str == null || str.length() == 0) {
            return null;
        }
        k41.k0 k0Var = new k41.k0();
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        int length = str.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z17 ? i17 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                }
                length--;
            } else if (z18) {
                i17++;
            } else {
                z17 = true;
            }
        }
        java.lang.String obj = str.subSequence(i17, length + 1).toString();
        if (!r26.i0.A(obj, "<", false, 2, null) && (L = r26.n0.L(obj, ":", 0, false, 6, null)) != -1) {
            obj = obj.substring(L + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "substring(...)");
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(obj, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuContactCardContent", "kefuCard parse xml invalid");
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.$username");
            if (str3 == null) {
                str3 = "";
            }
            k0Var.f385550a = str3;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.$nickname");
            if (str4 == null) {
                str4 = "";
            }
            k0Var.f385551b = str4;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.$sex");
            if (str5 == null) {
                str5 = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
            java.lang.String str6 = (java.lang.String) d17.get(".msg.$bigheadimgurl");
            if (str6 == null) {
                str6 = "";
            }
            k0Var.f385552c = str6;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.$smallheadimgurl");
            if (str7 == null) {
                str7 = "";
            }
            k0Var.f385553d = str7;
            java.lang.String str8 = (java.lang.String) d17.get(".msg.$openimdesc");
            if (str8 == null) {
                str8 = "";
            }
            k0Var.f385555f = str8;
            java.lang.String str9 = (java.lang.String) d17.get(".msg.$openimdescicon");
            if (str9 == null) {
                str9 = "";
            }
            k0Var.f385554e = str9;
            java.lang.String str10 = (java.lang.String) d17.get(".msg.$ticket");
            if (str10 != null) {
                str2 = str10;
            }
            k0Var.f385556g = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuContactCardContent", "kefuCard parse user: " + k0Var.f385550a + ", headImageUrl: " + k0Var.f385552c + ", " + k0Var.f385553d + ", ticket: " + k0Var.f385556g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMKefuContactCardContent", e17, "kefuCard parse exception", new java.lang.Object[0]);
        }
        return k0Var;
    }
}
