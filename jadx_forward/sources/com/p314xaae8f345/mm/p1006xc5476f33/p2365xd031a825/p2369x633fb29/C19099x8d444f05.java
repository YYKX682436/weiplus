package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders */
/* loaded from: classes9.dex */
public class C19099x8d444f05 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05> f38679x681a0c0c = new at4.v0();
    public int A;
    public int A1;
    public boolean B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo B1;
    public java.lang.String C;
    public java.lang.String D;
    public long E;
    public java.lang.String F;
    public java.lang.String G;
    public java.util.Set H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f261206J;
    public boolean K;
    public java.lang.String L;
    public java.util.List M;
    public vr4.j0 N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo S;
    public int T;
    public int U;
    public int V;
    public java.lang.String W;
    public int X;
    public int Y;
    public java.util.ArrayList Z;

    /* renamed from: d, reason: collision with root package name */
    public long f261207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261208e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f261209f;

    /* renamed from: field_infos */
    public java.util.ArrayList<r45.xj6> f38680x29441200;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261210g;

    /* renamed from: h, reason: collision with root package name */
    public double f261211h;

    /* renamed from: i, reason: collision with root package name */
    public int f261212i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f261213l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261214m;

    /* renamed from: n, reason: collision with root package name */
    public double f261215n;

    /* renamed from: o, reason: collision with root package name */
    public double f261216o;

    /* renamed from: p, reason: collision with root package name */
    public int f261217p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f261218p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f261219p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f261220q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f261221r;

    /* renamed from: s, reason: collision with root package name */
    public int f261222s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f261223t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f261224u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f261225v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f261226w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f261227x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f261228x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f261229x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f261230y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f261231y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f261232y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f261233z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f261234z1;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductShowInfo */
    /* loaded from: classes9.dex */
    public static class DeductShowInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo> f38683x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.d();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261267d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261268e;

        /* renamed from: f, reason: collision with root package name */
        public int f261269f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261270g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261271h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261272i;

        public DeductShowInfo(android.os.Parcel parcel) {
            this.f261267d = parcel.readString();
            this.f261268e = parcel.readString();
            this.f261269f = parcel.readInt();
            this.f261270g = parcel.readString();
            this.f261271h = parcel.readString();
            this.f261272i = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261267d);
            parcel.writeString(this.f261268e);
            parcel.writeInt(this.f261269f);
            parcel.writeString(this.f261270g);
            parcel.writeString(this.f261271h);
            parcel.writeString(this.f261272i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo */
    /* loaded from: classes9.dex */
    public static class DiscountInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo> f38684x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.e();

        /* renamed from: d, reason: collision with root package name */
        public double f261273d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261274e;

        public DiscountInfo(android.os.Parcel parcel) {
            this.f261273d = parcel.readDouble();
            this.f261274e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeDouble(this.f261273d);
            parcel.writeString(this.f261274e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo */
    /* loaded from: classes9.dex */
    public static class FinderInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo> f38685x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.f();

        /* renamed from: d, reason: collision with root package name */
        public int f261275d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261276e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261277f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261278g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261279h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261280i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f261281m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f261282n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f261283o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f261284p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f261285q;

        /* renamed from: r, reason: collision with root package name */
        public int f261286r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f261287s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f261288t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f261289u;

        public FinderInfo(android.os.Parcel parcel) {
            this.f261275d = parcel.readInt();
            this.f261276e = parcel.readString();
            this.f261277f = parcel.readString();
            this.f261278g = parcel.readString();
            this.f261279h = parcel.readString();
            this.f261280i = parcel.readString();
            this.f261281m = parcel.readString();
            this.f261282n = parcel.readString();
            this.f261283o = parcel.readString();
            this.f261284p = parcel.readString();
            this.f261285q = parcel.readString();
            this.f261287s = parcel.readString();
            this.f261288t = parcel.readString();
            this.f261289u = parcel.readString();
            this.f261286r = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f261275d);
            parcel.writeString(this.f261276e);
            parcel.writeString(this.f261277f);
            parcel.writeString(this.f261278g);
            parcel.writeString(this.f261279h);
            parcel.writeString(this.f261280i);
            parcel.writeString(this.f261281m);
            parcel.writeString(this.f261282n);
            parcel.writeString(this.f261283o);
            parcel.writeString(this.f261284p);
            parcel.writeString(this.f261285q);
            parcel.writeString(this.f261287s);
            parcel.writeString(this.f261288t);
            parcel.writeString(this.f261289u);
            parcel.writeInt(this.f261286r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo */
    /* loaded from: classes9.dex */
    public static class LeadTailViewInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo> f38686x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261290d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261291e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261292f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261293g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261294h;

        /* renamed from: i, reason: collision with root package name */
        public int f261295i;

        /* renamed from: m, reason: collision with root package name */
        public int f261296m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f261297n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f261298o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f261299p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f261300q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f261301r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f261302s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f261303t;

        public LeadTailViewInfo(android.os.Parcel parcel) {
            this.f261290d = parcel.readString();
            this.f261291e = parcel.readString();
            this.f261292f = parcel.readString();
            this.f261293g = parcel.readString();
            this.f261294h = parcel.readString();
            this.f261295i = parcel.readInt();
            this.f261296m = parcel.readInt();
            this.f261297n = parcel.readString();
            this.f261298o = parcel.readString();
            this.f261299p = parcel.readString();
            this.f261300q = parcel.readString();
            this.f261301r = parcel.readString();
            this.f261302s = parcel.readString();
            this.f261303t = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261290d);
            parcel.writeString(this.f261291e);
            parcel.writeString(this.f261292f);
            parcel.writeString(this.f261293g);
            parcel.writeString(this.f261294h);
            parcel.writeInt(this.f261295i);
            parcel.writeInt(this.f261296m);
            parcel.writeString(this.f261297n);
            parcel.writeString(this.f261298o);
            parcel.writeString(this.f261299p);
            parcel.writeString(this.f261300q);
            parcel.writeString(this.f261301r);
            parcel.writeString(this.f261302s);
            parcel.writeString(this.f261303t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Promotions */
    /* loaded from: classes9.dex */
    public static class Promotions implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions> f38687x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.h();
        public a36.c A;

        /* renamed from: d, reason: collision with root package name */
        public int f261304d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261305e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261306f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261307g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261308h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261309i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f261310m;

        /* renamed from: n, reason: collision with root package name */
        public int f261311n;

        /* renamed from: o, reason: collision with root package name */
        public long f261312o;

        /* renamed from: p, reason: collision with root package name */
        public int f261313p;

        /* renamed from: q, reason: collision with root package name */
        public int f261314q;

        /* renamed from: r, reason: collision with root package name */
        public int f261315r;

        /* renamed from: s, reason: collision with root package name */
        public int f261316s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f261317t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f261318u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.String f261319v;

        /* renamed from: w, reason: collision with root package name */
        public long f261320w;

        /* renamed from: x, reason: collision with root package name */
        public int f261321x;

        /* renamed from: y, reason: collision with root package name */
        public java.lang.String f261322y;

        /* renamed from: z, reason: collision with root package name */
        public java.lang.String f261323z;

        public Promotions(android.os.Parcel parcel) {
            this.f261304d = parcel.readInt();
            this.f261305e = parcel.readString();
            this.f261306f = parcel.readString();
            this.f261307g = parcel.readString();
            this.f261308h = parcel.readString();
            this.f261309i = parcel.readString();
            this.f261310m = parcel.readString();
            this.f261311n = parcel.readInt();
            this.f261312o = parcel.readLong();
            this.f261313p = parcel.readInt();
            this.f261314q = parcel.readInt();
            this.f261315r = parcel.readInt();
            this.f261316s = parcel.readInt();
            this.f261317t = parcel.readString();
            this.f261318u = parcel.readString();
            this.f261319v = parcel.readString();
            this.f261320w = parcel.readLong();
            this.f261321x = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f261304d);
            parcel.writeString(this.f261305e);
            parcel.writeString(this.f261306f);
            parcel.writeString(this.f261307g);
            parcel.writeString(this.f261308h);
            parcel.writeString(this.f261309i);
            parcel.writeString(this.f261310m);
            parcel.writeInt(this.f261311n);
            parcel.writeLong(this.f261312o);
            parcel.writeInt(this.f261313p);
            parcel.writeInt(this.f261314q);
            parcel.writeInt(this.f261315r);
            parcel.writeInt(this.f261316s);
            parcel.writeString(this.f261317t);
            parcel.writeString(this.f261318u);
            parcel.writeString(this.f261319v);
            parcel.writeLong(this.f261320w);
            parcel.writeInt(this.f261321x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RecommendTinyAppInfo */
    /* loaded from: classes9.dex */
    public static class RecommendTinyAppInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo> f38688x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.i();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261324d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261325e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261326f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261327g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261328h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261329i;

        /* renamed from: m, reason: collision with root package name */
        public long f261330m;

        /* renamed from: n, reason: collision with root package name */
        public long f261331n;

        /* renamed from: o, reason: collision with root package name */
        public int f261332o;

        /* renamed from: p, reason: collision with root package name */
        public int f261333p;

        /* renamed from: q, reason: collision with root package name */
        public long f261334q;

        /* renamed from: r, reason: collision with root package name */
        public int f261335r;

        public RecommendTinyAppInfo(android.os.Parcel parcel) {
            this.f261324d = parcel.readString();
            this.f261325e = parcel.readString();
            this.f261326f = parcel.readString();
            this.f261327g = parcel.readString();
            this.f261328h = parcel.readString();
            this.f261335r = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261324d);
            parcel.writeString(this.f261325e);
            parcel.writeString(this.f261326f);
            parcel.writeString(this.f261327g);
            parcel.writeString(this.f261328h);
            parcel.writeInt(this.f261335r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo */
    /* loaded from: classes9.dex */
    public static class RemarksInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RemarksInfo> f38689x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.j();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261336d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261337e;

        public RemarksInfo(android.os.Parcel parcel) {
            this.f261336d = parcel.readString();
            this.f261337e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261336d);
            parcel.writeString(this.f261337e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo */
    /* loaded from: classes9.dex */
    public static class ShowInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo> f38690x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.k();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261338d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261339e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261340f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261341g;

        /* renamed from: h, reason: collision with root package name */
        public int f261342h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261343i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f261344m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f261345n;

        /* renamed from: o, reason: collision with root package name */
        public int f261346o;

        public ShowInfo(android.os.Parcel parcel) {
            this.f261338d = parcel.readString();
            this.f261339e = parcel.readString();
            this.f261340f = parcel.readString();
            this.f261341g = parcel.readString();
            this.f261342h = parcel.readInt();
            this.f261343i = parcel.readString();
            this.f261344m = parcel.readString();
            this.f261345n = parcel.readString();
            this.f261346o = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m73890x9616526c() {
            return java.lang.String.format("ShowInfo name:%s, value:%s, nameColor:%s, valueColor:%s, linkType:%s, linkWeApp:%s, linkAddr:%s, linkUrl:%s, textAttr:%s", this.f261338d, this.f261339e, this.f261340f, this.f261341g, java.lang.Integer.valueOf(this.f261342h), this.f261343i, this.f261344m, this.f261345n, java.lang.Integer.valueOf(this.f261346o));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261338d);
            parcel.writeString(this.f261339e);
            parcel.writeString(this.f261340f);
            parcel.writeString(this.f261341g);
            parcel.writeInt(this.f261342h);
            parcel.writeString(this.f261343i);
            parcel.writeString(this.f261344m);
            parcel.writeString(this.f261345n);
            parcel.writeInt(this.f261346o);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$SimpleCashierInfo */
    /* loaded from: classes9.dex */
    public static class SimpleCashierInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo> f38691x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.l();

        /* renamed from: d, reason: collision with root package name */
        public int f261347d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261348e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261349f;

        public SimpleCashierInfo(android.os.Parcel parcel) {
            this.f261347d = parcel.readInt();
            this.f261348e = parcel.readString();
            this.f261349f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f261347d);
            parcel.writeString(this.f261348e);
            parcel.writeString(this.f261349f);
        }
    }

    public C19099x8d444f05() {
        this.f261208e = "";
        this.f261209f = "";
        this.f261210g = "0";
        this.f261211h = 0.0d;
        this.f261216o = 0.0d;
        this.B = false;
        this.C = "";
        this.D = "";
        this.E = 0L;
        this.F = "";
        this.H = new java.util.HashSet();
        this.I = 0;
        this.L = "";
        this.M = new java.util.ArrayList();
        this.N = new vr4.j0();
        this.P = 0;
        this.Q = "";
        this.R = "";
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = 0;
        this.Z = new java.util.ArrayList();
        this.f261218p0 = "";
        this.f261228x0 = "";
        this.f38680x29441200 = new java.util.ArrayList<>();
        this.f261231y0 = "";
        this.f261229x1 = "";
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 a(org.json.JSONObject jSONObject) {
        int i17;
        if (jSONObject == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19099x8d444f05.f261207d = java.lang.System.currentTimeMillis();
            int i18 = 2;
            c19099x8d444f05.f261211h = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("total_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            c19099x8d444f05.f261210g = jSONObject.getString("num");
            boolean z18 = true;
            c19099x8d444f05.f261212i = jSONObject.optInt("bank_card_tag", 1);
            c19099x8d444f05.f261214m = jSONObject.optString("fee_type", "");
            c19099x8d444f05.f261215n = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("charge_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            c19099x8d444f05.f261216o = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject.optString("fetch_fee"), "100", 2, java.math.RoundingMode.HALF_UP);
            c19099x8d444f05.f261217p = jSONObject.optInt("is_assign_userinfo_pay");
            c19099x8d444f05.f261220q = jSONObject.optString("true_name");
            c19099x8d444f05.f261221r = jSONObject.optString("cre_id");
            c19099x8d444f05.f261222s = jSONObject.optInt("ce_type");
            c19099x8d444f05.f261223t = jSONObject.optString("assign_pay_info");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            jSONObject.optLong("free_fee");
            jSONObject.optLong("remain_fee");
            c19099x8d444f05.T = jSONObject.optInt("not_support_bind_card", 0);
            c19099x8d444f05.U = jSONObject.optInt("not_support_retry", 0);
            boolean z19 = jSONObject.optInt("support_all_bank", 0) == 1;
            if (z19) {
                try {
                    c19099x8d444f05.H = new java.util.HashSet();
                } catch (org.json.JSONException e17) {
                    e = e17;
                    i17 = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Orders", e, "", new java.lang.Object[i17]);
                    return c19099x8d444f05;
                }
            }
            int length = jSONArray.length();
            int i19 = 0;
            while (i19 < length) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity();
                commodity.f261240h = jSONObject2.getString("desc");
                org.json.JSONArray jSONArray2 = jSONArray;
                commodity.f261242m = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(jSONObject2.optString("fee"), "100", i18, java.math.RoundingMode.HALF_UP);
                commodity.f261241i = "" + jSONObject2.optInt("count", 1);
                commodity.f261244o = jSONObject2.getString("pay_status");
                commodity.f261248s = jSONObject2.optString("buy_bank_name");
                commodity.f261245p = jSONObject2.getString("pay_status_name");
                commodity.f261238f = jSONObject2.optString("spid");
                commodity.f261239g = jSONObject2.optString("sp_name");
                commodity.f261246q = jSONObject2.optInt("modify_timestamp");
                commodity.f261247r = jSONObject2.getString(ya.b.f77506xba41a63c);
                commodity.f261249t = jSONObject2.optString("fee_type");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19099x8d444f05.f261214m)) {
                    c19099x8d444f05.f261214m = commodity.f261249t;
                }
                commodity.f261250u = jSONObject2.optString("appusername");
                commodity.f261252w = jSONObject2.optString("app_telephone");
                ((java.util.ArrayList) c19099x8d444f05.M).add(commodity);
                if (!z19) {
                    java.lang.String optString = jSONObject2.optString("support_bank");
                    c19099x8d444f05.G = optString;
                    c19099x8d444f05.H = m(optString);
                }
                i19++;
                z18 = true;
                jSONArray = jSONArray2;
                i18 = 2;
            }
            boolean z27 = z18;
            if (jSONObject.has("is_open_fee_protocal")) {
                c19099x8d444f05.B = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k0(jSONObject, "is_open_fee_protocal");
            } else {
                int i27 = c19099x8d444f05.f261212i;
                l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
                c19099x8d444f05.B = (i27 & 2) > 0 ? z27 : false;
            }
            c19099x8d444f05.N = e(jSONObject);
            n(jSONObject, c19099x8d444f05);
            c19099x8d444f05.P = jSONObject.optInt("needbindcardtoshowfavinfo");
            c19099x8d444f05.Q = jSONObject.optString("discount_wording");
            c19099x8d444f05.R = jSONObject.optString("favor_rule_wording");
            c(c19099x8d444f05, jSONObject.optJSONObject("entrustpayinfo"));
            java.lang.String optString2 = jSONObject.optString("field_area_info");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                try {
                    c19099x8d444f05.f38680x29441200.addAll(((r45.fs0) new r45.fs0().mo11468x92b714fd(android.util.Base64.decode(optString2, 0))).f76491x225d08d3);
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Orders", e18, "", new java.lang.Object[0]);
                }
            }
            c19099x8d444f05.f261231y0 = jSONObject.optString("price_total_fee", "0");
            c19099x8d444f05.f261213l1 = jSONObject.optString("price_fee_type", "");
            c19099x8d444f05.f261219p1 = jSONObject.optString("price_fee_symbol", "");
            c19099x8d444f05.f261229x1 = jSONObject.optString("settlement_fee", "0");
            c19099x8d444f05.f261232y1 = jSONObject.optString("settlement_type", "");
            c19099x8d444f05.f261234z1 = jSONObject.optString("settlement_symbol", "");
            c19099x8d444f05.A1 = jSONObject.optInt("is_open_field_area", 0);
            i(jSONObject, c19099x8d444f05);
            return c19099x8d444f05;
        } catch (org.json.JSONException e19) {
            e = e19;
            i17 = 0;
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity, org.json.JSONObject jSONObject, int i17) {
        commodity.f261254y = jSONObject.optString("discount");
        commodity.f261244o = jSONObject.getString("pay_status");
        commodity.f261245p = jSONObject.getString("pay_status_name");
        commodity.f261248s = jSONObject.optString("buy_bank_name");
        commodity.f261246q = jSONObject.optInt("pay_timestamp");
        commodity.f261253x = jSONObject.optString("card_tail");
        commodity.f261255z = i17;
        commodity.B = jSONObject.optString("rateinfo");
        jSONObject.optString("discount_rateinfo");
        commodity.C = jSONObject.optString("original_feeinfo");
        if (jSONObject.has("total_fee")) {
            commodity.f261242m = jSONObject.optDouble("total_fee", 0.0d) / 100.0d;
        }
        commodity.f261243n = jSONObject.optDouble("original_total_fee", -1.0d) / 100.0d;
        commodity.f261249t = jSONObject.optString("fee_type", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("subscribe_biz_info");
        int i18 = 1;
        if (optJSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
            promotions.f261304d = 0;
            promotions.f261306f = optJSONObject.optString("nickname");
            java.lang.String optString = optJSONObject.optString(dm.i4.f66875xa013b0d5);
            promotions.f261309i = optString;
            commodity.f261251v = optString;
            promotions.f261305e = optJSONObject.optString("logo_round_url");
            promotions.f261308h = optJSONObject.optString("subscribe_biz_url");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261306f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261308h)) {
                commodity.H.add(promotions);
                commodity.I = true;
            }
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("activity_info");
        int length = jSONArray.length();
        int i19 = 0;
        while (i19 < length) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
            promotions2.f261304d = i18;
            promotions2.f261305e = jSONObject2.optString("icon");
            promotions2.f261306f = jSONObject2.optString("wording");
            promotions2.f261308h = jSONObject2.optString("url");
            promotions2.f261307g = jSONObject2.optString("btn_text");
            promotions2.f261311n = jSONObject2.optInt("type");
            promotions2.f261310m = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            promotions2.f261312o = jSONObject2.optLong(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
            promotions2.f261313p = jSONObject2.optInt("activity_type", 0);
            promotions2.f261317t = jSONObject2.optString("small_title");
            promotions2.f261314q = jSONObject2.optInt("award_id");
            promotions2.f261315r = jSONObject2.optInt("send_record_id");
            promotions2.f261316s = jSONObject2.optInt("user_record_id");
            promotions2.f261318u = jSONObject2.optString("activity_tinyapp_username");
            promotions2.f261319v = jSONObject2.optString("activity_tinyapp_path");
            promotions2.f261320w = jSONObject2.optLong("activity_mch_id");
            promotions2.f261321x = jSONObject2.optInt("activity_tinyapp_version");
            promotions2.f261322y = jSONObject2.optString("get_award_params");
            promotions2.f261323z = jSONObject2.optString("query_award_status_params");
            d(promotions2, jSONObject2.optJSONObject("exposure_info"));
            commodity.H.add(promotions2);
            i19++;
            i18 = 1;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("link_ativity_info");
        if (optJSONObject2 != null) {
            java.lang.String optString2 = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
            at4.w0 w0Var = commodity.f261235J;
            w0Var.f95516a = optString2;
            w0Var.f95517b = optJSONObject2.optString("url");
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("discount_array");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            for (int i27 = 0; i27 < length2; i27++) {
                org.json.JSONObject optJSONObject3 = optJSONArray.optJSONObject(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo discountInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo();
                if (optJSONObject3 != null) {
                    discountInfo.f261273d = optJSONObject3.optDouble("payment_amount");
                    discountInfo.f261274e = optJSONObject3.optString("favor_desc");
                    commodity.A.add(discountInfo);
                }
            }
        }
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("tinyapp_info");
        if (optJSONObject4 != null) {
            if (commodity.D == null) {
                commodity.D = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo();
            }
            commodity.D.f261324d = optJSONObject4.optString("tinyapp_name");
            commodity.D.f261325e = optJSONObject4.optString("tinyapp_logo");
            commodity.D.f261326f = optJSONObject4.optString("tinyapp_desc");
            commodity.D.f261327g = optJSONObject4.optString("tinyapp_username");
            commodity.D.f261328h = optJSONObject4.optString("tinyapp_path");
            commodity.D.f261329i = optJSONObject4.optString("activity_tinyapp_btn_text");
            commodity.D.f261330m = optJSONObject4.optLong(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo recommendTinyAppInfo = commodity.D;
            optJSONObject4.optLong("activity_type");
            recommendTinyAppInfo.getClass();
            commodity.D.f261331n = optJSONObject4.optLong("award_id");
            commodity.D.f261332o = optJSONObject4.optInt("send_record_id");
            commodity.D.f261333p = optJSONObject4.optInt("user_record_id");
            commodity.D.f261334q = optJSONObject4.optLong("activity_mch_id");
            commodity.D.f261335r = optJSONObject4.optInt("tinyapp_version");
        }
        org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("remarks_info");
        if (optJSONObject5 != null) {
            if (commodity.G == null) {
                commodity.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RemarksInfo();
            }
            commodity.G.f261336d = optJSONObject5.optString("remark_title");
            commodity.G.f261337e = optJSONObject5.optString("remark_desc");
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "parseDeductInfo json is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "parseDeductInfo json is not null");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo deductInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo();
        c19099x8d444f05.S = deductInfo;
        deductInfo.f261256d = jSONObject.optString("contract_title");
        c19099x8d444f05.S.f261257e = jSONObject.optString("contract_desc");
        c19099x8d444f05.S.f261258f = jSONObject.optInt("auto_deduct_flag", 0);
        c19099x8d444f05.S.f261259g = jSONObject.optString("contract_url");
        c19099x8d444f05.S.f261261i = jSONObject.optInt("is_select_pay_way", 0);
        c19099x8d444f05.S.f261262m = jSONObject.optInt("deduct_show_type", 0);
        c19099x8d444f05.S.f261263n = jSONObject.optString("button_wording", "");
        c19099x8d444f05.S.f261264o = jSONObject.optString("deduct_rule_wording", "");
        c19099x8d444f05.S.f261265p = jSONObject.optString("open_deduct_wording", "");
        c19099x8d444f05.S.f261266q = jSONObject.optString("open_deduct_wording_color", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
        int length = optJSONArray.length();
        if (length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Orders", "parseDeductInfo's showInfo len is " + length);
            return;
        }
        c19099x8d444f05.S.f261260h = new java.util.ArrayList();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo deductShowInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo();
                deductShowInfo.f261267d = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                deductShowInfo.f261268e = optJSONObject.optString("value");
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                if (optJSONObject2 != null) {
                    deductShowInfo.f261269f = optJSONObject2.optInt("link_type", 0);
                    deductShowInfo.f261270g = optJSONObject2.optString("link_weapp");
                    deductShowInfo.f261271h = optJSONObject2.optString("link_addr");
                    deductShowInfo.f261272i = optJSONObject2.optString("link_url");
                }
                c19099x8d444f05.S.f261260h.add(deductShowInfo);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=" + i17);
            }
        }
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "parseExposureInfo: %s", jSONObject);
        if (jSONObject == null) {
            promotions.A = null;
            return;
        }
        try {
            a36.c cVar = new a36.c();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("single_exposure_info_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                cVar.f82637d = new java.util.LinkedList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    a36.i iVar = new a36.i();
                    iVar.f82682d = jSONObject2.optString("logo");
                    iVar.f82683e = jSONObject2.optString("award_name");
                    iVar.f82684f = jSONObject2.optString("award_description");
                    iVar.f82685g = jSONObject2.optString("background_img");
                    iVar.f82687i = jSONObject2.optString("award_description_color");
                    iVar.f82686h = jSONObject2.optString("award_name_color");
                    cVar.f82637d.add(iVar);
                }
            }
            cVar.f82638e = jSONObject.optInt("is_query_others", 0);
            cVar.f82639f = jSONObject.optString("draw_lottery_params");
            cVar.f82640g = jSONObject.optInt("is_show_btn");
            cVar.f82646p = jSONObject.optString("background_img_whole");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("btn_info");
            str = "MicroMsg.Orders";
            if (optJSONObject != null) {
                try {
                    a36.a aVar = new a36.a();
                    cVar.f82641h = aVar;
                    str2 = "";
                    aVar.f82624d = optJSONObject.optString("btn_words");
                    cVar.f82641h.f82625e = optJSONObject.optString("btn_color");
                    cVar.f82641h.f82626f = optJSONObject.optInt("btn_op_type");
                    cVar.f82641h.f82627g = optJSONObject.optString("url");
                    cVar.f82641h.f82629i = optJSONObject.optString("get_lottery_params");
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("mini_app_info");
                    if (optJSONObject2 != null) {
                        cVar.f82641h.f82628h = new a36.g();
                        cVar.f82641h.f82628h.f82675d = optJSONObject2.optString("activity_tinyapp_username");
                        cVar.f82641h.f82628h.f82676e = optJSONObject2.optString("activity_tinyapp_path");
                        cVar.f82641h.f82628h.f82677f = optJSONObject2.optInt("activity_tinyapp_version");
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e, "parseExposureInfo error: %s", e.getMessage());
                    return;
                }
            } else {
                str2 = "";
            }
            cVar.f82642i = jSONObject.optString("exposure_info_modify_params");
            cVar.f82643m = jSONObject.optInt("user_opertaion_type");
            cVar.f82644n = jSONObject.optInt("is_show_layer");
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("layer_info");
            if (optJSONObject3 != null) {
                a36.f fVar = new a36.f();
                cVar.f82645o = fVar;
                fVar.f82666d = optJSONObject3.optString("layer_title");
                cVar.f82645o.f82667e = optJSONObject3.optString("layer_logo");
                cVar.f82645o.f82668f = optJSONObject3.optString("layer_type");
                cVar.f82645o.f82669g = optJSONObject3.optString("layer_name");
                cVar.f82645o.f82670h = optJSONObject3.optString("layer_description");
                cVar.f82645o.f82671i = optJSONObject3.optInt("is_show_layer_btn");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optJSONObject3.optString("voice_url"))) {
                    cVar.f82645o.f82673n = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(optJSONObject3.optString("voice_url").getBytes());
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optJSONObject3.optString("voice_data"))) {
                    cVar.f82645o.f82674o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(optJSONObject3.optString("voice_data").getBytes());
                }
                org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("layer_btn_info");
                if (optJSONObject4 != null) {
                    cVar.f82645o.f82672m = new a36.e();
                    cVar.f82645o.f82672m.f82660d = optJSONObject4.optString("btn_words");
                    cVar.f82645o.f82672m.f82661e = optJSONObject4.optString("btn_color");
                    cVar.f82645o.f82672m.f82662f = optJSONObject4.optInt("btn_op_type");
                    cVar.f82645o.f82672m.f82663g = optJSONObject4.optString("get_lottery_params");
                    cVar.f82645o.f82672m.f82664h = optJSONObject4.optString("url");
                    org.json.JSONObject optJSONObject5 = optJSONObject4.optJSONObject("mini_app_info");
                    if (optJSONObject5 != null) {
                        cVar.f82645o.f82672m.f82665i = new a36.g();
                        cVar.f82645o.f82672m.f82665i.f82675d = optJSONObject5.optString("activity_tinyapp_username");
                        cVar.f82645o.f82672m.f82665i.f82676e = optJSONObject5.optString("activity_tinyapp_path");
                        cVar.f82645o.f82672m.f82665i.f82677f = optJSONObject5.optInt("activity_tinyapp_version");
                    }
                }
            }
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("draw_lottery_info");
            if (optJSONObject6 != null) {
                a36.b bVar = new a36.b();
                cVar.f82647q = bVar;
                bVar.f82631e = optJSONObject6.optString("url");
                cVar.f82647q.f82632f = optJSONObject6.optString("animation_wording");
                cVar.f82647q.f82633g = optJSONObject6.optString("animation_wording_color");
                cVar.f82647q.f82635i = optJSONObject6.optString("after_animation_wording");
                cVar.f82647q.f82636m = optJSONObject6.optString("after_animation_wording_color");
                cVar.f82647q.f82634h = optJSONObject6.optInt("op_type");
                org.json.JSONObject optJSONObject7 = optJSONObject6.optJSONObject("mini_app_info");
                if (optJSONObject7 != null) {
                    cVar.f82647q.f82630d = new a36.g();
                    cVar.f82647q.f82630d.f82675d = optJSONObject7.optString("activity_tinyapp_username");
                    cVar.f82647q.f82630d.f82676e = optJSONObject7.optString("activity_tinyapp_path");
                    cVar.f82647q.f82630d.f82677f = optJSONObject7.optInt("activity_tinyapp_version");
                }
            }
            org.json.JSONObject optJSONObject8 = jSONObject.optJSONObject("follow_cardbd_mch_info");
            if (optJSONObject8 != null) {
                a36.d dVar = new a36.d();
                cVar.f82648r = dVar;
                dVar.f82649d = optJSONObject8.optInt("is_followed_cardbd_mch", 0);
                java.lang.String str3 = str2;
                cVar.f82648r.f82651f = optJSONObject8.optString("follow_logo", str3);
                cVar.f82648r.f82650e = optJSONObject8.optString("follow_tips", str3);
                cVar.f82648r.f82652g = optJSONObject8.optString("follow_tips_color", str3);
                cVar.f82648r.f82653h = optJSONObject8.optLong("follow_tips_size", 0L);
                cVar.f82648r.f82657o = optJSONObject8.optString("follow_logo_after", str3);
                cVar.f82648r.f82659q = optJSONObject8.optString("follow_tips_after", str3);
                cVar.f82648r.f82658p = optJSONObject8.optString("follow_tips_color_after", str3);
                cVar.f82648r.f82654i = optJSONObject8.optString("follow_param", str3);
                cVar.f82648r.f82655m = optJSONObject8.optInt("is_show_pop_up", 0);
                org.json.JSONObject optJSONObject9 = optJSONObject8.optJSONObject("pop_up_window_info");
                if (optJSONObject9 != null) {
                    cVar.f82648r.f82656n = new a36.h();
                    cVar.f82648r.f82656n.f82678d = optJSONObject9.optString("pop_up_title");
                    cVar.f82648r.f82656n.f82679e = optJSONObject9.optString("pop_up_text");
                    cVar.f82648r.f82656n.f82681g = optJSONObject9.optString("pop_up_button_text");
                    cVar.f82648r.f82656n.f82680f = optJSONObject9.optString("pop_up_image_url");
                }
            }
            promotions.A = cVar;
        } catch (java.lang.Exception e18) {
            e = e18;
            str = "MicroMsg.Orders";
        }
    }

    public static vr4.j0 e(org.json.JSONObject jSONObject) {
        int i17;
        vr4.j0 j0Var = new vr4.j0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("favinfo");
        if (optJSONObject == null) {
            return j0Var;
        }
        j0Var.f521286d = optJSONObject.optLong("tradeAmount") / 100.0d;
        j0Var.f521287e = optJSONObject.optLong("totalFavAmount") / 100.0d;
        java.lang.String str = "afterFavorTradeAmount";
        j0Var.f521288f = optJSONObject.optLong("afterFavorTradeAmount") / 100.0d;
        j0Var.f521289g = optJSONObject.optString("favorComposeId");
        j0Var.f521292m = optJSONObject.optInt("useNaturalDefense");
        j0Var.f521293n = optJSONObject.optString("discountWording");
        j0Var.f521294o = optJSONObject.optString("favorRuleWording");
        java.lang.String str2 = "showFavorAmount";
        j0Var.f521295p = optJSONObject.optDouble("showFavorAmount", 0.0d) / 100.0d;
        j0Var.f521296q = optJSONObject.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
        j0Var.f521297r = optJSONObject.optInt("isVariableFavor");
        j0Var.f521298s = optJSONObject.optString("invariableFavorDesc");
        java.lang.String str3 = "variableFavorDesc";
        j0Var.f521299t = optJSONObject.optString("variableFavorDesc");
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("tradeFavList");
        int i18 = 0;
        while (i18 < optJSONArray.length()) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
            vr4.i1 i1Var = new vr4.i1();
            i1Var.f521267d = jSONObject2.optInt("favType");
            i1Var.f521268e = jSONObject2.optInt("favSubType");
            java.lang.String str4 = str3;
            org.json.JSONArray jSONArray = optJSONArray;
            i1Var.f521269f = jSONObject2.optLong("favProperty");
            i1Var.f521270g = jSONObject2.optString("favorTypeDesc");
            i1Var.f521271h = jSONObject2.optString("favId");
            i1Var.f521272i = jSONObject2.optString("favName");
            i1Var.f521273m = jSONObject2.optString("favDesc");
            i1Var.f521274n = jSONObject2.optString("favorUseManual");
            i1Var.f521275o = jSONObject2.optString("favorRemarks");
            i1Var.f521276p = jSONObject2.optLong("favPrice") / 100.0d;
            i1Var.f521277q = jSONObject2.optLong("realFavFee") / 100.0d;
            i1Var.f521278r = jSONObject2.optInt("needBankPay");
            i1Var.f521279s = jSONObject2.optString("bankNo");
            i1Var.f521280t = jSONObject2.optString("bankName");
            i1Var.f521281u = jSONObject2.optString("bankLogoUrl");
            org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("bind_serial_list");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                    i1Var.f521282v.add(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(optJSONArray2.optString(i19).getBytes()));
                }
            }
            j0Var.f521290h.add(i1Var);
            i18++;
            str3 = str4;
            optJSONArray = jSONArray;
        }
        java.lang.String str5 = str3;
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("favorComposeList");
        if (optJSONObject2 != null) {
            j0Var.f521291i = new vr4.k0();
            org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("favorComposeInfo");
            int i27 = 0;
            while (i27 < optJSONArray3.length()) {
                org.json.JSONObject jSONObject3 = optJSONArray3.getJSONObject(i27);
                vr4.l0 l0Var = new vr4.l0();
                l0Var.f521306d = jSONObject3.optString("faovrComposeId");
                l0Var.f521307e = jSONObject3.optLong("totalFavorAmount") / 100.0d;
                l0Var.f521308f = jSONObject3.optLong(str) / 100.0d;
                java.lang.String str6 = str;
                java.lang.String str7 = str2;
                l0Var.f521311i = jSONObject3.optDouble(str2, 0.0d) / 100.0d;
                l0Var.f521312m = jSONObject3.optDouble("invariableFavorAmount", 0.0d) / 100.0d;
                l0Var.f521313n = jSONObject3.optInt("isVariableFavor");
                l0Var.f521314o = jSONObject3.optString("invariableFavorDesc");
                java.lang.String str8 = str5;
                l0Var.f521315p = jSONObject3.optString(str8);
                org.json.JSONArray optJSONArray4 = jSONObject3.optJSONArray("composeArray");
                int i28 = 0;
                while (i28 < optJSONArray4.length()) {
                    org.json.JSONObject jSONObject4 = optJSONArray4.getJSONObject(i28);
                    vr4.j jVar = new vr4.j();
                    jVar.f521283d = jSONObject4.optString("favId");
                    jVar.f521284e = jSONObject4.optString("favorUseManual");
                    jVar.f521285f = jSONObject4.optString("favorRemarks");
                    l0Var.f521309g.add(jVar);
                    i28++;
                    str8 = str8;
                }
                str5 = str8;
                j0Var.f521291i.f521303d.add(l0Var);
                i27++;
                str = str6;
                str2 = str7;
            }
        }
        vr4.a aVar = new vr4.a();
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("bank_card_info");
        if (optJSONObject3 != null) {
            org.json.JSONArray optJSONArray5 = optJSONObject3.optJSONArray("bind_serial_favor_info_list");
            if (optJSONArray5 != null) {
                for (int i29 = 0; i29 < optJSONArray5.length(); i29++) {
                    vr4.c cVar = new vr4.c();
                    org.json.JSONObject jSONObject5 = optJSONArray5.getJSONObject(i29);
                    cVar.f521238d = jSONObject5.optString("bind_serial");
                    org.json.JSONArray optJSONArray6 = jSONObject5.optJSONArray("bind_serial_favor_list");
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i37 = 0; i37 < optJSONArray6.length(); i37++) {
                            vr4.d dVar = new vr4.d();
                            org.json.JSONObject optJSONObject4 = optJSONArray6.optJSONObject(i37);
                            dVar.f521240d = optJSONObject4.optString("favor_desc");
                            dVar.f521241e = optJSONObject4.optInt("is_default_show", 0);
                            cVar.f521239e.add(dVar);
                        }
                    }
                    aVar.f521206d.add(cVar);
                }
            }
            i17 = 0;
            org.json.JSONArray optJSONArray7 = optJSONObject3.optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
            if (optJSONArray7 != null && optJSONArray7.length() > 0) {
                aVar.f521207e = new vr4.v0();
                for (int i38 = 0; i38 < optJSONArray7.length(); i38++) {
                    vr4.w0 w0Var = new vr4.w0();
                    w0Var.f521342d = optJSONArray7.optJSONObject(i38).optString("favor_desc");
                    aVar.f521207e.f521341d.add(w0Var);
                }
            }
        } else {
            i17 = 0;
        }
        j0Var.f521300u = aVar;
        org.json.JSONArray optJSONArray8 = optJSONObject.optJSONArray("favcombid_forbindcard_list");
        if (optJSONArray8 != null) {
            int length = optJSONArray8.length();
            for (int i39 = i17; i39 < length; i39++) {
                org.json.JSONObject optJSONObject5 = optJSONArray8.optJSONObject(i39);
                if (optJSONObject5 != null) {
                    vr4.i0 i0Var = new vr4.i0();
                    i0Var.f521266e = optJSONObject5.optString("default_fav_comb_id");
                    org.json.JSONObject optJSONObject6 = optJSONObject5.optJSONObject("payment_channel");
                    if (optJSONObject6 != null) {
                        vr4.u0 u0Var = new vr4.u0();
                        u0Var.f521338f = optJSONObject6.optString("bind_serial");
                        u0Var.f521337e = optJSONObject6.optInt("selected");
                        u0Var.f521336d = optJSONObject6.optString("bankCode");
                        i0Var.f521265d = u0Var;
                    }
                    j0Var.f521301v.add(i0Var);
                }
            }
        }
        vr4.b bVar = new vr4.b();
        org.json.JSONObject optJSONObject7 = optJSONObject.optJSONObject("bank_fav_guide");
        if (optJSONObject7 != null) {
            vr4.u0 u0Var2 = new vr4.u0();
            org.json.JSONObject optJSONObject8 = optJSONObject7.optJSONObject("payment_channel");
            if (optJSONObject8 != null) {
                u0Var2.f521336d = optJSONObject8.optString("bankCode");
                u0Var2.f521337e = optJSONObject8.optInt("selected");
                u0Var2.f521338f = optJSONObject8.optString("bind_serial");
                bVar.f521213d = u0Var2;
            }
            bVar.f521214e = optJSONObject7.optInt("is_show_guide");
            bVar.f521215f = optJSONObject7.optString("default_fav_comb_id");
            bVar.f521216g = optJSONObject7.optString("guide_content");
            bVar.f521217h = optJSONObject7.optString("guide_content_color");
            bVar.f521218i = optJSONObject7.optString("guide_btn_text");
            bVar.f521219m = optJSONObject7.optString("guide_btn_text_color");
            bVar.f521220n = optJSONObject7.optString("guide_btn_bg_color");
            bVar.f521221o = optJSONObject7.optString("guide_logo");
            j0Var.f521302w = bVar;
        }
        return j0Var;
    }

    public static void f(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, int i17) {
        java.util.List list = c19099x8d444f05.M;
        c19099x8d444f05.C = jSONObject.optString("pay_result_tips");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("payresult");
        int length = jSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
            if (list != null && list.size() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) list.get(0);
                commodity.H = new java.util.ArrayList();
                commodity.A = new java.util.ArrayList();
                commodity.f261247r = jSONObject2.getString(ya.b.f77506xba41a63c);
                b(commodity, jSONObject2, i17);
            } else if (list != null) {
                java.lang.String string = jSONObject2.getString(ya.b.f77506xba41a63c);
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) it.next();
                        if (string != null && string.equals(commodity2.f261247r)) {
                            b(commodity2, jSONObject2, i17);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 g(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        if (jSONObject == null || c19099x8d444f05 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Orders", "oldOrders is null");
        } else {
            try {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("appservice");
                if (optJSONObject != null) {
                    c19099x8d444f05.f261230y = optJSONObject.optString("app_recommend_desc");
                    c19099x8d444f05.f261233z = optJSONObject.optString("app_telephone");
                    c19099x8d444f05.A = optJSONObject.optInt("recommend_level", 2);
                    c19099x8d444f05.D = optJSONObject.optString("share_to_friends_url");
                }
                f(jSONObject, c19099x8d444f05, c19099x8d444f05.A);
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("extinfo");
                if (optJSONObject2 != null) {
                    c19099x8d444f05.E = optJSONObject2.optLong("fetch_pre_arrive_time") * 1000;
                    c19099x8d444f05.F = optJSONObject2.optString("fetch_pre_arrive_time_wording");
                }
                c19099x8d444f05.V = jSONObject.optInt("is_use_new_paid_succ_page", 0);
                c19099x8d444f05.W = jSONObject.optString("pay_succ_btn_wording");
                c19099x8d444f05.Y = jSONObject.optInt("is_jsapi_close_page");
                c19099x8d444f05.f261218p0 = jSONObject.optString("jsapi_tinyapp_username");
                c19099x8d444f05.f261228x0 = jSONObject.optString("jsapi_tinyapp_path");
                h(c19099x8d444f05, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Orders", e17, "", new java.lang.Object[0]);
            }
        }
        return c19099x8d444f05;
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("is_use_show_info", 0);
                c19099x8d444f05.X = optInt;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "is_use_show_info: %s", java.lang.Integer.valueOf(optInt));
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("show_info");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "showInfo size: %s", java.lang.Integer.valueOf(optJSONArray.length()));
                c19099x8d444f05.Z = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo showInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo();
                        showInfo.f261338d = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        showInfo.f261339e = optJSONObject.optString("value");
                        showInfo.f261340f = optJSONObject.optString("name_color");
                        showInfo.f261341g = optJSONObject.optString("value_color");
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("value_attr");
                        if (optJSONObject2 != null) {
                            showInfo.f261342h = optJSONObject2.optInt("link_type");
                            showInfo.f261343i = optJSONObject2.optString("link_weapp");
                            showInfo.f261344m = optJSONObject2.optString("link_addr");
                            showInfo.f261345n = optJSONObject2.optString("link_url");
                            showInfo.f261346o = optJSONObject2.optInt("text_attr");
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(showInfo.f261338d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(showInfo.f261339e)) {
                            c19099x8d444f05.Z.add(showInfo);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Orders", e17, "parseShowInfo error", new java.lang.Object[0]);
            }
        }
    }

    public static void i(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("simple_cashier_info")) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo simpleCashierInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo();
        c19099x8d444f05.B1 = simpleCashierInfo;
        simpleCashierInfo.f261347d = optJSONObject.optInt("use_simple_cashier");
        c19099x8d444f05.B1.f261348e = optJSONObject.optString("bank_type");
        c19099x8d444f05.B1.f261349f = optJSONObject.optString("bind_serial");
    }

    public static java.util.HashSet m(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            for (java.lang.String str2 : str.split("\\|")) {
                hashSet.add(str2);
            }
            if (hashSet.size() > 0) {
                hashSet.retainAll(hashSet);
            } else {
                hashSet.clear();
            }
        }
        return hashSet;
    }

    public static void n(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Orders", "bindqueryresp is null ");
            return;
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
        if (optJSONObject2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Orders", "user_info is null ");
            return;
        }
        org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("touch_info");
        if (optJSONObject3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Orders", "touch_info is null ");
            return;
        }
        c19099x8d444f05.I = ((nz2.o) gm0.j1.s(nz2.o.class)).ja() || ((nz2.o) gm0.j1.s(nz2.o.class)).h1() ? optJSONObject3.optInt("use_touch_pay", 0) : 0;
        c19099x8d444f05.L = optJSONObject3.optString("touch_forbidword");
        java.lang.String optString = optJSONObject3.optString("touch_challenge");
        boolean z17 = 1 == optJSONObject3.optInt("need_change_auth_key");
        c19099x8d444f05.f261206J = optString;
        c19099x8d444f05.K = z17;
        mz2.d2 d2Var = mz2.d2.IML;
        d2Var.f414644d = optString;
        d2Var.f414646f = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", java.lang.Integer.valueOf(c19099x8d444f05.I), optString, java.lang.Boolean.valueOf(z17));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m73879x9616526c() {
        return "reqKey:" + this.f261208e + "\ntoken" + this.f261209f + "\nnum" + this.f261210g + "\ntotalFee" + this.f261211h + "\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f261207d);
        parcel.writeString(this.f261208e);
        parcel.writeString(this.f261209f);
        parcel.writeString(this.f261210g);
        parcel.writeDouble(this.f261211h);
        parcel.writeInt(this.f261212i);
        parcel.writeString(this.f261214m);
        parcel.writeDouble(this.f261215n);
        parcel.writeDouble(this.f261216o);
        parcel.writeInt(this.f261217p);
        parcel.writeString(this.f261220q);
        parcel.writeString(this.f261221r);
        parcel.writeInt(this.f261222s);
        parcel.writeString(this.f261223t);
        parcel.writeString(this.f261224u);
        parcel.writeString(this.f261225v);
        parcel.writeString(this.f261226w);
        parcel.writeString(this.f261227x);
        parcel.writeString(this.f261230y);
        parcel.writeString(this.f261233z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.F);
        parcel.writeTypedList(this.M);
        parcel.writeString(this.G);
        parcel.writeInt(this.I);
        parcel.writeString(this.L);
        parcel.writeParcelable(this.S, 1);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.f261228x0);
        parcel.writeString(this.f261218p0);
        parcel.writeInt(this.X);
        parcel.writeTypedList(this.Z);
        parcel.writeParcelable(this.B1, 1);
        parcel.writeString(this.f261206J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$DeductInfo */
    /* loaded from: classes9.dex */
    public static class DeductInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo> f38682x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.c();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261256d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261257e;

        /* renamed from: f, reason: collision with root package name */
        public int f261258f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261259g;

        /* renamed from: h, reason: collision with root package name */
        public java.util.List f261260h = new java.util.ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public int f261261i;

        /* renamed from: m, reason: collision with root package name */
        public int f261262m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f261263n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f261264o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f261265p;

        /* renamed from: q, reason: collision with root package name */
        public java.lang.String f261266q;

        public DeductInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261256d);
            parcel.writeString(this.f261257e);
            parcel.writeInt(this.f261258f);
            parcel.writeString(this.f261259g);
            parcel.writeInt(this.f261261i);
            parcel.writeTypedList(this.f261260h);
            parcel.writeInt(this.f261262m);
            parcel.writeString(this.f261263n);
            parcel.writeString(this.f261264o);
            parcel.writeString(this.f261265p);
            parcel.writeString(this.f261266q);
        }

        public DeductInfo(android.os.Parcel parcel) {
            this.f261256d = parcel.readString();
            this.f261257e = parcel.readString();
            this.f261258f = parcel.readInt();
            this.f261259g = parcel.readString();
            this.f261261i = parcel.readInt();
            parcel.readTypedList(this.f261260h, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo.f38683x681a0c0c);
            this.f261262m = parcel.readInt();
            this.f261263n = parcel.readString();
            this.f261264o = parcel.readString();
            this.f261265p = parcel.readString();
            this.f261266q = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Orders$Commodity */
    /* loaded from: classes9.dex */
    public static class Commodity implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity> f38681x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.b();
        public java.util.List A;
        public java.lang.String B;
        public java.lang.String C;
        public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo D;
        public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo E;
        public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo F;
        public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RemarksInfo G;
        public java.util.List H;
        public boolean I;

        /* renamed from: J, reason: collision with root package name */
        public final at4.w0 f261235J;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f261236d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f261237e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f261238f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f261239g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f261240h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f261241i;

        /* renamed from: m, reason: collision with root package name */
        public double f261242m;

        /* renamed from: n, reason: collision with root package name */
        public double f261243n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f261244o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f261245p;

        /* renamed from: q, reason: collision with root package name */
        public int f261246q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f261247r;

        /* renamed from: s, reason: collision with root package name */
        public java.lang.String f261248s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f261249t;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f261250u;

        /* renamed from: v, reason: collision with root package name */
        public java.lang.String f261251v;

        /* renamed from: w, reason: collision with root package name */
        public java.lang.String f261252w;

        /* renamed from: x, reason: collision with root package name */
        public java.lang.String f261253x;

        /* renamed from: y, reason: collision with root package name */
        public java.lang.String f261254y;

        /* renamed from: z, reason: collision with root package name */
        public int f261255z;

        public Commodity() {
            this.f261242m = 0.0d;
            this.f261243n = 0.0d;
            this.A = new java.util.ArrayList();
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = new java.util.ArrayList();
            this.I = false;
            this.f261235J = new at4.w0();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f261236d);
            parcel.writeString(this.f261237e);
            parcel.writeString(this.f261238f);
            parcel.writeString(this.f261239g);
            parcel.writeString(this.f261240h);
            parcel.writeString(this.f261241i);
            parcel.writeDouble(this.f261242m);
            parcel.writeString(this.f261244o);
            parcel.writeString(this.f261245p);
            parcel.writeInt(this.f261246q);
            parcel.writeString(this.f261247r);
            parcel.writeString(this.f261248s);
            parcel.writeString(this.f261249t);
            parcel.writeString(this.f261250u);
            parcel.writeString(this.f261252w);
            parcel.writeString(this.f261253x);
            parcel.writeString(this.f261254y);
            parcel.writeTypedList(this.A);
            parcel.writeString(this.B);
            parcel.writeString(this.C);
            parcel.writeParcelable(this.D, 0);
            parcel.writeParcelable(this.E, 0);
            parcel.writeParcelable(this.F, 0);
            parcel.writeTypedList(this.H);
            parcel.writeParcelable(this.G, 0);
            parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        }

        public Commodity(android.os.Parcel parcel) {
            this.f261242m = 0.0d;
            this.f261243n = 0.0d;
            this.A = new java.util.ArrayList();
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = new java.util.ArrayList();
            this.I = false;
            this.f261235J = new at4.w0();
            this.f261236d = parcel.readString();
            this.f261237e = parcel.readString();
            this.f261238f = parcel.readString();
            this.f261239g = parcel.readString();
            this.f261240h = parcel.readString();
            this.f261241i = parcel.readString();
            this.f261242m = parcel.readDouble();
            this.f261244o = parcel.readString();
            this.f261245p = parcel.readString();
            this.f261246q = parcel.readInt();
            this.f261247r = parcel.readString();
            this.f261248s = parcel.readString();
            this.f261249t = parcel.readString();
            this.f261250u = parcel.readString();
            this.f261252w = parcel.readString();
            this.f261253x = parcel.readString();
            this.f261254y = parcel.readString();
            parcel.readTypedList(this.A, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo.f38684x681a0c0c);
            this.B = parcel.readString();
            this.C = parcel.readString();
            this.D = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo.class.getClassLoader());
            this.E = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo.class.getClassLoader());
            this.F = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo.class.getClassLoader());
            parcel.readTypedList(this.H, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions.f38687x681a0c0c);
            this.G = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RemarksInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RemarksInfo.class.getClassLoader());
            this.I = parcel.readByte() != 0;
        }
    }

    public C19099x8d444f05(android.os.Parcel parcel) {
        this.f261208e = "";
        this.f261209f = "";
        this.f261210g = "0";
        this.f261211h = 0.0d;
        this.f261216o = 0.0d;
        this.B = false;
        this.C = "";
        this.D = "";
        this.E = 0L;
        this.F = "";
        this.H = new java.util.HashSet();
        this.I = 0;
        this.L = "";
        this.M = new java.util.ArrayList();
        this.N = new vr4.j0();
        this.P = 0;
        this.Q = "";
        this.R = "";
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = "";
        this.X = 0;
        this.Y = 0;
        this.Z = new java.util.ArrayList();
        this.f261218p0 = "";
        this.f261228x0 = "";
        this.f38680x29441200 = new java.util.ArrayList<>();
        this.f261231y0 = "";
        this.f261229x1 = "";
        this.f261207d = parcel.readLong();
        this.f261208e = parcel.readString();
        this.f261209f = parcel.readString();
        this.f261210g = parcel.readString();
        this.f261211h = parcel.readDouble();
        this.f261212i = parcel.readInt();
        this.f261214m = parcel.readString();
        this.f261215n = parcel.readDouble();
        this.f261216o = parcel.readDouble();
        this.f261217p = parcel.readInt();
        this.f261220q = parcel.readString();
        this.f261221r = parcel.readString();
        this.f261222s = parcel.readInt();
        this.f261223t = parcel.readString();
        this.f261224u = parcel.readString();
        this.f261225v = parcel.readString();
        this.f261226w = parcel.readString();
        this.f261227x = parcel.readString();
        this.f261230y = parcel.readString();
        this.f261233z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt() == 1;
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readLong();
        this.F = parcel.readString();
        parcel.readTypedList(this.M, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity.f38681x681a0c0c);
        java.lang.String readString = parcel.readString();
        this.G = readString;
        this.H = m(readString);
        this.I = parcel.readInt();
        this.L = parcel.readString();
        this.S = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo.class.getClassLoader());
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.Y = parcel.readInt();
        this.f261228x0 = parcel.readString();
        this.f261218p0 = parcel.readString();
        this.X = parcel.readInt();
        parcel.readTypedList(this.Z, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo.f38690x681a0c0c);
        this.B1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.SimpleCashierInfo.class.getClassLoader());
        this.f261206J = parcel.readString();
        this.K = parcel.readInt() == 1;
    }
}
