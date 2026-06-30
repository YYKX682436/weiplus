package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Args", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args */
/* loaded from: classes5.dex */
public final /* data */ class C19347xca10fe49 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49> f38742x681a0c0c = new fx4.b();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f265447d;

    /* renamed from: e, reason: collision with root package name */
    public final int f265448e;

    public C19347xca10fe49(byte[] listenLaterTingItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenLaterTingItem, "listenLaterTingItem");
        this.f265447d = listenLaterTingItem;
        this.f265448e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74412xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49 c19347xca10fe49 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2418x58d9bd6.C19347xca10fe49) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f265447d, c19347xca10fe49.f265447d) && this.f265448e == c19347xca10fe49.f265448e;
    }

    /* renamed from: hashCode */
    public int m74413x8cdac1b() {
        return (java.util.Arrays.hashCode(this.f265447d) * 31) + java.lang.Integer.hashCode(this.f265448e);
    }

    /* renamed from: toString */
    public java.lang.String m74414x9616526c() {
        return "Args(listenLaterTingItem=" + java.util.Arrays.toString(this.f265447d) + ", scene=" + this.f265448e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeByteArray(this.f265447d);
        out.writeInt(this.f265448e);
    }
}
