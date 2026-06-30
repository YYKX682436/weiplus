package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiOpenAdCanvas$JsApiOpenAdCanvasTask<Service extends com.tencent.mm.plugin.appbrand.jsapi.l> extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.advertise.q();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f78710f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f78711g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78712h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78713i;

    /* renamed from: m, reason: collision with root package name */
    public int f78714m;

    /* renamed from: n, reason: collision with root package name */
    public int f78715n;

    /* renamed from: o, reason: collision with root package name */
    public int f78716o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78717p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78718q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78719r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78720s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78721t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f78722u;

    public JsApiOpenAdCanvas$JsApiOpenAdCanvasTask(com.tencent.mm.plugin.appbrand.jsapi.advertise.r rVar, Service service, int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f78710f = new java.lang.ref.WeakReference(rVar);
        this.f78711g = new java.lang.ref.WeakReference(service);
        this.f78712h = i17;
        this.f78713i = str;
        this.f78714m = i18;
        this.f78715n = i19;
        this.f78717p = str2;
        ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        java.lang.String a17 = n74.d2.a(str3, 28);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDecodeUxInfoInAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        this.f78718q = a17;
        this.f78716o = i27;
        this.f78720s = str4;
        this.f78721t = str5;
        this.f78722u = str6;
    }

    public final void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, mq0.z zVar, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(this.f78722u)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.advertise.r.E(lVar, new org.json.JSONObject(this.f78722u), zVar, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] reportFullLinkFromTask failed", e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78713i = parcel.readString();
        this.f78714m = parcel.readInt();
        this.f78715n = parcel.readInt();
        this.f78717p = parcel.readString();
        this.f78718q = parcel.readString();
        this.f78719r = parcel.readString();
        this.f78716o = parcel.readInt();
        this.f78720s = parcel.readString();
        this.f78721t = parcel.readString();
        this.f78722u = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78713i);
        parcel.writeInt(this.f78714m);
        parcel.writeInt(this.f78715n);
        parcel.writeString(this.f78717p);
        parcel.writeString(this.f78718q);
        parcel.writeString(this.f78719r);
        parcel.writeInt(this.f78716o);
        parcel.writeString(this.f78720s);
        parcel.writeString(this.f78721t);
        parcel.writeString(this.f78722u);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.jsapi.advertise.r rVar = (com.tencent.mm.plugin.appbrand.jsapi.advertise.r) this.f78710f.get();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78711g.get();
        if (rVar == null || lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenAdCanvas", "hy: lost context!!");
            return;
        }
        java.lang.String str = this.f78719r;
        int i17 = this.f78714m;
        int i18 = this.f78712h;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            if (str == null) {
                str = "";
            }
            intent.putExtra("sns_landing_pages_xml", str);
            intent.putExtra("sns_landing_pages_pageid", com.tencent.mm.sdk.platformtools.t8.E1(this.f78713i));
            intent.putExtra("sns_landig_pages_from_source", 28);
            intent.putExtra("sns_landing_pages_extra", this.f78717p);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_no_store", this.f78715n);
            intent.putExtra("sns_landing_pages_ad_info", this.f78718q);
            intent.putExtra("sns_landing_is_native_sight_ad", this.f78716o == 1);
            intent.putExtra("sns_landing_page_canvas_dynamicinfo", this.f78720s);
            intent.putExtra("sns_landing_page_canvas_ext_dynamicinfo", this.f78721t);
            rVar.F(lVar, intent, i18);
        } else if (i17 == 1) {
            lVar.a(i18, rVar.o("ok"));
            B(lVar, mq0.z.f330648v, "");
        } else {
            lVar.a(i18, rVar.o("fail"));
            B(lVar, mq0.z.f330649w, "fail");
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        s75.d.b(new com.tencent.mm.plugin.appbrand.jsapi.advertise.p(this), "JsApiOpenAdCanvas");
    }

    public JsApiOpenAdCanvas$JsApiOpenAdCanvasTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
