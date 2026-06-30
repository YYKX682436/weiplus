package k52;

/* loaded from: classes15.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (b52.b.o(valueOf)) {
            java.lang.String r17 = b52.b.r(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "toHexString(...)");
            return r17;
        }
        try {
            java.lang.String r18 = b52.b.r(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "toHexString(...)");
            return r18;
        } catch (java.lang.Exception unused) {
            return valueOf;
        }
    }

    public final java.lang.String b(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (-1 == view.getId()) {
            return "-1";
        }
        try {
            java.lang.String resourceName = view.getResources().getResourceName(view.getId());
            if (resourceName == null) {
                return a(view.getId());
            }
            java.util.List f07 = r26.n0.f0(r26.i0.t(resourceName, "/", ":", false), new java.lang.String[]{":"}, false, 0, 6, null);
            return "R:" + ((java.lang.String) f07.get(1)) + ':' + ((java.lang.String) f07.get(2));
        } catch (android.content.res.Resources.NotFoundException unused) {
            return a(view.getId());
        }
    }

    public final java.lang.String c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b52.b.g(view.getClass().getName()));
        for (java.lang.Object parent = view.getParent(); parent != null && (parent instanceof android.view.View); parent = ((android.view.View) parent).getParent()) {
            sb6.append("|");
            sb6.append(b52.b.g(parent.getClass().getName()));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        java.lang.String g17;
        java.lang.String g18;
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str) || (g17 = b52.b.g(str2)) == null || (g18 = b52.b.g(str)) == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ViewUtil", "isViewCallerOk: " + g17 + ", " + g18);
        if (r26.i0.n(g17, "$", false)) {
            if (!r26.i0.y(g18, g17, false)) {
                return false;
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g17, g18)) {
            return false;
        }
        return true;
    }

    public final boolean e(r45.a07 viewNode, r45.b07 viewOp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewNode, "viewNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewOp, "viewOp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ViewUtil", "viewEqual: " + viewNode.f451134d + ", " + viewOp.f451950d + ", " + viewNode.f451135e + ", " + viewOp.f451955i);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewNode.f451134d, viewOp.f451950d) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewNode.f451135e, viewOp.f451955i)) {
            return d(viewNode.f451138h, viewOp.f451956m);
        }
        return false;
    }
}
