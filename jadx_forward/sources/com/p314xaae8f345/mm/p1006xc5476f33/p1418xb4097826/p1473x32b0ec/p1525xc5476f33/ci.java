package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ci extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(android.view.ViewGroup emptyFrameLayout, qo0.c statusMonitor) {
        super(emptyFrameLayout, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emptyFrameLayout, "emptyFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        java.lang.String str = string != null ? string : "";
        switch (str.hashCode()) {
            case -1394759506:
                if (str.equals("PORTRAIT_ACTION_DISPATCH_JUMP")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bi biVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bi(obj, this);
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(biVar, j17);
                    return;
                }
                return;
            case 287584941:
                if (str.equals("PORTRAIT_ACTION_CART_CLICKED")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai aiVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai(this);
                    java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aiVar, j17);
                    return;
                }
                return;
            case 480324394:
                if (str.equals("PORTRAIT_ACTION_HALF_SCREEN_MINIPRO") && X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zh zhVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zh(this, obj, j17);
                    java.util.regex.Pattern pattern3 = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(zhVar, j17);
                    return;
                }
                return;
            case 639452494:
                if (str.equals("PORTRAIT_ACTION_FULL_SCREEN_MINIPRO") && X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yh yhVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yh(this, obj, j17);
                    java.util.regex.Pattern pattern4 = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(yhVar, j17);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }
}
