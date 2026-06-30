package x44;

/* loaded from: classes4.dex */
public final class m1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.o1 f533391d;

    public m1(x44.o1 o1Var) {
        this.f533391d = o1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$2");
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.OperateDownloadTask", "the user cancel the resume");
        x44.o1 o1Var = this.f533391d;
        o1Var.b(w44.d.k(o1Var, -1, "cancel", null, 4, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1$2");
    }
}
