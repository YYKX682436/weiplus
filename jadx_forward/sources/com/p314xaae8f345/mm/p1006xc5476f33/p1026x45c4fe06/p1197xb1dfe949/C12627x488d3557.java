package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/tipsmsg/TipsMsgInfo;", "Ldm/jb;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "rj1/j", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo */
/* loaded from: classes7.dex */
public final class C12627x488d3557 extends dm.jb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final rj1.j f35291x681a0c0c = new rj1.j(null);
    public static final l75.e0 D = dm.jb.m125152x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557.class);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.jb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    /* renamed from: toString */
    public java.lang.String m52866x9616526c() {
        return "TipsMsgInfo:{appId:" + this.f67159x28d45f97 + ", msgId:" + this.f67164x297eb4f7 + ", businessType:" + this.f67160xd95c4268 + ", msgType:" + this.f67165xc4aab016 + ", dataJson:" + this.f67162x88617557;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f67159x28d45f97);
        dest.writeString(this.f67164x297eb4f7);
        dest.writeLong(this.f67161xac3be4e);
        dest.writeLong(this.f67163x876650f1);
        dest.writeInt(this.f67160xd95c4268);
        dest.writeInt(this.f67165xc4aab016);
        dest.writeString(this.f67162x88617557);
    }
}
