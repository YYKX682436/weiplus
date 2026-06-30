package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;", "Landroid/os/Parcelable;", "k91/o3", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener */
/* loaded from: classes7.dex */
public class C11818x81f6960b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b> f33598x681a0c0c = new k91.p3();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f158927d;

    public C11818x81f6960b() {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f158927d = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                int i18 = bundle != null ? bundle.getInt("action", -1) : -1;
                k91.o3[] o3VarArr = k91.o3.f387236d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b c11818x81f6960b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b.this;
                if (i18 == 0) {
                    c11818x81f6960b.d();
                    return;
                }
                k91.o3[] o3VarArr2 = k91.o3.f387236d;
                if (i18 == 1) {
                    c11818x81f6960b.c();
                }
            }
        };
    }

    public final void a() {
        android.os.ResultReceiver resultReceiver = this.f158927d;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.o3[] o3VarArr = k91.o3.f387236d;
            bundle.putInt("action", 1);
            resultReceiver.send(0, bundle);
        }
    }

    public final void b() {
        android.os.ResultReceiver resultReceiver = this.f158927d;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.o3[] o3VarArr = k91.o3.f387236d;
            bundle.putInt("action", 0);
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

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        android.os.ResultReceiver resultReceiver = this.f158927d;
        if (resultReceiver != null) {
            resultReceiver.writeToParcel(dest, i17);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11818x81f6960b(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f158927d = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }
}
