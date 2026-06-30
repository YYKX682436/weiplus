package gg1;

/* loaded from: classes7.dex */
public final class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353149d;

    public p(gg1.w wVar) {
        this.f353149d = wVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        gg1.w wVar = this.f353149d;
        return gg1.w.a(wVar) ? wVar.f353168e.f353125e.size() + wVar.f353168e.f353124d.size() + 2 : wVar.f353168e.f353124d.size() + wVar.f353168e.f353125e.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        gg1.w wVar = this.f353149d;
        if (i17 == 0 && gg1.w.a(wVar)) {
            return 1;
        }
        return (i17 == 0 || (gg1.w.a(wVar) && i17 == wVar.f353168e.f353125e.size() + 1)) ? 2 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        gg1.w wVar = this.f353149d;
        if (mo863xcdaf1228 == 1) {
            gg1.l lVar = (gg1.l) viewHolder;
            lVar.f353132e.setVisibility(8);
            boolean a17 = gg1.w.a(wVar);
            android.widget.TextView textView = lVar.f353131d;
            if (a17) {
                textView.setText("最近连接");
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        if (mo863xcdaf1228 == 2) {
            gg1.l lVar2 = (gg1.l) viewHolder;
            lVar2.f353131d.setText(gg1.w.a(wVar) ? y(com.p314xaae8f345.mm.R.C30867xcad56011.f571872s8) : y(com.p314xaae8f345.mm.R.C30867xcad56011.f571870s6));
            new java.util.Timer("progressBarHolder", false).schedule(new gg1.n(lVar2, wVar, this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            return;
        }
        if (mo863xcdaf1228 != 3) {
            return;
        }
        gg1.k kVar = (gg1.k) viewHolder;
        int i18 = i17 - 1;
        kVar.f353114e.setOnClickListener(new gg1.m(wVar, i18, this, i17));
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
        kVar.f353113d.setText(friendlyName);
        boolean z17 = wVar.f353169f;
        android.widget.TextView textView2 = kVar.f353117h;
        android.widget.ImageView imageView = kVar.f353116g;
        android.widget.ProgressBar progressBar = kVar.f353115f;
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
        } else if (!x17.f353103c && x17.f353102b && !z18) {
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
        gg1.w wVar = this.f353149d;
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(wVar.f353171h).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmj, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new gg1.k(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(wVar.f353171h).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpm, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new gg1.l(this, inflate2);
    }

    public final gg1.i x(int i17) {
        gg1.i iVar;
        gg1.w wVar = this.f353149d;
        if ((!wVar.f353168e.f353125e.isEmpty()) && i17 <= wVar.f353168e.f353125e.size()) {
            java.lang.Object obj = wVar.f353168e.f353125e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            return (gg1.i) obj;
        }
        if (!wVar.f353168e.f353125e.isEmpty()) {
            iVar = (gg1.i) wVar.f353168e.f353124d.get((i17 - r0.f353125e.size()) - 1);
        } else {
            iVar = (gg1.i) wVar.f353168e.f353124d.get(i17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        return iVar;
    }

    public final java.lang.String y(int i17) {
        android.content.Context context = this.f353149d.f353171h;
        if (context == null) {
            return "";
        }
        java.lang.String string = context.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
