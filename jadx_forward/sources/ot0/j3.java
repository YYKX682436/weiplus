package ot0;

/* loaded from: classes12.dex */
public final class j3 {
    public j3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ot0.k3 a(java.lang.String method, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        return new ot0.k3("ORM count (" + i17 + ") != SQL count (" + i18 + ") for method: " + method, null, 2, null);
    }

    public final ot0.k3 b(java.lang.String method, java.lang.String detail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detail, "detail");
        return new ot0.k3("Cursor results mismatch for method: " + method + '\n' + detail, null, 2, null);
    }

    public final ot0.k3 c(java.lang.String method, java.util.List ormArray, java.util.List sqlArray) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ormArray, "ormArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sqlArray, "sqlArray");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(kz5.n0.g0(kz5.n0.K0(ormArray, 10), ", ", null, null, 0, null, null, 62, null));
        java.lang.String str2 = "";
        if (ormArray.size() > 10) {
            str = "... (total: " + ormArray.size() + ')';
        } else {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(kz5.n0.g0(kz5.n0.K0(sqlArray, 10), ", ", null, null, 0, null, null, 62, null));
        if (sqlArray.size() > 10) {
            str2 = "... (total: " + sqlArray.size() + ')';
        }
        sb8.append(str2);
        return new ot0.k3("ORM int array != SQL int array for method: " + method + "\nORM: [" + sb7 + "]\nSQL: [" + sb8.toString() + ']', null, 2, null);
    }

    public final ot0.k3 d(java.lang.String method, java.util.List ormMsgIds, java.util.List sqlMsgIds) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ormMsgIds, "ormMsgIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sqlMsgIds, "sqlMsgIds");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(kz5.n0.g0(kz5.n0.K0(ormMsgIds, 10), ", ", null, null, 0, null, null, 62, null));
        java.lang.String str2 = "";
        if (ormMsgIds.size() > 10) {
            str = "... (total: " + ormMsgIds.size() + ')';
        } else {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(kz5.n0.g0(kz5.n0.K0(sqlMsgIds, 10), ", ", null, null, 0, null, null, 62, null));
        if (sqlMsgIds.size() > 10) {
            str2 = "... (total: " + sqlMsgIds.size() + ')';
        }
        sb8.append(str2);
        return new ot0.k3("ORM msgIds != SQL msgIds for method: " + method + "\nORM: [" + sb7 + "]\nSQL: [" + sb8.toString() + ']', null, 2, null);
    }

    public final ot0.k3 e(java.lang.String method, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        return new ot0.k3("ORM msgId (" + j17 + ") != SQL msgId (" + j18 + ") for method: " + method, null, 2, null);
    }

    public final ot0.k3 f(java.lang.String method, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        return new ot0.k3("ORM string ('" + str + "') != SQL string ('" + str2 + "') for method: " + method, null, 2, null);
    }
}
