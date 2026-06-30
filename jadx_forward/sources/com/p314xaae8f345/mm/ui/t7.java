package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.t7 f291414a = new com.p314xaae8f345.mm.ui.t7();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f291415b = jz5.h.b(com.p314xaae8f345.mm.ui.q7.f291078d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f291416c = jz5.h.b(com.p314xaae8f345.mm.ui.p7.f291028d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f291415b).mo141623x754a37bb()).booleanValue() || ((java.lang.Boolean) ((jz5.n) f291416c).mo141623x754a37bb()).booleanValue();
    }

    public final android.view.View b(android.content.Context context, com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.doj, (android.view.ViewGroup) null);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.r7(context, c21410x67d80e90));
        inflate.setOnLongClickListener(new com.p314xaae8f345.mm.ui.s7(context));
        return inflate;
    }
}
