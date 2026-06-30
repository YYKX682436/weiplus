package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo */
/* loaded from: classes9.dex */
public final /* data */ class C10527x84c4b5e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e> f28812x681a0c0c = new t00.d0();

    /* renamed from: d, reason: collision with root package name */
    public final int f147154d;

    /* renamed from: e, reason: collision with root package name */
    public final float f147155e;

    /* renamed from: f, reason: collision with root package name */
    public final float f147156f;

    /* renamed from: g, reason: collision with root package name */
    public final long f147157g;

    public C10527x84c4b5e(int i17, float f17, float f18, long j17) {
        this.f147154d = i17;
        this.f147155e = f17;
        this.f147156f = f18;
        this.f147157g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44210xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e c10527x84c4b5e = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e) obj;
        return this.f147154d == c10527x84c4b5e.f147154d && java.lang.Float.compare(this.f147155e, c10527x84c4b5e.f147155e) == 0 && java.lang.Float.compare(this.f147156f, c10527x84c4b5e.f147156f) == 0 && this.f147157g == c10527x84c4b5e.f147157g;
    }

    /* renamed from: hashCode */
    public int m44211x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f147154d) * 31) + java.lang.Float.hashCode(this.f147155e)) * 31) + java.lang.Float.hashCode(this.f147156f)) * 31) + java.lang.Long.hashCode(this.f147157g);
    }

    /* renamed from: toString */
    public java.lang.String m44212x9616526c() {
        return "IPCEcsPoiInfo(errCode=" + this.f147154d + ", longitude=" + this.f147155e + ", latitude=" + this.f147156f + ", updateTime=" + this.f147157g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f147154d);
        out.writeFloat(this.f147155e);
        out.writeFloat(this.f147156f);
        out.writeLong(this.f147157g);
    }
}
