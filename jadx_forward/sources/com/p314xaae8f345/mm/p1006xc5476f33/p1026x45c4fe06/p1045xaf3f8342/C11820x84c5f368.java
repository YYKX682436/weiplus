package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener */
/* loaded from: classes7.dex */
public class C11820x84c5f368 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368> f33599x681a0c0c = new k91.r3();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f158929d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.ResultReceiver f158930e;

    public C11820x84c5f368(boolean z17) {
        this.f158929d = z17;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f158930e = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 c11817xcfa25a95;
                if (bundle != null) {
                    bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95.f33597x681a0c0c.getClass().getClassLoader());
                }
                int i18 = bundle != null ? bundle.getInt("action", -1) : -1;
                k91.q3[] q3VarArr = k91.q3.f387266d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368.this;
                if (i18 == 0) {
                    int i19 = bundle != null ? bundle.getInt("status", -1) : -1;
                    if (i19 == 0) {
                        c11820x84c5f368.d();
                        return;
                    } else {
                        if (i19 != 1) {
                            return;
                        }
                        c11820x84c5f368.c();
                        return;
                    }
                }
                k91.q3[] q3VarArr2 = k91.q3.f387266d;
                if (i18 == 1) {
                    if (bundle == null || (c11817xcfa25a95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95) bundle.getParcelable("height_info")) == null) {
                        return;
                    }
                    c11820x84c5f368.i(c11817xcfa25a95);
                    return;
                }
                k91.q3[] q3VarArr3 = k91.q3.f387266d;
                if (i18 == 2) {
                    c11820x84c5f368.f(bundle != null ? bundle.getBoolean("isAnimationBegin", false) : false);
                    return;
                }
                k91.q3[] q3VarArr4 = k91.q3.f387266d;
                if (i18 == 3) {
                    c11820x84c5f368.e(bundle != null ? bundle.getBoolean("isAnimationBegin", false) : false);
                    return;
                }
                k91.q3[] q3VarArr5 = k91.q3.f387266d;
                if (i18 == 4) {
                    c11820x84c5f368.f158930e = null;
                    return;
                }
                k91.q3[] q3VarArr6 = k91.q3.f387266d;
                if (i18 == 5) {
                    c11820x84c5f368.h();
                    return;
                }
                k91.q3[] q3VarArr7 = k91.q3.f387266d;
                if (i18 == 6) {
                    c11820x84c5f368.g();
                }
            }
        };
    }

    public final void b(boolean z17) {
        android.os.ResultReceiver resultReceiver = this.f158930e;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.q3[] q3VarArr = k91.q3.f387266d;
            bundle.putInt("action", 3);
            bundle.putBoolean("isAnimationBegin", z17);
            resultReceiver.send(0, bundle);
        }
    }

    public void c() {
    }

    public void d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(boolean z17) {
    }

    public void f(boolean z17) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        android.os.ResultReceiver resultReceiver = this.f158930e;
        if (resultReceiver != null) {
            resultReceiver.writeToParcel(parcel, i17);
        }
        parcel.writeInt(this.f158929d ? 1 : 0);
    }

    public /* synthetic */ C11820x84c5f368(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11820x84c5f368(android.os.Parcel parcel) {
        this(false, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f158930e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        this.f158929d = parcel.readInt() == 1;
    }
}
