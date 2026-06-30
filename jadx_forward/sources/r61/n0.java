package r61;

/* loaded from: classes15.dex */
public class n0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f474442d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f474443e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f474444f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f474445g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f474446h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f474447i;

    /* renamed from: m, reason: collision with root package name */
    public final int f474448m;

    /* renamed from: n, reason: collision with root package name */
    public final r61.l0 f474449n;

    /* renamed from: o, reason: collision with root package name */
    public bb5.g f474450o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.e f474451p;

    public n0(android.content.Context context, r61.l0 l0Var, int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f474443e = linkedList;
        this.f474444f = new java.util.LinkedList();
        this.f474446h = new java.util.LinkedList();
        this.f474448m = 1;
        this.f474450o = new bb5.g(15, new r61.g0(this));
        this.f474451p = null;
        this.f474442d = context;
        this.f474448m = i17;
        this.f474449n = l0Var;
        this.f474447i = new int[linkedList.size()];
    }

    public final void a(r45.g74 g74Var, java.lang.String[] strArr) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f474444f;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((r45.g74) it.next()).f456476d;
            if (str2 != null && (str = g74Var.f456476d) != null && str2.equals(str)) {
                return;
            }
        }
        linkedList.add(g74Var);
        ((java.util.LinkedList) this.f474446h).add(new java.lang.String[]{strArr[2], strArr[1]});
    }

    public int c() {
        int i17;
        int[] iArr = this.f474447i;
        int length = iArr.length;
        int i18 = 0;
        while (i17 < length) {
            int i19 = iArr[i17];
            int i27 = this.f474448m;
            if (i27 == 1) {
                i17 = i19 != 1 ? i17 + 1 : 0;
                i18++;
            } else {
                if (i27 == 2) {
                    if (i19 != 2) {
                    }
                    i18++;
                }
            }
        }
        return i18;
    }

    public boolean d() {
        int[] iArr = this.f474447i;
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        int i17 = 0;
        while (true) {
            int[] iArr2 = this.f474447i;
            if (i17 >= iArr2.length) {
                return true;
            }
            int i18 = iArr2[i17];
            int i19 = this.f474448m;
            if (i19 == 1) {
                if (i18 == 0) {
                    return false;
                }
            } else if (i19 == 2 && i18 == 0) {
                return false;
            }
            i17++;
        }
    }

    public void f(boolean z17) {
        int i17 = 0;
        int i18 = this.f474448m;
        if (i18 == 1) {
            while (true) {
                int[] iArr = this.f474447i;
                if (i17 >= iArr.length) {
                    break;
                }
                iArr[i17] = z17 ? 1 : 0;
                i17++;
            }
        } else if (i18 == 2) {
            int i19 = 0;
            while (true) {
                int[] iArr2 = this.f474447i;
                if (i19 >= iArr2.length) {
                    break;
                }
                iArr2[i19] = z17 ? 2 : 0;
                i19++;
            }
        }
        notifyDataSetChanged();
    }

    public void g(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = this.f474443e;
        java.util.LinkedList linkedList3 = this.f474444f;
        if (linkedList != null) {
            linkedList3.clear();
            linkedList2.clear();
            ((java.util.LinkedList) this.f474446h).clear();
            for (java.lang.String[] strArr : this.f474445g) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.g74 g74Var = (r45.g74) it.next();
                    int i17 = this.f474448m;
                    if (i17 == 1) {
                        int i18 = g74Var.f456478f;
                        if (i18 == 1 || i18 == 0) {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[2]) && g74Var.f456476d.equals(kk.k.g(strArr[2].getBytes()))) {
                                a(g74Var, strArr);
                            }
                        }
                    } else if (i17 == 2 && g74Var.f456478f == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[2]) && g74Var.f456476d.equals(kk.k.g(strArr[2].getBytes()))) {
                        a(g74Var, strArr);
                    }
                }
            }
        }
        this.f474447i = new int[linkedList3.size()];
        linkedList2.addAll(linkedList3);
        linkedList3.clear();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f474443e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.g74) this.f474443e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return ((r45.g74) this.f474443e.get(i17)).hashCode();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        r61.m0 m0Var;
        int i18 = this.f474448m;
        if (i18 == 1) {
            if (this.f474451p == null) {
                this.f474451p = new r61.h0(this);
            }
            bb5.g gVar = this.f474450o;
            if (gVar != null) {
                gVar.b(i17, this.f474451p);
            }
        }
        r45.g74 g74Var = (r45.g74) this.f474443e.get(i17);
        if (view == null) {
            m0Var = new r61.m0();
            android.content.Context context = this.f474442d;
            if (i18 == 1) {
                view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ad6, null);
                m0Var.f474433b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567479jn1);
                m0Var.f474434c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jmu);
                m0Var.f474435d = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.jmv);
                m0Var.f474436e = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.jmx);
                m0Var.f474432a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ged);
                m0Var.f474437f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567480jn2);
                m0Var.f474438g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567483jn5);
                view.setTag(m0Var);
            } else if (i18 == 2) {
                view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ad7, null);
                m0Var.f474433b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567479jn1);
                m0Var.f474434c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jmu);
                m0Var.f474435d = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.jmv);
                m0Var.f474436e = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.jmx);
                m0Var.f474437f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567480jn2);
                m0Var.f474438g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567483jn5);
                view.setTag(m0Var);
            }
        } else {
            m0Var = (r61.m0) view.getTag();
        }
        m0Var.f474438g.setOnClickListener(new r61.i0(this, i17));
        java.util.List list = this.f474446h;
        if (i18 == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1])) {
                m0Var.f474433b.setText(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1]);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g74Var.f456481i)) {
                m0Var.f474433b.setText(g74Var.f456477e);
            } else {
                m0Var.f474433b.setText(g74Var.f456481i);
            }
            m0Var.f474435d.setOnClickListener(new r61.j0(this, i17));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m0Var.f474432a, g74Var.f456477e, null);
        } else if (i18 == 2) {
            m0Var.f474433b.setText(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1]);
            m0Var.f474436e.setOnClickListener(new r61.k0(this, i17));
        }
        int i19 = this.f474447i[i17];
        if (i19 != 0) {
            if (i19 == 1) {
                m0Var.f474435d.setVisibility(8);
                m0Var.f474434c.setVisibility(0);
                m0Var.f474437f.setVisibility(0);
                m0Var.f474438g.setVisibility(0);
            } else if (i19 == 2) {
                m0Var.f474435d.setVisibility(8);
                m0Var.f474436e.setVisibility(8);
                m0Var.f474434c.setVisibility(0);
                m0Var.f474437f.setVisibility(0);
                m0Var.f474438g.setVisibility(0);
            } else if (i19 == 3) {
                m0Var.f474435d.setVisibility(8);
                m0Var.f474434c.setVisibility(0);
                m0Var.f474437f.setVisibility(0);
                m0Var.f474438g.setVisibility(0);
            }
        } else if (i18 == 1) {
            m0Var.f474434c.setVisibility(8);
            m0Var.f474435d.setVisibility(0);
            m0Var.f474436e.setVisibility(8);
            m0Var.f474437f.setVisibility(8);
            m0Var.f474438g.setVisibility(8);
        } else if (i18 == 2) {
            m0Var.f474434c.setVisibility(8);
            m0Var.f474435d.setVisibility(8);
            m0Var.f474436e.setVisibility(0);
            m0Var.f474437f.setVisibility(8);
            m0Var.f474438g.setVisibility(8);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        r61.l0 l0Var = this.f474449n;
        if (l0Var != null) {
            l0Var.mo161929xced61ae5();
        }
    }
}
