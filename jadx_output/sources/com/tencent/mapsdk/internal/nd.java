package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nd {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bd f50492a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.tk f50493b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap<java.lang.Integer, com.tencent.mapsdk.internal.pi> f50494c = new java.util.HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap<java.lang.Integer, com.tencent.mapsdk.internal.pi> f50495d = new java.util.HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet<java.lang.String> f50496e = new java.util.HashSet<>();

    public nd(com.tencent.mapsdk.internal.bd bdVar, com.tencent.mapsdk.internal.tk tkVar) {
        this.f50492a = bdVar;
        this.f50493b = tkVar;
    }

    private static android.graphics.Bitmap a(java.lang.String str) {
        return com.tencent.mapsdk.internal.hl.f49771b.a(str);
    }

    private void b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, com.tencent.mapsdk.internal.pi> entry : this.f50494c.entrySet()) {
            java.lang.Integer key = entry.getKey();
            entry.getValue();
            if (!this.f50495d.containsKey(key)) {
                arrayList.add(java.lang.Integer.valueOf(key.intValue()));
            }
        }
        java.util.Iterator<java.lang.String> it = this.f50496e.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.hl.f49771b.b(it.next());
        }
        this.f50496e.clear();
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "deleteIcons GIcon [" + java.util.Arrays.toString(iArr) + "]");
        this.f50493b.a(iArr, size);
    }

    private void c() {
        this.f50494c.clear();
        this.f50494c.putAll(this.f50495d);
        this.f50495d.clear();
    }

    private com.tencent.mapsdk.internal.bd d() {
        return this.f50492a;
    }

    private float e() {
        return this.f50492a.c().A.f52409b.f52443l;
    }

    private void a(com.tencent.mapsdk.internal.pi piVar) {
        int intValue;
        int a17 = piVar.I.a();
        if (a17 > 0 && this.f50494c.containsKey(java.lang.Integer.valueOf(a17))) {
            if (piVar.f50620q.get() > 0) {
                piVar.f50619p = true;
                piVar.f50620q.set(0);
            }
            if (piVar.f50619p) {
                if (piVar.e()) {
                    com.tencent.mapsdk.internal.tk tkVar = this.f50493b;
                    tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass64(a17, piVar.f()));
                } else {
                    com.tencent.mapsdk.internal.tk tkVar2 = this.f50493b;
                    if (0 != tkVar2.f51661e) {
                        tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass150(piVar));
                    }
                }
                if (piVar.B.get() > 0) {
                    piVar.A = true;
                    piVar.B.set(0);
                }
                if (piVar.A) {
                    if (!piVar.H) {
                        this.f50496e.add(piVar.f50610g);
                    }
                    com.tencent.mapsdk.internal.hl.f49771b.a(piVar.f50609f, piVar.d());
                    piVar.b(false);
                }
            }
            piVar.a(false);
            this.f50495d.put(java.lang.Integer.valueOf(a17), piVar);
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "addMarker GIcon before [" + a17 + "]");
        if (piVar.e()) {
            com.tencent.mapsdk.internal.tk tkVar3 = this.f50493b;
            intValue = ((java.lang.Integer) tkVar3.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass63>) new com.tencent.mapsdk.internal.tk.AnonymousClass63(piVar.f()), (com.tencent.mapsdk.internal.tk.AnonymousClass63) 0)).intValue();
        } else {
            com.tencent.mapsdk.internal.tk tkVar4 = this.f50493b;
            intValue = ((java.lang.Integer) tkVar4.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass149>) new com.tencent.mapsdk.internal.tk.AnonymousClass149(piVar), (com.tencent.mapsdk.internal.tk.AnonymousClass149) 0)).intValue();
        }
        piVar.I.f50679m = intValue;
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "addMarker GIcon after [" + intValue + "]");
        if (intValue > 0) {
            com.tencent.mapsdk.internal.hl.f49771b.a(piVar.f50609f, piVar.d());
            piVar.b(false);
            piVar.a(false);
            this.f50495d.put(java.lang.Integer.valueOf(intValue), piVar);
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "mCurFrameDisplayMap: " + this.f50495d.keySet());
        }
    }

    public final void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.Integer, com.tencent.mapsdk.internal.pi> entry : this.f50494c.entrySet()) {
            java.lang.Integer key = entry.getKey();
            entry.getValue();
            if (!this.f50495d.containsKey(key)) {
                arrayList.add(java.lang.Integer.valueOf(key.intValue()));
            }
        }
        java.util.Iterator<java.lang.String> it = this.f50496e.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.hl.f49771b.b(it.next());
        }
        this.f50496e.clear();
        int size = arrayList.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "deleteIcons GIcon [" + java.util.Arrays.toString(iArr) + "]");
            this.f50493b.a(iArr, size);
        }
        this.f50494c.clear();
        this.f50494c.putAll(this.f50495d);
        this.f50495d.clear();
    }
}
