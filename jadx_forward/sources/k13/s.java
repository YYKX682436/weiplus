package k13;

/* loaded from: classes8.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384796d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6) {
        this.f384796d = activityC15562xa7b84ac6;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f384796d.f218873i.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object obj = this.f384796d.f218873i.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String field_UserName = ((i13.j) obj).f66503x11b86abb;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_UserName, "field_UserName");
        return r26.i0.n(field_UserName, "@app", false) ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.widget.TextView textView;
        k13.x holder = (k13.x) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384796d;
        java.lang.Object obj = activityC15562xa7b84ac6.f218873i.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        i13.j jVar = (i13.j) obj;
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        holder.f384814h = jVar.f66503x11b86abb;
        holder.f384815i = jVar.f66499xaeadb4bb;
        android.view.ViewPropertyAnimator animate = holder.f384813g.animate();
        if (animate != null) {
            animate.cancel();
        }
        boolean z17 = jVar.f66500xda05eaf7 == 1;
        android.widget.LinearLayout linearLayout = holder.f384812f;
        android.widget.TextView textView2 = holder.f384810d;
        if (z17) {
            textView2.setVisibility(0);
            linearLayout.setVisibility(8);
            textView2.setText(activityC15562xa7b84ac6.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fey, new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(jVar.f66497xc9a553ad))));
        } else {
            textView2.setVisibility(8);
            linearLayout.setVisibility(0);
        }
        if (mo863xcdaf1228 != 1 || (textView = holder.f384811e) == null) {
            return;
        }
        textView.setText(jVar.f66498x89ebb00a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384796d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activityC15562xa7b84ac6.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbc, (android.view.ViewGroup) null);
        if (i17 == 0) {
            ((android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.kdo)).inflate();
        } else {
            ((android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.jkp)).inflate();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new k13.x(activityC15562xa7b84ac6, inflate);
    }
}
