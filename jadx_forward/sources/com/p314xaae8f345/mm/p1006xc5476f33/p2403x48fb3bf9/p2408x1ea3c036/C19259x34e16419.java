package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* renamed from: com.tencent.mm.plugin.webview.luggage.FavUrlTask */
/* loaded from: classes8.dex */
public class C19259x34e16419 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19259x34e16419> f38716x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.m();

    /* renamed from: f, reason: collision with root package name */
    public int f263649f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f263650g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f263651h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f263652i;

    /* renamed from: m, reason: collision with root package name */
    public int f263653m;

    /* renamed from: n, reason: collision with root package name */
    public int f263654n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f263655o;

    public /* synthetic */ C19259x34e16419(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.m mVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f263649f = parcel.readInt();
        this.f263650g = parcel.readBundle();
        this.f263651h = parcel.readByte() == 1;
        this.f263652i = parcel.readByte() == 1;
        this.f263653m = parcel.readInt();
        this.f263654n = parcel.readInt();
        this.f263655o = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f263649f);
        parcel.writeBundle(this.f263650g);
        parcel.writeByte(this.f263651h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f263652i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f263653m);
        parcel.writeInt(this.f263654n);
        parcel.writeByte(this.f263655o ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        boolean z17;
        int i17 = this.f263649f;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
                c5432x35bb364f.f135776g.f90061a = 35;
                c5432x35bb364f.e();
                return;
            }
            if (i17 == 3) {
                j45.l.g("favorite");
                this.f263655o = true;
                return;
            }
            if (i17 != 4) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53();
            long j17 = this.f263650g.getLong("fav_local_id", -1L);
            am.w3 w3Var = c5296x2dd9a53.f135617g;
            w3Var.f89791a = j17;
            w3Var.f89793c = 11;
            c5296x2dd9a53.e();
            java.lang.Long valueOf = java.lang.Long.valueOf(w3Var.f89791a);
            am.x3 x3Var = c5296x2dd9a53.f135618h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", valueOf, java.lang.Boolean.valueOf(x3Var.f89876a));
            this.f263652i = x3Var.f89876a;
            return;
        }
        android.os.Bundle bundle = this.f263650g;
        if (bundle == null) {
            return;
        }
        long j18 = bundle.getLong("msg_id", Long.MIN_VALUE);
        java.lang.String string = this.f263650g.getString("msg_talker");
        java.lang.String string2 = this.f263650g.getString("sns_local_id");
        int i18 = this.f263650g.getInt("news_svr_id", 0);
        java.lang.String string3 = this.f263650g.getString("news_svr_tweetid");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (Long.MIN_VALUE != j18) {
            c4Var.f87854g = this.f263650g.getInt("message_index", 0);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.i(c5303xc75d2f73, j18, string);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd c6111xbfced4cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd();
            am.kx kxVar = c6111xbfced4cd.f136387g;
            kxVar.f88721b = string2;
            kxVar.f88722c = c5303xc75d2f73;
            kxVar.f88720a = this.f263650g.getString("rawUrl");
            c6111xbfced4cd.e();
            z17 = c6111xbfced4cd.f136388h.f88810a;
        } else {
            if (i18 == 0) {
                this.f263651h = true;
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51 c5872xad626b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51();
            am.np npVar = c5872xad626b51.f136179g;
            npVar.f88974a = 3;
            npVar.f88975b = c5303xc75d2f73;
            npVar.f88976c = i18;
            npVar.f88977d = string3;
            c5872xad626b51.e();
            z17 = c5872xad626b51.f136180h.f89104a;
        }
        if (z17) {
            java.lang.String string4 = this.f263650g.getString("prePublishId");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String a17 = c01.n2.a(string4);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("sendAppMsgScene", 2);
            c17.i("preChatName", this.f263650g.getString("preChatName"));
            c17.i("preMsgIndex", java.lang.Integer.valueOf(this.f263650g.getInt("preMsgIndex")));
            c17.i("prePublishId", string4);
            c17.i("preUsername", this.f263650g.getString("preUsername"));
            c17.i("getA8KeyScene", this.f263650g.getString("getA8KeyScene"));
            c17.i("referUrl", this.f263650g.getString("referUrl"));
            android.os.Bundle bundle2 = this.f263650g.getBundle("jsapiargs");
            if (bundle2 != null) {
                c17.i("adExtStr", bundle2.getString("key_snsad_statextstr"));
            }
            c4Var.f87855h = a17;
            c5303xc75d2f73.e();
        } else {
            if (c4Var.f87859l == 0) {
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cak;
            }
            c5303xc75d2f73.e();
        }
        this.f263653m = c5303xc75d2f73.f135624h.f87966a;
    }

    public C19259x34e16419() {
    }

    private C19259x34e16419(android.os.Parcel parcel) {
        v(parcel);
    }
}
