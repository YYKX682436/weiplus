package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo */
/* loaded from: classes8.dex */
public class C16994x3ba8255 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255> f37772x681a0c0c = new ut3.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f237222d;

    public C16994x3ba8255() {
        this.f237222d = new java.util.HashMap();
    }

    public void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.f237222d.put(next, jSONObject.get(next));
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public java.lang.Object b(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = this.f237222d;
        return hashMap.get(str) != null ? hashMap.get(str) : obj;
    }

    public void c(java.lang.String str, java.lang.Object obj) {
        this.f237222d.put(str, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeSerializable(this.f237222d);
    }

    public C16994x3ba8255(android.os.Parcel parcel) {
        this.f237222d = new java.util.HashMap();
        this.f237222d = (java.util.HashMap) parcel.readSerializable();
    }
}
