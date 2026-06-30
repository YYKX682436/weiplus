package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes8.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f232685a;

    /* renamed from: b, reason: collision with root package name */
    public final long f232686b;

    public g8(android.content.Context context, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f232685a = context;
        this.f232686b = j17;
    }

    public final void a(long j17, int i17, java.lang.String msgType, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgType, "msgType");
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        android.content.Context context = this.f232685a;
        r45.pk5 pk5Var = (r45.pk5) eVar.Ai(context, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f464673o = (int) (j17 - this.f232686b);
        }
        if (pk5Var != null) {
            pk5Var.f464665d = i17;
        }
        if (pk5Var != null) {
            pk5Var.f464671m = msgType;
        }
        if (pk5Var != null) {
            pk5Var.f464670i = i18;
        }
        if (str != null && pk5Var != null) {
            pk5Var.f464675q = str;
        }
        l35.a.f396976a.a(context);
    }
}
