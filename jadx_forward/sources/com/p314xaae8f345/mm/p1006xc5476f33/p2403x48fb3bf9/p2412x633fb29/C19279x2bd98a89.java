package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/model/AISummarySearchLogic$RequestParams", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams */
/* loaded from: classes.dex */
public final /* data */ class C19279x2bd98a89 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19279x2bd98a89> f38721x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f();

    /* renamed from: d, reason: collision with root package name */
    public final int f264258d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264259e;

    public C19279x2bd98a89(int i17, int i18) {
        this.f264258d = i17;
        this.f264259e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74267xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19279x2bd98a89)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19279x2bd98a89 c19279x2bd98a89 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19279x2bd98a89) obj;
        return this.f264258d == c19279x2bd98a89.f264258d && this.f264259e == c19279x2bd98a89.f264259e;
    }

    /* renamed from: hashCode */
    public int m74268x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f264258d) * 31) + java.lang.Integer.hashCode(this.f264259e);
    }

    /* renamed from: toString */
    public java.lang.String m74269x9616526c() {
        return "RequestParams(scene=" + this.f264258d + ", type=" + this.f264259e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f264258d);
        out.writeInt(this.f264259e);
    }
}
