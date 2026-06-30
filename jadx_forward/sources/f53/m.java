package f53;

/* loaded from: classes15.dex */
public class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f341207d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f341208e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f341209f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 f341210g;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864) {
        this.f341210g = c15901xbfc4864;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f341207d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        f53.l lVar = (f53.l) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864 = this.f341210g;
        boolean z17 = c15901xbfc4864.f221516p2 == i17;
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f341208e;
        o33.f fVar = (o33.f) linkedList.get(i17);
        android.widget.ImageView imageView = lVar.f341200e;
        imageView.setVisibility(8);
        if (fVar != null) {
            boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
            f53.m mVar = lVar.f341204i;
            android.widget.ImageView imageView2 = lVar.f341199d;
            if (n17) {
                java.lang.String str = fVar.f424272f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc48642 = mVar.f341210g;
                if (((lt0.f) c15901xbfc48642.f221510j2).k(str)) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) c15901xbfc48642.f221510j2).get(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        r53.v vVar = new r53.v();
                        vVar.f474236a = false;
                        vVar.f474242g = 0.083333336f;
                        r53.y.a().e(imageView2, str, vVar.a(), new f53.k(mVar, str));
                    } else {
                        imageView2.setImageBitmap(bitmap);
                    }
                } else {
                    r53.v vVar2 = new r53.v();
                    vVar2.f474236a = false;
                    vVar2.f474242g = 0.083333336f;
                    r53.y.a().e(imageView2, str, vVar2.a(), new f53.k(mVar, str));
                }
            } else {
                o11.f fVar2 = new o11.f();
                fVar2.f423629t = true;
                n11.a.b().h(fVar.f424272f, imageView2, fVar2.a());
            }
            lVar.f341201f.setText(fVar.f424271e);
            lVar.f341202g.setText(fVar.f424273g);
            if (mVar.f341210g.f221514n2.contains(fVar.f424270d)) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79427x18943f5b);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79426x1a89d3a);
        }
        if (z17) {
            android.view.View view = lVar.f341203h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = lVar.f341203h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o33.f fVar3 = (o33.f) linkedList.get(i17);
        if (fVar3 != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f341209f;
            if (arrayList3.contains(fVar3.f424270d)) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330, fVar3.f424270d);
            hashMap.put("is_search", c15901xbfc4864.f221517q2 ? "1" : "0");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(c15901xbfc4864.f221507g2, 101, 1, i17 + 1, 1, 0, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
            arrayList3.add(fVar3.f424270d);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new f53.l(this, android.view.LayoutInflater.from(this.f341210g.f221507g2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdw, (android.view.ViewGroup) null));
    }
}
