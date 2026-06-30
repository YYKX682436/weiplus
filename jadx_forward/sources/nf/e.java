package nf;

/* loaded from: classes7.dex */
public abstract class e {
    public static final java.lang.String a(org.json.JSONObject jSONObject, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return b(jSONObject, name, "");
    }

    public static final java.lang.String b(org.json.JSONObject jSONObject, java.lang.String name, java.lang.String fallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fallback, "fallback");
        java.lang.Object opt = jSONObject.opt(name);
        return opt instanceof java.lang.String ? (java.lang.String) opt : fallback;
    }

    public static final boolean c(java.lang.String str, java.lang.String prefix, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        if (r26.n0.N(prefix)) {
            return false;
        }
        if (!z17) {
            if (android.webkit.URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            } else if (android.webkit.URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
        }
        return nf.z.d(str, prefix);
    }

    public static boolean d(java.lang.String str, java.lang.String prefix, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        if (!z17) {
            if (android.webkit.URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            } else if (android.webkit.URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
        }
        return nf.z.d(str, prefix);
    }

    public static final java.util.ArrayList e(java.lang.Object[] objArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objArr, "<this>");
        return (java.util.ArrayList) kz5.z.C0(objArr);
    }

    public static final void f(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            block.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nf.d(block));
        }
    }
}
