package com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ting/AsyncResult;", "", "ret", "", "errorMessage", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "(JLjava/lang/String;[B)V", "getData", "()[B", "getErrorMessage", "()Ljava/lang/String;", "getRet", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.ting.AsyncResult */
/* loaded from: classes8.dex */
public final /* data */ class C24950x48e49199 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199.Companion(null);
    private final byte[] data;
    private final java.lang.String errorMessage;
    private final long ret;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/AsyncResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/AsyncResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.ting.AsyncResult$Companion, reason: from kotlin metadata */
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: fromList */
        public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199 m92411xb5cc5768(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(longValue, (java.lang.String) obj2, (byte[]) list.get(2));
        }
    }

    public C24950x48e49199(long j17, java.lang.String errorMessage, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        this.ret = j17;
        this.errorMessage = errorMessage;
        this.data = bArr;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199 m92399x75149012(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199 c24950x48e49199, long j17, java.lang.String str, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c24950x48e49199.ret;
        }
        if ((i17 & 2) != 0) {
            str = c24950x48e49199.errorMessage;
        }
        if ((i17 & 4) != 0) {
            bArr = c24950x48e49199.data;
        }
        return c24950x48e49199.m92403x2eaf75(j17, str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRet() {
        return this.ret;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199 m92403x2eaf75(long ret, java.lang.String errorMessage, byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(ret, errorMessage, data);
    }

    /* renamed from: equals */
    public boolean m92404xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199)) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199 c24950x48e49199 = (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199) other;
        return this.ret == c24950x48e49199.ret && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.errorMessage, c24950x48e49199.errorMessage) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.data, c24950x48e49199.data);
    }

    /* renamed from: getData */
    public final byte[] m92405xfb7e5820() {
        return this.data;
    }

    /* renamed from: getErrorMessage */
    public final java.lang.String m92406xa8aa7f55() {
        return this.errorMessage;
    }

    /* renamed from: getRet */
    public final long m92407xb588696b() {
        return this.ret;
    }

    /* renamed from: hashCode */
    public int m92408x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.ret) * 31) + this.errorMessage.hashCode()) * 31;
        byte[] bArr = this.data;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    /* renamed from: toList */
    public final java.util.List<java.lang.Object> m92409xcc327db9() {
        return kz5.c0.i(java.lang.Long.valueOf(this.ret), this.errorMessage, this.data);
    }

    /* renamed from: toString */
    public java.lang.String m92410x9616526c() {
        return "AsyncResult(ret=" + this.ret + ", errorMessage=" + this.errorMessage + ", data=" + java.util.Arrays.toString(this.data) + ')';
    }

    public /* synthetic */ C24950x48e49199(long j17, java.lang.String str, byte[] bArr, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, str, (i17 & 4) != 0 ? null : bArr);
    }
}
