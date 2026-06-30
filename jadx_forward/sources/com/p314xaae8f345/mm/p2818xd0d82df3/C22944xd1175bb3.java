package com.p314xaae8f345.mm.p2818xd0d82df3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/wexnet/TensorCpuB;", "", "dateType", "", "dataShape", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljava/nio/ByteBuffer;", "(I[ILjava/nio/ByteBuffer;)V", "getData", "()Ljava/nio/ByteBuffer;", "getDataShape", "()[I", "getDateType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.wexnet.TensorCpuB */
/* loaded from: classes5.dex */
public final /* data */ class C22944xd1175bb3 {
    private final java.nio.ByteBuffer data;
    private final int[] dataShape;
    private final int dateType;

    public C22944xd1175bb3(int i17, int[] dataShape, java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataShape, "dataShape");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.dateType = i17;
        this.dataShape = dataShape;
        this.data = data;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3 m83527x75149012(com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3 c22944xd1175bb3, int i17, int[] iArr, java.nio.ByteBuffer byteBuffer, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c22944xd1175bb3.dateType;
        }
        if ((i18 & 2) != 0) {
            iArr = c22944xd1175bb3.dataShape;
        }
        if ((i18 & 4) != 0) {
            byteBuffer = c22944xd1175bb3.data;
        }
        return c22944xd1175bb3.m83531x2eaf75(i17, iArr, byteBuffer);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDateType() {
        return this.dateType;
    }

    /* renamed from: component2, reason: from getter */
    public final int[] getDataShape() {
        return this.dataShape;
    }

    /* renamed from: component3, reason: from getter */
    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3 m83531x2eaf75(int dateType, int[] dataShape, java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataShape, "dataShape");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return new com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3(dateType, dataShape, data);
    }

    /* renamed from: equals */
    public boolean m83532xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3)) {
            return false;
        }
        com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3 c22944xd1175bb3 = (com.p314xaae8f345.mm.p2818xd0d82df3.C22944xd1175bb3) other;
        return this.dateType == c22944xd1175bb3.dateType && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.dataShape, c22944xd1175bb3.dataShape) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.data, c22944xd1175bb3.data);
    }

    /* renamed from: getData */
    public final java.nio.ByteBuffer m83533xfb7e5820() {
        return this.data;
    }

    /* renamed from: getDataShape */
    public final int[] m83534xe9161b61() {
        return this.dataShape;
    }

    /* renamed from: getDateType */
    public final int m83535xe6b5a97e() {
        return this.dateType;
    }

    /* renamed from: hashCode */
    public int m83536x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.dateType) * 31) + java.util.Arrays.hashCode(this.dataShape)) * 31) + this.data.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m83537x9616526c() {
        return "TensorCpuB(dateType=" + this.dateType + ", dataShape=" + java.util.Arrays.toString(this.dataShape) + ", data=" + this.data + ')';
    }
}
