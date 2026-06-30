package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeConversationData;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData */
/* loaded from: classes4.dex */
public final class C19466x3fbac4fb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb> f38774x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267669d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267670e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267671f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f267672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f267673h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f267674i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f267675m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f267676n;

    public C19466x3fbac4fb(java.lang.String sessionId, int i17, int i18, java.lang.String draftMsg, int i19, java.lang.String selfUsername, java.lang.String talker, java.lang.String digest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftMsg, "draftMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digest, "digest");
        this.f267669d = sessionId;
        this.f267670e = i17;
        this.f267671f = i18;
        this.f267672g = draftMsg;
        this.f267673h = i19;
        this.f267674i = selfUsername;
        this.f267675m = talker;
        this.f267676n = digest;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267669d);
        out.writeInt(this.f267670e);
        out.writeInt(this.f267671f);
        out.writeString(this.f267672g);
        out.writeInt(this.f267673h);
        out.writeString(this.f267674i);
        out.writeString(this.f267675m);
        out.writeString(this.f267676n);
    }
}
