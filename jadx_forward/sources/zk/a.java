package zk;

/* loaded from: classes8.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i17);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '_' && charAt != '-') {
                z17 = false;
            }
            if (!z17) {
                return false;
            }
            i17++;
        }
    }

    public final java.lang.String b() {
        try {
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            java.lang.String o17 = lp0.b.h0("secure_chat_records_provider").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o17);
            if (!r26.n0.N(o17)) {
                return o17;
            }
            return null;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getFilePathChatRecords: fileDirectoryPath is null");
            return null;
        }
    }

    public final java.lang.String c(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (!a(sessionId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getFilePathChatRecords: sessionId is malicious, ".concat(sessionId));
            return null;
        }
        java.lang.String b17 = b();
        java.lang.String concat = b17 != null ? b17.concat("/chat_records") : null;
        if (concat == null) {
            return null;
        }
        return concat + '_' + sessionId;
    }

    public final android.net.Uri d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.net.Uri parse = android.net.Uri.parse("content://" + context.getPackageName() + ".app.provider.ShareableChatRecords/");
        if (parse != null) {
            return parse;
        }
        android.net.Uri EMPTY = android.net.Uri.EMPTY;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EMPTY, "EMPTY");
        return EMPTY;
    }
}
