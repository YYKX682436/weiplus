package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class iy extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw {

    /* renamed from: c, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw> f131464c = new java.util.ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw, com.tencent.mapsdk.internal.iy.e> f131465d = new java.util.HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f131466e = new java.util.ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f131467f = new java.util.ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f131468g = true;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.iy.a f131469h = null;

    /* renamed from: b, reason: collision with root package name */
    boolean f131463b = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f131470i = false;

    /* renamed from: j, reason: collision with root package name */
    private long f131471j = 0;

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl f131472k = null;

    /* renamed from: l, reason: collision with root package name */
    private long f131473l = -1;

    /* loaded from: classes16.dex */
    public class a implements com.tencent.mapsdk.internal.iw.a {

        /* renamed from: b, reason: collision with root package name */
        private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy f131478b;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy iyVar) {
            this.f131478b = iyVar;
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a() {
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy iyVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this;
            if (iyVar.f131463b || iyVar.f131464c.size() != 0 || (arrayList = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131462a) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131462a.get(i17).a();
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            iwVar.b(this);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131464c.remove(iwVar);
            boolean z17 = true;
            ((com.tencent.mapsdk.internal.iy.e) this.f131478b.f131465d.get(iwVar)).f131493f = true;
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131463b) {
                return;
            }
            java.util.ArrayList arrayList = this.f131478b.f131467f;
            int size = arrayList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (!((com.tencent.mapsdk.internal.iy.e) arrayList.get(i17)).f131493f) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131462a;
                if (arrayList2 != null) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) arrayList2.clone();
                    int size2 = arrayList3.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        ((com.tencent.mapsdk.internal.iw.a) arrayList3.get(i18)).b(this.f131478b);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.d(this.f131478b);
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        static final int f131481a = 0;

        /* renamed from: b, reason: collision with root package name */
        static final int f131482b = 1;

        /* renamed from: c, reason: collision with root package name */
        public com.tencent.mapsdk.internal.iy.e f131483c;

        /* renamed from: d, reason: collision with root package name */
        public int f131484d;

        public c(com.tencent.mapsdk.internal.iy.e eVar, int i17) {
            this.f131483c = eVar;
            this.f131484d = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class d implements com.tencent.mapsdk.internal.iw.a {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy f131485a;

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy.e f131486b;

        /* renamed from: c, reason: collision with root package name */
        private int f131487c;

        public d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy iyVar, com.tencent.mapsdk.internal.iy.e eVar, int i17) {
            this.f131485a = iyVar;
            this.f131486b = eVar;
            this.f131487c = i17;
        }

        private void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            com.tencent.mapsdk.internal.iy.c cVar;
            if (this.f131485a.f131463b) {
                return;
            }
            int size = this.f131486b.f131490c.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    cVar = null;
                    break;
                }
                cVar = this.f131486b.f131490c.get(i17);
                if (cVar.f131484d == this.f131487c && cVar.f131483c.f131488a == iwVar) {
                    iwVar.b(this);
                    break;
                }
                i17++;
            }
            this.f131486b.f131490c.remove(cVar);
            if (this.f131486b.f131490c.size() == 0) {
                this.f131486b.f131488a.a();
                this.f131485a.f131464c.add(this.f131486b.f131488a);
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b() {
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            if (this.f131487c == 0) {
                c(iwVar);
            }
        }

        @Override // com.tencent.mapsdk.internal.iw.a
        public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            if (this.f131487c == 1) {
                c(iwVar);
            }
        }
    }

    public static /* synthetic */ boolean d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy iyVar) {
        iyVar.f131470i = false;
        return false;
    }

    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw> i() {
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f131488a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy mo36792x5a5dd5d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy iyVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy) super.mo36792x5a5dd5d();
        iyVar.f131468g = true;
        iyVar.f131463b = false;
        iyVar.f131470i = false;
        iyVar.f131464c = new java.util.ArrayList<>();
        iyVar.f131465d = new java.util.HashMap<>();
        iyVar.f131466e = new java.util.ArrayList<>();
        iyVar.f131467f = new java.util.ArrayList<>();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.iy.e next = it.next();
            com.tencent.mapsdk.internal.iy.e m36793x5a5dd5d = next.m36793x5a5dd5d();
            hashMap.put(next, m36793x5a5dd5d);
            iyVar.f131466e.add(m36793x5a5dd5d);
            iyVar.f131465d.put(m36793x5a5dd5d.f131488a, m36793x5a5dd5d);
            java.util.ArrayList arrayList = null;
            m36793x5a5dd5d.f131489b = null;
            m36793x5a5dd5d.f131490c = null;
            m36793x5a5dd5d.f131492e = null;
            m36793x5a5dd5d.f131491d = null;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = m36793x5a5dd5d.f131488a.f131462a;
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
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it8 = this.f131466e.iterator();
        while (it8.hasNext()) {
            com.tencent.mapsdk.internal.iy.e next3 = it8.next();
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) hashMap.get(next3);
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = next3.f131489b;
            if (arrayList3 != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.c> it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    com.tencent.mapsdk.internal.iy.c next4 = it9.next();
                    eVar.a(new com.tencent.mapsdk.internal.iy.c((com.tencent.mapsdk.internal.iy.e) hashMap.get(next4.f131483c), next4.f131484d));
                }
            }
        }
        return iyVar;
    }

    private void k() {
        if (!this.f131468g) {
            int size = this.f131466e.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mapsdk.internal.iy.e eVar = this.f131466e.get(i17);
                java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList = eVar.f131489b;
                if (arrayList != null && arrayList.size() > 0) {
                    int size2 = eVar.f131489b.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        com.tencent.mapsdk.internal.iy.c cVar = eVar.f131489b.get(i18);
                        if (eVar.f131491d == null) {
                            eVar.f131491d = new java.util.ArrayList<>();
                        }
                        if (!eVar.f131491d.contains(cVar.f131483c)) {
                            eVar.f131491d.add(cVar.f131483c);
                        }
                    }
                }
                eVar.f131493f = false;
            }
            return;
        }
        this.f131467f.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size3 = this.f131466e.size();
        for (int i19 = 0; i19 < size3; i19++) {
            com.tencent.mapsdk.internal.iy.e eVar2 = this.f131466e.get(i19);
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = eVar2.f131489b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(eVar2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        while (arrayList2.size() > 0) {
            int size4 = arrayList2.size();
            for (int i27 = 0; i27 < size4; i27++) {
                com.tencent.mapsdk.internal.iy.e eVar3 = (com.tencent.mapsdk.internal.iy.e) arrayList2.get(i27);
                this.f131467f.add(eVar3);
                java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> arrayList5 = eVar3.f131492e;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i28 = 0; i28 < size5; i28++) {
                        com.tencent.mapsdk.internal.iy.e eVar4 = eVar3.f131492e.get(i28);
                        eVar4.f131491d.remove(eVar3);
                        if (eVar4.f131491d.size() == 0) {
                            arrayList4.add(eVar4);
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            arrayList4.clear();
        }
        this.f131468g = false;
        if (this.f131467f.size() != this.f131466e.size()) {
            throw new java.lang.IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final boolean f() {
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
        while (it.hasNext()) {
            if (it.next().f131488a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final boolean g() {
        return this.f131470i;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw... iwVarArr) {
        if (iwVarArr != null) {
            this.f131468g = true;
            com.tencent.mapsdk.internal.iy.b a17 = a(iwVarArr[0]);
            for (int i17 = 1; i17 < iwVarArr.length; i17++) {
                a17.a(iwVarArr[i17]);
            }
        }
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw... iwVarArr) {
        if (iwVarArr != null) {
            this.f131468g = true;
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void c() {
        this.f131463b = true;
        if (this.f131470i) {
            if (this.f131467f.size() != this.f131466e.size()) {
                k();
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131467f.iterator();
                while (it.hasNext()) {
                    com.tencent.mapsdk.internal.iy.e next = it.next();
                    if (this.f131469h == null) {
                        this.f131469h = new com.tencent.mapsdk.internal.iy.a(this);
                    }
                    next.f131488a.a(this.f131469h);
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = this.f131472k;
            if (jlVar != null) {
                jlVar.b();
            }
            if (this.f131467f.size() > 0) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it6 = this.f131467f.iterator();
                while (it6.hasNext()) {
                    it6.next().f131488a.c();
                }
            }
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f131462a;
            if (arrayList != null) {
                java.util.Iterator it7 = ((java.util.ArrayList) arrayList.clone()).iterator();
                while (it7.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it7.next()).b(this);
                }
            }
            this.f131470i = false;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final long d() {
        return this.f131471j;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final long e() {
        return this.f131473l;
    }

    /* loaded from: classes16.dex */
    public class b {

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.iy.e f131480b;

        public b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.get(iwVar);
            this.f131480b = eVar;
            if (eVar == null) {
                this.f131480b = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.put(iwVar, this.f131480b);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131466e.add(this.f131480b);
            }
        }

        private com.tencent.mapsdk.internal.iy.b c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.put(iwVar, eVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131466e.add(eVar);
            }
            this.f131480b.a(new com.tencent.mapsdk.internal.iy.c(eVar, 1));
            return this;
        }

        public final com.tencent.mapsdk.internal.iy.b a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.put(iwVar, eVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131466e.add(eVar);
            }
            eVar.a(new com.tencent.mapsdk.internal.iy.c(this.f131480b, 0));
            return this;
        }

        public final com.tencent.mapsdk.internal.iy.b b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.get(iwVar);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(iwVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.put(iwVar, eVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131466e.add(eVar);
            }
            eVar.a(new com.tencent.mapsdk.internal.iy.c(this.f131480b, 1));
            return this;
        }

        private com.tencent.mapsdk.internal.iy.b a(long j17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.b(0.0d, 1.0d);
            b17.b(j17);
            com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.get(b17);
            if (eVar == null) {
                eVar = new com.tencent.mapsdk.internal.iy.e(b17);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131465d.put(b17, eVar);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131466e.add(eVar);
            }
            this.f131480b.a(new com.tencent.mapsdk.internal.iy.c(eVar, 1));
            return this;
        }
    }

    private void a(java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f131468g = true;
        com.tencent.mapsdk.internal.iy.b bVar = null;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar : collection) {
            if (bVar == null) {
                bVar = a(iwVar);
            } else {
                bVar.a(iwVar);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void b() {
        java.util.ArrayList arrayList;
        this.f131463b = true;
        if (this.f131470i) {
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList2 = this.f131462a;
            if (arrayList2 != null) {
                arrayList = (java.util.ArrayList) arrayList2.clone();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it.next()).a();
                }
            } else {
                arrayList = null;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = this.f131472k;
            if (jlVar != null && jlVar.f()) {
                this.f131472k.b();
            } else if (this.f131467f.size() > 0) {
                java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it6 = this.f131467f.iterator();
                while (it6.hasNext()) {
                    it6.next().f131488a.b();
                }
            }
            if (arrayList != null) {
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it7.next()).b(this);
                }
            }
            this.f131470i = false;
        }
    }

    /* loaded from: classes16.dex */
    public static class e implements java.lang.Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw f131488a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> f131489b = null;

        /* renamed from: c, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> f131490c = null;

        /* renamed from: d, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f131491d = null;

        /* renamed from: e, reason: collision with root package name */
        public java.util.ArrayList<com.tencent.mapsdk.internal.iy.e> f131492e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f131493f = false;

        public e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
            this.f131488a = iwVar;
        }

        public final void a(com.tencent.mapsdk.internal.iy.c cVar) {
            if (this.f131489b == null) {
                this.f131489b = new java.util.ArrayList<>();
                this.f131491d = new java.util.ArrayList<>();
            }
            this.f131489b.add(cVar);
            if (!this.f131491d.contains(cVar.f131483c)) {
                this.f131491d.add(cVar.f131483c);
            }
            com.tencent.mapsdk.internal.iy.e eVar = cVar.f131483c;
            if (eVar.f131492e == null) {
                eVar.f131492e = new java.util.ArrayList<>();
            }
            eVar.f131492e.add(this);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mapsdk.internal.iy.e m36793x5a5dd5d() {
            try {
                com.tencent.mapsdk.internal.iy.e eVar = (com.tencent.mapsdk.internal.iy.e) super.clone();
                eVar.f131488a = this.f131488a.mo36792x5a5dd5d();
                return eVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                throw new java.lang.AssertionError();
            }
        }
    }

    private void a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f131468g = true;
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a(android.view.animation.Interpolator interpolator) {
        java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
        while (it.hasNext()) {
            it.next().f131488a.a(interpolator);
        }
    }

    private com.tencent.mapsdk.internal.iy.b a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
        if (iwVar == null) {
            return null;
        }
        this.f131468g = true;
        return new com.tencent.mapsdk.internal.iy.b(iwVar);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy c(long j17) {
        if (j17 >= 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
            while (it.hasNext()) {
                it.next().f131488a.b(j17);
            }
            this.f131473l = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a(long j17) {
        this.f131471j = j17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw b(long j17) {
        if (j17 >= 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.iy.e> it = this.f131466e.iterator();
            while (it.hasNext()) {
                it.next().f131488a.b(j17);
            }
            this.f131473l = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a() {
        this.f131463b = false;
        this.f131470i = true;
        k();
        int size = this.f131467f.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.iy.e eVar = this.f131467f.get(i17);
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = eVar.f131488a.f131462a;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    com.tencent.mapsdk.internal.iw.a aVar = (com.tencent.mapsdk.internal.iw.a) it.next();
                    if ((aVar instanceof com.tencent.mapsdk.internal.iy.d) || (aVar instanceof com.tencent.mapsdk.internal.iy.a)) {
                        eVar.f131488a.b(aVar);
                    }
                }
            }
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mapsdk.internal.iy.e eVar2 = this.f131467f.get(i18);
            if (this.f131469h == null) {
                this.f131469h = new com.tencent.mapsdk.internal.iy.a(this);
            }
            java.util.ArrayList<com.tencent.mapsdk.internal.iy.c> arrayList3 = eVar2.f131489b;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size2 = eVar2.f131489b.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    com.tencent.mapsdk.internal.iy.c cVar = eVar2.f131489b.get(i19);
                    cVar.f131483c.f131488a.a(new com.tencent.mapsdk.internal.iy.d(this, eVar2, cVar.f131484d));
                }
                eVar2.f131490c = (java.util.ArrayList) eVar2.f131489b.clone();
            } else {
                arrayList2.add(eVar2);
            }
            eVar2.f131488a.a(this.f131469h);
        }
        if (this.f131471j <= 0) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mapsdk.internal.iy.e eVar3 = (com.tencent.mapsdk.internal.iy.e) it6.next();
                eVar3.f131488a.a();
                this.f131464c.add(eVar3.f131488a);
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.b(0.0d, 1.0d);
            this.f131472k = b17;
            b17.b(this.f131471j);
            this.f131472k.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ix() { // from class: com.tencent.mapsdk.internal.iy.1

                /* renamed from: a, reason: collision with root package name */
                boolean f131474a = false;

                @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ix, com.tencent.mapsdk.internal.iw.a
                public final void a() {
                    this.f131474a = true;
                }

                @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ix, com.tencent.mapsdk.internal.iw.a
                public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar) {
                    if (this.f131474a) {
                        return;
                    }
                    int size3 = arrayList2.size();
                    for (int i27 = 0; i27 < size3; i27++) {
                        com.tencent.mapsdk.internal.iy.e eVar4 = (com.tencent.mapsdk.internal.iy.e) arrayList2.get(i27);
                        eVar4.f131488a.a();
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iy.this.f131464c.add(eVar4.f131488a);
                    }
                }
            });
            this.f131472k.a();
        }
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList4 = this.f131462a;
        if (arrayList4 != null) {
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i27 = 0; i27 < size3; i27++) {
                ((com.tencent.mapsdk.internal.iw.a) arrayList5.get(i27)).a(this);
            }
        }
        if (this.f131466e.size() == 0 && this.f131471j == 0) {
            this.f131470i = false;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList6 = this.f131462a;
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
