package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2510x423001a2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/autotranslation/RepairerConfigClearAutoTranslationEnableSysTipShown;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.autotranslation.RepairerConfigClearAutoTranslationEnableSysTipShown */
/* loaded from: classes.dex */
public final class C19936x1ca37f0f extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ClearAutoTranslationEnableSysTipShown";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "清除全局自动翻译后系统消息展示记录";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2510x423001a2.C19939xc18e413d.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.AutoTranslationCache", 2, null).remove("enable_times");
    }
}
