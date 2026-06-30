package wo1;

/* loaded from: classes5.dex */
public abstract class v extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: $stable */
    public static final int f77365x3b2de05f = 8;

    /* renamed from: emptyView */
    private android.view.View f77368xab5dc592;

    /* renamed from: estimatedSize */
    private long f77369x6009565d;

    /* renamed from: onMoreIconClicked */
    private yz5.l f77370x8c7b66fa;

    /* renamed from: showMore */
    private boolean f77373xebcac3f2;

    /* renamed from: showSize */
    private boolean f77374xebcd689e;

    /* renamed from: sortAdapter */
    private wo1.m f77375x5bb57d1;
    private final java.lang.String TAG = "BaseContactAdapter";

    /* renamed from: convMap */
    private final java.util.HashMap<java.lang.String, java.lang.Integer> f77367x38b7c188 = new java.util.HashMap<>();

    /* renamed from: convList */
    private final java.util.List<wo1.n> f77366xde4019f2 = new java.util.ArrayList();

    /* renamed from: selectedUsers */
    private final java.util.ArrayList<java.lang.String> f77372x5644142d = new java.util.ArrayList<>();

    /* renamed from: selectedListAdapter */
    private wo1.l f77371x5c2dd336 = new wo1.u(this);

    /* renamed from: contains */
    public final boolean m174230xde2d761f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return this.f77367x38b7c188.containsKey(username);
    }

    /* renamed from: createSortTypeAdapter */
    public abstract wo1.m mo53981x3e90199b(android.content.Context context);

    /* renamed from: getEstimatedSize */
    public final long m174231x1d6912a7() {
        if (this.f77374xebcd689e) {
            return this.f77369x6009565d;
        }
        return -1L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f77366xde4019f2.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == this.f77366xde4019f2.size() ? 1 : 0;
    }

    /* renamed from: getOnMoreIconClicked */
    public final yz5.l m174232xdfafee44() {
        return this.f77370x8c7b66fa;
    }

    /* renamed from: getSelectedList */
    public final java.util.List<java.lang.String> m174233xf85be44f() {
        return this.f77372x5644142d;
    }

    /* renamed from: getSelectedListAdapter */
    public final wo1.l m174234xb45db000() {
        return this.f77371x5c2dd336;
    }

    /* renamed from: getShowMore */
    public final boolean m174235x67a50168() {
        return this.f77373xebcac3f2;
    }

    /* renamed from: getShowSize */
    public final boolean m174236x67a7a614() {
        return this.f77374xebcd689e;
    }

    /* renamed from: getSortTypeAdapter */
    public final android.widget.BaseAdapter m174237x2e226c01() {
        wo1.m mVar = this.f77375x5bb57d1;
        if (mVar != null) {
            return mVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortAdapter");
        throw null;
    }

    /* renamed from: getSortTypeDescription */
    public final java.lang.String m174238xb593a3ae() {
        wo1.m mVar = this.f77375x5bb57d1;
        if (mVar != null) {
            return mVar.a()[mVar.f529521d];
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortAdapter");
        throw null;
    }

    /* renamed from: getSpannedName */
    public abstract java.lang.CharSequence mo53982xda5071f8(android.content.Context context, java.lang.String str);

    /* renamed from: initAdapter */
    public final void m174239xa1b041f(android.content.Context ctx, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f77366xde4019f2.clear();
        mo53983xa1b041f(intent, this.f77366xde4019f2);
        this.f77375x5bb57d1 = mo53981x3e90199b(ctx);
        m174243x6546a9bd(0);
    }

    /* renamed from: initAdapter */
    public abstract void mo53983xa1b041f(android.content.Intent intent, java.util.List list);

    /* renamed from: isSelectAll */
    public final boolean m174240xdff51cfb() {
        return this.f77366xde4019f2.size() == this.f77372x5644142d.size();
    }

    /* renamed from: isSelected */
    public final boolean m174241x17bd99e5(java.lang.String str) {
        java.lang.Integer num = this.f77367x38b7c188.get(str);
        if (num != null) {
            int intValue = num.intValue();
            wo1.n nVar = (intValue < 0 || intValue > this.f77366xde4019f2.size()) ? null : this.f77366xde4019f2.get(intValue);
            if (nVar != null) {
                return nVar.f529528d;
            }
        }
        return false;
    }

    /* renamed from: notifyUserdataChanged */
    public final void m174242x129ad476(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.Integer num = this.f77367x38b7c188.get(username);
        if (num != null) {
            m8147xed6e4d18(num.intValue());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 == this.f77366xde4019f2.size()) {
            return;
        }
        wo1.n nVar = this.f77366xde4019f2.get(i17);
        wo1.b1 b1Var = (wo1.b1) holder;
        b1Var.f529438d.setChecked(nVar.f529528d);
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = b1Var.f529439e;
        java.lang.String str = nVar.f529525a;
        wVar.Ai(imageView, str, null);
        android.widget.TextView textView = b1Var.f529440f;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(mo53982xda5071f8(context, str));
        if (this.f77374xebcd689e) {
            b1Var.f529441g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(nVar.f529527c));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 != 0) {
            android.content.res.Resources resources = parent.getResources();
            float dimension = (2 * resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aky)) + resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.akw);
            android.view.View view = new android.view.View(parent.getContext());
            view.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, (int) dimension));
            this.f77368xab5dc592 = view;
            android.view.View view2 = this.f77368xab5dc592;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            wo1.o oVar = new wo1.o(view2);
            android.view.View view3 = this.f77368xab5dc592;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            view3.setTag(oVar);
            return oVar;
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.en9, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        wo1.b1 b1Var = new wo1.b1(inflate);
        inflate.setTag(b1Var);
        b1Var.f3639x46306858.setOnClickListener(new wo1.p(b1Var, this));
        b1Var.f529438d.setVisibility(0);
        b1Var.f529441g.setVisibility(this.f77374xebcd689e ? 0 : 8);
        boolean z17 = this.f77373xebcac3f2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = b1Var.f529442h;
        if (z17) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78982x7b144cef);
            c22699x3dcdb352.setVisibility(0);
        } else {
            c22699x3dcdb352.setVisibility(8);
        }
        c22699x3dcdb352.setOnClickListener(new wo1.q(b1Var, this));
        return b1Var;
    }

    /* renamed from: onSortTypeChanged */
    public final void m174243x6546a9bd(int i17) {
        wo1.m mVar = this.f77375x5bb57d1;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortAdapter");
            throw null;
        }
        mVar.c(i17, this.f77366xde4019f2);
        this.f77367x38b7c188.clear();
        int i18 = 0;
        for (java.lang.Object obj : this.f77366xde4019f2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            this.f77367x38b7c188.put(((wo1.n) obj).f529525a, java.lang.Integer.valueOf(i18));
            i18 = i19;
        }
        m8146xced61ae5();
    }

    /* renamed from: selectAll */
    public final void m174244x99b7db05() {
        java.util.Set<java.lang.String> keySet = this.f77367x38b7c188.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        x(keySet);
    }

    /* renamed from: setInitialSelection */
    public final void m174245xd6f2232a(java.util.List<java.lang.String> initSelection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initSelection, "initSelection");
        x(initSelection);
    }

    /* renamed from: setOnMoreIconClicked */
    public final void m174246xbb45fab8(yz5.l lVar) {
        this.f77370x8c7b66fa = lVar;
    }

    /* renamed from: setShowMore */
    public final void m174247x625d6274(boolean z17) {
        this.f77373xebcac3f2 = z17;
    }

    /* renamed from: setShowSize */
    public final void m174248x62600720(boolean z17) {
        this.f77374xebcd689e = z17;
    }

    /* renamed from: toggleSelected */
    public final void m174249x9ca87e0f(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "username is null");
            return;
        }
        java.lang.Integer num = this.f77367x38b7c188.get(str);
        wo1.n nVar = (num == null || num.intValue() < 0 || num.intValue() >= this.f77366xde4019f2.size()) ? null : this.f77366xde4019f2.get(num.intValue());
        if (num != null && nVar != null) {
            y(num.intValue());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "Fail to find the item by username=" + str + ", index=" + num);
    }

    /* renamed from: unselectAll */
    public final void m174250x9dcc288c() {
        this.f77369x6009565d = 0L;
        java.util.Iterator<T> it = this.f77366xde4019f2.iterator();
        while (it.hasNext()) {
            ((wo1.n) it.next()).f529528d = false;
        }
        m8146xced61ae5();
        this.f77372x5644142d.clear();
        this.f77371x5c2dd336.m8146xced61ae5();
        yz5.q qVar = this.f77371x5c2dd336.f529514e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f77372x5644142d, "", java.lang.Boolean.FALSE);
        }
    }

    public final void x(java.util.Collection collection) {
        java.util.Set X0 = kz5.n0.X0(collection);
        this.f77369x6009565d = 0L;
        for (wo1.n nVar : this.f77366xde4019f2) {
            if (X0.contains(nVar.f529525a)) {
                nVar.f529528d = true;
                this.f77369x6009565d += nVar.f529527c;
            }
        }
        m8146xced61ae5();
        this.f77372x5644142d.clear();
        this.f77372x5644142d.addAll(collection);
        this.f77371x5c2dd336.m8146xced61ae5();
        yz5.q qVar = this.f77371x5c2dd336.f529514e;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f77372x5644142d, "", java.lang.Boolean.TRUE);
        }
    }

    public final void y(int i17) {
        wo1.n nVar = this.f77366xde4019f2.get(i17);
        boolean z17 = !nVar.f529528d;
        nVar.f529528d = z17;
        long j17 = this.f77369x6009565d;
        long j18 = nVar.f529527c;
        if (!z17) {
            j18 = -j18;
        }
        this.f77369x6009565d = j17 + j18;
        m8147xed6e4d18(i17);
        boolean z18 = nVar.f529528d;
        java.lang.String str = nVar.f529525a;
        if (z18) {
            this.f77372x5644142d.add(str);
            this.f77371x5c2dd336.m8149x8b456734(this.f77372x5644142d.size() + 1);
            yz5.q qVar = this.f77371x5c2dd336.f529514e;
            if (qVar != null) {
                qVar.mo147xb9724478(this.f77372x5644142d, str, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        int indexOf = this.f77372x5644142d.indexOf(str);
        if (indexOf >= 0) {
            this.f77372x5644142d.remove(indexOf);
            this.f77371x5c2dd336.m8155x27702c4(indexOf + 1);
            yz5.q qVar2 = this.f77371x5c2dd336.f529514e;
            if (qVar2 != null) {
                qVar2.mo147xb9724478(this.f77372x5644142d, str, java.lang.Boolean.FALSE);
            }
        }
    }
}
