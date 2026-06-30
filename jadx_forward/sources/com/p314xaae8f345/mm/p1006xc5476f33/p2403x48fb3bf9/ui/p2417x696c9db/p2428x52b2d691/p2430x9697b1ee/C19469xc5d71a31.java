package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData */
/* loaded from: classes4.dex */
public final class C19469xc5d71a31 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31> f38777x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f267682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f267684f;

    public C19469xc5d71a31(java.util.List list, java.lang.String errmsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errmsg, "errmsg");
        this.f267682d = list;
        this.f267683e = errmsg;
        this.f267684f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f267682d;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb) it.next()).writeToParcel(out, i17);
            }
        }
        out.writeString(this.f267683e);
        out.writeInt(this.f267684f ? 1 : 0);
    }
}
