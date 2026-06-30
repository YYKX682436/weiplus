package rz1;

/* loaded from: classes2.dex */
public class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.ScrollSampleUI f483328d;

    public y(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI, rz1.p pVar) {
        this.f483328d = scrollSampleUI;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) com.tencent.mm.plugin.datareport.sample.ScrollSampleUI.g).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.widget.TextView textView;
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) com.tencent.mm.plugin.datareport.sample.ScrollSampleUI.g).get(i17);
        if (str == null || (textView = (android.widget.TextView) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lq6)) == null) {
            return;
        }
        textView.setText(str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(textView);
        if (i17 % 10 == 0) {
            k3Var.f3639x46306858.setOnLongClickListener(new rz1.w(this));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "view_id_" + i17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(textView, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ok(textView, 100L);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).nk(textView, 0.30000001192092896d);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 40, 24184);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new rz1.x(this, android.view.LayoutInflater.from(this.f483328d.getBaseContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgl, viewGroup, false));
    }
}
