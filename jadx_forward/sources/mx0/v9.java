package mx0;

/* loaded from: classes5.dex */
public final class v9 extends mx0.t9 {

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f413936i;

    @Override // mx0.t9
    public java.lang.String B(int i17) {
        if (i17 == 0) {
            return "kEmptyTemplateId";
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f413891f;
        boolean z17 = false;
        if (i18 >= 0 && i18 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f521553b;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "invalid position: " + i17);
        }
        return null;
    }

    @Override // mx0.t9
    public boolean E(int i17) {
        if (i17 == 0) {
            return false;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f413891f;
        if (i18 >= 0 && i18 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f521564m;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "getTemplateIsAIGC - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public boolean I(int i17) {
        if (i17 == 0) {
            return false;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f413891f;
        if (i18 >= 0 && i18 < arrayList.size()) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f521560i;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "getTemplateIsFavorite - invalid position: " + i17);
        return false;
    }

    @Override // mx0.t9
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g J(int i17) {
        if (i17 == 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.util.ArrayList arrayList = this.f413891f;
        boolean z17 = false;
        if (i18 >= 0 && i18 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            vt3.p pVar = (vt3.p) kz5.n0.a0(arrayList, i18);
            if (pVar != null) {
                return pVar.f521559h;
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingTemplateAdapterWithoutEmptyTemplate", "invalid position: " + i17);
        return null;
    }

    @Override // mx0.t9
    public void L(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        super.L(templateId);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "kEmptyTemplateId")) {
            m8148xed6e4d18(0, mx0.r9.f413827d);
        }
    }

    @Override // mx0.t9
    public void N(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        super.N(templateId);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "kEmptyTemplateId")) {
            m8148xed6e4d18(0, mx0.r9.f413827d);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f413891f.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        vt3.m mVar;
        int i18 = i17 - 1;
        if (i17 == 0) {
            vt3.m mVar2 = vt3.m.f521544e;
            return 1;
        }
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f413891f, i18);
        if (pVar != null && (mVar = pVar.f521552a) != null) {
            return mVar.f521547d;
        }
        vt3.m mVar3 = vt3.m.f521544e;
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        mx0.ba holder = (mx0.ba) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 != 0) {
            x(i17 - 1, holder);
            return;
        }
        holder.f413392d = "kEmptyTemplateId";
        java.lang.String r17 = i65.a.r(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lfx);
        android.widget.TextView textView = holder.f413394f;
        textView.setText(r17);
        textView.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = holder.f413393e;
        c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562582cl3);
        c22628xfde5d61d.setBackgroundColor(0);
        android.view.View view = holder.f413396h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate", "bindEmptyTemplate", "(Lcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate", "bindEmptyTemplate", "(Lcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f413395g.setVisibility(8);
        holder.f3639x46306858.setOnClickListener(new mx0.u9(this));
    }

    @Override // mx0.t9
    public int y(int i17) {
        return i17 - 1;
    }

    @Override // mx0.t9
    public int z(int i17) {
        return i17 + 1;
    }
}
