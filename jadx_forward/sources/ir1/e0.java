package ir1;

/* loaded from: classes11.dex */
public final class e0 extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f375491e;

    /* renamed from: f, reason: collision with root package name */
    public final int f375492f;

    /* renamed from: g, reason: collision with root package name */
    public final int f375493g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f375494h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f375495i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f375496m;

    /* renamed from: n, reason: collision with root package name */
    public final x.g f375497n;

    /* renamed from: o, reason: collision with root package name */
    public ir1.w f375498o;

    /* renamed from: p, reason: collision with root package name */
    public ir1.v f375499p;

    public e0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f375491e = fragment;
        this.f375492f = i17;
        this.f375493g = i18;
        this.f375494h = new java.util.ArrayList();
        this.f375495i = new java.util.HashMap();
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newKeySet, "newKeySet(...)");
        this.f375496m = newKeySet;
        this.f375497n = new x.g(50);
    }

    public static final void B(ir1.e0 e0Var, hr1.e eVar) {
        int i17;
        int i18;
        java.util.HashMap hashMap = e0Var.f375495i;
        hr1.e eVar2 = (hr1.e) hashMap.get(eVar.f66326xbed8694c);
        java.util.ArrayList arrayList = e0Var.f375494h;
        int c07 = kz5.n0.c0(arrayList, eVar2);
        if (c07 >= 0) {
            arrayList.remove(c07);
            e0Var.m8155x27702c4(c07);
        }
        eVar.u0();
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((hr1.e) listIterator.previous()).f66323xa97e89ae > 0) {
                    i18 = listIterator.nextIndex();
                    break;
                }
            } else {
                i18 = -1;
                break;
            }
        }
        int i19 = i18 < 0 ? 0 : i18 + 1;
        if (eVar.f66323xa97e89ae > 0) {
            for (i17 = 0; i17 < i19; i17++) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                hr1.e eVar3 = (hr1.e) obj;
                long j17 = eVar.f66323xa97e89ae;
                long j18 = eVar3.f66323xa97e89ae;
                if (j17 > j18 || (j17 == j18 && eVar.f66331xa783a79b > eVar3.f66331xa783a79b)) {
                    i19 = i17;
                    break;
                }
            }
        }
        arrayList.add(i19, eVar);
        e0Var.m8149x8b456734(i19);
        hashMap.remove(eVar.f66326xbed8694c);
        java.lang.String field_sessionId = eVar.f66326xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        hashMap.put(field_sessionId, eVar);
    }

    public final void E(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.util.HashMap hashMap = this.f375495i;
        hr1.e eVar = (hr1.e) hashMap.get(sessionId);
        java.util.ArrayList arrayList = this.f375494h;
        int c07 = kz5.n0.c0(arrayList, eVar);
        if (c07 < 0 || c07 >= arrayList.size()) {
            return;
        }
        arrayList.remove(c07);
        hashMap.remove(sessionId);
        this.f375497n.m174741xc84af884(sessionId);
        m8155x27702c4(c07);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f375494h.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r29, int r30) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.e0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f375491e.mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dze, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        ir1.u uVar = new ir1.u(inflate);
        android.view.View view = uVar.f3639x46306858;
        view.setOnLongClickListener(new ir1.b0(uVar, this, view));
        view.setOnClickListener(new ir1.c0(uVar, this, view));
        return uVar;
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f375494h;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convs, "convs");
        if (this.f375493g == 1) {
            java.util.Iterator it = convs.iterator();
            while (it.hasNext()) {
                hr1.e eVar = (hr1.e) it.next();
                java.lang.String str = eVar.f66326xbed8694c;
                if (!(str == null || str.length() == 0)) {
                    java.util.Set set = this.f375496m;
                    java.lang.String field_sessionId = eVar.f66326xbed8694c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                    ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).add(field_sessionId);
                }
            }
        }
        pm0.v.X(new ir1.d0(this, convs, z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    @Override // wn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(java.lang.String r8, l75.w0 r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir1.e0.z(java.lang.String, l75.w0):boolean");
    }
}
