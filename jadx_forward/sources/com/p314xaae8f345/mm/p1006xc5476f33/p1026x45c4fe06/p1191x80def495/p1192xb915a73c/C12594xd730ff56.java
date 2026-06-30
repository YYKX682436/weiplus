package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/skyline/nativeview/SkylineNativeViewManager$InnerMotionEvent", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent */
/* loaded from: classes.dex */
public final /* data */ class C12594xd730ff56 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56> f35194x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.u();

    /* renamed from: d, reason: collision with root package name */
    public final int f170414d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170415e;

    /* renamed from: f, reason: collision with root package name */
    public final long f170416f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f170417g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f170418h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f170419i;

    public C12594xd730ff56(int i17, int i18, long j17, java.util.List pointerIds, java.util.List x17, java.util.List y17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerIds, "pointerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "y");
        this.f170414d = i17;
        this.f170415e = i18;
        this.f170416f = j17;
        this.f170417g = pointerIds;
        this.f170418h = x17;
        this.f170419i = y17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52717xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56 c12594xd730ff56 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56) obj;
        return this.f170414d == c12594xd730ff56.f170414d && this.f170415e == c12594xd730ff56.f170415e && this.f170416f == c12594xd730ff56.f170416f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170417g, c12594xd730ff56.f170417g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170418h, c12594xd730ff56.f170418h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170419i, c12594xd730ff56.f170419i);
    }

    /* renamed from: hashCode */
    public int m52718x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f170414d) * 31) + java.lang.Integer.hashCode(this.f170415e)) * 31) + java.lang.Long.hashCode(this.f170416f)) * 31) + this.f170417g.hashCode()) * 31) + this.f170418h.hashCode()) * 31) + this.f170419i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52719x9616526c() {
        return "InnerMotionEvent(action=" + this.f170414d + ", actionIndex=" + this.f170415e + ", time=" + this.f170416f + ", pointerIds=" + this.f170417g + ", x=" + this.f170418h + ", y=" + this.f170419i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f170414d);
        out.writeInt(this.f170415e);
        out.writeLong(this.f170416f);
        java.util.List list = this.f170417g;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeInt(((java.lang.Number) it.next()).intValue());
        }
        java.util.List list2 = this.f170418h;
        out.writeInt(list2.size());
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            out.writeFloat(((java.lang.Number) it6.next()).floatValue());
        }
        java.util.List list3 = this.f170419i;
        out.writeInt(list3.size());
        java.util.Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            out.writeFloat(((java.lang.Number) it7.next()).floatValue());
        }
    }
}
