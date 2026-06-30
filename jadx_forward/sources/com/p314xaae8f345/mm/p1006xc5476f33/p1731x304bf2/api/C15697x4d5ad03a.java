package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api;

/* renamed from: com.tencent.mm.plugin.game.api.GameInputConfig */
/* loaded from: classes5.dex */
public class C15697x4d5ad03a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a> f36418x681a0c0c = new m33.t0();

    /* renamed from: atContentId */
    public java.lang.String f36419x7b1d2081;

    /* renamed from: atContext */
    public java.lang.String f36420xdbe631fc;

    /* renamed from: atLimit */
    public int f36421xd58ef748;

    /* renamed from: canSendWithoutText */
    public boolean f36422x2a24077d;

    /* renamed from: canShowAtSomeoneView */
    public boolean f36423xc2614a97;

    /* renamed from: contentText */
    public java.lang.String f36424xe8ce0946;

    /* renamed from: emoticonBoardViewType */
    public java.lang.String f36425x68c82b9f;

    /* renamed from: forceClearContent */
    public boolean f36426xa930abf7;

    /* renamed from: forceUserInterfaceStyle */
    public int f36427x386556ee;

    /* renamed from: hideImgBtn */
    public boolean f36428x374037b;

    /* renamed from: identifier */
    public java.lang.String f36429x9f88aca9;

    /* renamed from: isToolsProcess */
    public boolean f36430x51eb225e;

    /* renamed from: maxInputCharsCo */
    public int f36431x15842983;

    /* renamed from: maxInputCharsCount */
    public int f36432xdedc8898;

    /* renamed from: quickEmojiList */
    public java.lang.String f36433x67bb6697;

    /* renamed from: returnKeyType */
    public java.lang.String f36434x38797ee9;

    /* renamed from: showEmojiQuickInputView */
    public boolean f36435xa67e49cb;

    /* renamed from: stickBtmIfNonEmpty */
    public boolean f36436xf8e2c4c8;

    /* renamed from: textPlaceHolder */
    public java.lang.String f36437x6e4dc626;

    public C15697x4d5ad03a() {
        this.f36436xf8e2c4c8 = false;
        this.f36426xa930abf7 = false;
        this.f36431x15842983 = 1000;
        this.f36422x2a24077d = false;
        this.f36430x51eb225e = true;
        this.f36423xc2614a97 = false;
        this.f36432xdedc8898 = 1000;
        this.f36434x38797ee9 = "send";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f36437x6e4dc626);
        parcel.writeString(this.f36425x68c82b9f);
        parcel.writeString(this.f36424xe8ce0946);
        parcel.writeInt(this.f36436xf8e2c4c8 ? 1 : 0);
        parcel.writeInt(this.f36426xa930abf7 ? 1 : 0);
        parcel.writeInt(this.f36431x15842983);
        parcel.writeInt(this.f36422x2a24077d ? 1 : 0);
        parcel.writeString(this.f36429x9f88aca9);
        parcel.writeInt(this.f36430x51eb225e ? 1 : 0);
        parcel.writeInt(this.f36428x374037b ? 1 : 0);
        parcel.writeInt(this.f36427x386556ee);
        parcel.writeInt(this.f36435xa67e49cb ? 1 : 0);
        parcel.writeString(this.f36433x67bb6697);
        parcel.writeInt(this.f36432xdedc8898);
        parcel.writeString(this.f36434x38797ee9);
        parcel.writeInt(this.f36423xc2614a97 ? 1 : 0);
        parcel.writeString(this.f36419x7b1d2081);
        parcel.writeString(this.f36420xdbe631fc);
        parcel.writeInt(this.f36421xd58ef748);
    }

    public C15697x4d5ad03a(android.os.Parcel parcel) {
        this.f36436xf8e2c4c8 = false;
        this.f36426xa930abf7 = false;
        this.f36431x15842983 = 1000;
        this.f36422x2a24077d = false;
        this.f36430x51eb225e = true;
        this.f36423xc2614a97 = false;
        this.f36432xdedc8898 = 1000;
        this.f36434x38797ee9 = "send";
        this.f36437x6e4dc626 = parcel.readString();
        this.f36425x68c82b9f = parcel.readString();
        this.f36424xe8ce0946 = parcel.readString();
        this.f36436xf8e2c4c8 = parcel.readInt() == 1;
        this.f36426xa930abf7 = parcel.readInt() == 1;
        this.f36431x15842983 = parcel.readInt();
        this.f36422x2a24077d = parcel.readInt() == 1;
        this.f36429x9f88aca9 = parcel.readString();
        this.f36430x51eb225e = parcel.readInt() == 1;
        this.f36428x374037b = parcel.readInt() == 1;
        this.f36427x386556ee = parcel.readInt();
        this.f36435xa67e49cb = parcel.readInt() == 1;
        this.f36433x67bb6697 = parcel.readString();
        this.f36432xdedc8898 = parcel.readInt();
        this.f36434x38797ee9 = parcel.readString();
        this.f36423xc2614a97 = parcel.readInt() == 1;
        this.f36419x7b1d2081 = parcel.readString();
        this.f36420xdbe631fc = parcel.readString();
        this.f36421xd58ef748 = parcel.readInt();
    }
}
