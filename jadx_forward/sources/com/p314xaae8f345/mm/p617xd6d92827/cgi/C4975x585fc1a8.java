package com.p314xaae8f345.mm.p617xd6d92827.cgi;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiCallbackData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData */
/* loaded from: classes5.dex */
public final /* data */ class C4975x585fc1a8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8> f21386x681a0c0c = new yj.i();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134681d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f134682e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f134683f;

    public C4975x585fc1a8(boolean z17, byte[] bArr, java.lang.Integer num) {
        this.f134681d = z17;
        this.f134682e = bArr;
        this.f134683f = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42872xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData");
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8 c4975x585fc1a8 = (com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8) obj;
        if (this.f134681d != c4975x585fc1a8.f134681d || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134683f, c4975x585fc1a8.f134683f)) {
            return false;
        }
        byte[] bArr = c4975x585fc1a8.f134682e;
        byte[] bArr2 = this.f134682e;
        if (bArr2 != null) {
            if (bArr == null || !java.util.Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m42873x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f134681d) * 31;
        java.lang.Integer num = this.f134683f;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        byte[] bArr = this.f134682e;
        return intValue + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    /* renamed from: toString */
    public java.lang.String m42874x9616526c() {
        return "MagicAdIPCCgiCallbackData(success=" + this.f134681d + ", adsResult=" + java.util.Arrays.toString(this.f134682e) + ", errCode=" + this.f134683f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f134681d ? 1 : 0);
        out.writeByteArray(this.f134682e);
        java.lang.Integer num = this.f134683f;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public /* synthetic */ C4975x585fc1a8(boolean z17, byte[] bArr, java.lang.Integer num, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? true : z17, (i17 & 2) != 0 ? null : bArr, (i17 & 4) != 0 ? null : num);
    }
}
