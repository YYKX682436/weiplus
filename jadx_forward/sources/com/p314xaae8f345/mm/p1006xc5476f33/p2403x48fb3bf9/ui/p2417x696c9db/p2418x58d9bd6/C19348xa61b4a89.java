package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Result", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result */
/* loaded from: classes4.dex */
public final /* data */ class C19348xa61b4a89 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89> f38743x681a0c0c = new fx4.c();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f265449d;

    public C19348xa61b4a89(boolean z17) {
        this.f265449d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74416xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89) && this.f265449d == ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19348xa61b4a89) obj).f265449d;
    }

    /* renamed from: hashCode */
    public int m74417x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f265449d);
    }

    /* renamed from: toString */
    public java.lang.String m74418x9616526c() {
        return "Result(success=" + this.f265449d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f265449d ? 1 : 0);
    }
}
