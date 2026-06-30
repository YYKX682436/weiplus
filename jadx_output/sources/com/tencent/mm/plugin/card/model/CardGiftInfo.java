package com.tencent.mm.plugin.card.model;

/* loaded from: classes15.dex */
public class CardGiftInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.card.model.CardGiftInfo> CREATOR = new xt1.c();
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
    public java.lang.String f94646J;
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
    public java.lang.String f94647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94648e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94649f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f94650g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f94651h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f94652i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f94653m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f94654n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f94655o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f94656p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f94657p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f94658q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f94659r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f94660s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f94661t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f94662u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f94663v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f94664w;

    /* renamed from: x, reason: collision with root package name */
    public int f94665x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f94666x0;

    /* renamed from: y, reason: collision with root package name */
    public int f94667y;

    /* renamed from: z, reason: collision with root package name */
    public int f94668z;

    /* loaded from: classes15.dex */
    public static class AcceptedCardItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem> CREATOR = new com.tencent.mm.plugin.card.model.a();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f94669d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f94670e;

        public AcceptedCardItem(android.os.Parcel parcel, xt1.c cVar) {
            this.f94669d = parcel.readString();
            this.f94670e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f94669d);
            parcel.writeString(this.f94670e);
        }
    }

    /* loaded from: classes15.dex */
    public static class AccepterItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem> CREATOR = new com.tencent.mm.plugin.card.model.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f94671d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f94672e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f94673f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f94674g;

        public AccepterItem(android.os.Parcel parcel, xt1.c cVar) {
            this.f94671d = parcel.readString();
            this.f94672e = parcel.readString();
            this.f94673f = parcel.readString();
            this.f94674g = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f94671d);
            parcel.writeString(this.f94672e);
            parcel.writeString(this.f94673f);
            parcel.writeString(this.f94674g);
        }
    }

    public CardGiftInfo() {
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "CardGiftInfo{toUserName='" + this.f94647d + "', fromUserName='" + this.f94648e + "', fromUserImgUrl='" + this.f94649f + "', fromUserContent='" + this.f94650g + "', fromUserContentPicUrl='" + this.f94651h + "', fromUserContentVideoUrl='" + this.f94652i + "', fromUserContentThumbPicUrl='" + this.f94653m + "', picAESKey='" + this.f94654n + "', videoAESKey='" + this.f94655o + "', thumbVideoAESKey='" + this.f94656p + "', cardBackgroundPicUrl='" + this.f94658q + "', cardLogoLUrl='" + this.f94659r + "', cardTitle='" + this.f94660s + "', cardPrice='" + this.f94661t + "', footerWording='" + this.f94662u + "', color='" + this.f94663v + "', needJump=" + this.f94664w + ", picDataLength=" + this.f94665x + ", videoDataLength=" + this.f94667y + ", thumbDataLength=" + this.f94668z + ", descTitle='" + this.A + "', descIconUrl='" + this.B + "', descLayoutMode=" + this.C + ", giftingMediaTitle='" + this.D + "', descriptionTitleColor='" + this.E + "', cardTitleColor='" + this.F + "', cardPriceTitleColor='" + this.G + "', userCardId='" + this.H + "', operationTitle='" + this.I + "', operationUrl='" + this.f94646J + "', cardTpId='" + this.K + "', cardCode='" + this.L + "', accepted_card_list_size='" + this.M.size() + "', accepter_list_size='" + this.N.size() + "', accepter_list_title='" + this.P + "', out_of_card='" + this.Q + "', operation_wxa_username='" + this.R + "', operation_wxa_path='" + this.S + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f94647d);
        parcel.writeString(this.f94648e);
        parcel.writeString(this.f94649f);
        parcel.writeString(this.f94650g);
        parcel.writeString(this.f94651h);
        parcel.writeString(this.f94652i);
        parcel.writeString(this.f94653m);
        parcel.writeString(this.f94654n);
        parcel.writeString(this.f94655o);
        parcel.writeString(this.f94656p);
        parcel.writeString(this.f94658q);
        parcel.writeString(this.f94659r);
        parcel.writeString(this.f94660s);
        parcel.writeString(this.f94661t);
        parcel.writeString(this.f94662u);
        parcel.writeString(this.f94663v);
        parcel.writeByte(this.f94664w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f94665x);
        parcel.writeInt(this.f94667y);
        parcel.writeInt(this.f94668z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.f94646J);
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
        parcel.writeString(this.f94657p0);
        parcel.writeString(this.f94666x0);
    }

    public CardGiftInfo(android.os.Parcel parcel) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.M = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.N = linkedList2;
        this.f94647d = parcel.readString();
        this.f94648e = parcel.readString();
        this.f94649f = parcel.readString();
        this.f94650g = parcel.readString();
        this.f94651h = parcel.readString();
        this.f94652i = parcel.readString();
        this.f94653m = parcel.readString();
        this.f94654n = parcel.readString();
        this.f94655o = parcel.readString();
        this.f94656p = parcel.readString();
        this.f94658q = parcel.readString();
        this.f94659r = parcel.readString();
        this.f94660s = parcel.readString();
        this.f94661t = parcel.readString();
        this.f94662u = parcel.readString();
        this.f94663v = parcel.readString();
        this.f94664w = parcel.readByte() != 0;
        this.f94665x = parcel.readInt();
        this.f94667y = parcel.readInt();
        this.f94668z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f94646J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        parcel.readTypedList(linkedList, com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem.CREATOR);
        parcel.readTypedList(linkedList2, com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem.CREATOR);
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
        this.f94657p0 = parcel.readString();
        this.f94666x0 = parcel.readString();
    }
}
