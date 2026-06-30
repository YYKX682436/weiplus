package com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/search/data/SimilarEmojiQueryModel;", "Landroid/os/Parcelable;", "emojisdk-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.search.data.SimilarEmojiQueryModel */
/* loaded from: classes4.dex */
public final /* data */ class C21007x2f4a06dc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc> f39192x681a0c0c = new x75.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274683e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f274684f;

    /* renamed from: g, reason: collision with root package name */
    public final long f274685g;

    /* renamed from: h, reason: collision with root package name */
    public final int f274686h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f274687i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f274688m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f274689n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f274690o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 f274691p;

    public C21007x2f4a06dc(java.lang.String query, java.lang.String emojiMD5, java.lang.String chatID, long j17, int i17, java.lang.String toUser, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiMD5, "emojiMD5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatID, "chatID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        this.f274682d = query;
        this.f274683e = emojiMD5;
        this.f274684f = chatID;
        this.f274685g = j17;
        this.f274686h = i17;
        this.f274687i = toUser;
        this.f274688m = gVar;
        this.f274689n = gVar2;
        this.f274690o = z17;
        this.f274691p = v9Var;
    }

    public final boolean a() {
        java.lang.String str = this.f274682d;
        return str == null || str.length() == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m77840xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc)) {
            return false;
        }
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = (com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274682d, c21007x2f4a06dc.f274682d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274683e, c21007x2f4a06dc.f274683e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274684f, c21007x2f4a06dc.f274684f) && this.f274685g == c21007x2f4a06dc.f274685g && this.f274686h == c21007x2f4a06dc.f274686h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274687i, c21007x2f4a06dc.f274687i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274688m, c21007x2f4a06dc.f274688m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274689n, c21007x2f4a06dc.f274689n) && this.f274690o == c21007x2f4a06dc.f274690o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f274691p, c21007x2f4a06dc.f274691p);
    }

    /* renamed from: hashCode */
    public int m77841x8cdac1b() {
        int hashCode = ((((((((((this.f274682d.hashCode() * 31) + this.f274683e.hashCode()) * 31) + this.f274684f.hashCode()) * 31) + java.lang.Long.hashCode(this.f274685g)) * 31) + java.lang.Integer.hashCode(this.f274686h)) * 31) + this.f274687i.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f274688m;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f274689n;
        int hashCode3 = (((hashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f274690o)) * 31;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = this.f274691p;
        return hashCode3 + (v9Var != null ? v9Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m77842x9616526c() {
        return "SimilarEmojiQueryModel(query=" + this.f274682d + ", emojiMD5=" + this.f274683e + ", chatID=" + this.f274684f + ", timestamp=" + this.f274685g + ", scene=" + this.f274686h + ", toUser=" + this.f274687i + ", panelEmojiCtx=" + this.f274688m + ", PageBuff=" + this.f274689n + ", enableSos=" + this.f274690o + ", panelCallbackImpl=" + this.f274691p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f274682d);
        dest.writeString(this.f274683e);
        dest.writeString(this.f274684f);
        dest.writeLong(this.f274685g);
        dest.writeInt(this.f274686h);
        dest.writeString(this.f274687i);
    }
}
