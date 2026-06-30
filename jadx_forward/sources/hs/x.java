package hs;

@j95.b
/* loaded from: classes4.dex */
public final class x extends i95.w implements qk.s7 {
    public java.lang.String wi(qk.k9 parseSource, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parseSource, "parseSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("LivePhoto");
        int ordinal = parseSource.ordinal();
        java.lang.String str = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "" : "sns_mj_template_" : "sns_publish_ui_" : "gallery_";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.o());
        sb6.append('/');
        sb6.append(str);
        byte[] bytes = (tag + java.lang.System.currentTimeMillis()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }
}
