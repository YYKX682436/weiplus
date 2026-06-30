package ku3;

/* loaded from: classes10.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f393984d;

    public x(ku3.i0 i0Var) {
        this.f393984d = i0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f393984d.f393784d.f557112g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        zt3.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        ku3.i0 i0Var = this.f393984d;
        java.lang.Integer num = (java.lang.Integer) i0Var.f393784d.f557111f.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            int intValue = num.intValue();
            p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) i0Var.f393784d.f557112g.get(java.lang.Integer.valueOf(intValue));
            if (j0Var == null || (cVar = (zt3.c) j0Var.mo3195x754a37bb()) == null) {
                cVar = new zt3.c(intValue, false, null, false, false, 30, null);
            }
            zt3.c cVar2 = cVar;
            x(cVar2, frameLayout);
            frameLayout.setOnClickListener(new ku3.v(this.f393984d, i17, intValue, cVar2, this, frameLayout));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new ku3.w(com.p314xaae8f345.mm.ui.id.b(this.f393984d.f393788h).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569794of, parent, false));
    }

    public final void x(zt3.c cVar, android.widget.FrameLayout frameLayout) {
        int i17;
        switch (cVar.f557120a) {
            case 1:
                i17 = com.p314xaae8f345.mm.R.raw.f79982x604fd87b;
                break;
            case 2:
                i17 = com.p314xaae8f345.mm.R.raw.f79983x606c077d;
                break;
            case 3:
                i17 = com.p314xaae8f345.mm.R.raw.f79984xdc122216;
                break;
            case 4:
                i17 = com.p314xaae8f345.mm.R.raw.f79981xcf59cb9b;
                break;
            case 5:
                i17 = com.p314xaae8f345.mm.R.raw.f79979x9f7094b3;
                break;
            case 6:
                i17 = com.p314xaae8f345.mm.R.raw.f79977x985fd9b7;
                break;
            case 7:
                android.os.Bundle bundle = cVar.f557122c;
                int i18 = bundle != null ? bundle.getInt("PARAM_1_INT") : 3;
                if (i18 == 2) {
                    i17 = com.p314xaae8f345.mm.R.raw.f79987x7745b999;
                    break;
                } else if (i18 == 3) {
                    i17 = com.p314xaae8f345.mm.R.raw.f79985x716f880e;
                    break;
                } else {
                    i17 = com.p314xaae8f345.mm.R.raw.f79986x7745ae54;
                    break;
                }
            case 8:
                i17 = com.p314xaae8f345.mm.R.raw.f79980xa1ccee32;
                break;
            case 9:
                i17 = com.p314xaae8f345.mm.R.raw.f79978xb34bbf16;
                break;
            default:
                i17 = -1;
                break;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.jgr);
        boolean z17 = cVar.f557121b;
        int i19 = z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562620kd : com.p314xaae8f345.mm.R.C30861xcebc809e.f562621ke;
        int i27 = cVar.f557123d ? z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560305gs : com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt : com.p314xaae8f345.mm.R.C30859x5a72f63.f560304gr;
        frameLayout.setBackground(i65.a.i(this.f393984d.f393788h, i19));
        c22699x3dcdb352.s(i17, i27);
    }
}
