package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/LocalVideoCropInfoParcelable;", "Landroid/os/Parcelable;", "CREATOR", "cw2/va", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable */
/* loaded from: classes10.dex */
public final class C15203xfa689ef1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final cw2.va f36239x681a0c0c = new cw2.va(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.dd4 f212292d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        r45.dd4 dd4Var = this.f212292d;
        if (dd4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dd4Var);
            byte[] mo14344x5f01b1f6 = dd4Var.mo14344x5f01b1f6();
            dest.writeInt(mo14344x5f01b1f6.length);
            dest.writeByteArray(mo14344x5f01b1f6);
        }
    }
}
