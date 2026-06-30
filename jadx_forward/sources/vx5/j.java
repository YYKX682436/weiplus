package vx5;

/* loaded from: classes13.dex */
public class j implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27844x582d0256 {
    public j(vx5.l lVar) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.InterfaceC27844x582d0256
    /* renamed from: onLogMessage */
    public void mo120287x8781df62(int i17, java.lang.String str, int i18, java.lang.String str2) {
        if (str != null && str.contains("/")) {
            str = "XWeb.Core";
        } else if (str != null && !str.startsWith("XWeb.Core.")) {
            str = "XWeb.Core.".concat(str);
        }
        if (str2 != null && str2.contains("XWeb.Core.")) {
            str2 = str2.replaceFirst("XWeb.Core.", "");
        }
        by5.c4.f(str, str2);
    }
}
