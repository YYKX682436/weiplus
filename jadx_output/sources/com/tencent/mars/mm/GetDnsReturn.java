package com.tencent.mars.mm;

/* loaded from: classes6.dex */
public class GetDnsReturn {
    public int length;
    public int type = 0;
    public java.lang.String[] aryIps = new java.lang.String[50];

    /* loaded from: classes6.dex */
    public static class ResolveHostFlag {
        public static final int FLAGS_ALLINONE = 7;
        public static final int FLAGS_NEWDNS_DEFAULT = 5;
        public static final int FLAGS_SIMPLEDNS_DEFAULT = 6;
        public static final int FLAG_TRY_LOCALDNS = 4;
        public static final int FLAG_TRY_NEWDNS = 1;
        public static final int FLAG_TRY_SIMPLEDNS = 2;
    }

    /* loaded from: classes6.dex */
    public static class ResolveHostPriority {
        public static final int PRIORITY_NEWDNS_FIRST = 0;
        public static final int PRIORITY_SIMPLEDNS_FIRST = 1;
    }

    /* loaded from: classes6.dex */
    public static class ResolvedType {
        public static final int DEBUGIP = 3;
        public static final int LITERAL = 5;
        public static final int LOCALDNS = 2;
        public static final int NEWDNS = 1;
        public static final int NONE = 0;
        public static final int SIMPLEDNS = 4;
    }
}
