package lr4;

/* loaded from: classes11.dex */
public final class k extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f402275e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f402276f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f402277g;

    /* renamed from: h, reason: collision with root package name */
    public lr4.d f402278h;

    /* renamed from: i, reason: collision with root package name */
    public lr4.c f402279i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f402280m;

    /* renamed from: n, reason: collision with root package name */
    public int f402281n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f402282o;

    public k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f402275e = fragment;
        this.f402276f = new java.util.ArrayList();
        this.f402277g = new java.util.HashMap();
        this.f402280m = new java.util.HashSet();
        this.f402281n = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r1 = new org.json.JSONObject(r6).optJSONObject("fromUserInfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        r1 = r1.optString(dm.i4.f66875xa013b0d5, r11.f69047x5568d387);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r1 = r11.f69047x5568d387;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(lr4.k r10, kr4.g r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr4.k.B(lr4.k, kr4.g):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f402276f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        wn.j holder = (wn.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof lr4.e) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            java.lang.Object obj = this.f402276f.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            kr4.g gVar = (kr4.g) obj;
            holder.f374658i = gVar;
            lr4.e eVar = (lr4.e) holder;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = eVar.f402254n;
            c22628xfde5d61d.setImageDrawable(null);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69050x3e123854, "w1wnotificationholder@w1wmsg")) {
                c22628xfde5d61d.m81387x205ac394(i65.a.a(itemView.getContext(), 4.8f));
                c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.raw.f81349xabafab33);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69050x3e123854, "w1wsayhisessionholder@w1wmsg")) {
                c22628xfde5d61d.m81387x205ac394(i65.a.a(itemView.getContext(), 4.8f));
                if (this.f402282o == null) {
                    this.f402282o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f78712x3b941177, c22628xfde5d61d.getLayoutParams().width, c22628xfde5d61d.getLayoutParams().height, itemView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ani), itemView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.anh), 0.65f);
                }
                c22628xfde5d61d.setImageBitmap(this.f402282o);
            } else {
                java.lang.String str = gVar.f69050x3e123854;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
                if (str != null && str.endsWith("@zhugeprivate")) {
                    ng5.a.a(c22628xfde5d61d, gVar.f69050x3e123854);
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.K4(gVar.f69050x3e123854)) {
                    ng5.a.b(c22628xfde5d61d, gVar.f69050x3e123854);
                }
            }
            eVar.f402255o.setText(java.lang.String.valueOf(gVar.f393039p0));
            if (gVar.f393041y0 != null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String str2 = gVar.f69041x51f5672e;
                if (str2 == null || r26.n0.N(str2)) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69039x6b1f5383, "47") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69039x6b1f5383, "1048625")) {
                        charSequence = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charSequence, "getString(...)");
                    } else {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String str3 = gVar.f69038xf66fcca9;
                        ((ke0.e) xVar).getClass();
                        charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3);
                    }
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pcl));
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31)), 0, spannableStringBuilder.length(), 33);
                    android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str4 = gVar.f69041x51f5672e;
                    ((ke0.e) xVar2).getClass();
                    append.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str4));
                    charSequence = spannableStringBuilder;
                }
            } else {
                charSequence = null;
            }
            eVar.f402256p.setText(charSequence);
            jz5.l lVar = gVar.f69049x10a0fed7 == 5 ? new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80663xc7a973a9), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)) : null;
            if (lVar != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = eVar.f402257q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c22699x3dcdb352, arrayList2.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c22699x3dcdb352.setImageResource(((java.lang.Number) lVar.f384366d).intValue());
                c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getResources().getColor(((java.lang.Number) lVar.f384367e).intValue(), c22699x3dcdb352.getContext().getTheme()));
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = eVar.f402257q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c22699x3dcdb3522, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(c22699x3dcdb3522, arrayList4.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c22699x3dcdb3522.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(c22699x3dcdb3522, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/chatting/ConversationHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(c22699x3dcdb3522, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if ((gVar.f69045xa97e89ae <= 0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69048xbed8694c, "w1wnotificationholder@w1wmsg") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69048xbed8694c, "w1wsayhisessionholder@w1wmsg")) ? false : true) {
                itemView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            } else {
                itemView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            }
            android.content.Context context2 = itemView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            eVar.f402258r.setText(java.lang.String.valueOf(gVar.f69049x10a0fed7 == 1 ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pcn) : k35.m1.f(context2, gVar.f69053xa783a79b, true, false)));
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69050x3e123854, "w1wsayhisessionholder@w1wmsg");
            android.widget.TextView textView = eVar.f402259s;
            android.widget.TextView textView2 = eVar.f402260t;
            if (b17) {
                textView2.setVisibility(8);
                textView.setVisibility((gVar.f69052xa35b5abb <= 0 || gVar.f69046x9b4f418d != 0) ? 8 : 0);
                return;
            }
            textView2.setVisibility((gVar.f69052xa35b5abb <= 0 || gVar.f69046x9b4f418d != 0) ? 8 : 0);
            textView2.setText(java.lang.String.valueOf(gVar.f69052xa35b5abb));
            textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(itemView.getContext(), gVar.f69052xa35b5abb));
            textView2.setTextSize(0, i65.a.f(itemView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(itemView.getContext()));
            textView.setVisibility(8);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f402275e.mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eql, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        lr4.e eVar = new lr4.e(inflate);
        android.view.View view = eVar.f3639x46306858;
        view.setOnLongClickListener(new lr4.h(eVar, this, view));
        view.setOnClickListener(new lr4.i(eVar, this, view));
        return eVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        lr4.e eVar;
        int m8183xf806b362;
        kr4.g gVar;
        java.lang.String str;
        java.util.ArrayList arrayList = this.f402276f;
        wn.j holder = (wn.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        if ((holder instanceof lr4.e) && (m8183xf806b362 = (eVar = (lr4.e) holder).m8183xf806b362()) != -1) {
            try {
                gVar = (kr4.g) holder.f374658i;
                if (gVar == null) {
                    java.lang.Object obj = arrayList.get(m8183xf806b362);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    gVar = (kr4.g) obj;
                }
            } catch (java.lang.Throwable unused) {
                java.lang.Object obj2 = arrayList.get(m8183xf806b362);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                gVar = (kr4.g) obj2;
            }
            java.lang.String str2 = gVar.f69048xbed8694c;
            java.util.HashSet hashSet = this.f402280m;
            if (hashSet.contains(str2)) {
                return;
            }
            hashSet.add(str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69050x3e123854, "w1wsayhisessionholder@w1wmsg")) {
                str = eVar.f402259s.getVisibility() == 0 ? "reddot_hello_window:reddot_hello_window" : "hello_window:hello_window";
            } else {
                str = gVar.f69048xbed8694c + ":message_window";
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f402275e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(componentCallbacksC1101xa17d4670, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319) componentCallbacksC1101xa17d4670).K0(vu4.d.f521825e, mr4.a.a(str), "", gVar.f69048xbed8694c);
        }
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f402276f;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convs, "convs");
        pm0.v.X(new lr4.j(this, convs, z17));
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof kr4.g) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar = (kr4.g) obj;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69047x5568d387, ((fr4.g0) i95.n0.c(fr4.g0.class)).Di())) {
                return true;
            }
            pm0.v.X(new lr4.f(w0Var, this, gVar));
        } else {
            if (!(obj instanceof kr4.e)) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wContact");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fr4.g0) i95.n0.c(fr4.g0.class)).Di(), ((kr4.e) obj).f68903xdec927b)) {
                return true;
            }
            pm0.v.X(new lr4.g(this, w0Var));
        }
        return true;
    }
}
