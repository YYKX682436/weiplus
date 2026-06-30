package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.api.ext;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u001d\b\u0017\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/nfc/hce/api/ext/HceServiceBase$CheckIsSupportHCETask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "in", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Led1/k;", "api", "", "checkSystemSwitch", "<init>", "(Led1/k;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "ed1/j", "luggage-commons-jsapi-nfc-ext_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.api.ext.HceServiceBase$CheckIsSupportHCETask */
/* loaded from: classes7.dex */
public final class C12194x70e2b4ea extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final ed1.j f34555x681a0c0c = new ed1.j(null);

    /* renamed from: f, reason: collision with root package name */
    public final ed1.k f163939f;

    /* renamed from: g, reason: collision with root package name */
    public int f163940g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f163941h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163942i;

    public C12194x70e2b4ea(ed1.k kVar) {
        this(kVar, false, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        super.v(in6);
        this.f163940g = in6.readInt();
        this.f163941h = in6.readString();
        this.f163942i = 1 == in6.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeInt(this.f163940g);
        dest.writeString(this.f163941h);
        dest.writeInt(this.f163942i ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
        ed1.k kVar = this.f163939f;
        if (kVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            int i17 = this.f163940g;
            java.lang.String str = this.f163941h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceApiBaseService", "checkIsSupport resultCallback errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
            if (i17 == 0) {
                ed1.i iVar = kVar.f332782a;
                if (iVar != null) {
                    iVar.mo127322x57429edc(i17, str);
                    return;
                }
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "unknown error";
            }
            ed1.i iVar2 = kVar.f332782a;
            if (iVar2 != null) {
                iVar2.mo127322x57429edc(i17, str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (!fd1.d.b()) {
            this.f163940g = 13000;
            this.f163941h = "not support NFC";
        } else if (!fd1.d.a()) {
            this.f163940g = 13002;
            this.f163941h = "not support HCE";
        } else if (!this.f163942i || fd1.d.c()) {
            this.f163940g = 0;
            this.f163941h = "support HCE and system NFC switch is opened";
        } else {
            this.f163940g = 13001;
            this.f163941h = "system NFC switch not opened";
        }
        c();
    }

    public C12194x70e2b4ea(ed1.k kVar, boolean z17) {
        this.f163939f = kVar;
        this.f163942i = z17;
    }

    public /* synthetic */ C12194x70e2b4ea(ed1.k kVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(kVar, (i17 & 2) != 0 ? false : z17);
    }

    public C12194x70e2b4ea(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        v(in6);
    }
}
