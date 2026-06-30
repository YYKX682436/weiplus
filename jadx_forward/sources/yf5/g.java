package yf5;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f543403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.m f543404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.l0 f543405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f543406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f543407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf5.k0 f543408i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yf5.m mVar, yf5.l0 l0Var, yz5.l lVar, java.util.ArrayList arrayList, yf5.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543404e = mVar;
        this.f543405f = l0Var;
        this.f543406g = lVar;
        this.f543407h = arrayList;
        this.f543408i = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yf5.g gVar = new yf5.g(this.f543404e, this.f543405f, this.f543406g, this.f543407h, this.f543408i, interfaceC29045xdcb5ca57);
        gVar.f543403d = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList<yf5.f> arrayList2 = new java.util.ArrayList();
        yf5.m mVar = this.f543404e;
        java.util.Iterator it = mVar.f543444e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f543407h;
            java.lang.Object obj2 = null;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            yf5.f fVar = (yf5.f) entry.getValue();
            if (fVar.f543401c == this.f543408i.f543429b) {
                if (fVar.f543399a.f543528d.G0() >= mVar.f543445f.f543396a) {
                    arrayList2.add(fVar);
                } else {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yf5.x) next).f543528d.h1(), str)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 != null) {
                        arrayList2.add(fVar);
                    }
                }
            }
        }
        mVar.f543444e.clear();
        yf5.l0 l0Var = this.f543405f;
        int i17 = l0Var.f543436a.f543429b;
        int i18 = mVar.f543445f.f543397b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 < i18) {
            return f0Var;
        }
        yz5.l lVar = this.f543406g;
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = mVar.f543440a.f543495f;
            if (c16718x7059cefe != null) {
                c16718x7059cefe.n(arrayList, false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f543441b, "submitInsert, " + l0Var.f543436a.f543428a + ", " + arrayList.size());
        for (yf5.f fVar2 : arrayList2) {
            int ordinal = fVar2.f543400b.ordinal();
            yf5.x xVar = fVar2.f543399a;
            if (ordinal == 0) {
                java.lang.String str2 = mVar.f543441b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("change event submitInsert, ");
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = xVar.f543528d;
                sb6.append(l4Var != null ? l4Var.h1() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = mVar.f543440a.f543495f;
                if (c16718x7059cefe2 != null) {
                    c16718x7059cefe2.o(xVar, false);
                }
            } else if (ordinal == 1) {
                java.lang.String str3 = mVar.f543441b;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("change event submitUpdate, ");
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = xVar.f543528d;
                sb7.append(l4Var2 != null ? l4Var2.h1() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = mVar.f543440a.f543495f;
                if (c16718x7059cefe3 != null) {
                    c16718x7059cefe3.y(xVar, true);
                }
            } else if (ordinal == 2) {
                java.lang.String str4 = mVar.f543441b;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("change event submitRemove, ");
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = xVar.f543528d;
                sb8.append(l4Var3 != null ? l4Var3.h1() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb8.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe4 = mVar.f543440a.f543495f;
                if (c16718x7059cefe4 != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var4 = xVar.f543528d;
                    java.lang.String h17 = l4Var4 != null ? l4Var4.h1() : null;
                    if (h17 == null) {
                        h17 = "";
                    }
                    c16718x7059cefe4.s(h17);
                }
            }
        }
        return f0Var;
    }
}
