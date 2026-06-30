package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* renamed from: com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener */
/* loaded from: classes14.dex */
public class C16191xaf149588 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588> f37326x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f224951d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f224952e;

    public C16191xaf149588(java.lang.Boolean bool) {
        this.f224951d = bool;
        this.f224952e = new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                if (bundle != null) {
                    int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.m65648xcee59d22()[bundle.getInt("KEY_ACTION", 0)].ordinal();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588.this;
                    switch (ordinal) {
                        case 1:
                            c16191xaf149588.h();
                            return;
                        case 2:
                            c16191xaf149588.g();
                            return;
                        case 3:
                            c16191xaf149588.c();
                            return;
                        case 4:
                            c16191xaf149588.b();
                            return;
                        case 5:
                            c16191xaf149588.getClass();
                            return;
                        case 6:
                            c16191xaf149588.e();
                            return;
                        case 7:
                            c16191xaf149588.n();
                            return;
                        case 8:
                            c16191xaf149588.getClass();
                            return;
                        case 9:
                            c16191xaf149588.getClass();
                            return;
                        case 10:
                            c16191xaf149588.getClass();
                            return;
                        case 11:
                            c16191xaf149588.m();
                            return;
                        case 12:
                            c16191xaf149588.i();
                            return;
                        case 13:
                            c16191xaf149588.getClass();
                            return;
                        case 14:
                            c16191xaf149588.d();
                            return;
                        case 15:
                            c16191xaf149588.f(bundle.getInt("KEY_CUR_HEIGHT", 0), bundle.getInt("BASE_HEIGHT", 0));
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m mVar) {
        if (mVar == com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.HEIGHT_CHANGED) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_ACTION", mVar.ordinal());
        this.f224952e.send(0, bundle);
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
    }

    public void f(int i17, int i18) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void n() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f224952e.writeToParcel(parcel, i17);
        parcel.writeInt(this.f224951d.booleanValue() ? 1 : 0);
    }

    public C16191xaf149588(android.os.Parcel parcel) {
        this.f224952e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        this.f224951d = java.lang.Boolean.valueOf(parcel.readInt() == 1);
    }
}
