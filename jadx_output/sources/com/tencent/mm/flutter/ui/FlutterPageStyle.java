package com.tencent.mm.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageStyle;", "Landroid/os/Parcelable;", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterPageStyle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.flutter.ui.FlutterPageStyle> CREATOR = new bj0.d();

    /* renamed from: d, reason: collision with root package name */
    public int f68117d;

    /* renamed from: e, reason: collision with root package name */
    public int f68118e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode f68119f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68120g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f68121h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f68122i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f68123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f68124n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f68125o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f68126p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f68127q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f68128r;

    public FlutterPageStyle(int i17, int i18, io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode, boolean z17, boolean z18, boolean z19, java.lang.Integer num, int i19, boolean z27, boolean z28, boolean z29, java.lang.Integer num2) {
        kotlin.jvm.internal.o.g(backgroundMode, "backgroundMode");
        this.f68117d = i17;
        this.f68118e = i18;
        this.f68119f = backgroundMode;
        this.f68120g = z17;
        this.f68121h = z18;
        this.f68122i = z19;
        this.f68123m = num;
        this.f68124n = i19;
        this.f68125o = z27;
        this.f68126p = z28;
        this.f68127q = z29;
        this.f68128r = num2;
        bj0.b[] bVarArr = bj0.b.f21102d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f68117d);
        out.writeInt(this.f68118e);
        out.writeString(this.f68119f.name());
        out.writeInt(this.f68120g ? 1 : 0);
        out.writeInt(this.f68121h ? 1 : 0);
        out.writeInt(this.f68122i ? 1 : 0);
        java.lang.Integer num = this.f68123m;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.f68124n);
        out.writeInt(this.f68125o ? 1 : 0);
        out.writeInt(this.f68126p ? 1 : 0);
        out.writeInt(this.f68127q ? 1 : 0);
        java.lang.Integer num2 = this.f68128r;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ FlutterPageStyle(int i17, int i18, io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode, boolean z17, boolean z18, boolean z19, java.lang.Integer num, int i19, boolean z27, boolean z28, boolean z29, java.lang.Integer num2, int i27, kotlin.jvm.internal.i iVar) {
        this((i27 & 1) != 0 ? 0 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent : backgroundMode, (i27 & 8) != 0 ? true : z17, (i27 & 16) != 0 ? true : z18, (i27 & 32) != 0 ? true : z19, (i27 & 64) != 0 ? null : num, (i27 & 128) == 0 ? i19 : 0, (i27 & 256) != 0 ? true : z27, (i27 & 512) != 0 ? true : z28, (i27 & 1024) == 0 ? z29 : true, (i27 & 2048) == 0 ? num2 : null);
    }
}
