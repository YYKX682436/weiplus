package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 f282304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArraySet f282305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282306f;

    public a0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var, java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f282304d = h0Var;
        this.f282305e = copyOnWriteArraySet;
        this.f282306f = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "delete message");
        de5.a aVar = de5.a.f310929a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282304d;
        aVar.b(19, h0Var.f282506f);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i3.a(h0Var.f282504d, this.f282305e, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z(h0Var, this.f282306f));
    }
}
