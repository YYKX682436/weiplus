package com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29;

/* renamed from: com.tencent.mm.plugin.msgquote.model.MsgQuoteItem */
/* loaded from: classes5.dex */
public class C16565x9bc03d4e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e> f37685x681a0c0c = new ti3.n();

    /* renamed from: d, reason: collision with root package name */
    public int f231015d;

    /* renamed from: e, reason: collision with root package name */
    public long f231016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f231017f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f231018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f231019h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f231020i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f231021m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f231022n;

    /* renamed from: o, reason: collision with root package name */
    public int f231023o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f231024p;

    /* renamed from: q, reason: collision with root package name */
    public long f231025q;

    /* renamed from: r, reason: collision with root package name */
    public r15.g f231026r;

    public C16565x9bc03d4e(android.os.Parcel parcel) {
        this.f231015d = parcel.readInt();
        this.f231016e = parcel.readLong();
        this.f231017f = parcel.readString();
        this.f231018g = parcel.readString();
        this.f231019h = parcel.readString();
        this.f231020i = parcel.readString();
        this.f231021m = parcel.readString();
        this.f231022n = parcel.readString();
        this.f231023o = parcel.readInt();
        this.f231024p = parcel.readString();
        this.f231025q = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readString)) {
            return;
        }
        r15.g gVar = new r15.g();
        this.f231026r = gVar;
        gVar.m126728xdc93280d(readString);
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        r15.g gVar;
        if (c16565x9bc03d4e == null) {
            return false;
        }
        if (this == c16565x9bc03d4e) {
            return true;
        }
        if (this.f231016e != c16565x9bc03d4e.f231016e || this.f231015d != c16565x9bc03d4e.f231015d || this.f231023o != c16565x9bc03d4e.f231023o || this.f231025q != c16565x9bc03d4e.f231025q || !android.text.TextUtils.equals(this.f231017f, c16565x9bc03d4e.f231017f) || !android.text.TextUtils.equals(this.f231018g, c16565x9bc03d4e.f231018g) || !android.text.TextUtils.equals(this.f231019h, c16565x9bc03d4e.f231019h) || !android.text.TextUtils.equals(this.f231020i, c16565x9bc03d4e.f231020i) || !android.text.TextUtils.equals(this.f231021m, c16565x9bc03d4e.f231021m) || !android.text.TextUtils.equals(this.f231022n, c16565x9bc03d4e.f231022n) || !android.text.TextUtils.equals(this.f231024p, c16565x9bc03d4e.f231024p)) {
            return false;
        }
        r15.g gVar2 = this.f231026r;
        return ((gVar2 != null || c16565x9bc03d4e.f231026r != null) ? (gVar2 == null || (gVar = c16565x9bc03d4e.f231026r) == null) ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(gVar2.mo516x5c5a33d4(gVar)) : java.lang.Boolean.TRUE).booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m66997x9616526c() {
        if (this.f231026r == null) {
            return "MsgQuoteItem{type=" + this.f231015d + ", svrid=" + this.f231016e + ", fromusr='" + this.f231017f + "', chatuser='" + this.f231018g + "', displayname='" + this.f231019h + "', msgsource='" + this.f231020i + "', content='" + this.f231021m + "', msgSource='" + this.f231022n + "', referfromscene='" + this.f231023o + "', strid='" + this.f231024p + "', createTime=" + this.f231025q + '}';
        }
        return "MsgQuoteItem{type=" + this.f231015d + ", svrid=" + this.f231016e + ", fromusr='" + this.f231017f + "', chatuser='" + this.f231018g + "', displayname='" + this.f231019h + "', msgsource='" + this.f231020i + "', content='" + this.f231021m + "', msgSource='" + this.f231022n + "', referfromscene='" + this.f231023o + "', strid='" + this.f231024p + "', createTime=" + this.f231025q + ", partialQuoteText= " + this.f231026r.toString() + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f231015d);
        parcel.writeLong(this.f231016e);
        parcel.writeString(this.f231017f);
        parcel.writeString(this.f231018g);
        parcel.writeString(this.f231019h);
        parcel.writeString(this.f231020i);
        parcel.writeString(this.f231021m);
        parcel.writeString(this.f231022n);
        parcel.writeInt(this.f231023o);
        parcel.writeString(this.f231024p);
        parcel.writeLong(this.f231025q);
        r15.g gVar = this.f231026r;
        if (gVar != null) {
            parcel.writeString(gVar.m126748x696739c(false));
        } else {
            parcel.writeString(null);
        }
    }
}
