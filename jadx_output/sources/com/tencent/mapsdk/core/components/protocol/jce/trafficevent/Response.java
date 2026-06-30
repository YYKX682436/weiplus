package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

/* loaded from: classes13.dex */
public final class Response extends com.qq.taf.jce.MapJceStruct {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> f48708a = new java.util.ArrayList<>();
    public java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> detail;
    public short error;
    public java.lang.String msg;

    static {
        f48708a.add(new com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail());
    }

    public Response() {
        this.error = (short) 0;
        this.msg = "";
        this.detail = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.error = mVar.a(this.error, 0, true);
        this.msg = mVar.b(1, false);
        this.detail = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48708a, 2, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.error, 0);
        java.lang.String str = this.msg;
        if (str != null) {
            nVar.a(str, 1);
        }
        java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> arrayList = this.detail;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 2);
        }
    }

    public Response(short s17, java.lang.String str, java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> arrayList) {
        this.error = s17;
        this.msg = str;
        this.detail = arrayList;
    }
}
