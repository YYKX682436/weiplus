package aw4;

/* loaded from: classes13.dex */
public class s extends com.p314xaae8f345.p3210x3857dc.s0 {
    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String str;
        android.webkit.ConsoleMessage.MessageLevel messageLevel;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = consoleMessage != null ? java.lang.Integer.valueOf(consoleMessage.lineNumber()) : null;
        if (consoleMessage == null || (messageLevel = consoleMessage.messageLevel()) == null || (str = messageLevel.name()) == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = consoleMessage != null ? consoleMessage.message() : null;
        objArr[3] = consoleMessage != null ? consoleMessage.sourceId() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchChromeClient", "onConsoleMessage %d %s %s %s", objArr);
        return false;
    }
}
