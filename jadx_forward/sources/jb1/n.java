package jb1;

/* loaded from: classes7.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(char c17) {
        if ('0' <= c17 && c17 < ':') {
            return c17 - '0';
        }
        char c18 = 'A';
        if (!('A' <= c17 && c17 < 'G')) {
            c18 = 'a';
            if (!('a' <= c17 && c17 < 'g')) {
                throw new java.lang.IllegalArgumentException("invalid hex char '" + c17 + '\'');
            }
        }
        return (c17 - c18) + 10;
    }
}
