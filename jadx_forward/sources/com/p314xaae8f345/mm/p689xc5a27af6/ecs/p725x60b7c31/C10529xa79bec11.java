package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSelectConvParams", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSelectConvParams */
/* loaded from: classes.dex */
public final /* data */ class C10529xa79bec11 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10529xa79bec11> f28814x681a0c0c = new t00.r1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147161d;

    public C10529xa79bec11(java.lang.String str) {
        this.f147161d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44218xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10529xa79bec11) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147161d, ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10529xa79bec11) obj).f147161d);
    }

    /* renamed from: hashCode */
    public int m44219x8cdac1b() {
        java.lang.String str = this.f147161d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m44220x9616526c() {
        return "IPCSelectConvParams(blackList=" + this.f147161d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f147161d);
    }
}
