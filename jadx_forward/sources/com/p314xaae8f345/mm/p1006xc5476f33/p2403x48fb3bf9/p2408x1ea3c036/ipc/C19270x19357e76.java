package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc;

/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask */
/* loaded from: classes8.dex */
public class C19270x19357e76 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19270x19357e76> f38719x681a0c0c = new sw4.m();

    /* renamed from: f, reason: collision with root package name */
    public sd.b f263763f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263764g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f263765h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f263766i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f263767m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f263768n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f263769o;

    public /* synthetic */ C19270x19357e76(android.os.Parcel parcel, sw4.l lVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f263764g = parcel.readString();
        this.f263765h = parcel.readString();
        this.f263766i = parcel.readString();
        this.f263767m = parcel.readString();
        this.f263768n = parcel.readString();
        this.f263769o = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f263764g);
        parcel.writeString(this.f263765h);
        parcel.writeString(this.f263766i);
        parcel.writeString(this.f263767m);
        parcel.writeString(this.f263768n);
        parcel.writeInt(this.f263769o ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        org.json.JSONObject jSONObject;
        if (!this.f263769o) {
            x();
        }
        if (this.f263763f != null) {
            try {
                jSONObject = android.text.TextUtils.isEmpty(this.f263767m) ? new org.json.JSONObject() : new org.json.JSONObject(this.f263767m);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiMMTask", e17, "runInClientProcess fail.", new java.lang.Object[0]);
                jSONObject = null;
            }
            if (android.text.TextUtils.isEmpty(this.f263768n)) {
                this.f263763f.c(this.f263766i, jSONObject);
                return;
            }
            sd.d dVar = this.f263763f.f488129a;
            if (dVar instanceof sd.a) {
                ((sd.a) dVar).mo64556x9a3f0ba2().b(this.f263768n, jSONObject);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5) java.lang.Class.forName(this.f263765h).newInstance()).d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f263764g, new sw4.l(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiMMTask", e17, "runInMainProcess fail.", new java.lang.Object[0]);
        }
    }

    public C19270x19357e76() {
        this.f263769o = false;
    }

    private C19270x19357e76(android.os.Parcel parcel) {
        this.f263769o = false;
        v(parcel);
    }
}
