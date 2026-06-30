package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCPoiRequest", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest */
/* loaded from: classes9.dex */
public final /* data */ class C10528xc51e3780 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780> f28813x681a0c0c = new t00.e0();

    /* renamed from: d, reason: collision with root package name */
    public final int f147158d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f147159e;

    /* renamed from: f, reason: collision with root package name */
    public final int f147160f;

    public C10528xc51e3780(int i17, boolean z17, int i18) {
        this.f147158d = i17;
        this.f147159e = z17;
        this.f147160f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44214xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780 c10528xc51e3780 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780) obj;
        return this.f147158d == c10528xc51e3780.f147158d && this.f147159e == c10528xc51e3780.f147159e && this.f147160f == c10528xc51e3780.f147160f;
    }

    /* renamed from: hashCode */
    public int m44215x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f147158d) * 31) + java.lang.Boolean.hashCode(this.f147159e)) * 31) + java.lang.Integer.hashCode(this.f147160f);
    }

    /* renamed from: toString */
    public java.lang.String m44216x9616526c() {
        return "IPCPoiRequest(poiValidTimeSec=" + this.f147158d + ", waitingPoiUpdateResult=" + this.f147159e + ", waitingPoiUpdateTimeoutSec=" + this.f147160f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f147158d);
        out.writeInt(this.f147159e ? 1 : 0);
        out.writeInt(this.f147160f);
    }
}
