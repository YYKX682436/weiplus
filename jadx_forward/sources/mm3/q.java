package mm3;

/* loaded from: classes10.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f411204d;

    public q(mm3.w wVar) {
        this.f411204d = wVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f411204d.f411211o.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        mm3.o holder = (mm3.o) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        mm3.w wVar = this.f411204d;
        fm3.b bVar = i17 == 0 ? null : (fm3.b) wVar.f411211o.get(i17 - 1);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar != null ? bVar.f345561a : null, wVar.f411214r)) {
            android.view.View view = holder.f411199e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f411199e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = holder.f411198d;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = holder.f411200f;
        if (bVar != null) {
            c16077xb54fe366.m64938x75cc54fa(bVar.f345563c);
            c16077xb54fe366.m64933xc84dc82d();
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            org.json.JSONObject jSONObject = bVar.f345562b;
            java.lang.String optString = jSONObject.optString(f17);
            textView.setText((optString == null && (optString = jSONObject.optString("en")) == null) ? "" : optString);
        } else {
            c16077xb54fe366.setImageDrawable(c16077xb54fe366.getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f571232wu));
            textView.setText("");
        }
        holder.f3639x46306858.setOnClickListener(new mm3.p(wVar, bVar, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4v, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new mm3.o(inflate);
    }
}
