package on2;

/* loaded from: classes3.dex */
public final class j1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f428478d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f428479e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f428480f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f428481g;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f428478d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.atw, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new on2.z0(this, inflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(on2.z0 r17, int r18) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.j1.mo864xe5e2e48d(on2.z0, int):void");
    }

    public final void y(android.widget.TextView textView, int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelListAdapter", "setStatusBtn haveJoinLive:" + this.f428479e + ", status:" + i17 + ",statusWording:" + str + '!');
        if (!this.f428479e) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (str == null || str.length() == 0) {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpo));
            textView.setEnabled(false);
            return;
        }
        if (i17 == 0) {
            textView.setText(str);
            textView.setEnabled(true);
            return;
        }
        if (i17 == 1) {
            textView.setText(str);
            textView.setEnabled(false);
        } else if (i17 == 2) {
            textView.setText(str);
            textView.setEnabled(true);
        } else {
            if (i17 != 3) {
                return;
            }
            textView.setText(str);
            textView.setEnabled(true);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        on2.z0 holder = (on2.z0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        for (java.lang.Object obj : payloads) {
            if ((obj instanceof java.lang.Integer) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1)) {
                android.widget.TextView textView = holder.f428617i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-status>(...)");
                java.util.ArrayList arrayList = this.f428478d;
                int m75939xb282bd08 = ((r45.dz1) arrayList.get(i17)).m75939xb282bd08(7);
                java.lang.String m75945x2fec8307 = ((r45.dz1) arrayList.get(i17)).m75945x2fec8307(8);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                y(textView, m75939xb282bd08, m75945x2fec8307);
            }
        }
    }
}
