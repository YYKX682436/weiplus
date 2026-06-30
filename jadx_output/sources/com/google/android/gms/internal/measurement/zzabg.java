package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzabg {
    public static java.lang.String zza(com.google.android.gms.internal.measurement.zzyw zzywVar) {
        java.lang.String str;
        com.google.android.gms.internal.measurement.zzabh zzabhVar = new com.google.android.gms.internal.measurement.zzabh(zzywVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(zzabhVar.size());
        for (int i17 = 0; i17 < zzabhVar.size(); i17++) {
            int zzae = zzabhVar.zzae(i17);
            if (zzae == 34) {
                str = "\\\"";
            } else if (zzae == 39) {
                str = "\\'";
            } else if (zzae != 92) {
                switch (zzae) {
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
                        if (zzae < 32 || zzae > 126) {
                            sb6.append('\\');
                            sb6.append((char) (((zzae >>> 6) & 3) + 48));
                            sb6.append((char) (((zzae >>> 3) & 7) + 48));
                            zzae = (zzae & 7) + 48;
                        }
                        sb6.append((char) zzae);
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
