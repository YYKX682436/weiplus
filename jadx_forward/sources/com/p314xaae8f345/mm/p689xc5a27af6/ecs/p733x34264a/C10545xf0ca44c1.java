package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsOpenAsyncInfoResult", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult */
/* loaded from: classes9.dex */
public final /* data */ class C10545xf0ca44c1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1> f28833x681a0c0c = new r10.e();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f147384d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f147385e;

    public C10545xf0ca44c1(boolean z17, boolean z18) {
        this.f147384d = z17;
        this.f147385e = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44300xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1 c10545xf0ca44c1 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10545xf0ca44c1) obj;
        return this.f147384d == c10545xf0ca44c1.f147384d && this.f147385e == c10545xf0ca44c1.f147385e;
    }

    /* renamed from: hashCode */
    public int m44301x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f147384d) * 31) + java.lang.Boolean.hashCode(this.f147385e);
    }

    /* renamed from: toString */
    public java.lang.String m44302x9616526c() {
        return "EcsOpenAsyncInfoResult(success=" + this.f147384d + ", isTeenMode=" + this.f147385e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f147384d ? 1 : 0);
        out.writeInt(this.f147385e ? 1 : 0);
    }
}
