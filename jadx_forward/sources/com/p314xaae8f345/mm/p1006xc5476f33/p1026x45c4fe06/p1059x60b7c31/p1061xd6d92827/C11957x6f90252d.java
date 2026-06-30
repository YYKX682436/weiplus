package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask */
/* loaded from: classes.dex */
public class C11957x6f90252d<Service extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l> extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.C11957x6f90252d> f33692x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.q();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f160243f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f160244g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160245h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160246i;

    /* renamed from: m, reason: collision with root package name */
    public int f160247m;

    /* renamed from: n, reason: collision with root package name */
    public int f160248n;

    /* renamed from: o, reason: collision with root package name */
    public int f160249o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160250p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160251q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160252r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160253s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160254t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f160255u;

    public C11957x6f90252d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r rVar, Service service, int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f160243f = new java.lang.ref.WeakReference(rVar);
        this.f160244g = new java.lang.ref.WeakReference(service);
        this.f160245h = i17;
        this.f160246i = str;
        this.f160247m = i18;
        this.f160248n = i19;
        this.f160250p = str2;
        ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        java.lang.String a17 = n74.d2.a(str3, 28);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        this.f160251q = a17;
        this.f160249o = i27;
        this.f160253s = str4;
        this.f160254t = str5;
        this.f160255u = str6;
    }

    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, mq0.z zVar, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(this.f160255u)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r.E(lVar, new org.json.JSONObject(this.f160255u), zVar, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] reportFullLinkFromTask failed", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160246i = parcel.readString();
        this.f160247m = parcel.readInt();
        this.f160248n = parcel.readInt();
        this.f160250p = parcel.readString();
        this.f160251q = parcel.readString();
        this.f160252r = parcel.readString();
        this.f160249o = parcel.readInt();
        this.f160253s = parcel.readString();
        this.f160254t = parcel.readString();
        this.f160255u = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160246i);
        parcel.writeInt(this.f160247m);
        parcel.writeInt(this.f160248n);
        parcel.writeString(this.f160250p);
        parcel.writeString(this.f160251q);
        parcel.writeString(this.f160252r);
        parcel.writeInt(this.f160249o);
        parcel.writeString(this.f160253s);
        parcel.writeString(this.f160254t);
        parcel.writeString(this.f160255u);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r) this.f160243f.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f160244g.get();
        if (rVar == null || lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenAdCanvas", "hy: lost context!!");
            return;
        }
        java.lang.String str = this.f160252r;
        int i17 = this.f160247m;
        int i18 = this.f160245h;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            if (str == null) {
                str = "";
            }
            intent.putExtra("sns_landing_pages_xml", str);
            intent.putExtra("sns_landing_pages_pageid", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(this.f160246i));
            intent.putExtra("sns_landig_pages_from_source", 28);
            intent.putExtra("sns_landing_pages_extra", this.f160250p);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_no_store", this.f160248n);
            intent.putExtra("sns_landing_pages_ad_info", this.f160251q);
            intent.putExtra("sns_landing_is_native_sight_ad", this.f160249o == 1);
            intent.putExtra("sns_landing_page_canvas_dynamicinfo", this.f160253s);
            intent.putExtra("sns_landing_page_canvas_ext_dynamicinfo", this.f160254t);
            rVar.F(lVar, intent, i18);
        } else if (i17 == 1) {
            lVar.a(i18, rVar.o("ok"));
            B(lVar, mq0.z.f412181v, "");
        } else {
            lVar.a(i18, rVar.o("fail"));
            B(lVar, mq0.z.f412182w, "fail");
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.p(this), "JsApiOpenAdCanvas");
    }

    public C11957x6f90252d(android.os.Parcel parcel) {
        v(parcel);
    }
}
