package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserAvatarInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/t", "MMUserAvatarItem", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MMUserAvatarInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.t CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.t(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f79464d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f79465e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79466f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79467g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f79468h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f79469i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f79470m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f79471n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f79472o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f79473p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f79474q;

    public MMUserAvatarInfo(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f79464d = new java.util.ArrayList();
        java.util.ArrayList readArrayList = in6.readArrayList(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo.MMUserAvatarItem.class.getClassLoader());
        this.f79464d = readArrayList == null ? new java.util.ArrayList() : readArrayList;
        this.f79465e = in6.readByte() != 0;
        this.f79466f = in6.readInt();
        this.f79467g = in6.readInt();
        this.f79468h = in6.readString();
        this.f79469i = in6.readString();
        this.f79470m = in6.readString();
        this.f79471n = in6.readString();
        this.f79472o = in6.readString();
        this.f79473p = in6.readString();
        this.f79474q = in6.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeList(this.f79464d);
        dest.writeByte(this.f79465e ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f79466f);
        dest.writeInt(this.f79467g);
        dest.writeString(this.f79468h);
        dest.writeString(this.f79469i);
        dest.writeString(this.f79470m);
        dest.writeString(this.f79471n);
        dest.writeString(this.f79472o);
        dest.writeString(this.f79473p);
        dest.writeString(this.f79474q);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserAvatarInfo$MMUserAvatarItem;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/u", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class MMUserAvatarItem implements android.os.Parcelable {
        public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.u CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.u(null);

        /* renamed from: d, reason: collision with root package name */
        public final int f79475d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f79476e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f79477f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f79478g;

        public MMUserAvatarItem(android.os.Parcel in6) {
            kotlin.jvm.internal.o.g(in6, "in");
            this.f79476e = "";
            this.f79477f = "";
            this.f79475d = in6.readInt();
            this.f79476e = java.lang.String.valueOf(in6.readString());
            this.f79477f = java.lang.String.valueOf(in6.readString());
            this.f79478g = in6.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int i17) {
            kotlin.jvm.internal.o.g(dest, "dest");
            dest.writeInt(this.f79475d);
            dest.writeString(this.f79476e);
            dest.writeString(this.f79477f);
            dest.writeString(this.f79478g);
        }

        public MMUserAvatarItem(r45.tv6 item) {
            kotlin.jvm.internal.o.g(item, "item");
            this.f79476e = "";
            this.f79477f = "";
            this.f79475d = item.f386822d;
            java.lang.String nickname = item.f386823e;
            kotlin.jvm.internal.o.f(nickname, "nickname");
            this.f79476e = nickname;
            java.lang.String avatarurl = item.f386824f;
            kotlin.jvm.internal.o.f(avatarurl, "avatarurl");
            this.f79477f = avatarurl;
            this.f79478g = item.f386825g;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MMUserAvatarInfo(r45.sv6 avatar_info) {
        this(avatar_info, "", "", "");
        kotlin.jvm.internal.o.g(avatar_info, "avatar_info");
    }

    public MMUserAvatarInfo(r45.sv6 avatar_info, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(avatar_info, "avatar_info");
        this.f79464d = new java.util.ArrayList();
        java.util.Iterator it = avatar_info.f385984d.iterator();
        while (it.hasNext()) {
            r45.tv6 tv6Var = (r45.tv6) it.next();
            java.util.ArrayList arrayList = this.f79464d;
            kotlin.jvm.internal.o.d(arrayList);
            kotlin.jvm.internal.o.d(tv6Var);
            arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo.MMUserAvatarItem(tv6Var));
        }
        this.f79465e = avatar_info.f385985e;
        this.f79466f = avatar_info.f385986f;
        this.f79467g = avatar_info.f385987g;
        this.f79468h = avatar_info.f385988h;
        this.f79469i = avatar_info.f385989i;
        this.f79470m = avatar_info.f385990m;
        this.f79471n = avatar_info.f385991n;
        this.f79472o = str2 == null ? "" : str2;
        this.f79473p = str == null ? "" : str;
        this.f79474q = str3 == null ? "" : str3;
    }
}
