package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class m3 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f64354d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64355e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.j3 f64356f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f64357g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f64358h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f64359i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(android.content.Context context, com.tencent.mm.storage.a3 a3Var, android.view.View itemView, com.tencent.mm.chatroom.ui.j3 j3Var) {
        super(itemView);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f64354d = context;
        this.f64355e = a3Var;
        this.f64356f = j3Var;
        this.f64357g = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.q7h);
        this.f64358h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cem);
        this.f64359i = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.q_b);
    }

    public static final java.lang.String i(com.tencent.mm.chatroom.ui.m3 m3Var, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String z07;
        m3Var.getClass();
        kotlin.jvm.internal.o.d(z3Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            com.tencent.mm.storage.a3 a3Var = m3Var.f64355e;
            z07 = a3Var != null ? a3Var.z0(z3Var.d1()) : null;
            if (z07 == null) {
                z07 = "";
            }
        } else {
            z07 = z3Var.w0();
            kotlin.jvm.internal.o.d(z07);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = z3Var.f2();
            kotlin.jvm.internal.o.f(z07, "getDisplayNick(...)");
        }
        if (z3Var.r2()) {
            return z07;
        }
        com.tencent.mm.storage.ya z08 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
        if (z08 == null || com.tencent.mm.sdk.platformtools.t8.K0(z08.field_conRemark)) {
            return z07;
        }
        java.lang.String str = z08.field_conRemark;
        kotlin.jvm.internal.o.f(str, "getConRemark(...)");
        return str;
    }
}
