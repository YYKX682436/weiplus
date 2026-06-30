package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class p1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 f239989d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1 x1Var) {
        this.f239989d = x1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        vx3.i iVar = (vx3.i) obj;
        long j17 = iVar.f522831o;
        if (j17 > 0) {
            qx3.d.c(j17, iVar);
        }
        cy3.d dVar = this.f239989d.f240074d;
        if (dVar != null) {
            boolean z17 = iVar.f522830n;
            android.widget.TextView textView = dVar.f306293b;
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = dVar.f306294c;
            android.content.Context context = dVar.f306298g;
            if (z17) {
                if (textView != null) {
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3f));
                }
                if (textView != null) {
                    textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
                }
                if (c16077xb54fe366 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a38);
                    android.graphics.drawable.Drawable mutate = i65.a.i(context, com.p314xaae8f345.mm.R.raw.f79723x416541f0).mutate();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "mutate(...)");
                    mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d17), android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                    mutate.setAlpha(android.graphics.Color.alpha(d17));
                    c16077xb54fe366.setImageDrawable(mutate);
                }
            } else {
                vx3.i iVar2 = dVar.f306299h;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar2 != null ? iVar2.e() : null, iVar.e())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonRingtoneLayout", "hashCode is same:" + iVar.e() + ", skip bind!");
                    return;
                }
                if (textView != null) {
                    textView.setText(iVar.f522825i);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.C17242xd917d577 c17242xd917d577 = dVar.f306297f;
                if (c17242xd917d577 != null) {
                    ((dd0.i0) ((ed0.p0) i95.n0.c(ed0.p0.class))).wi(c17242xd917d577, iVar);
                }
                int b17 = i65.a.b(context, iVar.j() ? 202 : 80);
                int b18 = i65.a.b(context, iVar.j() ? 266 : 80);
                android.widget.ImageView imageView = dVar.f306295d;
                if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                    layoutParams2.width = b17;
                    layoutParams2.height = b18;
                    imageView.setLayoutParams(layoutParams2);
                }
                int i17 = iVar.j() ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df : com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7;
                if (c16077xb54fe366 != null && (layoutParams = c16077xb54fe366.getLayoutParams()) != null) {
                    layoutParams.width = i65.a.h(context, i17);
                    layoutParams.height = i65.a.h(context, i17);
                    c16077xb54fe366.setLayoutParams(layoutParams);
                }
                if (c16077xb54fe366 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    int d18 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                    android.graphics.drawable.Drawable mutate2 = i65.a.i(context, com.p314xaae8f345.mm.R.raw.f80264x8f433126).mutate();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate2, "mutate(...)");
                    mutate2.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d18), android.graphics.Color.red(d18), android.graphics.Color.green(d18), android.graphics.Color.blue(d18)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                    mutate2.setAlpha(android.graphics.Color.alpha(d18));
                    c16077xb54fe366.setImageDrawable(mutate2);
                }
                if (iVar.f522827k.length() > 0) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.k(iVar.f522827k, imageView, iVar.e());
                } else if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.axm);
                }
                dVar.f306292a.setOnClickListener(new cy3.c(dVar, iVar));
            }
            boolean b19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.g(), "voip_default_sound");
            android.view.View view = dVar.f306302k;
            if (b19) {
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            dVar.f306299h = iVar;
        }
    }
}
