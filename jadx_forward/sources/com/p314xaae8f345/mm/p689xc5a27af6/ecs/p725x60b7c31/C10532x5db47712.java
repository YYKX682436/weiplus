package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket */
/* loaded from: classes9.dex */
public final /* data */ class C10532x5db47712 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712> f28817x681a0c0c = new t00.u1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147170d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f147171e;

    public C10532x5db47712(java.lang.String userName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f147170d = userName;
        this.f147171e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44230xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712 c10532x5db47712 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147170d, c10532x5db47712.f147170d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147171e, c10532x5db47712.f147171e);
    }

    /* renamed from: hashCode */
    public int m44231x8cdac1b() {
        int hashCode = this.f147170d.hashCode() * 31;
        java.lang.String str = this.f147171e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m44232x9616526c() {
        return "IPCUserTicket(userName=" + this.f147170d + ", ticket=" + this.f147171e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f147170d);
        out.writeString(this.f147171e);
    }
}
