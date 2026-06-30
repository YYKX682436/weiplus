package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1 {

    /* renamed from: g, reason: collision with root package name */
    public int f223156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 f223157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var, android.content.Context context, android.database.Cursor cursor, int i17) {
        super(context, cursor);
        this.f223157h = t0Var;
        this.f223156g = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var = this.f223157h;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.s0(t0Var, android.view.LayoutInflater.from(t0Var.f223172b2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgh, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m1
    public void y(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.database.Cursor cursor) {
        int i17;
        android.text.SpannableString spannableString;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.s0 s0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.s0) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
        e1Var.mo9015xbf5d97fd(cursor);
        int position = cursor.getPosition();
        int i19 = position + 1;
        char c17 = i19 == mo1894x7e414b06() ? (char) 3 : i19 == this.f223156g ? (char) 2 : (char) 1;
        s0Var.getClass();
        e1Var.t0();
        java.util.HashMap hashMap = e1Var.f221815g2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z0 z0Var = e1Var.K2;
        s0Var.f223158d.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1(e1Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0) hashMap.get(z0Var.f222076a), 4));
        java.lang.String str = z0Var.f222079d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var = s0Var.f223170s;
        kk.j jVar = t0Var.f223175e2;
        boolean k17 = ((lt0.f) jVar).k(str);
        android.widget.ImageView imageView = s0Var.f223159e;
        if (k17) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                t0Var.g1(imageView, str, 0.083333336f);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            t0Var.g1(imageView, str, 0.083333336f);
        }
        imageView.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1(e1Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0) hashMap.get(z0Var.f222081f), 2));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str2 = z0Var.f222080e;
        android.widget.TextView textView = s0Var.f223160f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.content.Context context = t0Var.f223172b2;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize));
        textView.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1(e1Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0) hashMap.get(z0Var.f222081f), 1));
        int i27 = e1Var.f68459xcfbd642e;
        android.widget.TextView textView2 = s0Var.f223161g;
        if (i27 > 1) {
            textView2.setVisibility(0);
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fo8, java.lang.Integer.valueOf(e1Var.f68459xcfbd642e)));
        } else {
            textView2.setVisibility(8);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f222091p);
        android.widget.ImageView imageView2 = s0Var.f223163i;
        if (K0) {
            i17 = 8;
            imageView2.setVisibility(8);
        } else {
            java.lang.String str3 = z0Var.f222091p;
            kk.j jVar2 = t0Var.f223175e2;
            if (((lt0.f) jVar2).k(str3)) {
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) jVar2).get(str3);
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    t0Var.g1(imageView2, str3, 0.0f);
                } else {
                    imageView2.setImageBitmap(bitmap2);
                }
            } else {
                t0Var.g1(imageView2, str3, 0.0f);
            }
            imageView2.setVisibility(0);
            i17 = 8;
        }
        if (imageView2.getVisibility() == i17) {
            boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f222092q);
            android.widget.TextView textView3 = s0Var.f223162h;
            if (K02) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str4 = z0Var.f222092q;
                float textSize2 = textView3.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str4, textSize2));
            }
        }
        java.lang.String str5 = z0Var.f222089n;
        int indexOf = str5.indexOf("<em class=\"prefix\">");
        int indexOf2 = str5.indexOf("</em>") - 19;
        if (indexOf < indexOf2) {
            spannableString = new android.text.SpannableString(str5.replaceAll("<em class=\"prefix\">", "").replaceAll("</em>", ""));
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)), indexOf, indexOf2, 33);
        } else {
            spannableString = new android.text.SpannableString(str5);
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView4 = s0Var.f223164m;
        float textSize3 = textView4.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, spannableString, textSize3));
        s0Var.f223165n.setText(r53.e.a(context, e1Var.f68454xac3be4e * 1000));
        z0Var.f222093r = "";
        boolean K03 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("");
        android.widget.TextView textView5 = s0Var.f223166o;
        if (K03) {
            i18 = 8;
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            textView5.setText(z0Var.f222093r);
            i18 = 8;
        }
        if (c17 == 1) {
            android.view.View view = s0Var.f223167p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = s0Var.f223168q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = s0Var.f223169r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (c17 == 2) {
            android.view.View view4 = s0Var.f223167p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = s0Var.f223168q;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = s0Var.f223169r;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (c17 == 3) {
            android.view.View view7 = s0Var.f223167p;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList7.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = s0Var.f223168q;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = s0Var.f223169r;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var2 = this.f223157h;
        if (((java.util.HashSet) t0Var2.f223178h2).contains(java.lang.Integer.valueOf(position))) {
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("tab", "1");
        hashMap2.put("isnew", position >= this.f223156g ? "2" : "1");
        hashMap2.put("fold", java.lang.String.valueOf(e1Var.f68459xcfbd642e));
        hashMap2.put("ext_data", e1Var.U2);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(t0Var2.getContext(), 13, 1300, i19, 1, 0, e1Var.f68449x28d45f97, t0Var2.f223173c2, e1Var.S2, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap2));
        ((java.util.HashSet) t0Var2.f223178h2).add(java.lang.Integer.valueOf(position));
    }
}
