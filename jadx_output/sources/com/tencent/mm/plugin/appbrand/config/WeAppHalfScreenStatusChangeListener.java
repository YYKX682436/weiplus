package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class WeAppHalfScreenStatusChangeListener implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener> CREATOR = new k91.r3();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77396d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.ResultReceiver f77397e;

    public WeAppHalfScreenStatusChangeListener(boolean z17) {
        this.f77396d = z17;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f77397e = new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.tencent.mm.plugin.appbrand.config.HeightInfo heightInfo;
                if (bundle != null) {
                    bundle.setClassLoader(com.tencent.mm.plugin.appbrand.config.HeightInfo.CREATOR.getClass().getClassLoader());
                }
                int i18 = bundle != null ? bundle.getInt("action", -1) : -1;
                k91.q3[] q3VarArr = k91.q3.f305733d;
                com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener.this;
                if (i18 == 0) {
                    int i19 = bundle != null ? bundle.getInt("status", -1) : -1;
                    if (i19 == 0) {
                        weAppHalfScreenStatusChangeListener.d();
                        return;
                    } else {
                        if (i19 != 1) {
                            return;
                        }
                        weAppHalfScreenStatusChangeListener.c();
                        return;
                    }
                }
                k91.q3[] q3VarArr2 = k91.q3.f305733d;
                if (i18 == 1) {
                    if (bundle == null || (heightInfo = (com.tencent.mm.plugin.appbrand.config.HeightInfo) bundle.getParcelable("height_info")) == null) {
                        return;
                    }
                    weAppHalfScreenStatusChangeListener.i(heightInfo);
                    return;
                }
                k91.q3[] q3VarArr3 = k91.q3.f305733d;
                if (i18 == 2) {
                    weAppHalfScreenStatusChangeListener.f(bundle != null ? bundle.getBoolean("isAnimationBegin", false) : false);
                    return;
                }
                k91.q3[] q3VarArr4 = k91.q3.f305733d;
                if (i18 == 3) {
                    weAppHalfScreenStatusChangeListener.e(bundle != null ? bundle.getBoolean("isAnimationBegin", false) : false);
                    return;
                }
                k91.q3[] q3VarArr5 = k91.q3.f305733d;
                if (i18 == 4) {
                    weAppHalfScreenStatusChangeListener.f77397e = null;
                    return;
                }
                k91.q3[] q3VarArr6 = k91.q3.f305733d;
                if (i18 == 5) {
                    weAppHalfScreenStatusChangeListener.h();
                    return;
                }
                k91.q3[] q3VarArr7 = k91.q3.f305733d;
                if (i18 == 6) {
                    weAppHalfScreenStatusChangeListener.g();
                }
            }
        };
    }

    public final void b(boolean z17) {
        android.os.ResultReceiver resultReceiver = this.f77397e;
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            k91.q3[] q3VarArr = k91.q3.f305733d;
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

    public void i(com.tencent.mm.plugin.appbrand.config.HeightInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        android.os.ResultReceiver resultReceiver = this.f77397e;
        if (resultReceiver != null) {
            resultReceiver.writeToParcel(parcel, i17);
        }
        parcel.writeInt(this.f77396d ? 1 : 0);
    }

    public /* synthetic */ WeAppHalfScreenStatusChangeListener(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeAppHalfScreenStatusChangeListener(android.os.Parcel parcel) {
        this(false, 1, null);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f77397e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        this.f77396d = parcel.readInt() == 1;
    }
}
