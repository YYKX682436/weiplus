package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class sq extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.um {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.um
    public void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        android.text.SpannableString spannableString;
        f21.a m07;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        java.lang.String x17 = dVar.x();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vm vmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vm) g0Var;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("conv_talker_username", x17);
        if (dVar.f542250l instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI) {
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 10);
        } else if (dVar.D()) {
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        } else {
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putLong("msg_id", f9Var.m124847x74d37ac6());
        bundle.putLong("msg_sever_id", f9Var.I0());
        bundle.putString("send_msg_username", f9Var.Q0());
        k01.v0 v0Var = (k01.v0) i95.n0.c(k01.v0.class);
        java.lang.String j17 = f9Var.j();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar.g());
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(vmVar.f287411b);
        oh1.o1 o1Var = (oh1.o1) v0Var;
        o1Var.getClass();
        tt0.d a17 = tt0.d.a(j17);
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaSubscribeMsgService", "context is null");
        } else {
            java.lang.String str2 = a17.f503329a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.String string = bundle.getString("conv_talker_username");
                int i17 = bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                long j18 = bundle.getLong("msg_sever_id");
                java.lang.String string2 = bundle.getString("send_msg_username");
                long j19 = a17.f503339k;
                android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
                spannableString2.setSpan(new oh1.m1(o1Var, 1, null, a17, string, j19, i17, j18, string2), str2.indexOf(a17.f503331c), str2.indexOf(a17.f503331c) + a17.f503331c.length(), 17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeMsgService", "wxaSubscribeSysContent.forbids:%d", java.lang.Integer.valueOf(a17.f503337i));
                if (a17.f503337i == 1) {
                    spannableString = spannableString2;
                } else {
                    k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(a17.f503333e);
                    java.lang.String str3 = Bi != null ? Bi.f68910xea1bd3d4 : "";
                    l01.b bVar = l01.d0.f396294a;
                    android.graphics.Bitmap f17 = bVar.f(str3, null);
                    if (f17 == null) {
                        bVar.m(new oh1.n1(o1Var, weakReference2, weakReference, spannableString2), str3, null);
                        spannableString = android.text.TextUtils.concat(o1Var.wi(context, a17.f503338j, null), spannableString2);
                    } else {
                        spannableString = android.text.TextUtils.concat(o1Var.wi(context, a17.f503338j, f17), spannableString2);
                    }
                }
                if (spannableString != null || spannableString.length() == 0) {
                    android.view.View view = vmVar.f287412c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = vmVar.f287412c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (spannableString instanceof android.text.SpannableString) {
                        c(spannableString);
                    }
                    vmVar.f287411b.b(spannableString);
                }
                m07 = f21.r0.wi().m0(x17);
                int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
                vmVar.f287411b.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).n0());
                if ((m07 != null || m07.f340366b == -2) && (m07 != null || intValue == -2)) {
                    vmVar.f287411b.m84183x1c5c5ff4(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
                } else {
                    vmVar.f287411b.m84183x1c5c5ff4(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
                }
                vmVar.f287411b.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rq(this));
                vmVar.f287411b.invalidate();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaSubscribeMsgService", "content is null, return");
        }
        spannableString = null;
        if (spannableString != null) {
        }
        android.view.View view3 = vmVar.f287412c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemWxaSubscribeSysImpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m07 = f21.r0.wi().m0(x17);
        int intValue2 = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        vmVar.f287411b.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).n0());
        if (m07 != null) {
        }
        vmVar.f287411b.m84183x1c5c5ff4(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        vmVar.f287411b.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rq(this));
        vmVar.f287411b.invalidate();
    }
}
