package com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/gamelive/GameLiveCommonService$IPCLiveControlData", "Landroid/os/Parcelable;", "p60/l", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData */
/* loaded from: classes5.dex */
public final /* data */ class C10616xc4862b57 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57> f28881x681a0c0c = new p60.k();

    /* renamed from: d, reason: collision with root package name */
    public final p60.l f148641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148642e;

    /* renamed from: f, reason: collision with root package name */
    public final int f148643f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Parcelable f148644g;

    public C10616xc4862b57(p60.l action, java.lang.String str, int i17, android.os.Parcelable parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f148641d = action;
        this.f148642e = str;
        this.f148643f = i17;
        this.f148644g = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45038xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57 c10616xc4862b57 = (com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57) obj;
        return this.f148641d == c10616xc4862b57.f148641d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148642e, c10616xc4862b57.f148642e) && this.f148643f == c10616xc4862b57.f148643f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148644g, c10616xc4862b57.f148644g);
    }

    /* renamed from: hashCode */
    public int m45039x8cdac1b() {
        int hashCode = this.f148641d.hashCode() * 31;
        java.lang.String str = this.f148642e;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f148643f)) * 31;
        android.os.Parcelable parcelable = this.f148644g;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m45040x9616526c() {
        return "IPCLiveControlData(action=" + this.f148641d + ", appId=" + this.f148642e + ", versionType=" + this.f148643f + ", payload=" + this.f148644g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f148641d.name());
        out.writeString(this.f148642e);
        out.writeInt(this.f148643f);
        out.writeParcelable(this.f148644g, i17);
    }

    public /* synthetic */ C10616xc4862b57(p60.l lVar, java.lang.String str, int i17, android.os.Parcelable parcelable, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(lVar, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? null : parcelable);
    }
}
