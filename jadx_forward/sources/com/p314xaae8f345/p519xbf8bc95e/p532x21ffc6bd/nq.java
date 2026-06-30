package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class nq extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> {

    /* renamed from: i, reason: collision with root package name */
    private final java.util.HashMap<java.lang.Long, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b> f132115i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.HashMap<java.lang.Long, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b> f132116j;

    public nq(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar) {
        super(tkVar);
        this.f132115i = new java.util.HashMap<>();
        this.f132116j = new java.util.HashMap<>();
    }

    private void g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = this.f132115i.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f132115i.get(it.next()));
        }
        if (this.f132115i.size() == this.f132116j.size() && this.f132115i.keySet().equals(this.f132116j.keySet())) {
            return;
        }
        this.f132116j.clear();
        this.f132116j.putAll(this.f132115i);
        this.f132101a.a(arrayList);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq h() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr nrVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns(this, nrVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void c() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> ngVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass87(ngVar.e_(), ngVar.f132100d));
        if (!ngVar.f132100d.f132117a.m35694xc0c54d48() || ngVar.f132100d.f132117a.m35683x227a49d1() == null) {
            return;
        }
        this.f132115i.put(java.lang.Long.valueOf(ngVar.e_()), ngVar.f132100d.f132117a.m35683x227a49d1());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> ngVar) {
        this.f132101a.c(ngVar.e_());
        this.f132115i.remove(java.lang.Long.valueOf(ngVar.e_()));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> ngVar) {
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ngVar).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr nrVar) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) super.b((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq) nrVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> ngVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        ngVar.a(((java.lang.Long) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass86>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass86(ngVar.f132100d), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass86) 0L)).longValue());
        if (!ngVar.f132100d.f132117a.m35694xc0c54d48() || ngVar.f132100d.f132117a.m35683x227a49d1() == null) {
            return;
        }
        this.f132115i.put(java.lang.Long.valueOf(ngVar.e_()), ngVar.f132100d.f132117a.m35683x227a49d1());
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr> a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr nrVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns(this, nrVar);
    }

    public final java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.AnimationInfo> b(long j17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        int intValue = ((java.lang.Integer) tkVar.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass91>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass91(j17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass91) 0)).intValue();
        if (intValue <= 0) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = this.f132101a;
        float[] fArr = (float[]) tkVar2.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass92>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass92(j17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass92) new float[0]);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar3 = this.f132101a;
        java.lang.String[] strArr = (java.lang.String[]) tkVar3.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass93>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass93(j17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass93) new java.lang.String[0]);
        if (fArr == null || strArr == null || fArr.length != strArr.length || fArr.length != intValue) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < intValue; i17++) {
            arrayList.add(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.AnimationInfo(i17, strArr[i17], fArr[i17]));
        }
        return arrayList;
    }

    public final void e(long j17) {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
                tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass98(j17));
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final boolean f() {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).mo35534x93c986e3()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final android.util.Pair<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject> a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, long j17, java.lang.String str, java.lang.String str2) {
        android.util.Pair<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject> pair = new android.util.Pair<>(null, null);
        if (j17 > 0) {
            java.util.Iterator it = this.f132102b.entrySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns nsVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue();
                if (nsVar.e_() == j17) {
                    com.tencent.mapsdk.internal.nh.a aVar = new com.tencent.mapsdk.internal.nh.a(c26041x873d1d26, str, str2);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns.AnonymousClass1(aVar));
                    return new android.util.Pair<>(nsVar, aVar);
                }
            }
        }
        return pair;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh
    public final void e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = this.f132115i.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f132115i.get(it.next()));
        }
        if (this.f132115i.size() != this.f132116j.size() || !this.f132115i.keySet().equals(this.f132116j.keySet())) {
            this.f132116j.clear();
            this.f132116j.putAll(this.f132115i);
            this.f132101a.a(arrayList);
        }
        if (this.f132101a.y()) {
            this.f132101a.f133199j.f132055v = true;
        }
    }

    public final void a(long j17, int i17, float f17, boolean z17) {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
                tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass88(j17, i17, f17, z17));
            }
        }
    }

    public final void a(long j17) {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
                tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass89(j17));
            }
        }
    }

    public final int d(long j17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        return java.lang.Math.max(((java.lang.Integer) tkVar.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass95>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass95(j17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass95) 0)).intValue(), 0);
    }

    public final void a(long j17, int i17) {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
                tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass96(j17, i17));
            }
        }
    }

    public final java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantInfo> c(long j17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass94 anonymousClass94 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass94(j17);
        java.lang.String[] strArr = (java.lang.String[]) tkVar.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass94>) anonymousClass94, (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass94) new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantInfo materialVariantInfo = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantInfo();
                materialVariantInfo.f16401xa08c34b0 = str;
                arrayList.add(materialVariantInfo);
            }
        }
        return arrayList;
    }

    public final void a(long j17, float f17, float f18, float f19) {
        java.util.Iterator it = this.f132102b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132101a;
                tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass97(j17, f17, f18, f19));
            }
        }
    }
}
