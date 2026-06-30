package ex5;

/* loaded from: classes7.dex */
public class g extends android.widget.BaseAdapter implements ex5.b {

    /* renamed from: d, reason: collision with root package name */
    public final ex5.h f338784d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.SharedPreferences f338791n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f338792o;

    /* renamed from: s, reason: collision with root package name */
    public android.preference.Preference.OnPreferenceChangeListener f338796s;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f338785e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f338786f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f338787g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f338788h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f338789i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f338790m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public int[] f338793p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    public boolean f338794q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f338795r = false;

    public g(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        this.f338784d = new ex5.h(context);
        this.f338792o = context;
        this.f338791n = sharedPreferences;
    }

    public static java.lang.String d(android.preference.Preference preference) {
        return preference.getClass().getName() + "L" + preference.getLayoutResource() + p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f + preference.getWidgetLayoutResource();
    }

    public static boolean f(int i17) {
        return i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.byv || i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13;
    }

    public static void g(android.preference.Preference preference, android.content.SharedPreferences sharedPreferences) {
        if (preference instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) {
            com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe c27745x1c1b08fe = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) preference;
            if (c27745x1c1b08fe.isPersistent()) {
                c27745x1c1b08fe.f301633d = sharedPreferences.getBoolean(preference.getKey(), ((com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) preference).h());
            }
        }
    }

    public final void a(android.preference.Preference preference, int i17) {
        java.lang.String str;
        if (preference.getKey() == null || preference.getKey().length() <= 0) {
            str = "_anonymous_pref@" + preference.hashCode();
        } else {
            str = preference.getKey();
        }
        this.f338786f.put(str, preference);
        java.util.LinkedList linkedList = this.f338785e;
        if (i17 == -1) {
            i17 = linkedList.size();
        }
        linkedList.add(i17, str);
        java.util.HashMap hashMap = this.f338789i;
        if (!hashMap.containsKey(d(preference)) && !this.f338795r) {
            hashMap.put(d(preference), java.lang.Integer.valueOf(hashMap.size()));
        }
        if (preference.getDependency() != null) {
            this.f338790m.put(preference.getDependency() + "|" + preference.getKey(), preference.getKey());
        }
    }

    public android.preference.Preference c(java.lang.String str) {
        return (android.preference.Preference) this.f338786f.get(str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f338788h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f338786f.get(this.f338788h.get(i17));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f338788h;
        if (i17 > linkedList.size()) {
            return -1;
        }
        java.lang.Integer num = (java.lang.Integer) this.f338789i.get(d((android.preference.Preference) this.f338786f.get(linkedList.get(i17))));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        java.util.LinkedList linkedList = this.f338788h;
        if (i17 > linkedList.size()) {
            return view;
        }
        android.preference.Preference preference = (android.preference.Preference) this.f338786f.get(linkedList.get(i17));
        if (preference instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) {
            preference.setOnPreferenceChangeListener(this.f338796s);
        }
        android.view.View view2 = preference.getView(!this.f338789i.containsKey(d(preference)) ? null : view, viewGroup);
        int i19 = this.f338793p[i17];
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        int i27 = 0;
        if (findViewById == null) {
            com.p314xaae8f345.mm.ui.yk.a("MicroMsg.WeUIPreferenceAdapter", "find content view error", new java.lang.Object[0]);
            return view2;
        }
        android.view.View findViewById2 = view2.findViewById(android.R.id.widget_frame);
        if ((i19 & 4) == 0) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingRight = findViewById.getPaddingRight();
            int paddingTop = findViewById.getPaddingTop();
            int paddingBottom = findViewById.getPaddingBottom();
            int paddingLeft2 = view2.getPaddingLeft();
            int paddingRight2 = view2.getPaddingRight();
            int paddingTop2 = view2.getPaddingTop();
            int paddingBottom2 = view2.getPaddingBottom();
            if ((i19 & 8) != 0) {
                i27 = (i17 == linkedList.size() + (-1) || (i17 == linkedList.size() + (-2) && (getItem(linkedList.size() + (-1)) instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27747x79ac8f19)) || (i19 & 2) != 0) ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3 : com.p314xaae8f345.mm.R.C30861xcebc809e.bfj;
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.aaw;
            } else if ((i19 & 16) == 0 && (i19 & 2) != 0) {
                i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.azm;
            } else {
                i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.azm;
                i27 = com.p314xaae8f345.mm.R.C30861xcebc809e.bfj;
            }
            findViewById.setBackgroundResource(i27);
            findViewById.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(i27);
            }
            view2.setBackgroundResource(i18);
            view2.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        if (!this.f338795r) {
            this.f338795r = true;
        }
        return java.lang.Math.max(1, this.f338789i.size());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        java.util.HashMap hashMap;
        int i17;
        java.util.LinkedList linkedList = this.f338788h;
        linkedList.clear();
        java.util.Iterator it = this.f338785e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f338786f;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f338787g.contains(str)) {
                if (hashMap.get(str) == null) {
                    com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeUIPreferenceAdapter", "not found pref by key " + str, new java.lang.Object[0]);
                } else {
                    linkedList.add(str);
                }
            }
        }
        if (!linkedList.isEmpty() && f(((android.preference.Preference) hashMap.get(linkedList.get(0))).getLayoutResource())) {
            a(new com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27749x4b9b05ea(this.f338792o, null), 0);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            if (i18 != 0) {
            }
        }
        linkedList.removeAll(hashSet);
        int[] iArr = new int[linkedList.size()];
        this.f338793p = iArr;
        if (iArr.length <= 0) {
            return;
        }
        int length = iArr.length;
        android.content.SharedPreferences sharedPreferences = this.f338791n;
        if (length == 1) {
            int layoutResource = ((android.preference.Preference) hashMap.get(linkedList.get(0))).getLayoutResource();
            android.preference.Preference preference = (android.preference.Preference) hashMap.get(linkedList.get(0));
            if (!f(layoutResource)) {
                this.f338793p[0] = 4;
            } else if (preference instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) {
                int[] iArr2 = this.f338793p;
                iArr2[0] = iArr2[0] | 8;
            } else {
                this.f338793p[0] = 3;
            }
            g((android.preference.Preference) hashMap.get(linkedList.get(0)), sharedPreferences);
            super.notifyDataSetChanged();
            return;
        }
        for (i17 = 0; i17 < linkedList.size(); i17++) {
            g((android.preference.Preference) hashMap.get(linkedList.get(i17)), sharedPreferences);
            android.preference.Preference preference2 = (android.preference.Preference) hashMap.get(linkedList.get(i17));
            int layoutResource2 = preference2.getLayoutResource();
            if (f(layoutResource2)) {
                if (preference2 instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) {
                    int[] iArr3 = this.f338793p;
                    iArr3[i17] = iArr3[i17] | 8;
                } else if (i17 == 0) {
                    int[] iArr4 = this.f338793p;
                    iArr4[i17] = iArr4[i17] | 1;
                } else {
                    if (i17 == linkedList.size() - 1) {
                        int[] iArr5 = this.f338793p;
                        iArr5[i17] = iArr5[i17] | 2;
                    }
                    int layoutResource3 = ((android.preference.Preference) hashMap.get(linkedList.get(i17 - 1))).getLayoutResource();
                    if (layoutResource3 != com.p314xaae8f345.mm.R.C30864xbddafb2a.byv || layoutResource3 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || layoutResource3 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13) {
                        int[] iArr6 = this.f338793p;
                        iArr6[i17] = iArr6[i17] | 1;
                    }
                }
            } else if (layoutResource2 != com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d) {
                int[] iArr7 = this.f338793p;
                iArr7[i17] = iArr7[i17] | 4;
                if (i17 != 0) {
                    int i19 = i17 - 1;
                    int layoutResource4 = ((android.preference.Preference) hashMap.get(linkedList.get(i19))).getLayoutResource();
                    if (f(layoutResource4) || layoutResource4 == com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d) {
                        int[] iArr8 = this.f338793p;
                        iArr8[i19] = iArr8[i19] | 2;
                    }
                }
            } else if (i17 == 0) {
                int[] iArr9 = this.f338793p;
                iArr9[i17] = iArr9[i17] | 4;
            } else {
                int[] iArr10 = this.f338793p;
                iArr10[i17] = iArr10[i17] | 16;
                int i27 = i17 - 1;
                int layoutResource5 = ((android.preference.Preference) hashMap.get(linkedList.get(i27))).getLayoutResource();
                if (layoutResource5 == com.p314xaae8f345.mm.R.C30864xbddafb2a.byv || layoutResource5 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || layoutResource5 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13) {
                    int[] iArr11 = this.f338793p;
                    iArr11[i27] = iArr11[i27] | 2;
                }
            }
        }
        super.notifyDataSetChanged();
    }
}
