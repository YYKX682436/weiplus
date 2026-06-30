package uf;

/* loaded from: classes7.dex */
public final class v1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508648d;

    public v1(uf.c2 c2Var) {
        this.f508648d = c2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        uf.c2 c2Var = this.f508648d;
        return uf.c2.a(c2Var) ? c2Var.f508529f.f508518d.size() + c2Var.f508529f.f508517c.size() + 2 : c2Var.f508529f.f508517c.size() + c2Var.f508529f.f508518d.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        uf.c2 c2Var = this.f508648d;
        if (i17 == 0 && uf.c2.a(c2Var)) {
            return 1;
        }
        return (i17 == 0 || (uf.c2.a(c2Var) && i17 == c2Var.f508529f.f508518d.size() + 1)) ? 2 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        if (mo863xcdaf1228 == 1) {
            uf.s1 s1Var = (uf.s1) viewHolder;
            s1Var.f508634e.setVisibility(8);
            boolean a17 = uf.c2.a(this.f508648d);
            android.widget.TextView textView = s1Var.f508633d;
            if (a17) {
                textView.setText("最近连接");
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        if (mo863xcdaf1228 == 2) {
            uf.s1 s1Var2 = (uf.s1) viewHolder;
            s1Var2.f508633d.setText(uf.c2.a(this.f508648d) ? y(com.p314xaae8f345.mm.R.C30867xcad56011.f571872s8) : y(com.p314xaae8f345.mm.R.C30867xcad56011.f571870s6));
            ku5.u0 u0Var = ku5.t0.f394148d;
            uf.u1 u1Var = new uf.u1(s1Var2, this.f508648d, this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u1Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, false);
            return;
        }
        if (mo863xcdaf1228 != 3) {
            return;
        }
        uf.r1 r1Var = (uf.r1) viewHolder;
        int i18 = i17 - 1;
        android.widget.FrameLayout frameLayout = r1Var.f508627e;
        uf.c2 c2Var = this.f508648d;
        frameLayout.setOnClickListener(new uf.t1(c2Var, i18, this, i17));
        gg1.i x17 = x(i18);
        x17.m131529x9616526c();
        x91.h hVar = x17.f353101a;
        x91.c cVar = hVar.f534180a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        java.lang.String friendlyName = cVar.f534172g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(friendlyName, "friendlyName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(friendlyName)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar.f534180a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(null, "modeName");
            throw null;
        }
        r1Var.f508626d.setText(friendlyName);
        boolean z17 = c2Var.f508528e;
        android.widget.TextView textView2 = r1Var.f508630h;
        android.widget.ImageView imageView = r1Var.f508629g;
        android.widget.ProgressBar progressBar = r1Var.f508628f;
        if (!z17) {
            progressBar.setVisibility(8);
            imageView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        boolean z18 = x17.f353104d;
        if (z18 && x17.f353102b && !x17.f353103c) {
            progressBar.setVisibility(0);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (!z18 && x17.f353103c && x17.f353102b) {
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(0);
        } else if (!x17.f353103c && x17.f353102b) {
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            if (x17.f353102b) {
                return;
            }
            progressBar.setVisibility(8);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        uf.c2 c2Var = this.f508648d;
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(c2Var.f508531h).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmj, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new uf.r1(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(c2Var.f508531h).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpm, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new uf.s1(this, inflate2);
    }

    public final gg1.i x(int i17) {
        gg1.i iVar;
        uf.c2 c2Var = this.f508648d;
        if ((!c2Var.f508529f.f508518d.isEmpty()) && i17 <= c2Var.f508529f.f508518d.size()) {
            java.lang.Object obj = c2Var.f508529f.f508518d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            return (gg1.i) obj;
        }
        if (!c2Var.f508529f.f508518d.isEmpty()) {
            iVar = (gg1.i) c2Var.f508529f.f508517c.get((i17 - r0.f508518d.size()) - 1);
        } else {
            iVar = (gg1.i) c2Var.f508529f.f508517c.get(i17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        return iVar;
    }

    public final java.lang.String y(int i17) {
        android.content.Context context = this.f508648d.f508531h;
        if (context == null) {
            return "";
        }
        java.lang.String string = context.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
