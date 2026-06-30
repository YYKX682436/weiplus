package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ko implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho f251177d;

    public ko(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ho hoVar) {
        this.f251177d = hoVar;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$3");
        oz5.m mVar = oz5.m.f431862d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$3");
        return mVar;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$3");
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f442944b == -1 && m1Var.f442945c == 0) {
                qc0.l1 a17 = m1Var.a();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_extra_data", m1Var.f442947e);
                if (a17.a()) {
                    intent.putExtra("key_req_result", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, a17.f442929b));
                } else {
                    r45.vh4 vh4Var = new r45.vh4();
                    vh4Var.f469768e = true;
                    vh4Var.f469767d = false;
                    java.lang.String str = a17.f442929b;
                    intent.putExtra("key_req_result", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, str, a17.f442930c, com.p314xaae8f345.mm.vfs.w6.q(str), by5.x.c(str), (int) (a17.f442931d / 1000), vh4Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lo loVar = this.f251177d.f250058c;
                if (loVar != null) {
                    loVar.a(m1Var.f442944b, intent);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$3");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$3");
    }
}
