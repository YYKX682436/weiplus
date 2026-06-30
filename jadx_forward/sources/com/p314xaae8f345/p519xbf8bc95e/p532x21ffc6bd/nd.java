package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class nd {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f132025a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f132026b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi> f132027c = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi> f132028d = new java.util.HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet<java.lang.String> f132029e = new java.util.HashSet<>();

    public nd(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar) {
        this.f132025a = bdVar;
        this.f132026b = tkVar;
    }

    private static android.graphics.Bitmap a(java.lang.String str) {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(str);
    }

    private void b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi> entry : this.f132027c.entrySet()) {
            java.lang.Integer key = entry.getKey();
            entry.getValue();
            if (!this.f132028d.containsKey(key)) {
                arrayList.add(java.lang.Integer.valueOf(key.intValue()));
            }
        }
        java.util.Iterator<java.lang.String> it = this.f132029e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.b(it.next());
        }
        this.f132029e.clear();
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "deleteIcons GIcon [" + java.util.Arrays.toString(iArr) + "]");
        this.f132026b.a(iArr, size);
    }

    private void c() {
        this.f132027c.clear();
        this.f132027c.putAll(this.f132028d);
        this.f132028d.clear();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd d() {
        return this.f132025a;
    }

    private float e() {
        return this.f132025a.c().A.f133942b.f133976l;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi piVar) {
        int intValue;
        int a17 = piVar.I.a();
        if (a17 > 0 && this.f132027c.containsKey(java.lang.Integer.valueOf(a17))) {
            if (piVar.f132153q.get() > 0) {
                piVar.f132152p = true;
                piVar.f132153q.set(0);
            }
            if (piVar.f132152p) {
                if (piVar.e()) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132026b;
                    tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass64(a17, piVar.f()));
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = this.f132026b;
                    if (0 != tkVar2.f133194e) {
                        tkVar2.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass150(piVar));
                    }
                }
                if (piVar.B.get() > 0) {
                    piVar.A = true;
                    piVar.B.set(0);
                }
                if (piVar.A) {
                    if (!piVar.H) {
                        this.f132029e.add(piVar.f132143g);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(piVar.f132142f, piVar.d());
                    piVar.b(false);
                }
            }
            piVar.a(false);
            this.f132028d.put(java.lang.Integer.valueOf(a17), piVar);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "addMarker GIcon before [" + a17 + "]");
        if (piVar.e()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar3 = this.f132026b;
            intValue = ((java.lang.Integer) tkVar3.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass63>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass63(piVar.f()), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass63) 0)).intValue();
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar4 = this.f132026b;
            intValue = ((java.lang.Integer) tkVar4.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass149>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass149(piVar), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass149) 0)).intValue();
        }
        piVar.I.f132212m = intValue;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "addMarker GIcon after [" + intValue + "]");
        if (intValue > 0) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(piVar.f132142f, piVar.d());
            piVar.b(false);
            piVar.a(false);
            this.f132028d.put(java.lang.Integer.valueOf(intValue), piVar);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "mCurFrameDisplayMap: " + this.f132028d.keySet());
        }
    }

    public final void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi> entry : this.f132027c.entrySet()) {
            java.lang.Integer key = entry.getKey();
            entry.getValue();
            if (!this.f132028d.containsKey(key)) {
                arrayList.add(java.lang.Integer.valueOf(key.intValue()));
            }
        }
        java.util.Iterator<java.lang.String> it = this.f132029e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.b(it.next());
        }
        this.f132029e.clear();
        int size = arrayList.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "deleteIcons GIcon [" + java.util.Arrays.toString(iArr) + "]");
            this.f132026b.a(iArr, size);
        }
        this.f132027c.clear();
        this.f132027c.putAll(this.f132028d);
        this.f132028d.clear();
    }
}
