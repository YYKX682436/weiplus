package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/a", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin */
/* loaded from: classes8.dex */
public final class C19481x7e1b7177 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.a f38785x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.a(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f268509d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f268510e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f268511f;

    /* renamed from: g, reason: collision with root package name */
    public int f268512g;

    /* renamed from: h, reason: collision with root package name */
    public int f268513h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m74789x9616526c() {
        java.lang.String format = java.lang.String.format("FinderFeedInfoForVideoPlugin{id: " + this.f268509d + ", isLike: " + this.f268510e + ", isFav: " + this.f268511f + ", likeCount: " + this.f268512g + ", favCount: " + this.f268513h + '}', java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f268509d);
        parcel.writeByte(this.f268510e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f268511f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f268512g);
        parcel.writeInt(this.f268513h);
    }
}
