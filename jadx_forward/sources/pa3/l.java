package pa3;

/* loaded from: classes8.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String bizName, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                query = str;
            }
        }
        return "[" + bizName + "]<star>-[" + appId + '-' + page + "]-{" + query + '}';
    }
}
