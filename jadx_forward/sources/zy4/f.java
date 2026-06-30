package zy4;

/* loaded from: classes15.dex */
public class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f559211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 f559212e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824) {
        this.f559212e = activityC19511xc9358824;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f559211d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        zy4.g gVar = (zy4.g) k3Var;
        gVar.f559213d.setTag(this.f559211d.get(i17));
        n11.a.b().h((java.lang.String) this.f559211d.get(i17), gVar.f559213d, sy4.m.f495417c.f495419b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824 = this.f559212e;
        android.view.View inflate = activityC19511xc9358824.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_8, viewGroup, false);
        zy4.g gVar = new zy4.g(activityC19511xc9358824, inflate);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ha_);
        gVar.f559213d = imageView;
        imageView.setOnClickListener(activityC19511xc9358824.f269631w);
        return gVar;
    }
}
