package j12;

/* loaded from: classes15.dex */
public abstract class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f378684d;

    /* renamed from: e, reason: collision with root package name */
    public j12.f f378685e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 f378686f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f378687g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashMap f378688h;

    public b(android.content.Context context) {
        this.f378684d = context;
        if (context == null) {
            return;
        }
        this.f378688h = new java.util.HashMap();
    }

    public void a() {
        java.util.HashMap hashMap = this.f378688h;
        if (hashMap != null) {
            hashMap.clear();
            this.f378688h = null;
        }
        j12.f fVar = this.f378685e;
        if (fVar != null) {
            java.util.ArrayList arrayList = fVar.f378691d;
            if (arrayList != null) {
                arrayList.clear();
                fVar.f378691d = null;
            }
            java.util.HashMap hashMap2 = fVar.f378692e;
            if (hashMap2 != null) {
                hashMap2.clear();
                fVar.f378692e = null;
            }
            java.util.HashMap hashMap3 = fVar.f378693f;
            if (hashMap3 != null) {
                hashMap3.clear();
                fVar.f378693f = null;
            }
            this.f378685e = null;
        }
        this.f378687g = false;
    }

    public abstract int c();

    public final java.lang.String d(j12.i iVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.f378699a != j12.h.cellset) {
            return iVar.f378700b.f473661d;
        }
        return "" + iVar.f378702d.f460262g + "_cell";
    }

    public abstract int f();

    public abstract boolean g(int i17);

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList;
        j12.f fVar = this.f378685e;
        if (fVar == null || (arrayList = fVar.f378691d) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.c cVar = view != null ? (i12.c) view.getTag() : null;
        j12.i item = getItem(i17);
        if (cVar == null) {
            cVar = l(this.f378684d, view);
            view = cVar.A;
            this.f378688h.put(d(item), cVar);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d(item))) {
            if (this.f378688h.containsValue(cVar)) {
                this.f378688h.remove(cVar.e());
            }
            this.f378688h.put(d(item), cVar);
        }
        cVar.f368705d = i17;
        cVar.f368704c = item;
        android.view.View j17 = j(i17, view, viewGroup);
        cVar.h();
        return j17;
    }

    @Override // android.widget.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j12.i getItem(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        j12.f fVar = this.f378685e;
        if (fVar == null || (arrayList = fVar.f378691d) == null || arrayList.size() <= i17 || i17 < 0 || (arrayList2 = fVar.f378691d) == null) {
            return null;
        }
        return (j12.i) arrayList2.get(i17);
    }

    public abstract android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup);

    public abstract int k();

    public abstract i12.c l(android.content.Context context, android.view.View view);

    public void m() {
        if (this.f378687g) {
            super.notifyDataSetChanged();
        }
    }

    public void n(j12.i iVar, java.lang.String str, int i17) {
        if (iVar == null || str == null) {
            return;
        }
        iVar.c(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) this.f378685e.f378692e.get(str);
        if (f5Var == null) {
            return;
        }
        f5Var.a(i17);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f378687g = false;
        j12.f fVar = this.f378685e;
        if (fVar != null && fVar.f378691d != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            fVar.f378693f = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().b1();
            java.util.Iterator it = fVar.f378691d.iterator();
            while (it.hasNext()) {
                j12.i iVar = (j12.i) it.next();
                r45.zj0 zj0Var = iVar.f378700b;
                if (zj0Var != null) {
                    if (n22.l.c(zj0Var)) {
                        iVar.c(n22.l.a() ? 7 : 3);
                    } else {
                        java.lang.String str = zj0Var.f473661d;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) fVar.f378692e.get(str);
                        java.util.HashMap hashMap = fVar.f378693f;
                        iVar.b(fVar.f378694g, f5Var, hashMap == null ? false : hashMap.containsKey(str));
                    }
                }
            }
            fVar.d();
        }
        java.util.HashMap hashMap2 = this.f378688h;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        super.notifyDataSetChanged();
        this.f378687g = true;
    }

    public abstract void o(int i17);

    public abstract void p(int i17);

    public abstract void q(int i17);

    public void r(java.lang.String str, int i17) {
        j12.f fVar;
        if (this.f378688h == null || (fVar = this.f378685e) == null || str == null) {
            return;
        }
        j12.i g17 = fVar.g(str);
        if (g17 != null) {
            if (i17 >= 0 && i17 < 100) {
                n(g17, str, 6);
                g17.f378703e = i17;
            }
            if (i17 >= 100) {
                n(g17, str, 7);
            }
        }
        java.util.HashMap hashMap = this.f378688h;
        i12.c cVar = hashMap == null ? null : (i12.c) hashMap.get(str);
        if (cVar == null) {
            return;
        }
        java.lang.String e17 = cVar.e() != null ? cVar.e() : null;
        if (e17 == null || !e17.equals(str)) {
            return;
        }
        cVar.h();
    }

    public void s(java.lang.String str, int i17) {
        j12.f fVar;
        if (this.f378688h == null || (fVar = this.f378685e) == null || str == null) {
            return;
        }
        j12.i g17 = fVar.g(str);
        if (g17 != null) {
            n(g17, str, i17);
        }
        if (g17 != null && this.f378685e != null && g17.f378704f == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
            j12.f fVar2 = this.f378685e;
            boolean z17 = fVar2.f378694g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) fVar2.f378692e.get(str);
            java.util.HashMap hashMap = this.f378685e.f378693f;
            g17.b(z17, f5Var, hashMap == null ? false : hashMap.containsKey(str));
        }
        java.util.HashMap hashMap2 = this.f378688h;
        i12.c cVar = hashMap2 == null ? null : (i12.c) hashMap2.get(str);
        if (cVar == null) {
            return;
        }
        java.lang.String e17 = cVar.e() != null ? cVar.e() : null;
        if (e17 == null || !e17.equals(str)) {
            return;
        }
        cVar.h();
    }
}
