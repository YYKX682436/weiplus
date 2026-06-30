package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class iy extends com.tencent.mapsdk.internal.iw {

    /* renamed from: c, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.iw> f49931c = new java.util.ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<com.tencent.mapsdk.internal.iw, com.tencent.mapsdk.internal.iy.e> f49932d = new java.util.HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f49933e = new java.util.ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f49934f = new java.util.ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f49935g = true;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.iy.a f49936h = null;

    /* renamed from: b, reason: collision with root package name */
    boolean f49930b = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f49937i = false;

    /* renamed from: j, reason: collision with root package name */
    private long f49938j = 0;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.mapsdk.internal.jl f49939k = null;

    /* renamed from: l, reason: collision with root package name */
    private long f49940l = -1;

    /* loaded from: classes16.dex */
    public class a implements com.tencent.mapsdk.internal.iw.a {

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy f49945b;

        public a(com.tencent.mapsdk.internal.iy iyVar) {
            this.f49945b = iyVar;
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a(com.tencent.mapsdk.internal.iw iwVar) {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a() {
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
            com.tencent.mapsdk.internal.iy iyVar = com.tencent.mapsdk.internal.iy.this;
            if (iyVar.f49930b || iyVar.f49931c.size() != 0 || (arrayList = com.tencent.mapsdk.internal.iy.this.f49929a) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mapsdk.internal.iy.this.f49929a.get(i17).a();
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b(com.tencent.mapsdk.internal.iw iwVar) {
            iwVar.b(this);
            com.tencent.mapsdk.internal.iy.this.f49931c.remove(iwVar);
            boolean z17 = true;
            ((com.tencent.mapsdk.internal.iy.e) this.f49945b.f49932d.get(iwVar)).f49960f = true;
            if (com.tencent.mapsdk.internal.iy.this.f49930b) {
                return;
            }
            java.util.ArrayList arrayList = this.f49945b.f49934f;
            int size = arrayList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (!((com.tencent.mapsdk.internal.iy.e) arrayList.get(i17)).f49960f) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = com.tencent.mapsdk.internal.iy.this.f49929a;
                if (arrayList2 != null) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) arrayList2.clone();
                    int size2 = arrayList3.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        ((com.tencent.mapsdk.internal.iw.a) arrayList3.get(i18)).b(this.f49945b);
                    }
                }
                com.tencent.mapsdk.internal.iy.d(this.f49945b);
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        static final int f49948a = 0;

        /* renamed from: b, reason: collision with root package name */
        static final int f49949b = 1;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.mapsdk.internal.iy.e f49950c;

        /* renamed from: d, reason: collision with root package name */
        public int f49951d;

        public c(com.tencent.mapsdk.internal.iy.e eVar, int i17) {
            this.f49950c = eVar;
            this.f49951d = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class d implements com.tencent.mapsdk.internal.iw.a {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy f49952a;

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy.e f49953b;

        /* renamed from: c, reason: collision with root package name */
        private int f49954c;

        public d(com.tencent.mapsdk.internal.iy iyVar, com.tencent.mapsdk.internal.iy.e eVar, int i17) {
            this.f49952a = iyVar;
            this.f49953b = eVar;
            this.f49954c = i17;
        }

        private void c(com.tencent.mapsdk.internal.iw iwVar) {
            com.tencent.mapsdk.internal.iy.c cVar;
            if (this.f49952a.f49930b) {
                return;
            }
            int size = this.f49953b.f49957c.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    cVar = null;
                    break;
                }
                cVar = this.f49953b.f49957c.get(i17);
                if (cVar.f49951d == this.f49954c && cVar.f49950c.f49955a == iwVar) {
                    iwVar.b(this);
                    break;
                }
                i17++;
            }
            this.f49953b.f49957c.remove(cVar);
            if (this.f49953b.f49957c.size() == 0) {
                this.f49953b.f49955a.a();
                this.f49952a.f49931c.add(this.f49953b.f49955a);
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a(com.tencent.mapsdk.internal.iw iwVar) {
            if (this.f49954c == 0) {
                c(iwVar);
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b(com.tencent.mapsdk.internal.iw iwVar) {
            if (this.f49954c == 1) {
                c(iwVar);
            }
        }
    }

    public static /* synthetic */ boolean d(com.tencent.mapsdk.internal.iy iyVar) {
        iyVar.f49937i = false;
        return false;
    }

    private java.util.ArrayList<com.tencent.mapsdk.internal.iw> i() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f49955a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.iw
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.internal.iy clone() {
        com.tencent.mapsdk.internal.iy iyVar = (com.tencent.mapsdk.internal.iy) super.clone();
        iyVar.f49935g = true;
        iyVar.f49930b = false;
        iyVar.f49937i = false;
        iyVar.f49931c = new java.util.ArrayList<>();
        iyVar.f49932d = new java.util.HashMap<>();
        iyVar.f49933e = new java.util.ArrayList<>();
        iyVar.f49934f = new java.util.ArrayList<>();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.iy.e next = it.next();
            com.tencent.mapsdk.internal.iy.e clone = next.clone();
            hashMap.put(next, clone);
            iyVar.f49933e.add(clone);
            iyVar.f49932d.put(clone.f49955a, clone);
            java.util.ArrayList arrayList = null;
            clone.f49956b = null;
            clone.f49957c = null;
            clone.f49959e = null;
            clone.f49958d = null;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = clone.f49955a.f49929a;
            if (arrayList2 != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.iw.a> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    com.tencent.mapsdk.internal.iw.a next2 = it6.next();
                    if (next2 instanceof com.tencent.mapsdk.internal.iy.a) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        arrayList2.remove((com.tencent.mapsdk.internal.iw.a) it7.next());
                    }
                }
            }
        }
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it8 = this.f49933e.iterator();
        while (it8.hasNext()) {
            com.tencent.mapsdk.internal.iy.e next3 = it8.next();
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) hashMap.get(next3);
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = next3.f49956b;
            if (arrayList3 != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.c> it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    com.tencent.mapsdk.internal.iy.c next4 = it9.next();
                    eVar.a(new com.tencent.mapsdk.internal.iy.c((com.tencent.mapsdk.internal.iy.e) hashMap.get(next4.f49950c), next4.f49951d));
                }
            }
        }
        return iyVar;
    }

    private void k() {
        if (!this.f49935g) {
            int size = this.f49933e.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mapsdk.internal.iy.e eVar = this.f49933e.get(i17);
                java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList = eVar.f49956b;
                if (arrayList != null && arrayList.size() > 0) {
                    int size2 = eVar.f49956b.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        com.tencent.mapsdk.internal.iy.c cVar = eVar.f49956b.get(i18);
                        if (eVar.f49958d == null) {
                            eVar.f49958d = new java.util.ArrayList<>();
                        }
                        if (!eVar.f49958d.contains(cVar.f49950c)) {
                            eVar.f49958d.add(cVar.f49950c);
                        }
                    }
                }
                eVar.f49960f = false;
            }
            return;
        }
        this.f49934f.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size3 = this.f49933e.size();
        for (int i19 = 0; i19 < size3; i19++) {
            com.tencent.mapsdk.internal.iy.e eVar2 = this.f49933e.get(i19);
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = eVar2.f49956b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(eVar2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        while (arrayList2.size() > 0) {
            int size4 = arrayList2.size();
            for (int i27 = 0; i27 < size4; i27++) {
                com.tencent.mapsdk.internal.iy.e eVar3 = (com.tencent.mapsdk.internal.iy.e) arrayList2.get(i27);
                this.f49934f.add(eVar3);
                java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> arrayList5 = eVar3.f49959e;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i28 = 0; i28 < size5; i28++) {
                        com.tencent.mapsdk.internal.iy.e eVar4 = eVar3.f49959e.get(i28);
                        eVar4.f49958d.remove(eVar3);
                        if (eVar4.f49958d.size() == 0) {
                            arrayList4.add(eVar4);
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            arrayList4.clear();
        }
        this.f49935g = false;
        if (this.f49934f.size() != this.f49933e.size()) {
            throw new java.lang.IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean f() {
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
        while (it.hasNext()) {
            if (it.next().f49955a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean g() {
        return this.f49937i;
    }

    private void a(com.tencent.mapsdk.internal.iw... iwVarArr) {
        if (iwVarArr != null) {
            this.f49935g = true;
            com.tencent.mapsdk.internal.iy.b a17 = a(iwVarArr[0]);
            for (int i17 = 1; i17 < iwVarArr.length; i17++) {
                a17.a(iwVarArr[i17]);
            }
        }
    }

    private void b(com.tencent.mapsdk.internal.iw... iwVarArr) {
        if (iwVarArr != null) {
            this.f49935g = true;
            int i17 = 0;
            if (iwVarArr.length == 1) {
                a(iwVarArr[0]);
                return;
            }
            while (i17 < iwVarArr.length - 1) {
                com.tencent.mapsdk.internal.iy.b a17 = a(iwVarArr[i17]);
                i17++;
                a17.b(iwVarArr[i17]);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void c() {
        this.f49930b = true;
        if (this.f49937i) {
            if (this.f49934f.size() != this.f49933e.size()) {
                k();
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49934f.iterator();
                while (it.hasNext()) {
                    com.tencent.mapsdk.internal.iy.e next = it.next();
                    if (this.f49936h == null) {
                        this.f49936h = new com.tencent.mapsdk.internal.iy.a(this);
                    }
                    next.f49955a.a(this.f49936h);
                }
            }
            com.tencent.mapsdk.internal.jl jlVar = this.f49939k;
            if (jlVar != null) {
                jlVar.b();
            }
            if (this.f49934f.size() > 0) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it6 = this.f49934f.iterator();
                while (it6.hasNext()) {
                    it6.next().f49955a.c();
                }
            }
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f49929a;
            if (arrayList != null) {
                java.util.Iterator it7 = ((java.util.ArrayList) arrayList.clone()).iterator();
                while (it7.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it7.next()).b(this);
                }
            }
            this.f49937i = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final long d() {
        return this.f49938j;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final long e() {
        return this.f49940l;
    }

    /* loaded from: classes16.dex */
    public class b {

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy.e f49947b;

        public b(com.tencent.mapsdk.internal.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.tencent.mapsdk.internal.iy.this.f49932d.get(iwVar);
            this.f49947b = eVar;
            if (eVar == null) {
                this.f49947b = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.tencent.mapsdk.internal.iy.this.f49932d.put(iwVar, this.f49947b);
                com.tencent.mapsdk.internal.iy.this.f49933e.add(this.f49947b);
            }
        }

        private com.tencent.mapsdk.internal.iy.b c(com.tencent.mapsdk.internal.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.tencent.mapsdk.internal.iy.this.f49932d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.tencent.mapsdk.internal.iy.this.f49932d.put(iwVar, eVar);
                com.tencent.mapsdk.internal.iy.this.f49933e.add(eVar);
            }
            this.f49947b.a(new com.tencent.mapsdk.internal.iy.c(eVar, 1));
            return this;
        }

        public final com.tencent.mapsdk.internal.iy.b a(com.tencent.mapsdk.internal.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.tencent.mapsdk.internal.iy.this.f49932d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.tencent.mapsdk.internal.iy.this.f49932d.put(iwVar, eVar);
                com.tencent.mapsdk.internal.iy.this.f49933e.add(eVar);
            }
            eVar.a(new com.tencent.mapsdk.internal.iy.c(this.f49947b, 0));
            return this;
        }

        public final com.tencent.mapsdk.internal.iy.b b(com.tencent.mapsdk.internal.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.tencent.mapsdk.internal.iy.this.f49932d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.tencent.mapsdk.internal.iy.this.f49932d.put(iwVar, eVar);
                com.tencent.mapsdk.internal.iy.this.f49933e.add(eVar);
            }
            eVar.a(new com.tencent.mapsdk.internal.iy.c(this.f49947b, 1));
            return this;
        }

        private com.tencent.mapsdk.internal.iy.b a(long j17) {
            com.tencent.mapsdk.internal.jl b17 = com.tencent.mapsdk.internal.jl.b(0.0d, 1.0d);
            b17.b(j17);
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.tencent.mapsdk.internal.iy.this.f49932d.get(b17);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(b17);
                com.tencent.mapsdk.internal.iy.this.f49932d.put(b17, eVar);
                com.tencent.mapsdk.internal.iy.this.f49933e.add(eVar);
            }
            this.f49947b.a(new com.tencent.mapsdk.internal.iy.c(eVar, 1));
            return this;
        }
    }

    private void a(java.util.Collection<com.tencent.mapsdk.internal.iw> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f49935g = true;
        com.tencent.mapsdk.internal.iy.b bVar = null;
        for (com.tencent.mapsdk.internal.iw iwVar : collection) {
            if (bVar == null) {
                bVar = a(iwVar);
            } else {
                bVar.a(iwVar);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void b() {
        java.util.ArrayList arrayList;
        this.f49930b = true;
        if (this.f49937i) {
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = this.f49929a;
            if (arrayList2 != null) {
                arrayList = (java.util.ArrayList) arrayList2.clone();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it.next()).a();
                }
            } else {
                arrayList = null;
            }
            com.tencent.mapsdk.internal.jl jlVar = this.f49939k;
            if (jlVar != null && jlVar.f()) {
                this.f49939k.b();
            } else if (this.f49934f.size() > 0) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it6 = this.f49934f.iterator();
                while (it6.hasNext()) {
                    it6.next().f49955a.b();
                }
            }
            if (arrayList != null) {
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it7.next()).b(this);
                }
            }
            this.f49937i = false;
        }
    }

    /* loaded from: classes16.dex */
    public static class e implements java.lang.Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.mapsdk.internal.iw f49955a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> f49956b = null;

        /* renamed from: c, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> f49957c = null;

        /* renamed from: d, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f49958d = null;

        /* renamed from: e, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f49959e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f49960f = false;

        public e(com.tencent.mapsdk.internal.iw iwVar) {
            this.f49955a = iwVar;
        }

        public final void a(com.tencent.mapsdk.internal.iy.c cVar) {
            if (this.f49956b == null) {
                this.f49956b = new java.util.ArrayList<>();
                this.f49958d = new java.util.ArrayList<>();
            }
            this.f49956b.add(cVar);
            if (!this.f49958d.contains(cVar.f49950c)) {
                this.f49958d.add(cVar.f49950c);
            }
            com.tencent.mapsdk.internal.iy.e eVar = cVar.f49950c;
            if (eVar.f49959e == null) {
                eVar.f49959e = new java.util.ArrayList<>();
            }
            eVar.f49959e.add(this);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mapsdk.internal.iy.e clone() {
            try {
                com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) super.clone();
                eVar.f49955a = this.f49955a.clone();
                return eVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                throw new java.lang.AssertionError();
            }
        }
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.iw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f49935g = true;
        int i17 = 0;
        if (list.size() == 1) {
            a(list.get(0));
            return;
        }
        while (i17 < list.size() - 1) {
            com.tencent.mapsdk.internal.iy.b a17 = a(list.get(i17));
            i17++;
            a17.b(list.get(i17));
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a(android.view.animation.Interpolator interpolator) {
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
        while (it.hasNext()) {
            it.next().f49955a.a(interpolator);
        }
    }

    private com.tencent.mapsdk.internal.iy.b a(com.tencent.mapsdk.internal.iw iwVar) {
        if (iwVar == null) {
            return null;
        }
        this.f49935g = true;
        return new com.tencent.mapsdk.internal.iy.b(iwVar);
    }

    private com.tencent.mapsdk.internal.iy c(long j17) {
        if (j17 >= 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
            while (it.hasNext()) {
                it.next().f49955a.b(j17);
            }
            this.f49940l = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a(long j17) {
        this.f49938j = j17;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final /* synthetic */ com.tencent.mapsdk.internal.iw b(long j17) {
        if (j17 >= 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f49933e.iterator();
            while (it.hasNext()) {
                it.next().f49955a.b(j17);
            }
            this.f49940l = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a() {
        this.f49930b = false;
        this.f49937i = true;
        k();
        int size = this.f49934f.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.iy.e eVar = this.f49934f.get(i17);
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = eVar.f49955a.f49929a;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    com.tencent.mapsdk.internal.iw.a aVar = (com.tencent.mapsdk.internal.iw.a) it.next();
                    if ((aVar instanceof com.tencent.mapsdk.internal.iy.d) || (aVar instanceof com.tencent.mapsdk.internal.iy.a)) {
                        eVar.f49955a.b(aVar);
                    }
                }
            }
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mapsdk.internal.iy.e eVar2 = this.f49934f.get(i18);
            if (this.f49936h == null) {
                this.f49936h = new com.tencent.mapsdk.internal.iy.a(this);
            }
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = eVar2.f49956b;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size2 = eVar2.f49956b.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    com.tencent.mapsdk.internal.iy.c cVar = eVar2.f49956b.get(i19);
                    cVar.f49950c.f49955a.a(new com.tencent.mapsdk.internal.iy.d(this, eVar2, cVar.f49951d));
                }
                eVar2.f49957c = (java.util.ArrayList) eVar2.f49956b.clone();
            } else {
                arrayList2.add(eVar2);
            }
            eVar2.f49955a.a(this.f49936h);
        }
        if (this.f49938j <= 0) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mapsdk.internal.iy.e eVar3 = (com.tencent.mapsdk.internal.iy.e) it6.next();
                eVar3.f49955a.a();
                this.f49931c.add(eVar3.f49955a);
            }
        } else {
            com.tencent.mapsdk.internal.jl b17 = com.tencent.mapsdk.internal.jl.b(0.0d, 1.0d);
            this.f49939k = b17;
            b17.b(this.f49938j);
            this.f49939k.a(new com.tencent.mapsdk.internal.ix() { // from class: com.tencent.mapsdk.internal.iy.1

                /* renamed from: a, reason: collision with root package name */
                boolean f49941a = false;

                @Override // com.tencent.mapsdk.internal.ix, com.tencent.mapsdk.internal.iw.a
                public final void a() {
                    this.f49941a = true;
                }

                @Override // com.tencent.mapsdk.internal.ix, com.tencent.mapsdk.internal.iw.a
                public final void b(com.tencent.mapsdk.internal.iw iwVar) {
                    if (this.f49941a) {
                        return;
                    }
                    int size3 = arrayList2.size();
                    for (int i27 = 0; i27 < size3; i27++) {
                        com.tencent.mapsdk.internal.iy.e eVar4 = (com.tencent.mapsdk.internal.iy.e) arrayList2.get(i27);
                        eVar4.f49955a.a();
                        com.tencent.mapsdk.internal.iy.this.f49931c.add(eVar4.f49955a);
                    }
                }
            });
            this.f49939k.a();
        }
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList4 = this.f49929a;
        if (arrayList4 != null) {
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i27 = 0; i27 < size3; i27++) {
                ((com.tencent.mapsdk.internal.iw.a) arrayList5.get(i27)).a(this);
            }
        }
        if (this.f49933e.size() == 0 && this.f49938j == 0) {
            this.f49937i = false;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList6 = this.f49929a;
            if (arrayList6 != null) {
                java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.clone();
                int size4 = arrayList7.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    ((com.tencent.mapsdk.internal.iw.a) arrayList7.get(i28)).b(this);
                }
            }
        }
    }
}
