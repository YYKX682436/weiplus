package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class mp extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a f228743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a) {
        super(false);
        this.f228743d = c16407x72652a1a;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state onClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a = this.f228743d;
        sb6.append(c16407x72652a1a.f228217s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", sb6.toString());
        if (c16407x72652a1a.f228217s == 0) {
            c16407x72652a1a.m66220xe1b25b63(true);
            c16407x72652a1a.f228213o.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
            c16407x72652a1a.f228217s = 1;
            c16407x72652a1a.f228219u = false;
        } else {
            c16407x72652a1a.m66220xe1b25b63(false);
            c16407x72652a1a.f228219u = false;
            c16407x72652a1a.f228213o.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
            c16407x72652a1a.f228217s = 0;
        }
        c16407x72652a1a.j();
    }
}
