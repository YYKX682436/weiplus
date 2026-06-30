package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzabg */
/* loaded from: classes13.dex */
public final class C2150x6f02126 {
    public static java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e abstractC2383x394e5e) {
        java.lang.String str;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2151x6f02127 c2151x6f02127 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2151x6f02127(abstractC2383x394e5e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(c2151x6f02127.mo18878x35e001());
        for (int i17 = 0; i17 < c2151x6f02127.mo18878x35e001(); i17++) {
            int mo18879x394b64 = c2151x6f02127.mo18879x394b64(i17);
            if (mo18879x394b64 == 34) {
                str = "\\\"";
            } else if (mo18879x394b64 == 39) {
                str = "\\'";
            } else if (mo18879x394b64 != 92) {
                switch (mo18879x394b64) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo18879x394b64 < 32 || mo18879x394b64 > 126) {
                            sb6.append('\\');
                            sb6.append((char) (((mo18879x394b64 >>> 6) & 3) + 48));
                            sb6.append((char) (((mo18879x394b64 >>> 3) & 7) + 48));
                            mo18879x394b64 = (mo18879x394b64 & 7) + 48;
                        }
                        sb6.append((char) mo18879x394b64);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb6.append(str);
        }
        return sb6.toString();
    }
}
