package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/share/EcsShareMgr$TaskParams", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams */
/* loaded from: classes.dex */
final /* data */ class C10564x1d74f9a1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1> f28834x681a0c0c = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147501d;

    /* renamed from: e, reason: collision with root package name */
    public final int f147502e;

    public C10564x1d74f9a1(java.lang.String input, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        this.f147501d = input;
        this.f147502e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1 c10564x1d74f9a1 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147501d, c10564x1d74f9a1.f147501d) && this.f147502e == c10564x1d74f9a1.f147502e;
    }

    /* renamed from: hashCode */
    public int m44416x8cdac1b() {
        return (this.f147501d.hashCode() * 31) + java.lang.Integer.hashCode(this.f147502e);
    }

    /* renamed from: toString */
    public java.lang.String m44417x9616526c() {
        return "TaskParams(input=" + this.f147501d + ", method=" + this.f147502e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f147501d);
        out.writeInt(this.f147502e);
    }
}
