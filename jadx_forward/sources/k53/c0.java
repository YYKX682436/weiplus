package k53;

/* loaded from: classes8.dex */
public class c0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f385879d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385880e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3) {
        this.f385880e = activityC15919x390706d3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f385879d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        k53.b0 b0Var = (k53.b0) k3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onBindViewHolder scroll position:%d", java.lang.Integer.valueOf(i17));
        p33.l lVar = (p33.l) this.f385879d.get(i17);
        b0Var.f385870d.setTag(lVar);
        if (lVar != null) {
            if (lVar.f433135d) {
                r53.f.l().m77784x795fa299(new k53.v(this, lVar, b0Var));
                return;
            }
            o11.f fVar = new o11.f();
            fVar.f423616g = i53.h4.f370126a;
            fVar.f423611b = true;
            o11.g a17 = fVar.a();
            n11.a.b().i(lVar.f433139h, b0Var.f385872f, a17, new k53.x(this, b0Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new k53.b0(this, android.view.LayoutInflater.from(this.f385880e.f221647d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570693bi3, viewGroup, false));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p33.l lVar;
        k53.b0 b0Var = (k53.b0) k3Var;
        super.mo8160xd8bfd53(b0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewAttachedToWindow");
        if (b0Var == null || (lVar = (p33.l) b0Var.f385870d.getTag()) == null) {
            return;
        }
        b0Var.f385874h.setVisibility(0);
        java.lang.String str = lVar.f433140i;
        int i17 = (int) (lVar.f433145q / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce c15920x9de661ce = b0Var.f385871e;
        c15920x9de661ce.h(false, str, i17);
        lVar.f433150v = c15920x9de661ce.m64623xb7957b7a();
        c15920x9de661ce.m64633x5875b76a(new k53.z(this, b0Var));
        c15920x9de661ce.mo48238x68ac462();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        k53.b0 b0Var = (k53.b0) k3Var;
        super.mo8161x38c82990(b0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewDetachedFromWindow");
        if (b0Var != null) {
            b0Var.f385871e.mo48239x360802();
            b0Var.f385872f.post(new k53.a0(this, b0Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        k53.b0 b0Var = (k53.b0) k3Var;
        super.mo8162x34789575(b0Var);
        if (b0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "onViewRecycled");
            b0Var.f385871e.mo48239x360802();
        }
    }

    public p33.l x(int i17) {
        if (i17 >= mo1894x7e414b06() || i17 < 0) {
            return null;
        }
        return (p33.l) this.f385879d.get(i17);
    }
}
