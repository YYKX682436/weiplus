package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/media/camera/CameraSupportInfo;", "Landroid/os/Parcelable;", "CREATOR", "nr0/b", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.CameraSupportInfo */
/* loaded from: classes13.dex */
public final /* data */ class C10891x95c0498 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final nr0.b f29739x681a0c0c = new nr0.b(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f150389d;

    /* renamed from: e, reason: collision with root package name */
    public int f150390e;

    /* renamed from: f, reason: collision with root package name */
    public int f150391f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f150392g;

    public C10891x95c0498(java.lang.String id6, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        this.f150389d = id6;
        this.f150390e = i17;
        this.f150391f = i18;
        this.f150392g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46829xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498)) {
            return false;
        }
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c0498 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150389d, c10891x95c0498.f150389d) && this.f150390e == c10891x95c0498.f150390e && this.f150391f == c10891x95c0498.f150391f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150392g, c10891x95c0498.f150392g);
    }

    /* renamed from: hashCode */
    public int m46830x8cdac1b() {
        return (((((this.f150389d.hashCode() * 31) + java.lang.Integer.hashCode(this.f150390e)) * 31) + java.lang.Integer.hashCode(this.f150391f)) * 31) + this.f150392g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m46831x9616526c() {
        return "CameraSupportInfo(id=" + this.f150389d + ", lensFacing=" + this.f150390e + ", level=" + this.f150391f + ", str=" + this.f150392g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f150389d);
        parcel.writeInt(this.f150390e);
        parcel.writeInt(this.f150391f);
        parcel.writeString(this.f150392g);
    }

    public /* synthetic */ C10891x95c0498(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? -1 : i17, (i19 & 4) != 0 ? -1 : i18, (i19 & 8) != 0 ? "" : str2);
    }
}
