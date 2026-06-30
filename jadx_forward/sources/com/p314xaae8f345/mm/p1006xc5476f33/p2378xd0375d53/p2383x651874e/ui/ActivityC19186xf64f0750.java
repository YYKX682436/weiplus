package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2383x651874e.ui;

/* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI */
/* loaded from: classes9.dex */
public class ActivityC19186xf64f0750 extends com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f262804r = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd
    public void U6() {
        m83090x14f40144(com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de);
        m83090x14f40144(1544);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd
    public void V6(java.lang.String str, java.lang.String str2, int i17) {
        m83098x5406100e(new wt4.b(str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd
    public void W6() {
        m83098x5406100e(new wt4.a(10, this.f234391m));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd
    public java.lang.String X6(int i17) {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q(i17, new java.text.SimpleDateFormat("dd MMMM", locale), new java.text.SimpleDateFormat("dd MMMM yyyy", locale));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd
    public void a7() {
        m83121xf6ff5b27(com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de);
        m83121xf6ff5b27(1544);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof wt4.a) {
            wt4.a aVar = (wt4.a) m1Var;
            java.util.LinkedList linkedList = ((r45.d75) aVar.f531063e.f152244b.f152233a).f453739f;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.m75 m75Var = (r45.m75) it.next();
                dp3.o oVar = new dp3.o();
                oVar.f323767q = m75Var.f461731p;
                oVar.f323768r = m75Var.f461732q;
                oVar.f323769s = m75Var.f461733r;
                oVar.f323760g = m75Var.f461725g;
                oVar.f323763m = m75Var.f461728m;
                oVar.f323759f = m75Var.f461724f;
                oVar.f323766p = "0";
                oVar.f323762i = m75Var.f461727i;
                oVar.f323765o = m75Var.f461730o;
                oVar.f323772v = 1;
                oVar.f323771u = m75Var.f461735t;
                oVar.f323770t = m75Var.f461734s;
                oVar.f323764n = m75Var.f461729n;
                oVar.f323758e = m75Var.f461723e;
                oVar.f323761h = m75Var.f461726h;
                oVar.f323757d = m75Var.f461722d;
                linkedList2.add(oVar);
            }
            Z6(linkedList2);
            int size = ((java.util.ArrayList) this.f234388g).size();
            this.f234390i = size;
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = aVar.f531063e;
            this.f234389h = ((r45.d75) oVar2.f152244b.f152233a).f453737d > size;
            this.f234387f.notifyDataSetChanged();
            int i19 = ((r45.d75) oVar2.f152244b.f152233a).f453737d;
            this.f234385d.mo50293x3498a0(new xt4.a(this));
            this.f234394p = false;
        } else if (m1Var instanceof dp3.m) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((dp3.m) m1Var).f323755e.f152243a.f152217a;
            if (((r45.w55) fVar).f470432d == 2) {
                java.util.List list = this.f234388g;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                this.f234390i = 0;
                this.f234389h = false;
                this.f234386e.b();
            } else {
                java.lang.String str2 = ((r45.w55) fVar).f470433e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.util.Iterator it6 = ((java.util.ArrayList) this.f234388g).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        dp3.o oVar3 = (dp3.o) it6.next();
                        if (str2.equals(oVar3.f323757d)) {
                            ((java.util.ArrayList) this.f234388g).remove(oVar3);
                            this.f234390i = ((java.util.ArrayList) this.f234388g).size();
                            break;
                        }
                    }
                }
            }
            this.f234385d.mo50293x3498a0(new xt4.b(this));
        }
        if (this.f234390i > 0 || ((java.util.ArrayList) this.f234388g).size() != 0) {
            mo74408xb0dfae51(true);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dfu);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo74408xb0dfae51(false);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dfu);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
