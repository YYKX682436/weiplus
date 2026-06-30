package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjtemplate/RepairerConfigSnsAlbumActivityTemplateTipForEndTime;", "Ly55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumActivityTemplateTipForEndTime */
/* loaded from: classes4.dex */
public final class C20451x7b82cdde extends y55.a {
    @Override // q55.h
    public java.lang.String c() {
        return "结束时间(秒，默认为今天24点)";
    }

    @Override // q55.e
    public java.lang.Object i() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "getInstance(...)");
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return java.lang.String.valueOf(calendar.getTimeInMillis() / 1000);
    }
}
