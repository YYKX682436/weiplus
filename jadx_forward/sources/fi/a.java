package fi;

/* loaded from: classes11.dex */
public class a implements fi.b {
    @Override // fi.b
    public boolean a(java.lang.String str, java.lang.String str2) {
        if (str.endsWith(" (deleted)")) {
            str = str.substring(0, str.length() - 10);
        } else if (str.endsWith("]")) {
            str = str.substring(0, str.length() - 1);
        }
        return !str2.contains("w") && (str.endsWith(".so") || str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99) || str.endsWith(".apk") || str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55753xc810596f) || str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628) || str.endsWith(".oat") || str.endsWith(".art") || str.endsWith(".ttf") || str.endsWith(".otf") || str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55691xbc9c2a15));
    }
}
