package tr2;

/* loaded from: classes8.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f502946d;

    /* renamed from: e, reason: collision with root package name */
    public int f502947e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f502948f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f502949g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f502950h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f502951i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f502952m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f502953n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Long f502954o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f502955p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f502956q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f502957r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f502958s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f502958s = jz5.h.a(jz5.i.f384364f, new tr2.m(this));
    }

    public final void O6(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (interfaceC4987x84e327cb == null) {
            android.widget.ImageView imageView = this.f502950h;
            if (imageView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(imageView, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f502956q;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80474xda75ff01);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f502956q;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            }
            android.widget.TextView textView = this.f502955p;
            if (textView != null) {
                textView.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            }
            android.widget.TextView textView2 = this.f502955p;
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.om7);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = this.f502950h;
        if (imageView2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(imageView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(imageView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(imageView2, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView3 = this.f502950h;
        if (imageView3 != null) {
            ox2.r0.a(imageView3, interfaceC4987x84e327cb, true, "Finder.PostInteractionEasterEggUIC onEmojiChanged loadCover");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f502956q;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f80472x2458cd5d);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f502956q;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        }
        android.widget.TextView textView3 = this.f502955p;
        if (textView3 != null) {
            textView3.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        }
        android.widget.TextView textView4 = this.f502955p;
        if (textView4 != null) {
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.om8);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class);
        if (c14609xb4d6eef6.X == sr2.z2.f493358f) {
            c14609xb4d6eef6.M7(null, sr2.z2.f493356d);
        }
    }

    public final void P6() {
        this.f502947e = 2;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f502953n;
        this.f502946d = interfaceC4987x84e327cb;
        O6(interfaceC4987x84e327cb);
        android.view.ViewGroup viewGroup = this.f502952m;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewGroup, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "useLastEmoji", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "useLastEmoji", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(viewGroup, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ee  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr2.v.mo450x3e5a77bb(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if ((r7.getVisibility() == 0) == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo739xfd763ae1(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr2.v.mo739xfd763ae1(android.os.Bundle):void");
    }
}
