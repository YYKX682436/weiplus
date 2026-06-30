package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserInfo", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo */
/* loaded from: classes9.dex */
public final /* data */ class C10531x377cba34 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34> f28816x681a0c0c = new t00.t1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f147166e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f147167f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f147168g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f147169h;

    public C10531x377cba34(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3) {
        this.f147165d = str;
        this.f147166e = str2;
        this.f147167f = num;
        this.f147168g = num2;
        this.f147169h = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m44226xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34 c10531x377cba34 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147165d, c10531x377cba34.f147165d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147166e, c10531x377cba34.f147166e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147167f, c10531x377cba34.f147167f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147168g, c10531x377cba34.f147168g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147169h, c10531x377cba34.f147169h);
    }

    /* renamed from: hashCode */
    public int m44227x8cdac1b() {
        java.lang.String str = this.f147165d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f147166e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f147167f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f147168g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str3 = this.f147169h;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m44228x9616526c() {
        return "IPCUserInfo(displayName=" + this.f147165d + ", avatarUrl=" + this.f147166e + ", recipientType=" + this.f147167f + ", chatroomCnt=" + this.f147168g + ", errorMsg=" + this.f147169h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f147165d);
        out.writeString(this.f147166e);
        int i18 = 0;
        java.lang.Integer num = this.f147167f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        java.lang.Integer num2 = this.f147168g;
        if (num2 != null) {
            out.writeInt(1);
            i18 = num2.intValue();
        }
        out.writeInt(i18);
        out.writeString(this.f147169h);
    }
}
