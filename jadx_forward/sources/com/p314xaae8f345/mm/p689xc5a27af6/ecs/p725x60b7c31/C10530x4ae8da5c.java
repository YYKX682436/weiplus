package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSingleUserInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo */
/* loaded from: classes9.dex */
public final /* data */ class C10530x4ae8da5c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c> f28815x681a0c0c = new t00.s1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147162d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f147163e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f147164f;

    public C10530x4ae8da5c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f147162d = str;
        this.f147163e = str2;
        this.f147164f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44222xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c c10530x4ae8da5c = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147162d, c10530x4ae8da5c.f147162d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147163e, c10530x4ae8da5c.f147163e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147164f, c10530x4ae8da5c.f147164f);
    }

    /* renamed from: hashCode */
    public int m44223x8cdac1b() {
        java.lang.String str = this.f147162d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f147163e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f147164f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m44224x9616526c() {
        return "IPCSingleUserInfo(displayName=" + this.f147162d + ", avatarUrl=" + this.f147163e + ", errorMsg=" + this.f147164f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f147162d);
        out.writeString(this.f147163e);
        out.writeString(this.f147164f);
    }
}
