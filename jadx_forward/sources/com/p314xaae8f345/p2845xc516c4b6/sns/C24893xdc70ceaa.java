package com.p314xaae8f345.p2845xc516c4b6.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterContactInfo;", "", "userName", "", "displayName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.sns.SnsFlutterContactInfo */
/* loaded from: classes11.dex */
public final /* data */ class C24893xdc70ceaa {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa.Companion(null);
    private final java.lang.String displayName;
    private final java.lang.String userName;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/SnsFlutterContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.sns.SnsFlutterContactInfo$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa m92144xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa((java.lang.String) obj, (java.lang.String) obj2);
        }
    }

    public C24893xdc70ceaa(java.lang.String userName, java.lang.String displayName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        this.userName = userName;
        this.displayName = displayName;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa m92134x75149012(com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa c24893xdc70ceaa, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c24893xdc70ceaa.userName;
        }
        if ((i17 & 2) != 0) {
            str2 = c24893xdc70ceaa.displayName;
        }
        return c24893xdc70ceaa.m92137x2eaf75(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa m92137x2eaf75(java.lang.String userName, java.lang.String displayName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        return new com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa(userName, displayName);
    }

    /* renamed from: equals */
    public boolean m92138xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa c24893xdc70ceaa = (com.p314xaae8f345.p2845xc516c4b6.sns.C24893xdc70ceaa) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.userName, c24893xdc70ceaa.userName) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.displayName, c24893xdc70ceaa.displayName);
    }

    /* renamed from: getDisplayName */
    public final java.lang.String m92139x40021d37() {
        return this.displayName;
    }

    /* renamed from: getUserName */
    public final java.lang.String m92140x6bf53a6c() {
        return this.userName;
    }

    /* renamed from: hashCode */
    public int m92141x8cdac1b() {
        return (this.userName.hashCode() * 31) + this.displayName.hashCode();
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m92142xcc327db9() {
        return kz5.c0.i(this.userName, this.displayName);
    }

    /* renamed from: toString */
    public java.lang.String m92143x9616526c() {
        return "SnsFlutterContactInfo(userName=" + this.userName + ", displayName=" + this.displayName + ')';
    }
}
