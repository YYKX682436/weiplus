package com.p314xaae8f345.mm.p775xd2ae381c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageStyle;", "Landroid/os/Parcelable;", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.flutter.ui.FlutterPageStyle */
/* loaded from: classes11.dex */
public final class C10716x931597c6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6> f28959x681a0c0c = new bj0.d();

    /* renamed from: d, reason: collision with root package name */
    public int f149650d;

    /* renamed from: e, reason: collision with root package name */
    public int f149651e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode f149652f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f149653g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149654h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f149655i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f149656m;

    /* renamed from: n, reason: collision with root package name */
    public final int f149657n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f149658o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f149659p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f149660q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f149661r;

    public C10716x931597c6(int i17, int i18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode, boolean z17, boolean z18, boolean z19, java.lang.Integer num, int i19, boolean z27, boolean z28, boolean z29, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundMode, "backgroundMode");
        this.f149650d = i17;
        this.f149651e = i18;
        this.f149652f = backgroundMode;
        this.f149653g = z17;
        this.f149654h = z18;
        this.f149655i = z19;
        this.f149656m = num;
        this.f149657n = i19;
        this.f149658o = z27;
        this.f149659p = z28;
        this.f149660q = z29;
        this.f149661r = num2;
        bj0.b[] bVarArr = bj0.b.f102635d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f149650d);
        out.writeInt(this.f149651e);
        out.writeString(this.f149652f.name());
        out.writeInt(this.f149653g ? 1 : 0);
        out.writeInt(this.f149654h ? 1 : 0);
        out.writeInt(this.f149655i ? 1 : 0);
        java.lang.Integer num = this.f149656m;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.f149657n);
        out.writeInt(this.f149658o ? 1 : 0);
        out.writeInt(this.f149659p ? 1 : 0);
        out.writeInt(this.f149660q ? 1 : 0);
        java.lang.Integer num2 = this.f149661r;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ C10716x931597c6(int i17, int i18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode, boolean z17, boolean z18, boolean z19, java.lang.Integer num, int i19, boolean z27, boolean z28, boolean z29, java.lang.Integer num2, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i27 & 1) != 0 ? 0 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.transparent : backgroundMode, (i27 & 8) != 0 ? true : z17, (i27 & 16) != 0 ? true : z18, (i27 & 32) != 0 ? true : z19, (i27 & 64) != 0 ? null : num, (i27 & 128) == 0 ? i19 : 0, (i27 & 256) != 0 ? true : z27, (i27 & 512) != 0 ? true : z28, (i27 & 1024) == 0 ? z29 : true, (i27 & 2048) == 0 ? num2 : null);
    }
}
