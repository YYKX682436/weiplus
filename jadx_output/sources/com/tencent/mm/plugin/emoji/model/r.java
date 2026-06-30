package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f97598b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.EmotionStateChangeEvent f97597a = new com.tencent.mm.autogen.events.EmotionStateChangeEvent();

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent = this.f97597a;
        am.t4 t4Var = emotionStateChangeEvent.f54107g;
        t4Var.f7979a = str;
        t4Var.f7980b = i17;
        t4Var.f7981c = i18;
        t4Var.f7982d = str2;
        emotionStateChangeEvent.e();
        java.util.Map map = this.f97598b;
        if (i17 != 6) {
            ((java.util.HashMap) map).remove(str);
        } else if (i18 < 0 || i18 >= 100) {
            ((java.util.HashMap) map).remove(str);
        } else {
            ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i18));
        }
    }

    public int b(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) this.f97598b).get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
