package y75;

/* loaded from: classes10.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f541320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541321e;

    public b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.content.Context context) {
        this.f541320d = interfaceC4987x84e327cb;
        this.f541321e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String mo42930x4f4a97c4 = this.f541320d.mo42930x4f4a97c4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42930x4f4a97c4, "getGroupId(...)");
        qk.c0 c0Var = new qk.c0(mo42930x4f4a97c4);
        c0Var.f445731g = 20;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimilarEmoji", "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(this.f541321e, c0Var);
        }
        dialogInterface.cancel();
    }
}
