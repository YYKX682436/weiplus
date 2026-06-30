package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/msgsend/RepairerConfigNewSendVideo;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendVideo */
/* loaded from: classes.dex */
public final class C20540xbb77632f extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_NewSendVideo";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "发送视频使用新架构";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20899x6b0c564.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        boolean z17 = true;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        return java.lang.Integer.valueOf(z17 ? 7 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_new_send_video";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("禁用新视频发送", "拍摄+相册+转发--发送使用新架构");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "7");
    }
}
