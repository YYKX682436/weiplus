package cf;

/* loaded from: classes13.dex */
public abstract class o {
    public static final void a(android.webkit.ConsoleMessage consoleMessage, java.lang.String tag, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        android.webkit.ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
        int i17 = messageLevel == null ? -1 : cf.n.f122364a[messageLevel.ordinal()];
        if (i17 != -1) {
            int i18 = 3;
            if (i17 != 1 && i17 != 2) {
                if (i17 != 3) {
                    i18 = 5;
                    if (i17 != 4) {
                        if (i17 != 5) {
                            throw new jz5.j();
                        }
                        i18 = 6;
                    }
                } else if (z17) {
                    i18 = 4;
                }
            }
            try {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.m96100xed3dc8ef(i18, tag, "ConsoleMessage: message:" + consoleMessage.message() + ", sourceId:" + consoleMessage.sourceId() + ", lineNumber:" + consoleMessage.lineNumber());
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
    }
}
