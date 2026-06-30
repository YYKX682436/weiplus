package i22;

/* loaded from: classes15.dex */
public class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f369547d;

    /* renamed from: e, reason: collision with root package name */
    public final i22.w f369548e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369549f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f369550g;

    /* renamed from: h, reason: collision with root package name */
    public i22.p0 f369551h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f369552i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f369553m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f369554n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f369555o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.p f369556p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f369557q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f369558r;

    public s(android.content.Context context, i22.w singleProductAlbumItemSizeResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singleProductAlbumItemSizeResolver, "singleProductAlbumItemSizeResolver");
        this.f369547d = context;
        this.f369548e = singleProductAlbumItemSizeResolver;
        this.f369549f = "MicroMsg.EmojiStoreV3HomeMainAdapter";
        this.f369550g = new java.util.ArrayList();
        this.f369552i = new java.util.HashMap();
        this.f369553m = new java.util.LinkedHashSet();
        this.f369554n = new java.util.ArrayList();
    }

    public final void B(boolean z17) {
        java.lang.Object obj = z17 ? i22.i.f369514a : i22.j.f369518a;
        java.util.Iterator it = this.f369553m.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (((i22.n0) this.f369550g.get(intValue)).mo134661xfb85f7b0() == 5) {
                m8148xed6e4d18(intValue, obj);
            }
        }
    }

    public final void E(i22.p event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String a17 = event.a();
        java.lang.Integer num = (java.lang.Integer) this.f369552i.get(a17);
        java.lang.String str = this.f369549f;
        if (num != null) {
            int intValue = num.intValue();
            java.util.ArrayList arrayList = this.f369550g;
            if (intValue < arrayList.size()) {
                java.lang.Object obj = arrayList.get(num.intValue());
                i22.m0 m0Var = obj instanceof i22.m0 ? (i22.m0) obj : null;
                j12.i iVar = m0Var != null ? m0Var.f369537a : null;
                if (event instanceof i22.o) {
                    z(iVar, a17, ((i22.o) event).f369542b);
                    if (iVar != null && iVar.f378704f == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "force refresh emotionItem status, productId:" + a17);
                        boolean y17 = c01.z1.y();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.f369558r;
                        iVar.b(y17, f0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).b(a17) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.a(a17));
                    }
                } else if (event instanceof i22.n) {
                    int i17 = ((i22.n) event).f369540b;
                    if (i17 >= 0 && i17 < 100) {
                        z(iVar, a17, 6);
                        if (iVar != null) {
                            iVar.f378703e = i17;
                        }
                    }
                    if (i17 >= 100) {
                        z(iVar, a17, 7);
                    }
                }
                m8148xed6e4d18(num.intValue(), event);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateListItemProgress failed, cache pos error, productId:" + a17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f369550g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        i22.n0 n0Var = (i22.n0) kz5.n0.a0(this.f369550g, i17);
        if (n0Var != null) {
            return n0Var.mo134661xfb85f7b0();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        recyclerView.i(new i22.r(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.zj0 zj0Var;
        i22.m holder = (i22.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f369550g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        i22.n0 n0Var = (i22.n0) obj;
        holder.i(n0Var, new java.util.ArrayList());
        int mo134661xfb85f7b0 = n0Var.mo134661xfb85f7b0();
        if (mo134661xfb85f7b0 == 1) {
            j12.i iVar = ((i22.m0) n0Var).f369537a;
            java.lang.String str = (iVar == null || (zj0Var = iVar.f378700b) == null) ? null : zj0Var.f473661d;
            if (str == null) {
                return;
            }
            this.f369552i.put(str, java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.List list = this.f369554n;
        if (mo134661xfb85f7b0 == 2) {
            ((java.util.ArrayList) list).add(new i22.q(i17, 0, ((i22.l0) n0Var).f369534b + 10000, 2, null));
            return;
        }
        if (mo134661xfb85f7b0 == 5) {
            this.f369553m.add(java.lang.Integer.valueOf(i17));
        } else {
            if (mo134661xfb85f7b0 != 6) {
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                ((i22.q) kz5.n0.i0(arrayList)).f369544b = i17;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8k, parent, false);
            android.content.Context context = this.f369547d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new i22.v(context, inflate, null, false, false, this.f369551h, 28, null);
        }
        if (i17 == 2) {
            android.view.View inflate2 = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8j, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new i22.x(inflate2, this.f369551h);
        }
        android.content.Context context2 = this.f369547d;
        if (i17 == 3) {
            android.view.View inflate3 = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8n, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new i22.j0(context2, inflate3, this.f369551h, this.f369548e);
        }
        if (i17 != 6) {
            android.view.View inflate4 = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8a, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
            return new i22.g(context2, inflate4, this.f369551h);
        }
        android.view.View inflate5 = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8i, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
        return new i22.y(context2, inflate5, this.f369551h);
    }

    public final i22.q x(int i17) {
        java.util.List list = this.f369554n;
        if (((java.util.ArrayList) list).isEmpty()) {
            return null;
        }
        boolean z17 = false;
        int i18 = 0;
        i22.q qVar = null;
        while (true) {
            if (i18 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            int i19 = i18 + 1;
            i22.q qVar2 = (i22.q) ((java.util.ArrayList) list).get(i18);
            if (i17 > qVar2.f369543a && i17 < qVar2.f369544b) {
                z17 = true;
                qVar = qVar2;
                break;
            }
            qVar = qVar2;
            i18 = i19;
        }
        if (z17) {
            return qVar;
        }
        return null;
    }

    public final void y(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        yz5.p pVar;
        r45.zj0 zj0Var;
        if (layoutManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369549f, "reportExposeData failed, recyclerview layoutManager null");
            return;
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            if (y17 - w17 <= 0) {
                return;
            }
            e06.k kVar = new e06.k(w17, y17);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            int i17 = kVar.f327743e;
            if (w17 <= i17) {
                int i18 = 0;
                while (true) {
                    java.lang.Object obj = this.f369550g.get(w17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    i22.n0 n0Var = (i22.n0) obj;
                    if (n0Var instanceof i22.m0) {
                        java.util.List list = this.f369554n;
                        if (!list.isEmpty()) {
                            i22.q qVar = (i22.q) ((java.util.ArrayList) list).get(i18);
                            int i19 = i18;
                            while (true) {
                                if (i19 < ((java.util.ArrayList) list).size()) {
                                    if (w17 > qVar.f369543a && w17 < qVar.f369544b) {
                                        i18 = i19;
                                        break;
                                    }
                                    i19++;
                                    if (i19 >= ((java.util.ArrayList) list).size()) {
                                        break;
                                    } else {
                                        qVar = (i22.q) ((java.util.ArrayList) list).get(i19);
                                    }
                                } else {
                                    break;
                                }
                            }
                            int i27 = qVar.f369545c;
                            if (!linkedHashMap.containsKey(java.lang.Integer.valueOf(i27))) {
                                linkedHashMap.put(java.lang.Integer.valueOf(i27), new java.util.LinkedList());
                            }
                            java.util.List list2 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(i27));
                            if (list2 != null) {
                                int i28 = w17 - qVar.f369543a;
                                j12.i iVar = ((i22.m0) n0Var).f369537a;
                                java.lang.String str = (iVar == null || (zj0Var = iVar.f378700b) == null) ? null : zj0Var.f473663f;
                                if (str == null) {
                                    str = "";
                                }
                                list2.add(new j22.j(i28, str, iVar != null ? iVar.f378700b : null, iVar != null ? iVar.f378709k : null));
                            }
                        }
                    }
                    if (n0Var instanceof i22.a1) {
                        i22.a1 a1Var = (i22.a1) n0Var;
                        r45.kj0 kj0Var = a1Var.f369459b;
                        int i29 = kj0Var != null ? kj0Var.f460262g : 0;
                        if (!linkedHashMap2.containsKey(java.lang.Integer.valueOf(i29))) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
                            long j17 = i29;
                            r45.kj0 kj0Var2 = a1Var.f369459b;
                            java.lang.String str2 = kj0Var2 != null ? kj0Var2.f460260e : null;
                            linkedHashMap2.put(valueOf, new j22.l(j17, str2 == null ? "" : str2, 0, 0, null, null, 60, null));
                        }
                        int i37 = a1Var.f369460c;
                        j22.l lVar = (j22.l) linkedHashMap2.get(java.lang.Integer.valueOf(i29));
                        if (lVar != null) {
                            if (1 <= i37) {
                                int i38 = 1;
                                while (true) {
                                    java.lang.StringBuilder sb6 = lVar.f378798c;
                                    java.lang.StringBuilder sb7 = lVar.f378799d;
                                    if (i38 != 1) {
                                        sb7.append("#");
                                        sb6.append("#");
                                    }
                                    sb7.append(i38);
                                    r45.ri0 ri0Var = ((i22.c1) a1Var.f369458a.get(i38 - 1)).f369485a;
                                    sb6.append(ri0Var != null ? ri0Var.f466419d : null);
                                    if (i38 == i37) {
                                        break;
                                    } else {
                                        i38++;
                                    }
                                }
                            }
                            yz5.l lVar2 = this.f369557q;
                            if (lVar2 != null) {
                                lVar2.mo146xb9724478(lVar);
                            }
                        }
                    }
                    if ((n0Var instanceof i22.a) && (pVar = this.f369556p) != null) {
                        pVar.mo149xb9724478(java.lang.Integer.valueOf(w17), n0Var);
                    }
                    if (w17 == i17) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            yz5.l lVar3 = this.f369555o;
            if (lVar3 != null) {
                lVar3.mo146xb9724478(new j22.k(linkedHashMap));
            }
        }
    }

    public final void z(j12.i iVar, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var;
        if (iVar == null || str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.f369558r;
        if (f0Var == null || (f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).f179129b.get(str)) == null) {
            return;
        }
        f5Var.a(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        i22.m holder = (i22.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (!payloads.isEmpty()) {
            java.lang.Object obj = this.f369550g.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            holder.i((i22.n0) obj, payloads);
            return;
        }
        super.mo8157xe5e2e48d(holder, i17, payloads);
    }
}
