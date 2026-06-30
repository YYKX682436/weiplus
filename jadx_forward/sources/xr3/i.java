package xr3;

/* loaded from: classes11.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f537761d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.q f537762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f537763f;

    public i(java.util.List menuList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuList, "menuList");
        this.f537761d = menuList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f537761d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((r45.mm) this.f537761d.get(i17)).f462169e == 0 ? 2 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        int i18;
        int i19;
        java.lang.CharSequence i27;
        bw5.x7 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof xr3.c;
        java.util.List list = this.f537761d;
        if (!z17) {
            if (!(holder instanceof xr3.b)) {
                if (holder instanceof xr3.a) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(holder.f3639x46306858);
                    holder.f3639x46306858.setOnClickListener(new xr3.h(this));
                    return;
                }
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            xr3.b bVar = (xr3.b) holder;
            android.widget.TextView textView = bVar.f537745e;
            android.content.Context context = textView.getContext();
            java.lang.String str = ((r45.mm) list.get(i17)).f462170f;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i28 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
            android.view.View view = bVar.f537744d;
            i18 = i17 != 0 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(i28);
            xr3.e eVar = new xr3.e(this, i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.ViewOnClickListenerC22697x158cd364 viewOnClickListenerC22697x158cd364 = bVar.f537746f;
            viewOnClickListenerC22697x158cd364.m82026x7b481f89(eVar);
            viewOnClickListenerC22697x158cd364.g(((r45.mm) list.get(i17)).f462173i, new xr3.g(this, holder, i17));
            return;
        }
        xr3.c cVar = (xr3.c) holder;
        android.widget.TextView textView2 = cVar.f537748e;
        android.content.Context context2 = textView2.getContext();
        r45.mm mmVar = (r45.mm) list.get(i17);
        switch (mmVar.f462176o) {
            case 1:
                i19 = com.p314xaae8f345.mm.R.raw.f78635x6960e003;
                break;
            case 2:
                i19 = com.p314xaae8f345.mm.R.raw.f78638xdc982204;
                break;
            case 3:
                i19 = com.p314xaae8f345.mm.R.raw.f78650x47839927;
                break;
            case 4:
                i19 = com.p314xaae8f345.mm.R.raw.f78622xd0faa114;
                break;
            case 5:
                i19 = com.p314xaae8f345.mm.R.raw.f78649x76f2c386;
                break;
            case 6:
            case 7:
                i19 = com.p314xaae8f345.mm.R.raw.f79015x9eb0e8f2;
                break;
            case 8:
            default:
                i19 = 0;
                break;
            case 9:
                i19 = com.p314xaae8f345.mm.R.raw.f78366xb6e79581;
                break;
        }
        if (i19 != 0) {
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context2, i19, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            e17.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(context2, 12), com.p314xaae8f345.mm.ui.zk.a(context2, 12));
            al5.w wVar = new al5.w(e17, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("@");
            spannableString.setSpan(wVar, 0, 1, 33);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = mmVar.f462170f;
            ((ke0.e) xVar2).getClass();
            sb6.append(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str2).toString());
            sb6.append(' ');
            i27 = android.text.TextUtils.concat(sb6.toString(), spannableString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i27);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileMenuAdapter", "get empty res id, username: %s, icon show type: %d", mmVar.f462170f, java.lang.Integer.valueOf(mmVar.f462176o));
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = mmVar.f462170f;
            ((ke0.e) xVar3).getClass();
            i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str3);
        }
        android.view.View view2 = cVar.f537747d;
        i18 = i17 != 0 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setText(i27);
        holder.f3639x46306858.setOnClickListener(new xr3.d(this, i17));
        if (this.f537763f) {
            return;
        }
        int i29 = mmVar.f462169e;
        if (i29 != 5) {
            if (i29 != 7) {
                return;
            }
            bw5.nf0 nf0Var = mmVar.f462177p;
            if (((nf0Var == null || (b17 = nf0Var.b()) == null) ? null : b17.f()) == null) {
                return;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.W);
        this.f537763f = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570218a22, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new xr3.c(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570215a16, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new xr3.a(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570217a21, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        return new xr3.b(inflate3);
    }
}
