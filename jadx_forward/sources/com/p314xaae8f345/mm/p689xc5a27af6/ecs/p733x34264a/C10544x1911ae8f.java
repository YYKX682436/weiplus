package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsAsyncRequest", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest */
/* loaded from: classes4.dex */
public final /* data */ class C10544x1911ae8f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10544x1911ae8f> f28832x681a0c0c = new r10.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f147383d;

    public C10544x1911ae8f(int i17) {
        this.f147383d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44296xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10544x1911ae8f) && this.f147383d == ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p733x34264a.C10544x1911ae8f) obj).f147383d;
    }

    /* renamed from: hashCode */
    public int m44297x8cdac1b() {
        return java.lang.Integer.hashCode(this.f147383d);
    }

    /* renamed from: toString */
    public java.lang.String m44298x9616526c() {
        return "EcsAsyncRequest(placeholder=" + this.f147383d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f147383d);
    }

    public /* synthetic */ C10544x1911ae8f(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
