package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class wt implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yt f252995d;

    public wt(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yt ytVar) {
        this.f252995d = ytVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yt ytVar = this.f252995d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = ytVar.f253181d.f248343o;
        c18064xe6e1a3b3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = c18064xe6e1a3b3.W;
        if (c21520x5bb48e5e == null || c18064xe6e1a3b3.f248735p0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            i18 = -1;
        } else {
            int m80830xfda78ef6 = c21520x5bb48e5e.m80830xfda78ef6();
            if (m80830xfda78ef6 >= 0 && c18064xe6e1a3b3.J1.size() > m80830xfda78ef6) {
                c18064xe6e1a3b3.J1.remove(m80830xfda78ef6);
                c18064xe6e1a3b3.f248735p0.mo8343xced61ae5();
                c18064xe6e1a3b3.d0();
            }
            i18 = c18064xe6e1a3b3.f248735p0.mo8338x7444f759();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        if (i18 == 0) {
            ytVar.f253181d.r7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
    }
}
