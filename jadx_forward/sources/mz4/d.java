package mz4;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    public long f414768g;

    /* renamed from: h, reason: collision with root package name */
    public long f414769h;

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f414762a = null;

    /* renamed from: b, reason: collision with root package name */
    public lz4.a f414763b = null;

    /* renamed from: c, reason: collision with root package name */
    public r45.gp0 f414764c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f414765d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f414766e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f414767f = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f414770i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f414771j = false;

    public void A(int i17, boolean z17) {
        synchronized (this) {
            java.util.List list = this.f414762a;
            if (list != null && i17 >= 0 && i17 < list.size()) {
                for (int i18 = 0; i18 < this.f414762a.size(); i18++) {
                    if (i18 == i17) {
                        ((iz4.c) this.f414762a.get(i18)).f377637b = true;
                        ((iz4.c) this.f414762a.get(i18)).f377643h = z17;
                    } else {
                        ((iz4.c) this.f414762a.get(i18)).f377637b = false;
                        ((iz4.c) this.f414762a.get(i18)).f377643h = false;
                    }
                }
            }
        }
    }

    public void B(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.f(this, i17, z17, z18));
    }

    public final java.lang.String C(java.lang.String str, int i17) {
        return java.lang.String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", java.lang.Integer.valueOf(i17), str, str);
    }

    public int D() {
        java.util.List list = this.f414762a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void E(iz4.c cVar, boolean z17) {
        if (cVar == null) {
            return;
        }
        if (cVar.d() != 1) {
            if (z17) {
                this.f414767f++;
                return;
            } else {
                this.f414767f--;
                return;
            }
        }
        int e17 = qz4.c.e(((iz4.i) cVar).f377688t);
        if (z17) {
            this.f414766e += e17;
        } else {
            this.f414766e -= e17;
        }
    }

    public void a(final int i17, final iz4.c cVar, final boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: mz4.d$$m
            @Override // java.lang.Runnable
            public final void run() {
                boolean z18;
                lz4.a aVar;
                java.util.List list;
                mz4.d dVar = mz4.d.this;
                iz4.c cVar2 = cVar;
                int i18 = i17;
                boolean z19 = z17;
                synchronized (dVar) {
                    if (dVar.f414762a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[add] item = " + cVar2 + ", mDataList = " + dVar.f414762a + ", position = " + i18 + ", mDataList size = " + dVar.f414762a.size());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[add] item = " + cVar2 + ", mDataList = " + dVar.f414762a + ", position = " + i18);
                    }
                    if (cVar2 == null || (list = dVar.f414762a) == null || i18 < 0 || i18 > list.size()) {
                        z18 = false;
                    } else {
                        dVar.f414762a.add(i18, cVar2);
                        dVar.E(cVar2, true);
                        z18 = true;
                    }
                }
                if (z18 && z19 && (aVar = dVar.f414763b) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar, i18));
                    if (i18 <= 0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i18, dVar.f414762a.size() - i18);
                    } else {
                        int i19 = i18 - 1;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i19, dVar.f414762a.size() - i19);
                    }
                }
            }
        });
    }

    public void b(final iz4.c cVar, final boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: mz4.d$$e
            @Override // java.lang.Runnable
            public final void run() {
                boolean z18;
                lz4.a aVar;
                mz4.d dVar = mz4.d.this;
                iz4.c cVar2 = cVar;
                boolean z19 = z17;
                synchronized (dVar) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[add] item = " + cVar2 + ", type = " + cVar2.d() + ", mDataList = " + dVar.f414762a);
                    java.util.List list = dVar.f414762a;
                    if (list != null) {
                        list.add(cVar2);
                        dVar.E(cVar2, true);
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                if (z18 && z19 && (aVar = dVar.f414763b) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar, dVar.f414762a.size() - 1));
                }
            }
        });
    }

    public final boolean c(int i17, iz4.c cVar, boolean z17) {
        boolean z18;
        lz4.a aVar;
        java.util.List list;
        if (this.f414762a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addWithOutSync] item = " + cVar + ", mDataList = " + this.f414762a + ", position = " + i17 + ", mDataList size = " + this.f414762a.size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addWithOutSync] item = " + cVar + ", mDataList = " + this.f414762a + ", position = " + i17);
        }
        if (cVar == null || (list = this.f414762a) == null || i17 < 0 || i17 > list.size()) {
            z18 = false;
        } else {
            this.f414762a.add(i17, cVar);
            E(cVar, true);
            z18 = true;
        }
        if (z18 && z17 && (aVar = this.f414763b) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar, i17));
            if (i17 > 0) {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414763b).u7(i18, this.f414762a.size() - i18);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414763b).u7(i17, this.f414762a.size() - i17);
            }
        }
        return z18;
    }

    public final boolean d(iz4.c cVar, boolean z17) {
        boolean z18;
        lz4.a aVar;
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addWithOutSync] item = " + cVar + ", mDataList = " + this.f414762a);
        if (cVar == null || (list = this.f414762a) == null) {
            z18 = false;
        } else {
            list.add(cVar);
            E(cVar, true);
            z18 = true;
        }
        if (z18 && z17 && (aVar = this.f414763b) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.s((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar, this.f414762a.size() - 1));
        }
        return z18;
    }

    public void e(int i17, int i18, boolean z17) {
        lz4.a aVar;
        lz4.a aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem startPos: %d endPos: %d needNotify: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            try {
                java.util.List list = this.f414762a;
                if (list == null) {
                    return;
                }
                boolean z18 = false;
                if (i17 <= 0) {
                    i17 = 0;
                }
                if (i18 >= list.size()) {
                    i18 = this.f414762a.size() - 1;
                }
                int i19 = -1;
                while (i18 > i17) {
                    iz4.c cVar = (iz4.c) this.f414762a.get(i18);
                    int i27 = i18 - 1;
                    iz4.c cVar2 = (iz4.c) this.f414762a.get(i27);
                    if (cVar != null && cVar.d() == 1 && cVar2 != null && cVar2.d() == 1) {
                        iz4.i iVar = (iz4.i) cVar;
                        iz4.i iVar2 = (iz4.i) cVar2;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f377688t)) {
                            android.text.Spanned a17 = kz4.a.a(iVar.f377688t);
                            android.text.Spanned a18 = kz4.a.a(iVar2.f377688t);
                            iVar2.f377688t += "<br/>" + iVar.f377688t;
                            if (iVar.f377637b) {
                                iVar2.f377637b = true;
                                iVar2.f377643h = false;
                                int i28 = iVar.f377638c;
                                if (i28 != -1 && i28 < a17.length()) {
                                    iVar2.f377638c = a18.length() + 1 + iVar.f377638c;
                                }
                                iVar2.f377638c = -1;
                            } else if (iVar2.f377637b && iVar2.f377638c == -1) {
                                iVar2.f377638c = a18.length();
                            }
                        } else if (iVar.f377637b) {
                            iVar2.f377637b = true;
                            iVar2.f377643h = false;
                            iVar2.f377638c = -1;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem remove position: %d", java.lang.Integer.valueOf(i18));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.RunnableC29173x2e0103(this, i18, z18));
                        if (z17 && (aVar2 = this.f414763b) != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar2).x1(i18);
                        }
                        i19 = i27;
                    }
                    i18 = i27;
                }
                if (i19 != -1 && z17 && (aVar = this.f414763b) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).u7(i19, this.f414762a.size() - i19);
                }
                y();
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public boolean f(int i17, int i18) {
        boolean z17 = i17 >= 0;
        boolean z18 = i18 >= 0;
        if (!z17 || this.f414766e + i17 <= 16384) {
            return z18 && this.f414767f + i18 > 30;
        }
        return true;
    }

    public boolean g(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iz4.c cVar = (iz4.c) it.next();
            if (cVar.d() != 1) {
                i17++;
            } else {
                sb6.append(((iz4.i) cVar).f377688t);
            }
        }
        return f(qz4.c.e(sb6.toString()), i17);
    }

    public void h() {
        synchronized (this) {
            java.util.List<iz4.c> list = this.f414762a;
            if (list != null) {
                for (iz4.c cVar : list) {
                    cVar.f377637b = false;
                    cVar.f377643h = false;
                }
            }
        }
    }

    public void i() {
        java.util.List<iz4.c> list = this.f414762a;
        if (list != null) {
            for (iz4.c cVar : list) {
                cVar.f377637b = false;
                cVar.f377643h = false;
            }
        }
    }

    public java.lang.String j() {
        java.lang.String sb6;
        java.util.List list;
        synchronized (this) {
            if (this.f414765d == 0 && (list = this.f414762a) != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String f17 = ((iz4.o) ((iz4.c) it.next())).f();
                    if (f17.startsWith("WeNote_")) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(f17.substring(7), -1);
                        int i17 = this.f414765d;
                        if (P <= i17) {
                            P = i17;
                        }
                        this.f414765d = P;
                    }
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("WeNote_");
            int i18 = this.f414765d + 1;
            this.f414765d = i18;
            sb7.append(i18);
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public final java.lang.String k() {
        java.util.List list;
        if (this.f414765d == 0 && (list = this.f414762a) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String f17 = ((iz4.o) ((iz4.c) it.next())).f();
                if (f17.startsWith("WeNote_")) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(f17.substring(7), -1);
                    int i17 = this.f414765d;
                    if (P <= i17) {
                        P = i17;
                    }
                    this.f414765d = P;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeNote_");
        int i18 = this.f414765d + 1;
        this.f414765d = i18;
        sb6.append(i18);
        return sb6.toString();
    }

    public iz4.c l(int i17) {
        java.util.List list = this.f414762a;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return null;
        }
        return (iz4.c) this.f414762a.get(i17);
    }

    public java.util.ArrayList m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[getBasicClone] mDataList = " + this.f414762a);
        if (this.f414762a == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator it = this.f414762a.iterator();
            while (it.hasNext()) {
                arrayList.add(qz4.c.a((iz4.c) it.next(), null));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[getBasicClone] destDataList = " + arrayList);
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0340. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public r45.bq0 n(java.lang.String str) {
        int i17;
        int i18;
        boolean z17;
        byte[] bArr;
        java.lang.Object[] objArr;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.x1 m18;
        java.lang.String str2;
        int i19;
        iz4.o oVar;
        int i27;
        iz4.o oVar2;
        java.lang.String Y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem error ,htmlstr is null or nil");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.List c17 = mz4.j.f414822a.c(this.f414762a);
            int i28 = 0;
            while (true) {
                java.util.LinkedList linkedList = (java.util.LinkedList) c17;
                i17 = 4;
                i18 = 6;
                z17 = true;
                if (i28 >= linkedList.size()) {
                    break;
                }
                iz4.c cVar = (iz4.c) linkedList.get(i28);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f377636a)) {
                    cVar.f377636a = hz4.l.b(cVar.toString(), 18);
                }
                if (cVar.d() == -1) {
                    if (arrayList.size() <= 0 || ((iz4.o) arrayList.get(arrayList.size() - 1)).f377666q != 1) {
                        iz4.i iVar = new iz4.i();
                        iVar.f377688t = "\n";
                        iVar.f377636a = cVar.f377636a;
                        iVar.f377664o = "-1";
                        iVar.f377666q = 1;
                        iVar.f377663n = null;
                        arrayList.add(iVar);
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        iz4.i iVar2 = (iz4.i) arrayList.get(arrayList.size() - 1);
                        sb6.append(iVar2.f377688t);
                        sb6.append("\n");
                        iVar2.f377688t = sb6.toString();
                    }
                } else if (cVar.d() >= -1) {
                    if ((cVar.d() == 6 || cVar.d() == 4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((iz4.o) cVar).f377668s)) {
                        r45.gp0 gp0Var = new r45.gp0();
                        gp0Var.e0(cVar.f377636a);
                        gp0Var.i0(cVar.b());
                        java.lang.String c18 = hz4.l.c(gp0Var);
                        if (com.p314xaae8f345.mm.vfs.w6.j(c18)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem,type = %d, localfile exsit,but localpath is null or nil, set path here", java.lang.Integer.valueOf(cVar.d()));
                            ((iz4.o) cVar).f377668s = c18;
                        }
                    }
                    if (cVar.d() != 1) {
                        arrayList.add((iz4.o) cVar);
                    } else {
                        iz4.i iVar3 = (iz4.i) cVar;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar3.f377688t)) {
                            if (arrayList.size() <= 0 || ((iz4.o) arrayList.get(arrayList.size() - 1)).d() != 1) {
                                iz4.i iVar4 = new iz4.i();
                                iVar4.f377688t = iVar3.f377688t;
                                iVar4.f377636a = iVar3.f377636a;
                                iVar4.f377664o = iVar3.f377664o;
                                iVar4.f377666q = iVar3.f377666q;
                                iVar4.f377663n = null;
                                arrayList.add(iVar4);
                            } else {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                iz4.i iVar5 = (iz4.i) arrayList.get(arrayList.size() - 1);
                                sb7.append(iVar5.f377688t);
                                sb7.append(iVar3.f377688t);
                                iVar5.f377688t = sb7.toString();
                            }
                            int i29 = i28 + 1;
                            if (i29 < linkedList.size() && ((iz4.c) linkedList.get(i29)).d() == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((iz4.i) linkedList.get(i29)).f377688t)) {
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                iz4.i iVar6 = (iz4.i) arrayList.get(arrayList.size() - 1);
                                sb8.append(iVar6.f377688t);
                                sb8.append("<br/>");
                                iVar6.f377688t = sb8.toString();
                            }
                        } else if (arrayList.size() <= 0 || ((iz4.o) arrayList.get(arrayList.size() - 1)).d() != 1) {
                            iz4.i iVar7 = new iz4.i();
                            iVar7.f377688t = "<br/>";
                            iVar7.f377636a = iVar3.f377636a;
                            iVar7.f377664o = iVar3.f377664o;
                            iVar7.f377666q = iVar3.f377666q;
                            iVar7.f377663n = null;
                            arrayList.add(iVar7);
                        } else {
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                            iz4.i iVar8 = (iz4.i) arrayList.get(arrayList.size() - 1);
                            sb9.append(iVar8.f377688t);
                            sb9.append("<br/>");
                            iVar8.f377688t = sb9.toString();
                        }
                    }
                }
                i28++;
            }
        }
        int i37 = 2;
        java.lang.String replaceAll = java.util.regex.Pattern.compile("</wx-", 2).matcher(java.util.regex.Pattern.compile("<wx-", 2).matcher(str).replaceAll("<")).replaceAll("</");
        try {
            bArr = replaceAll.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            objArr = false;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Note.NoteDataManager", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "writehtmlfile, use utf-8 encoding error,use default encoding,");
            bArr = null;
            objArr = true;
        }
        this.f414764c.h0(8);
        this.f414764c.t0("WeNoteHtmlFile");
        this.f414764c.z0(true);
        this.f414764c.i0(".htm");
        r45.gp0 gp0Var2 = this.f414764c;
        gp0Var2.e0(hz4.l.b(gp0Var2.toString(), 18));
        java.lang.String c19 = hz4.l.c(this.f414764c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "getFavProtoItem: save note html file, path is %s", c19);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c19);
        if (r6Var.m()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Note.NoteDataManager", e18, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (objArr == true || com.p314xaae8f345.mm.vfs.w6.S(c19, bArr, 0, bArr.length) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "writefile error,return");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccq), 1).show();
            return null;
        }
        this.f414764c.A0(c19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "do WNNoteBase.ConvertNote2FavProtoItem");
        r45.gp0 gp0Var3 = this.f414764c;
        java.util.HashMap hashMap = hz4.h.f367944s;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.bq0 bq0Var = new r45.bq0();
        if (gp0Var3 != null) {
            linkedList2.add(gp0Var3);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(replaceAll) && replaceAll.length() > 0) {
            java.lang.String b17 = o72.p5.b();
            r45.gp0 gp0Var4 = new r45.gp0();
            gp0Var4.h0(8);
            gp0Var4.t0("WeNoteHtmlFile");
            gp0Var4.z0(true);
            gp0Var4.q0(com.p314xaae8f345.mm.vfs.w6.k(b17));
            gp0Var4.i0(".htm");
            linkedList2.add(gp0Var4);
            java.lang.String c27 = hz4.l.c(gp0Var4);
            if (!com.p314xaae8f345.mm.vfs.w6.j(c27)) {
                com.p314xaae8f345.mm.vfs.w6.c(b17, c27);
            }
            gp0Var4.A0(c27);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iz4.o oVar3 = (iz4.o) it.next();
            if (oVar3 != null) {
                r45.gp0 gp0Var5 = oVar3.f377663n;
                if (gp0Var5 == null) {
                    r45.gp0 gp0Var6 = new r45.gp0();
                    r45.hp0 hp0Var = new r45.hp0();
                    r45.ip0 ip0Var = new r45.ip0();
                    ip0Var.l(i18);
                    hp0Var.f457886d = ip0Var;
                    gp0Var6.J1 = hp0Var;
                    switch (oVar3.f377666q) {
                        case 1:
                            if (hz4.h.f367945t) {
                                i19 = i37;
                                oVar = oVar3;
                                i27 = 6;
                            } else {
                                hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
                                if (hVar == null) {
                                    i19 = i37;
                                    oVar = oVar3;
                                    i27 = 6;
                                } else {
                                    java.lang.String h17 = hVar.h();
                                    hz4.i iVar9 = hVar.f367951i;
                                    java.lang.String a17 = iVar9.a(h17);
                                    boolean g17 = hVar.g();
                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
                                    oVar = oVar3;
                                    i27 = 6;
                                    c6447xbd8a5a3.f137877d = 6;
                                    c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
                                    c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
                                    c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar9.f367958a, true);
                                    c6447xbd8a5a3.k();
                                    if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                                        i19 = 2;
                                        java.lang.String n17 = c6447xbd8a5a3.n();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
                                    } else {
                                        i19 = 2;
                                    }
                                }
                                hz4.h.f367945t = true;
                            }
                            gp0Var6.h0(1);
                            gp0Var6.x0(true);
                            gp0Var6.z0(true);
                            oVar2 = oVar;
                            gp0Var6.e0(oVar2.f377636a);
                            gp0Var6.m0(qz4.b.a(((iz4.i) oVar).f377688t));
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var6.f456941f) && gp0Var6.f456941f.length() > 1000) {
                                gp0Var6.m0(gp0Var6.f456941f.substring(0, 1000));
                            }
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                        case 2:
                            gp0Var6.h0(i37);
                            iz4.q qVar = (iz4.q) oVar3;
                            java.lang.String origPath = qVar.f377671t;
                            gp0Var6.A0(origPath);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f377636a)) {
                                gp0Var6.e0(hz4.l.b(qVar.toString(), 18));
                                android.graphics.Bitmap.CompressFormat format = android.graphics.Bitmap.CompressFormat.JPEG;
                                java.lang.String thumbFullPath = hz4.l.e(gp0Var6);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origPath, "origPath");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFullPath, "thumbFullPath");
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(origPath, 150, 150, format, 90, thumbFullPath, true) && (Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(origPath)) != null) {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(Y, thumbFullPath);
                                }
                                gp0Var6.B0(hz4.l.e(gp0Var6));
                            } else {
                                gp0Var6.e0(oVar3.f377636a);
                                gp0Var6.B0(qVar.f377668s);
                            }
                            gp0Var6.h0(i37);
                            i19 = i37;
                            oVar2 = oVar3;
                            i27 = 6;
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                        case 3:
                            gp0Var6.h0(i18);
                            iz4.s sVar = (iz4.s) oVar3;
                            gp0Var6.e0(oVar3.f377636a);
                            r45.pp0 pp0Var = new r45.pp0();
                            pp0Var.t(sVar.f377685x);
                            pp0Var.u(sVar.f377682u);
                            pp0Var.w(sVar.f377683v);
                            pp0Var.E((int) sVar.f377684w);
                            pp0Var.C(sVar.f377681t);
                            pp0Var.B(sVar.f377686y);
                            pp0Var.s(sVar.f377687z);
                            pp0Var.y(sVar.A);
                            pp0Var.x(sVar.B);
                            pp0Var.z(sVar.C);
                            pp0Var.A(sVar.D);
                            pp0Var.q(sVar.E);
                            pp0Var.r(sVar.F);
                            gp0Var6.x0(true);
                            gp0Var6.z0(true);
                            gp0Var6.J1.f457887e = pp0Var;
                            i19 = i37;
                            oVar2 = oVar3;
                            i27 = 6;
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                        case 4:
                            gp0Var6.h0(3);
                            iz4.v vVar = (iz4.v) oVar3;
                            gp0Var6.e0(oVar3.f377636a);
                            java.lang.String str3 = vVar.f377668s;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && str3.length() != 0) {
                                gp0Var6.A0(str3);
                                gp0Var6.n0(vVar.f377696x);
                                gp0Var6.z0(true);
                                gp0Var6.i0(vVar.f377692t);
                                i19 = i37;
                                oVar2 = oVar3;
                                i27 = i18;
                                gp0Var6.t0(oVar2.f377664o);
                                linkedList2.add(gp0Var6);
                                i37 = i19;
                                i18 = i27;
                                i17 = 4;
                                break;
                            }
                            break;
                        case 5:
                            gp0Var6.h0(8);
                            iz4.u uVar = (iz4.u) oVar3;
                            gp0Var6.e0(oVar3.f377636a);
                            gp0Var6.A0(uVar.f377668s);
                            gp0Var6.z0(true);
                            gp0Var6.O0(uVar.f377689t);
                            gp0Var6.m0(uVar.f377690u);
                            gp0Var6.i0(uVar.f377691v);
                            i19 = i37;
                            oVar2 = oVar3;
                            i27 = i18;
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                        case 6:
                            gp0Var6.h0(i17);
                            iz4.k kVar = (iz4.k) oVar3;
                            gp0Var6.e0(oVar3.f377636a);
                            gp0Var6.A0(kVar.f377668s);
                            gp0Var6.B0(kVar.f377650t);
                            com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar4 = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
                            java.lang.String str4 = kVar.f377668s;
                            ((be0.e) oVar4).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str4, true);
                            if (d17 != null) {
                                gp0Var6.n0(d17.a());
                            } else {
                                gp0Var6.n0(1);
                            }
                            gp0Var6.i0(kVar.f377652v);
                            i19 = i37;
                            oVar2 = oVar3;
                            i27 = i18;
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                        default:
                            i19 = i37;
                            oVar2 = oVar3;
                            i27 = i18;
                            gp0Var6.t0(oVar2.f377664o);
                            linkedList2.add(gp0Var6);
                            i37 = i19;
                            i18 = i27;
                            i17 = 4;
                            break;
                    }
                } else {
                    if (gp0Var5.I == 20) {
                        gp0Var5.h0(3);
                    }
                    oVar3.f377663n.t0(oVar3.f377664o);
                    linkedList2.add(oVar3.f377663n);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "do WNNoteBase.setExtraInfo");
        if (linkedList2.size() > 0) {
            int size = linkedList2.size();
            int i38 = 0;
            while (i38 < size) {
                r45.gp0 gp0Var7 = (r45.gp0) linkedList2.get(i38);
                if (i38 > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var7.f456967s)) {
                    gp0Var7.e0(hz4.l.b(gp0Var7.toString(), 18));
                    int i39 = i38 - 1;
                    iz4.o oVar5 = (i39 < 0 || i39 >= arrayList.size() || arrayList.size() <= 0) ? null : (iz4.o) arrayList.get(i39);
                    if (oVar5 != null && (str2 = oVar5.f377664o) != null && str2.equals(gp0Var7.P1)) {
                        oVar5.f377636a = gp0Var7.T;
                    }
                }
                if (i38 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var7.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var7.f456971u)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "datalist.get[%d].type = %d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(gp0Var7.I));
                    java.lang.String str5 = gp0Var7.V;
                    if (com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "datapath exist,pathname:%s", str5);
                        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str5);
                        java.lang.String g18 = kk.k.g(com.p314xaae8f345.mm.vfs.w6.N(str5, 0, 256));
                        gp0Var7.p0(p17);
                        gp0Var7.r0(g18);
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str5);
                        java.lang.String str6 = a18.f294812f;
                        if (str6 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                            if (!str6.equals(l17)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                        gp0Var7.q0((m19.a() && (m18 = m19.f294799a.m(m19.f294800b)) != null) ? m18.f294766c : 0L);
                        java.lang.String c28 = hz4.l.c(gp0Var7);
                        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(c28);
                        if (!str5.equals(c28) && !j17 && !"WeNoteHtmlFile".equals(gp0Var7.P1)) {
                            com.p314xaae8f345.mm.vfs.w6.c(str5, c28);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "datapath not exist, %s not exist!", str5);
                    }
                    java.lang.String str7 = gp0Var7.X;
                    if (com.p314xaae8f345.mm.vfs.w6.j(str7)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteBase", "thumbPath exist,pathname:%s", str7);
                        java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(str7);
                        java.lang.String f17 = kk.k.f(str7, 0, 256);
                        gp0Var7.N0(p18);
                        gp0Var7.M0(f17);
                        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(str7);
                        java.lang.String str8 = a19.f294812f;
                        if (str8 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str8, false, false);
                            if (!str8.equals(l18)) {
                                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l18, a19.f294813g, a19.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
                        gp0Var7.L0((m27.a() && (m17 = m27.f294799a.m(m27.f294800b)) != null) ? m17.f294766c : 0L);
                        java.lang.String e19 = hz4.l.e(gp0Var7);
                        if (!str7.equals(e19) && !com.p314xaae8f345.mm.vfs.w6.j(e19)) {
                            com.p314xaae8f345.mm.vfs.w6.c(str7, e19);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteBase", "thumbPath not exist, pathname:%s", str7);
                    }
                } else {
                    gp0Var7.x0(z17);
                    gp0Var7.z0(z17);
                }
                i38++;
                z17 = true;
            }
        }
        bq0Var.d(linkedList2);
        return bq0Var;
    }

    public int o() {
        synchronized (this) {
            if (this.f414762a == null) {
                return -1;
            }
            for (int i17 = 0; i17 < this.f414762a.size(); i17++) {
                iz4.c cVar = (iz4.c) this.f414762a.get(i17);
                if (cVar != null && cVar.d() != -3 && cVar.d() != -2) {
                    return i17;
                }
            }
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dc, code lost:
    
        r7 = r6.f414762a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01de, code lost:
    
        if (r7 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "[getHtmlContent] dataList == null return empty html");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ec, code lost:
    
        if (r7.size() > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ee, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "[getHtmlContent] mDataList.size() <= 0 return empty html");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f6, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "[getHtmlContent] incomprehensible case return empty html");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String p(boolean r7) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.d.p(boolean):java.lang.String");
    }

    public int q() {
        synchronized (this) {
            java.util.List list = this.f414762a;
            if (list == null) {
                return -1;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                iz4.c cVar = (iz4.c) this.f414762a.get(size);
                if (cVar != null && cVar.d() != -3 && cVar.d() != -2) {
                    return size;
                }
            }
            return -1;
        }
    }

    public java.lang.String r(java.lang.String str) {
        synchronized (this) {
            if (this.f414762a != null) {
                for (int i17 = 0; i17 < this.f414762a.size(); i17++) {
                    boolean z17 = true;
                    if (((iz4.c) this.f414762a.get(i17)).d() == 1) {
                        java.lang.String replace = qz4.b.a(((iz4.i) this.f414762a.get(i17)).f377688t).replace("&lt;", "<").replace("&gt;", ">").replace(" ", " ");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(replace)) {
                            java.lang.String[] split = replace.split("\n");
                            int i18 = 0;
                            while (true) {
                                if (i18 >= split.length) {
                                    z17 = false;
                                    break;
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[i18].trim())) {
                                    str = split[i18];
                                    break;
                                }
                                i18++;
                            }
                            if (z17) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return str.length() > 1000 ? str.substring(0, 1000) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(java.util.List r17, int r18, int r19, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a r20) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.d.s(java.util.List, int, int, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText):boolean");
    }

    public int t(iz4.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        if (cVar == null) {
            return -1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(cVar);
        return u(arrayList, c19515x154ec45a, z17, z18, z19, z27, z28);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01c8 A[Catch: all -> 0x01da, TryCatch #0 {all -> 0x01da, blocks: (B:58:0x00c0, B:59:0x00cc, B:61:0x00d2, B:64:0x00e1, B:70:0x0205, B:106:0x00e4, B:108:0x00ee, B:110:0x00f0, B:112:0x00f9, B:114:0x00ff, B:116:0x012b, B:118:0x0133, B:119:0x013c, B:121:0x0159, B:123:0x0168, B:124:0x0170, B:125:0x01bd, B:126:0x01c2, B:128:0x01c8, B:131:0x01d7, B:137:0x017d, B:139:0x0183, B:141:0x018b, B:142:0x0193, B:143:0x01a9, B:145:0x01b3, B:147:0x01b7, B:148:0x01dd, B:150:0x01e3, B:151:0x01e5, B:152:0x01eb, B:154:0x01f1, B:157:0x0200), top: B:56:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u(java.util.ArrayList r9, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.d.u(java.util.ArrayList, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText, boolean, boolean, boolean, boolean, boolean):int");
    }

    public void v() {
        this.f414763b = null;
        java.util.List list = this.f414762a;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((iz4.c) it.next()).e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:29:0x0060, B:31:0x0065, B:33:0x006b, B:35:0x0076, B:37:0x007c, B:40:0x0084, B:42:0x00a5, B:44:0x00ad, B:45:0x00b6, B:47:0x00d3, B:49:0x00e2, B:50:0x00ea, B:51:0x0137, B:52:0x013c, B:54:0x0142, B:57:0x0151, B:63:0x01a2, B:91:0x00f7, B:93:0x00fd, B:95:0x0105, B:96:0x010d, B:97:0x0123, B:99:0x012d, B:101:0x0131, B:102:0x0159, B:105:0x0169, B:106:0x017f, B:108:0x0165, B:110:0x0183, B:111:0x0185, B:112:0x018a, B:114:0x0190, B:117:0x019f), top: B:28:0x0060 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(java.util.ArrayList r7, int r8, int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.d.w(java.util.ArrayList, int, int, int, int, boolean, boolean):int");
    }

    public void x(iz4.c cVar) {
        if (cVar == null) {
            return;
        }
        iz4.o oVar = (iz4.o) cVar;
        if (oVar.d() > 1) {
            if (oVar instanceof iz4.p) {
                oVar.f377664o = k();
                for (iz4.c cVar2 : ((iz4.p) oVar).f377669t) {
                    if (cVar2 instanceof iz4.o) {
                        ((iz4.o) cVar2).f377664o = k();
                    }
                }
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f377664o)) {
                oVar.f377664o = k();
            }
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
            if (hVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but get wnnote base is null", cVar.toString());
            } else {
                java.util.Map map = hVar.f367950h;
                if (map == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but mEditorIdToDataItem is null", cVar.toString());
                } else {
                    map.put(oVar.f377664o, oVar);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f377636a)) {
            cVar.f377636a = hz4.l.b(cVar.toString(), 18);
        }
    }

    public void y() {
        gm0.j1.e().j(new mz4.g(this));
    }

    public void z(final int i17, final boolean z17, final nz4.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: mz4.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                lz4.a aVar;
                mz4.d dVar = mz4.d.this;
                int i18 = i17;
                boolean z18 = z17;
                nz4.h hVar2 = hVar;
                synchronized (dVar) {
                    if (dVar.f414762a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[remove] , mDataList = " + dVar.f414762a + ", position = " + i18 + ", mDataList size = " + dVar.f414762a.size());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[remove] , mDataList = " + dVar.f414762a + ", position = " + i18);
                    }
                    java.util.List list = dVar.f414762a;
                    boolean z19 = false;
                    if (list != null && i18 >= 0 && i18 < list.size()) {
                        if (mz4.j.f414822a.d(i18, z18, dVar.f414762a, hVar2, dVar)) {
                            lz4.a aVar2 = dVar.f414763b;
                            if (aVar2 != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar2).t7();
                            }
                            return;
                        } else {
                            dVar.E((iz4.c) dVar.f414762a.get(i18), false);
                            dVar.f414762a.remove(i18);
                            z19 = true;
                        }
                    }
                    if (z19 && z18 && (aVar = dVar.f414763b) != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).x1(i18);
                        if (i18 <= 0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i18, dVar.f414762a.size() - i18);
                        } else {
                            int i19 = i18 - 1;
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i19, dVar.f414762a.size() - i19);
                        }
                    }
                }
            }
        });
    }
}
