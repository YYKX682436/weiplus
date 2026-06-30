package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

/* loaded from: classes13.dex */
public final class Detail extends com.qq.taf.jce.MapJceStruct {

    /* renamed from: a, reason: collision with root package name */
    static com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic f48706a = new com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic();

    /* renamed from: b, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Float> f48707b = new java.util.ArrayList<>();
    public com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic;
    public java.util.ArrayList<java.lang.Float> coord;

    static {
        f48707b.add(java.lang.Float.valueOf(0.0f));
    }

    public Detail() {
        this.basic = null;
        this.coord = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.basic = (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic) mVar.a((com.tencent.mapsdk.internal.p) f48706a, 0, true);
        this.coord = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48707b, 1, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a((com.tencent.mapsdk.internal.p) this.basic, 0);
        java.util.ArrayList<java.lang.Float> arrayList = this.coord;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 1);
        }
    }

    public Detail(com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic, java.util.ArrayList<java.lang.Float> arrayList) {
        this.basic = basic;
        this.coord = arrayList;
    }
}
