package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasFilterItem;", "Landroid/os/Parcelable;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem */
/* loaded from: classes5.dex */
public final /* data */ class C16996x6c653a3a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a> f37774x681a0c0c = new vt3.o();

    /* renamed from: d, reason: collision with root package name */
    public final vt3.m f237236d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237237e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f237238f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f237239g;

    /* renamed from: h, reason: collision with root package name */
    public final int f237240h;

    /* renamed from: i, reason: collision with root package name */
    public final float f237241i;

    public C16996x6c653a3a(vt3.m rvType, int i17, java.lang.String filterName, java.lang.String filterPath, int i18, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rvType, "rvType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterName, "filterName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterPath, "filterPath");
        this.f237236d = rvType;
        this.f237237e = i17;
        this.f237238f = filterName;
        this.f237239g = filterPath;
        this.f237240h = i18;
        this.f237241i = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m67894xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a c16996x6c653a3a = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a) obj;
        return this.f237236d == c16996x6c653a3a.f237236d && this.f237237e == c16996x6c653a3a.f237237e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237238f, c16996x6c653a3a.f237238f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237239g, c16996x6c653a3a.f237239g) && this.f237240h == c16996x6c653a3a.f237240h && java.lang.Float.compare(this.f237241i, c16996x6c653a3a.f237241i) == 0;
    }

    /* renamed from: hashCode */
    public int m67895x8cdac1b() {
        return (((((((((this.f237236d.hashCode() * 31) + java.lang.Integer.hashCode(this.f237237e)) * 31) + this.f237238f.hashCode()) * 31) + this.f237239g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f237240h)) * 31) + java.lang.Float.hashCode(this.f237241i);
    }

    /* renamed from: toString */
    public java.lang.String m67896x9616526c() {
        return "ImproveRecordMaasFilterItem(rvType=" + this.f237236d + ", filterType=" + this.f237237e + ", filterName=" + this.f237238f + ", filterPath=" + this.f237239g + ", bgColor=" + this.f237240h + ", intensity=" + this.f237241i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f237236d.name());
        out.writeInt(this.f237237e);
        out.writeString(this.f237238f);
        out.writeString(this.f237239g);
        out.writeInt(this.f237240h);
        out.writeFloat(this.f237241i);
    }

    public /* synthetic */ C16996x6c653a3a(vt3.m mVar, int i17, java.lang.String str, java.lang.String str2, int i18, float f17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? vt3.m.f521545f : mVar, i17, str, str2, i18, (i19 & 32) != 0 ? 1.0f : f17);
    }
}
