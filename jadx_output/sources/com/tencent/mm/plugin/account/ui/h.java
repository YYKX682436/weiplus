package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f73892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.j f73893e;

    public h(com.tencent.mm.plugin.account.ui.j jVar, android.content.Context context) {
        this.f73893e = jVar;
        this.f73892d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.j jVar = this.f73893e;
        com.tencent.mm.modelbase.m1 c17 = jVar.c(jVar.f73940c, jVar.f73939b.getSecImgCode());
        gm0.j1.d().g(c17);
        android.content.Context context = this.f73892d;
        db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f73892d.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.g(this, c17));
    }
}
