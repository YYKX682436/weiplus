package com.tencent.mapsdk.core.components.protocol.jce.rtt;

/* loaded from: classes13.dex */
public final class RttRequest extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Integer> f48690a = new java.util.ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    static int f48691b = 0;

    /* renamed from: c, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Long> f48692c = null;

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f48693d = true;
    public java.util.ArrayList<java.lang.Integer> bounds;
    public java.util.ArrayList<java.lang.Long> crcs;
    public int type;
    public short zip;
    public short zoom;

    static {
        f48690a.add(0);
        f48691b = 0;
        f48692c = new java.util.ArrayList<>();
        f48692c.add(0L);
    }

    public RttRequest() {
        this.bounds = null;
        this.zoom = (short) 0;
        this.zip = (short) 0;
        this.type = com.tencent.mapsdk.internal.cu.f49169c.f49178a;
        this.crcs = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "navsns.RttRequest";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48693d) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a((java.util.Collection) this.bounds, "bounds");
        kVar.a(this.zoom, com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM);
        kVar.a(this.zip, "zip");
        kVar.a(this.type, "type");
        kVar.a((java.util.Collection) this.crcs, "crcs");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a((java.util.Collection) this.bounds, true);
        kVar.a(this.zoom, true);
        kVar.a(this.zip, true);
        kVar.a(this.type, true);
        kVar.a((java.util.Collection) this.crcs, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest rttRequest = (com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest) obj;
        return com.tencent.mapsdk.internal.q.a((java.lang.Object) this.bounds, (java.lang.Object) rttRequest.bounds) && com.tencent.mapsdk.internal.q.a(this.zoom, rttRequest.zoom) && com.tencent.mapsdk.internal.q.a(this.zip, rttRequest.zip) && com.tencent.mapsdk.internal.q.a(this.type, rttRequest.type) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.crcs, (java.lang.Object) rttRequest.crcs);
    }

    public final java.util.ArrayList<java.lang.Integer> getBounds() {
        return this.bounds;
    }

    public final java.util.ArrayList<java.lang.Long> getCrcs() {
        return this.crcs;
    }

    public final int getType() {
        return this.type;
    }

    public final short getZip() {
        return this.zip;
    }

    public final short getZoom() {
        return this.zoom;
    }

    public final int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.bounds = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48690a, 0, true);
        this.zoom = mVar.a(this.zoom, 1, true);
        this.zip = mVar.a(this.zip, 2, true);
        this.type = mVar.a(this.type, 3, false);
        this.crcs = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48692c, 4, false);
    }

    public final void setBounds(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.bounds = arrayList;
    }

    public final void setCrcs(java.util.ArrayList<java.lang.Long> arrayList) {
        this.crcs = arrayList;
    }

    public final void setType(int i17) {
        this.type = i17;
    }

    public final void setZip(short s17) {
        this.zip = s17;
    }

    public final void setZoom(short s17) {
        this.zoom = s17;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a((java.util.Collection) this.bounds, 0);
        nVar.a(this.zoom, 1);
        nVar.a(this.zip, 2);
        nVar.a(this.type, 3);
        java.util.ArrayList<java.lang.Long> arrayList = this.crcs;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 4);
        }
    }

    public RttRequest(java.util.ArrayList<java.lang.Integer> arrayList, short s17, short s18, int i17, java.util.ArrayList<java.lang.Long> arrayList2) {
        this.bounds = null;
        this.zoom = (short) 0;
        this.zip = (short) 0;
        int i18 = com.tencent.mapsdk.internal.cu.f49169c.f49178a;
        this.bounds = arrayList;
        this.zoom = s17;
        this.zip = s18;
        this.type = i17;
        this.crcs = arrayList2;
    }
}
