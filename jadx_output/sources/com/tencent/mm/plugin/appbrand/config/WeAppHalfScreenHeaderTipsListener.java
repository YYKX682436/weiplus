package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;", "Landroid/os/Parcelable;", "k91/o3", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class WeAppHalfScreenHeaderTipsListener implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener> CREATOR = new k91.p3();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f77394d;

    public WeAppHalfScreenHeaderTipsListener() {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f77394d = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                int i18 = bundle != null ? bundle.getInt("action", -1) : -1;
                k91.o3[] o3VarArr = k91.o3.f305703d;
                com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener = com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener.this;
                if (i18 == 0) {
                    weAppHalfScreenHeaderTipsListener.d();
                    return;
                }
                k91.o3[] o3VarArr2 = k91.o3.f305703d;
                if (i18 == 1) {
                    weAppHalfScreenHeaderTipsListener.c();
                }
            }
        };
    }

    public final void a() {
        android.os.ResultReceiver resultReceiver = this.f77394d;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.o3[] o3VarArr = k91.o3.f305703d;
            bundle.putInt("action", 1);
            resultReceiver.send(0, bundle);
        }
    }

    public final void b() {
        android.os.ResultReceiver resultReceiver = this.f77394d;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.o3[] o3VarArr = k91.o3.f305703d;
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
        kotlin.jvm.internal.o.g(dest, "dest");
        android.os.ResultReceiver resultReceiver = this.f77394d;
        if (resultReceiver != null) {
            resultReceiver.writeToParcel(dest, i17);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeAppHalfScreenHeaderTipsListener(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f77394d = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }
}
