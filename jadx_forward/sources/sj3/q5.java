package sj3;

/* loaded from: classes8.dex */
public final class q5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f490250d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f490251e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f490252f;

    /* renamed from: g, reason: collision with root package name */
    public final int f490253g;

    public q5(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f490250d = context;
        this.f490251e = new java.util.ArrayList();
        this.f490253g = 1;
    }

    public final void B(java.util.ArrayList userNameList, android.view.View.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
        java.util.ArrayList arrayList = this.f490251e;
        arrayList.clear();
        arrayList.add(c01.z1.r());
        int size = userNameList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = userNameList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            if (!x((java.lang.String) obj) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userNameList.get(i17), c01.z1.r())) {
                arrayList.add(userNameList.get(i17));
            }
        }
        this.f490252f = onClickListener;
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f490251e.size() + this.f490253g;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == 0 ? 2 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int z17;
        sj3.r5 holder = (sj3.r5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z18 = i17 == 0 ? 2 : true;
        java.util.ArrayList arrayList = this.f490251e;
        android.widget.ImageView imageView = holder.f490263d;
        if (!z18) {
            if ((i17 == 0 ? (char) 2 : (char) 1) != 2 || arrayList.size() < 5) {
                return;
            }
            int i18 = sj3.i1.f490101m;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i18 / 2, i18);
            layoutParams.topMargin = sj3.i1.f490095g;
            layoutParams.setMarginStart(0);
            holder.f3639x46306858.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            android.view.View view = holder.f490264e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i19 = i17 - 1;
        java.lang.Object obj = arrayList.get(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        android.view.View view2 = holder.f490264e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = sj3.i1.f490101m;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i27, i27);
        layoutParams2.addRule(1);
        layoutParams2.topMargin = sj3.i1.f490095g;
        if (i19 != 0) {
            z17 = sj3.i1.f490094f;
        } else {
            z17 = z() >= 0 ? z() : 0;
        }
        layoutParams2.setMarginStart(z17);
        holder.f3639x46306858.setLayoutParams(layoutParams2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.nwv, c01.a2.e(str));
        imageView.setOnClickListener(this.f490252f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f490250d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571007co1, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new sj3.r5(inflate);
    }

    public final boolean x(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = this.f490251e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, str)) {
                break;
            }
        }
        return obj != null;
    }

    public final java.lang.StringBuffer y() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.h27));
        java.util.Iterator it = this.f490251e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.e(str) : null);
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        return stringBuffer;
    }

    public final int z() {
        int i17 = com.p314xaae8f345.mm.ui.bk.h(this.f490250d).x;
        int i18 = sj3.i1.f490101m;
        return ((i17 - ((this.f490251e.size() * i18) + (sj3.i1.f490094f * (r2.size() - 1)))) / 2) - i18;
    }
}
