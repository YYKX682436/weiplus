package ca4;

/* loaded from: classes4.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f40005a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f40006b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f40007c = new java.util.concurrent.ConcurrentHashMap();

    public java.lang.CharSequence a(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f40005a.get(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return charSequence;
    }

    public java.lang.String b(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.String str = (java.lang.String) this.f40006b.get(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return str;
    }

    public java.lang.CharSequence c(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f40007c.get(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return charSequence;
    }

    public void d(r45.e86 e86Var, java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f40005a.put(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h, charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    public void e(r45.e86 e86Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f40006b.put(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    public void f(r45.e86 e86Var, java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f40007c.put(e86Var.f373132m + "-" + e86Var.f373137r + "-" + e86Var.f373130h, charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }
}
