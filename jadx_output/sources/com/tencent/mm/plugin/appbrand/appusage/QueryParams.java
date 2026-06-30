package com.tencent.mm.plugin.appbrand.appusage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/QueryParams;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/appusage/l6", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class QueryParams implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.appusage.l6 CREATOR = new com.tencent.mm.plugin.appbrand.appusage.l6(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f76376d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appusage.y5 f76377e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76378f;

    public QueryParams(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var, int i18) {
        this.f76376d = i17;
        this.f76377e = y5Var;
        this.f76378f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f76376d);
        com.tencent.mm.plugin.appbrand.appusage.y5 y5Var = this.f76377e;
        dest.writeInt(y5Var != null ? y5Var.ordinal() : -1);
        dest.writeInt(this.f76378f);
    }
}
