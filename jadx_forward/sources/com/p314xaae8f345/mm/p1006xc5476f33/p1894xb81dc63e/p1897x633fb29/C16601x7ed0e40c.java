package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29;

/* renamed from: com.tencent.mm.plugin.multitask.model.MultiTaskInfo */
/* loaded from: classes8.dex */
public class C16601x7ed0e40c extends dm.h8 implements android.os.Parcelable {
    public static final l75.e0 A = dm.h8.m125034x3593deb(dm.h8.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c> f37692x681a0c0c = new lk3.a();

    public static org.json.JSONObject u0(java.lang.String str, int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("field_id", str);
            jSONObject.put("field_type", i17);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTaskInfo", e17, "convertMultiTaskToJSONObject fail, exception:%s", e17);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.h8, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    public r45.lr4 v0() {
        if (this.f66792x98981ec == null) {
            this.f66792x98981ec = new r45.lr4();
        }
        return this.f66792x98981ec;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f66791xc8a07680);
        parcel.writeInt(this.f66793x2262335f);
        parcel.writeLong(this.f66789xac3be4e);
        parcel.writeLong(this.f66794xa783a79b);
        parcel.writeString(this.f66792x98981ec.m75945x2fec8307(0));
        parcel.writeString(this.f66792x98981ec.m75945x2fec8307(1));
        parcel.writeString(this.f66792x98981ec.m75945x2fec8307(2));
        parcel.writeInt(this.f66792x98981ec.m75939xb282bd08(3));
        parcel.writeString(this.f66792x98981ec.m75945x2fec8307(4));
        parcel.writeString(this.f66792x98981ec.m75945x2fec8307(5));
        parcel.writeInt(this.f66792x98981ec.m75939xb282bd08(6));
        parcel.writeInt(this.f66792x98981ec.m75933x41a8a7f2(7) ? 1 : 0);
        parcel.writeInt(this.f66790x225a93cf.length);
        parcel.writeByteArray(this.f66790x225a93cf);
    }
}
