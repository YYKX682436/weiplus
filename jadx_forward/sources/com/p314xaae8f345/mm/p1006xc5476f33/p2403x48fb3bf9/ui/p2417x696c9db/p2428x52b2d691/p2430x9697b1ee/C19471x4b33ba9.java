package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgList;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgList */
/* loaded from: classes8.dex */
public final class C19471x4b33ba9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19471x4b33ba9> f38779x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f267688d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f267689e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267690f;

    public C19471x4b33ba9(java.util.List list, boolean z17, java.lang.String errmsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errmsg, "errmsg");
        this.f267688d = list;
        this.f267689e = z17;
        this.f267690f = errmsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f267688d;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19465x658e4e73) it.next()).writeToParcel(out, i17);
            }
        }
        out.writeInt(this.f267689e ? 1 : 0);
        out.writeString(this.f267690f);
    }
}
