package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class oh extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4259xc18f51ed implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni {

    /* renamed from: a, reason: collision with root package name */
    com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 f132124a;

    public oh(android.content.Context context, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 abstractC4304xe42503c2) {
        this.f132124a = abstractC4304xe42503c2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(abstractC4304xe42503c2.mo35764xfb7e5820());
        m35439xe131cdea(arrayList);
        this.f16639x1bd1f072 = abstractC4304xe42503c2.mo35593xf5215fdc();
        this.f16637xb477f80b = abstractC4304xe42503c2.mo35589xf24533d5();
        this.f16632x3252eb57 = abstractC4304xe42503c2.mo35586x70202721();
        this.f16634x3f6cc545 = abstractC4304xe42503c2.mo35587x7d3a010f();
        this.f16619xb118f2b5 = abstractC4304xe42503c2.mo35767x32997e7e();
        this.f16621x6219b84 = abstractC4304xe42503c2.mo35585xc0274e58();
        this.f16630x6280547 = abstractC4304xe42503c2.m35778xfb85f7b0();
        this.f16640xd4677478 = abstractC4304xe42503c2.mo35591x397e976e();
        this.f16577xf669cf14 = abstractC4304xe42503c2.m35590x88d92190();
        if (abstractC4304xe42503c2 instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab c4302x40bb7fab = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab) abstractC4304xe42503c2;
            this.f16638xc80e6c92 = c4302x40bb7fab.m35774x2d258f88();
            this.f16617xaf3ebd70 = c4302x40bb7fab.m35773x1455e066();
            this.f16622x6b04e5b4 = c4302x40bb7fab.m35775xaa5d7a57();
            return;
        }
        if (abstractC4304xe42503c2 instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51) {
            com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 c4300xcbfccc51 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51) abstractC4304xe42503c2;
            this.f16624x14f1c32a = c4300xcbfccc51.m35766x755bd410();
            this.f16623x6f77a843 = c4300xcbfccc51.m35765x1c4fb41d();
            if (c4300xcbfccc51.m35763x37b270ee() == null || c4300xcbfccc51.m35763x37b270ee().length <= 0) {
                return;
            }
            this.f16625x97fde7f7 = new android.graphics.Bitmap[c4300xcbfccc51.m35763x37b270ee().length];
            for (int i17 = 0; i17 < c4300xcbfccc51.m35763x37b270ee().length; i17++) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = c4300xcbfccc51.m35763x37b270ee()[i17];
                if (c26010x4177761e != null) {
                    android.graphics.Bitmap m99320x12501425 = c26010x4177761e.m99320x12501425(context);
                    if (m99320x12501425 != null && (this.f16624x14f1c32a != m99320x12501425.getWidth() || this.f16623x6f77a843 != m99320x12501425.getHeight())) {
                        int i18 = this.f16624x14f1c32a;
                        int i19 = this.f16623x6f77a843;
                        int width = m99320x12501425.getWidth();
                        int height = m99320x12501425.getHeight();
                        android.graphics.Matrix matrix = new android.graphics.Matrix();
                        matrix.postScale(i18 / width, i19 / height);
                        m99320x12501425 = android.graphics.Bitmap.createBitmap(m99320x12501425, 0, 0, width, height, matrix, true);
                    }
                    this.f16625x97fde7f7[i17] = m99320x12501425;
                } else {
                    this.f16625x97fde7f7[i17] = null;
                }
            }
        }
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i17, int i18) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i17 / width, i18 / height);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 a() {
        return this.f132124a;
    }
}
