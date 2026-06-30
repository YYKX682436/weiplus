package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class nv extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4248xcb6918f7 implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni {

    /* renamed from: a, reason: collision with root package name */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 f132121a;

    public nv(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5) {
        if (c26024x5ce381b5 == null) {
            return;
        }
        this.f132121a = c26024x5ce381b5;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99449x12501425 = c26024x5ce381b5.m99449x12501425();
        if (m99449x12501425 != null) {
            android.graphics.Bitmap m99320x12501425 = m99449x12501425.m99320x12501425(context);
            if (m99320x12501425 != null) {
                this.f16487x14f1c32a = m99320x12501425.getWidth();
                this.f16486x6f77a843 = m99320x12501425.getHeight();
            }
            this.f16485xfca517fc = m99320x12501425;
        }
        this.f16484xbdc6fcf1 = c26024x5ce381b5.m99446x742757a8();
        this.f16490x4fe85b5f = c26024x5ce381b5.m99455xf94337e8();
        this.f16489xbe5ee717 = c26024x5ce381b5.m99451x74bf41ce();
        this.f16491x23d39b45 = c26024x5ce381b5.m99453x397e976e();
        if (c26024x5ce381b5.m99452xa86cd69f() != null) {
            a();
        }
        if (c26024x5ce381b5.m99450x227a49d1() != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99450x227a49d1 = c26024x5ce381b5.m99450x227a49d1();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeParcelable(m99450x227a49d1, 0);
            obtain.setDataPosition(0);
            android.os.Parcelable readParcelable = obtain.readParcelable(m99450x227a49d1.getClass().getClassLoader());
            obtain.recycle();
            this.f16488x591cd068 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b) readParcelable;
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 b() {
        return this.f132121a;
    }

    public final void a() {
        if (this.f132121a.m99452xa86cd69f() == null) {
            return;
        }
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.f132121a.m99447xa62d00a()));
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.f132121a.m99448xa62d00b()));
        double pow = java.lang.Math.pow(2.0d, 20.0f - java.lang.Math.max(3.0f, java.lang.Math.min(22.0f, this.f132121a.m99454xfb888c49())));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gg ggVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gg(2.68435456E8d);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu d17 = ggVar.d(this.f132121a.m99452xa86cd69f());
        this.f16488x591cd068 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99564x73c954a8(ggVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17.f131000a - ((this.f16487x14f1c32a * max) * pow), d17.f131001b - ((this.f16486x6f77a843 * max2) * pow)))).m99564x73c954a8(ggVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17.f131000a + (this.f16487x14f1c32a * (1.0d - max) * pow), d17.f131001b + (this.f16486x6f77a843 * (1.0d - max2) * pow)))).m99563x59bc66e();
    }
}
