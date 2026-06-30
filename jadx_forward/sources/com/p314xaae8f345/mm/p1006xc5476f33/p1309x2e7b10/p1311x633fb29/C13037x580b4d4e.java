package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29;

/* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo */
/* loaded from: classes15.dex */
public class C13037x580b4d4e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e> f35391x681a0c0c = new xt1.c();
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f176179J;
    public java.lang.String K;
    public java.lang.String L;
    public final java.util.LinkedList M;
    public final java.util.LinkedList N;
    public java.lang.String P;
    public int Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public int X;
    public java.lang.String Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f176180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f176181e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176182f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f176183g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f176184h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f176185i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f176186m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f176187n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f176188o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f176189p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f176190p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f176191q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f176192r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f176193s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f176194t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f176195u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f176196v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176197w;

    /* renamed from: x, reason: collision with root package name */
    public int f176198x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f176199x0;

    /* renamed from: y, reason: collision with root package name */
    public int f176200y;

    /* renamed from: z, reason: collision with root package name */
    public int f176201z;

    /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AcceptedCardItem */
    /* loaded from: classes15.dex */
    public static class AcceptedCardItem implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem> f35392x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f176202d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f176203e;

        public AcceptedCardItem(android.os.Parcel parcel, xt1.c cVar) {
            this.f176202d = parcel.readString();
            this.f176203e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f176202d);
            parcel.writeString(this.f176203e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.model.CardGiftInfo$AccepterItem */
    /* loaded from: classes15.dex */
    public static class AccepterItem implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem> f35393x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f176204d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f176205e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f176206f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f176207g;

        public AccepterItem(android.os.Parcel parcel, xt1.c cVar) {
            this.f176204d = parcel.readString();
            this.f176205e = parcel.readString();
            this.f176206f = parcel.readString();
            this.f176207g = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f176204d);
            parcel.writeString(this.f176205e);
            parcel.writeString(this.f176206f);
            parcel.writeString(this.f176207g);
        }
    }

    public C13037x580b4d4e() {
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m54441x9616526c() {
        return "CardGiftInfo{toUserName='" + this.f176180d + "', fromUserName='" + this.f176181e + "', fromUserImgUrl='" + this.f176182f + "', fromUserContent='" + this.f176183g + "', fromUserContentPicUrl='" + this.f176184h + "', fromUserContentVideoUrl='" + this.f176185i + "', fromUserContentThumbPicUrl='" + this.f176186m + "', picAESKey='" + this.f176187n + "', videoAESKey='" + this.f176188o + "', thumbVideoAESKey='" + this.f176189p + "', cardBackgroundPicUrl='" + this.f176191q + "', cardLogoLUrl='" + this.f176192r + "', cardTitle='" + this.f176193s + "', cardPrice='" + this.f176194t + "', footerWording='" + this.f176195u + "', color='" + this.f176196v + "', needJump=" + this.f176197w + ", picDataLength=" + this.f176198x + ", videoDataLength=" + this.f176200y + ", thumbDataLength=" + this.f176201z + ", descTitle='" + this.A + "', descIconUrl='" + this.B + "', descLayoutMode=" + this.C + ", giftingMediaTitle='" + this.D + "', descriptionTitleColor='" + this.E + "', cardTitleColor='" + this.F + "', cardPriceTitleColor='" + this.G + "', userCardId='" + this.H + "', operationTitle='" + this.I + "', operationUrl='" + this.f176179J + "', cardTpId='" + this.K + "', cardCode='" + this.L + "', accepted_card_list_size='" + this.M.size() + "', accepter_list_size='" + this.N.size() + "', accepter_list_title='" + this.P + "', out_of_card='" + this.Q + "', operation_wxa_username='" + this.R + "', operation_wxa_path='" + this.S + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f176180d);
        parcel.writeString(this.f176181e);
        parcel.writeString(this.f176182f);
        parcel.writeString(this.f176183g);
        parcel.writeString(this.f176184h);
        parcel.writeString(this.f176185i);
        parcel.writeString(this.f176186m);
        parcel.writeString(this.f176187n);
        parcel.writeString(this.f176188o);
        parcel.writeString(this.f176189p);
        parcel.writeString(this.f176191q);
        parcel.writeString(this.f176192r);
        parcel.writeString(this.f176193s);
        parcel.writeString(this.f176194t);
        parcel.writeString(this.f176195u);
        parcel.writeString(this.f176196v);
        parcel.writeByte(this.f176197w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f176198x);
        parcel.writeInt(this.f176200y);
        parcel.writeInt(this.f176201z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.f176179J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeTypedList(this.M);
        parcel.writeTypedList(this.N);
        parcel.writeString(this.P);
        parcel.writeInt(this.Q);
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        parcel.writeString(this.S);
        parcel.writeString(this.T);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f176190p0);
        parcel.writeString(this.f176199x0);
    }

    public C13037x580b4d4e(android.os.Parcel parcel) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.M = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.N = linkedList2;
        this.f176180d = parcel.readString();
        this.f176181e = parcel.readString();
        this.f176182f = parcel.readString();
        this.f176183g = parcel.readString();
        this.f176184h = parcel.readString();
        this.f176185i = parcel.readString();
        this.f176186m = parcel.readString();
        this.f176187n = parcel.readString();
        this.f176188o = parcel.readString();
        this.f176189p = parcel.readString();
        this.f176191q = parcel.readString();
        this.f176192r = parcel.readString();
        this.f176193s = parcel.readString();
        this.f176194t = parcel.readString();
        this.f176195u = parcel.readString();
        this.f176196v = parcel.readString();
        this.f176197w = parcel.readByte() != 0;
        this.f176198x = parcel.readInt();
        this.f176200y = parcel.readInt();
        this.f176201z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f176179J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        parcel.readTypedList(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem.f35392x681a0c0c);
        parcel.readTypedList(linkedList2, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem.f35393x681a0c0c);
        this.P = parcel.readString();
        this.Q = parcel.readInt();
        this.R = parcel.readString();
        this.S = parcel.readString();
        this.S = parcel.readString();
        this.T = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.f176190p0 = parcel.readString();
        this.f176199x0 = parcel.readString();
    }
}
