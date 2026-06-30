package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534;

/* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPLogPlugin */
/* loaded from: classes15.dex */
public class C26528x183f9c7b implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 {
    public static final java.lang.String TAG = "TPLogPlugin";

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onAttach */
    public void mo103279x3b13c504() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onDetach */
    public void mo103280x3f5eee52() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onEvent */
    public void mo103281xaf8c47fb(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        switch (i17) {
            case 101:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "create player adapter");
                return;
            case 102:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "start prepare");
                return;
            case 103:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on prepared");
                return;
            case 104:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "start play");
                return;
            case 105:
            default:
                return;
            case 106:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on paused");
                return;
            case 107:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on stoped");
                return;
            case 108:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on error:" + i18);
                return;
            case 109:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "start seek");
                return;
            case 110:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "seek complete");
                return;
            case 111:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on play complete");
                return;
            case 112:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on release");
                return;
            case 113:
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "on reset");
                return;
        }
    }
}
