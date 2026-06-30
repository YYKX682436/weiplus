package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f281920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj f281921f;

    public zi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj bjVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        this.f281921f = bjVar;
        this.f281919d = f9Var;
        this.f281920e = c16565x9bc03d4e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj bjVar = this.f281921f;
        bjVar.getClass();
        java.lang.String str = bjVar.f280362h;
        long j17 = bjVar.f280361g;
        sb5.z zVar = (sb5.z) bjVar.f280113d.f542241c.a(sb5.z.class);
        int b17 = i65.a.b(bjVar.f280113d.g(), 120);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && j17 != 0) {
            sb5.y yVar = new sb5.y();
            yVar.f487130b = true;
            yVar.f487133e = b17;
            yVar.f487135g = true;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).T0(str, j17, hd5.n.ACTION_POSITION, yVar);
        }
        bjVar.m0();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281919d;
        if (f9Var != null) {
            int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = this.f281920e;
            switch (mo78013xfb85f7b0) {
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 975175729:
                case 1040187441:
                case 1090519089:
                case 1157627953:
                case 1174405169:
                case 1224736817:
                case 1241514033:
                    ot0.q v17 = ot0.q.v(f9Var.j());
                    if (v17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QuoteMsgTongueComponent", "appMsgContent is null");
                        break;
                    } else {
                        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f504272h, c16565x9bc03d4e, java.lang.Integer.valueOf(v17.f430199i), str);
                        break;
                    }
                default:
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f504272h, c16565x9bc03d4e, 0, str);
                    break;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
