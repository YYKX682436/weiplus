package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class j0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final w33.a f220713e;

    /* renamed from: f, reason: collision with root package name */
    public final w33.a f220714f;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 f220718m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f220712d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f220715g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f220716h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f220717i = new java.util.HashMap();

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6) {
        this.f220718m = c15850x99d4a1f6;
        this.f220713e = new w33.a(1, null, false, c15850x99d4a1f6.f220434f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fod));
        this.f220714f = new w33.a(3, null, false, c15850x99d4a1f6.f220434f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fox));
    }

    public synchronized void B(java.util.List list) {
        boolean z17;
        int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).indexOf(this.f220714f);
        if (indexOf >= 0) {
            java.util.List list2 = this.f220712d;
            ((java.util.concurrent.CopyOnWriteArrayList) list2).removeAll(((java.util.concurrent.CopyOnWriteArrayList) list2).subList(indexOf, ((java.util.concurrent.CopyOnWriteArrayList) list2).size()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220718m;
        c15850x99d4a1f6.i1(c15850x99d4a1f6.f220436h2);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).add(this.f220714f);
        y();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            z17 = false;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new w33.a(4, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) it.next()));
            }
            z17 = linkedList.size() != 0;
            ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).addAll(linkedList);
            m8146xced61ae5();
        }
        if (z17) {
            this.f220718m.f220436h2.a();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f62 = this.f220718m;
            fVar.k(1002L, 0L, 1L, 0L, c15850x99d4a1f62.f220439k2, c15850x99d4a1f62.f220438j2, "", "", "");
        } else {
            android.view.View view = this.f220718m.f220436h2.f220424n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f63 = this.f220718m;
        c15850x99d4a1f63.mo53680x55dede61(c15850x99d4a1f63.f220436h2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).get(i17)).f524232a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r31, int r32) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 i1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220718m;
        if (i17 != 1) {
            if (i17 == 2) {
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v0(android.view.LayoutInflater.from(c15850x99d4a1f6.f220434f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5s, viewGroup, false));
            } else if (i17 != 3) {
                if (i17 != 4) {
                    return null;
                }
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1(android.view.LayoutInflater.from(c15850x99d4a1f6.f220434f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccv, viewGroup, false));
            }
            return i1Var;
        }
        i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i1(android.view.LayoutInflater.from(c15850x99d4a1f6.f220434f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569922rz, viewGroup, false));
        return i1Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d x(int i17) {
        w33.a aVar;
        java.util.List list = this.f220712d;
        if (i17 >= ((java.util.concurrent.CopyOnWriteArrayList) list).size() || i17 < 0 || (aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)) == null) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.b(aVar);
    }

    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220718m;
        if (c15850x99d4a1f6.f220441m2 == null) {
            return;
        }
        java.util.List list = this.f220712d;
        w33.a aVar = this.f220713e;
        int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(aVar);
        w33.a aVar2 = this.f220714f;
        int indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(aVar2);
        if (indexOf >= 0) {
            aVar.f524236e = c15850x99d4a1f6.f220441m2;
            aVar2.f524236e = null;
            aVar2.f524235d = c15850x99d4a1f6.f220434f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fox);
        } else {
            aVar.f524236e = null;
            aVar2.f524236e = c15850x99d4a1f6.f220441m2;
            aVar2.f524235d = c15850x99d4a1f6.f220434f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fou);
        }
        if (indexOf >= 0) {
            m8147xed6e4d18(indexOf);
        }
        if (indexOf2 >= 0) {
            m8147xed6e4d18(indexOf2);
        }
    }

    public synchronized void z(java.util.List list) {
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f220712d);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList2.add(new w33.a(2, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) it.next()));
            }
            int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).indexOf(this.f220713e);
            int indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).indexOf(this.f220714f);
            if (indexOf2 < 0) {
                indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).size();
            }
            if (list.size() == 0) {
                ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).removeAll(((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).subList(0, indexOf2));
            } else {
                if (indexOf < 0) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).add(0, this.f220713e);
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).addAll(1, linkedList2);
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).removeAll(((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).subList(1, indexOf2));
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220712d).addAll(1, linkedList2);
                }
                if (!this.f220715g) {
                    this.f220715g = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("GroupNum", linkedList2.size());
                    } catch (org.json.JSONException unused) {
                    }
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220718m;
                    fVar.k(1001L, 0L, 1L, 0L, c15850x99d4a1f6.f220439k2, c15850x99d4a1f6.f220438j2, "", "", jSONObject.toString());
                }
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.h0(this.f220718m, linkedList, this.f220712d), true).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i0(this));
            y();
        }
    }
}
