package i93;

/* loaded from: classes11.dex */
public class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f371260d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f371267n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f371272s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f371273t;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f371261e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f371262f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f371263g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f371264h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f371265i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f371266m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f371268o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f371269p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f371270q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371271r = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f371274u = true;

    /* renamed from: v, reason: collision with root package name */
    public i93.f f371275v = null;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.SparseArray f371276w = new android.util.SparseArray();

    public e(android.content.Context context) {
        this.f371267n = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f371260d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, final int i17) {
        final f93.d5 d5Var = (f93.d5) k3Var;
        final com.p314xaae8f345.mm.p2621x8fb0427b.d4 x17 = x(i17);
        final java.lang.String valueOf = java.lang.String.valueOf(x17.f66585x70ce48ca);
        d5Var.f341848f.setOnClickListener(new android.view.View.OnClickListener() { // from class: i93.e$$a
            /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01ee  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02d4  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instructions count: 810
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i93.ViewOnClickListenerC28507x2e755c.onClick(android.view.View):void");
            }
        });
        d5Var.f341848f.setOnTouchListener(null);
        d5Var.f341851i.setVisibility(8);
        int i18 = this.f371268o;
        android.widget.CheckBox checkBox = d5Var.f341850h;
        if (i18 == 1) {
            checkBox.setVisibility(0);
        } else {
            checkBox.setVisibility(8);
        }
        boolean z17 = this.f371273t;
        android.content.Context context = this.f371267n;
        android.widget.TextView textView = d5Var.f341847e;
        if (z17) {
            textView.setVisibility(0);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573906g94, java.lang.Integer.valueOf(y(valueOf))));
        } else {
            textView.setVisibility(8);
        }
        if (this.f371264h.contains(valueOf)) {
            checkBox.setEnabled(false);
            checkBox.setChecked(true);
        } else {
            checkBox.setEnabled(true);
            if (checkBox.getVisibility() == 0) {
                checkBox.setChecked(((java.util.LinkedList) this.f371262f).contains(valueOf));
            }
        }
        boolean z18 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9.C20615x8ee66c89()) == 1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = d5Var.f341846d;
        if (!z18) {
            java.lang.String str = x17.f66586x7661fe9a;
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
            int hashCode = str.hashCode();
            android.util.SparseArray sparseArray = this.f371276w;
            android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
            if (spannableString == null) {
                spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, h17));
                int indexOf = str.indexOf(this.f371271r);
                if (indexOf != -1) {
                    int length = this.f371271r.length() + indexOf;
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)), indexOf, length, 33);
                    spannableString.setSpan(new android.text.style.StyleSpan(1), indexOf, length, 33);
                    sparseArray.put(hashCode, spannableString);
                }
            }
            c22632xdab56332.setText(spannableString);
        } else if (i17 >= 0 && i17 < this.f371261e.size()) {
            p13.y matchInfo = (p13.y) this.f371261e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((i93.d) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(i93.d.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchInfo, "matchInfo");
            java.lang.Object obj = matchInfo.f432730o;
            jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
            if (c22632xdab56332 != null) {
                c22632xdab56332.setText(lVar != null ? (java.lang.CharSequence) lVar.f384366d : null);
            }
            android.widget.TextView textView2 = d5Var.f341852m;
            if (textView2 != null) {
                textView2.setText(lVar != null ? (java.lang.CharSequence) lVar.f384367e : null);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        boolean isEmpty = this.f371266m.isEmpty();
        android.widget.LinearLayout linearLayout = d5Var.f341849g;
        if (isEmpty || !this.f371266m.contains(java.lang.String.valueOf(x17.f66585x70ce48ca))) {
            linearLayout.setAlpha(1.0f);
            checkBox.setAlpha(1.0f);
        } else {
            linearLayout.setAlpha(0.3f);
            checkBox.setAlpha(0.3f);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2c, viewGroup, false);
        f93.d5 d5Var = new f93.d5(inflate);
        inflate.setTag(d5Var);
        return d5Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 x(int i17) {
        java.util.ArrayList arrayList = this.f371260d;
        if (arrayList == null || i17 > arrayList.size()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.d4) this.f371260d.get(i17);
    }

    public int y(java.lang.String str) {
        int i17;
        java.util.Map map = this.f371270q;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(str);
        if (num != null) {
            return num.intValue();
        }
        java.util.ArrayList P1 = b93.r.wi().P1(str);
        int i18 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
            i17 = 0;
        } else {
            int size = P1.size();
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3((java.lang.String) it.next())) {
                    i18++;
                }
            }
            i17 = i18;
            i18 = size;
        }
        ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i18 - i17));
        return i18;
    }

    public void z(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            this.f371260d = new java.util.ArrayList();
            m8146xced61ae5();
            return;
        }
        java.util.List list = this.f371263g;
        if (!list.isEmpty()) {
            java.util.List list2 = this.f371265i;
            ((java.util.LinkedList) list2).clear();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) arrayList.get(i17);
                if (((java.util.LinkedList) list).contains(java.lang.String.valueOf(d4Var.f66585x70ce48ca))) {
                    ((java.util.LinkedList) list2).add(java.lang.String.valueOf(d4Var.f66585x70ce48ca));
                }
            }
            java.util.List list3 = this.f371262f;
            ((java.util.LinkedList) list3).clear();
            ((java.util.LinkedList) list3).addAll(list2);
        }
        this.f371260d = arrayList;
        m8146xced61ae5();
    }
}
