package com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetFindersRequest;", "", dm.i4.f66875xa013b0d5, "", "timeLimit", "", "(Ljava/lang/String;J)V", "getTimeLimit", "()J", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_voip_status.GetFindersRequest */
/* loaded from: classes11.dex */
public final /* data */ class C24219xd944b198 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198.Companion(null);
    private final long timeLimit;
    private final java.lang.String username;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetFindersRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetFindersRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.flutter_voip_status.GetFindersRequest$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 m89574xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198(str, longValue);
        }
    }

    public C24219xd944b198(java.lang.String username, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.username = username;
        this.timeLimit = j17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 m89564x75149012(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 c24219xd944b198, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c24219xd944b198.username;
        }
        if ((i17 & 2) != 0) {
            j17 = c24219xd944b198.timeLimit;
        }
        return c24219xd944b198.m89567x2eaf75(str, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeLimit() {
        return this.timeLimit;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 m89567x2eaf75(java.lang.String username, long timeLimit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198(username, timeLimit);
    }

    /* renamed from: equals */
    public boolean m89568xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 c24219xd944b198 = (com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.username, c24219xd944b198.username) && this.timeLimit == c24219xd944b198.timeLimit;
    }

    /* renamed from: getTimeLimit */
    public final long m89569x8c3238() {
        return this.timeLimit;
    }

    /* renamed from: getUsername */
    public final java.lang.String m89570x6c03c64c() {
        return this.username;
    }

    /* renamed from: hashCode */
    public int m89571x8cdac1b() {
        return (this.username.hashCode() * 31) + java.lang.Long.hashCode(this.timeLimit);
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m89572xcc327db9() {
        return kz5.c0.i(this.username, java.lang.Long.valueOf(this.timeLimit));
    }

    /* renamed from: toString */
    public java.lang.String m89573x9616526c() {
        return "GetFindersRequest(username=" + this.username + ", timeLimit=" + this.timeLimit + ')';
    }
}
