package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask */
/* loaded from: classes8.dex */
public final class C19548xc9500d9c extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c> f38798x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.d();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f270037h;

    /* renamed from: i, reason: collision with root package name */
    public int f270038i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f270039m;

    /* renamed from: com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq */
    /* loaded from: classes8.dex */
    public static class WepkgCheckReq implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq> f38799x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.e();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f270040d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f270041e;

        /* renamed from: f, reason: collision with root package name */
        public int f270042f;

        public WepkgCheckReq(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.a aVar) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f270040d);
            parcel.writeString(this.f270041e);
            parcel.writeInt(this.f270042f);
        }

        public WepkgCheckReq(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.a aVar) {
            this.f270040d = parcel.readString();
            this.f270041e = parcel.readString();
            this.f270042f = parcel.readInt();
        }
    }

    public /* synthetic */ C19548xc9500d9c(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.a aVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void B(android.os.Parcel parcel) {
        if (this.f270037h == null) {
            this.f270037h = new java.util.ArrayList();
        }
        parcel.readList(this.f270037h, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq.class.getClassLoader());
        this.f270038i = parcel.readInt();
        this.f270039m = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeList(this.f270037h);
        parcel.writeInt(this.f270038i);
        parcel.writeByte(this.f270039m ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f270037h)) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1313;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmgame-bin/checkwepkgversion";
        r45.c30 c30Var = new r45.c30();
        java.util.Iterator it = ((java.util.ArrayList) this.f270037h).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq wepkgCheckReq = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq) it.next();
            r45.m40 m40Var = new r45.m40();
            m40Var.f461669d = wepkgCheckReq.f270040d;
            m40Var.f461670e = wepkgCheckReq.f270041e;
            m40Var.f461671f = wepkgCheckReq.f270042f;
            c30Var.f452786d.add(m40Var);
        }
        lVar.f152197a = c30Var;
        lVar.f152198b = new r45.d30();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 15L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.c(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.c(this));
    }

    public C19548xc9500d9c() {
        this.f270037h = new java.util.ArrayList();
    }

    private C19548xc9500d9c(android.os.Parcel parcel) {
        v(parcel);
    }
}
