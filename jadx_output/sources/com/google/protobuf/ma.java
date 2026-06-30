package com.google.protobuf;

/* loaded from: classes13.dex */
public abstract class ma {
    public static java.lang.String a(com.google.protobuf.y yVar) {
        return b(new com.google.protobuf.ja(yVar));
    }

    public static java.lang.String b(com.google.protobuf.la laVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(laVar.size());
        for (int i17 = 0; i17 < laVar.size(); i17++) {
            byte a17 = laVar.a(i17);
            if (a17 == 34) {
                sb6.append("\\\"");
            } else if (a17 == 39) {
                sb6.append("\\'");
            } else if (a17 != 92) {
                switch (a17) {
                    case 7:
                        sb6.append("\\a");
                        break;
                    case 8:
                        sb6.append("\\b");
                        break;
                    case 9:
                        sb6.append("\\t");
                        break;
                    case 10:
                        sb6.append("\\n");
                        break;
                    case 11:
                        sb6.append("\\v");
                        break;
                    case 12:
                        sb6.append("\\f");
                        break;
                    case 13:
                        sb6.append("\\r");
                        break;
                    default:
                        if (a17 < 32 || a17 > 126) {
                            sb6.append('\\');
                            sb6.append((char) (((a17 >>> 6) & 3) + 48));
                            sb6.append((char) (((a17 >>> 3) & 7) + 48));
                            sb6.append((char) ((a17 & 7) + 48));
                            break;
                        } else {
                            sb6.append((char) a17);
                            break;
                        }
                        break;
                }
            } else {
                sb6.append("\\\\");
            }
        }
        return sb6.toString();
    }
}
