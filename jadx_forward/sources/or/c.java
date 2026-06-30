package or;

/* loaded from: classes8.dex */
public abstract class c {
    public static final java.lang.String a(java.lang.String actionType, java.lang.String sessionId, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return c(actionType, sessionId, num, str, null, 16, null);
    }

    public static final java.lang.String b(java.lang.String actionType, java.lang.String sessionId, java.lang.Integer num, java.lang.String str, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("\"action_type\":\"" + actionType + '\"');
        if (num != null && num.intValue() > 0) {
            arrayList.add("\"source_count\":" + num);
        }
        if (!(str == null || str.length() == 0)) {
            arrayList.add("\"edit_sticker_info\":\"" + r26.i0.v(str, "\"", "\\\"", false, 4, null) + '\"');
        }
        arrayList.add("\"add_stickers_sessionid\":\"" + sessionId + '\"');
        if (num2 != null) {
            arrayList.add("\"pup_win_type\":" + num2.intValue());
        }
        return "{" + kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null) + '}';
    }

    public static /* synthetic */ java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.Integer num2, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            num = null;
        }
        if ((i17 & 8) != 0) {
            str3 = null;
        }
        if ((i17 & 16) != 0) {
            num2 = null;
        }
        return b(str, str2, num, str3, num2);
    }

    public static final java.lang.String d(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        return kz5.n0.g0(items, "#", null, null, 0, null, or.b.f428955d, 30, null);
    }
}
