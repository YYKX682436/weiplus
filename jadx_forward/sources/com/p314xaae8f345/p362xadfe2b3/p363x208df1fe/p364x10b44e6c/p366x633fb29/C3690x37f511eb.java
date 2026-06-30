package com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/tencent/liteapp/framework/dynamic_module/model/WXPLiteAppNetworkResponse;", "Lbd/a;", "", "", "", "toMap", "", "component1", "component2", "Ljava/nio/ByteBuffer;", "component3", "errCode", "errMsg", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "copy", "toString", "hashCode", "other", "", "equals", "I", "getErrCode", "()I", "Ljava/lang/String;", "getErrMsg", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "getData", "()Ljava/nio/ByteBuffer;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, "Ljava/util/Map;", "getExtraInfo", "()Ljava/util/Map;", "setExtraInfo", "(Ljava/util/Map;)V", "<init>", "(ILjava/lang/String;Ljava/nio/ByteBuffer;)V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse */
/* loaded from: classes9.dex */
public final /* data */ class C3690x37f511eb extends bd.a {
    private final java.nio.ByteBuffer data;
    private final int errCode;
    private final java.lang.String errMsg;
    private java.util.Map<java.lang.String, java.lang.String> extraInfo;

    public C3690x37f511eb(int i17, java.lang.String errMsg, java.nio.ByteBuffer byteBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.errCode = i17;
        this.errMsg = errMsg;
        this.data = byteBuffer;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb m28769x75149012(com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb c3690x37f511eb, int i17, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c3690x37f511eb.errCode;
        }
        if ((i18 & 2) != 0) {
            str = c3690x37f511eb.errMsg;
        }
        if ((i18 & 4) != 0) {
            byteBuffer = c3690x37f511eb.data;
        }
        return c3690x37f511eb.m28773x2eaf75(i17, str, byteBuffer);
    }

    /* renamed from: component1, reason: from getter */
    public final int getErrCode() {
        return this.errCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    /* renamed from: component3, reason: from getter */
    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb m28773x2eaf75(int errCode, java.lang.String errMsg, java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        return new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb(errCode, errMsg, data);
    }

    /* renamed from: equals */
    public boolean m28774xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb)) {
            return false;
        }
        com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb c3690x37f511eb = (com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb) other;
        return this.errCode == c3690x37f511eb.errCode && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.errMsg, c3690x37f511eb.errMsg) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.data, c3690x37f511eb.data);
    }

    /* renamed from: getData */
    public final java.nio.ByteBuffer m28775xfb7e5820() {
        return this.data;
    }

    /* renamed from: getErrCode */
    public final int m28776xe591acbc() {
        return this.errCode;
    }

    /* renamed from: getErrMsg */
    public final java.lang.String m28777x17ec12d2() {
        return this.errMsg;
    }

    /* renamed from: getExtraInfo */
    public final java.util.Map<java.lang.String, java.lang.String> m28778xf04f5628() {
        return this.extraInfo;
    }

    /* renamed from: hashCode */
    public int m28779x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.errCode) * 31) + this.errMsg.hashCode()) * 31;
        java.nio.ByteBuffer byteBuffer = this.data;
        return hashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode());
    }

    /* renamed from: setExtraInfo */
    public final void m28780x4ca3169c(java.util.Map<java.lang.String, java.lang.String> map) {
        this.extraInfo = map;
    }

    @Override // bd.a
    /* renamed from: toMap */
    public java.util.Map<java.lang.String, java.lang.Object> mo10162x69648e1() {
        java.util.Map<java.lang.String, java.lang.Object> l17 = kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(this.errCode)), new jz5.l("errMsg", this.errMsg));
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            l17.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, byteBuffer);
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.extraInfo;
        if (map != null) {
            l17.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, map);
        }
        return l17;
    }

    /* renamed from: toString */
    public java.lang.String m28781x9616526c() {
        return "WXPLiteAppNetworkResponse(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", data=" + this.data + ')';
    }
}
