package np4;

/* loaded from: classes10.dex */
public abstract class b {
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        if (c16993xacc19624 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by default:");
            return "";
        }
        java.lang.String string = c16993xacc19624.M.getString("key_click_tab_context_id", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by parse:" + string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        if (c16993xacc19624 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by default:");
            return "";
        }
        java.lang.String string = c16993xacc19624.M.getString("FINDER_CONTEXT_ID", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by parse:" + string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        if (c16993xacc19624 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getSessionId by default:");
            return "";
        }
        java.lang.String string = c16993xacc19624.M.getString("FINDER_SESSION_ID", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getSessionId by parse:" + string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }
}
