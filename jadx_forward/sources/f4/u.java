package f4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f340941a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f340942b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f340943c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f340944d = new java.util.ArrayList();

    public u(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(long j17, long j18, java.util.List list, java.util.List list2) {
        java.util.List list3;
        int size = list2.size() - 1;
        java.util.List list4 = this.f340943c;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                f4.t tVar = (f4.t) list2.get(size);
                long j19 = tVar.f340939b;
                if (j19 > 0 && j19 < j17) {
                    list2.remove(size);
                } else if (tVar.f340938a < j18) {
                    ((java.util.ArrayList) list4).add(tVar);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list2, this.f340942b) && tVar.f340939b == -1) {
                        tVar.f340939b = java.lang.System.nanoTime();
                    }
                }
                if (i17 < 0) {
                    break;
                } else {
                    size = i17;
                }
            }
        }
        if (((java.util.ArrayList) list4).size() > 0) {
            int size2 = ((java.util.ArrayList) list4).size();
            int i18 = 0;
            while (true) {
                list3 = this.f340944d;
                if (i18 >= size2) {
                    break;
                }
                if (!((java.util.ArrayList) list3).contains(java.lang.Integer.valueOf(i18))) {
                    f4.t tVar2 = (f4.t) ((java.util.ArrayList) list4).get(i18);
                    int size3 = ((java.util.ArrayList) list4).size();
                    for (int i19 = i18 + 1; i19 < size3; i19++) {
                        f4.t tVar3 = (f4.t) ((java.util.ArrayList) list4).get(i19);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2.f340940c.f340945a, tVar3.f340940c.f340945a)) {
                            if (tVar2.f340938a < tVar3.f340938a) {
                                ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i18));
                            } else {
                                ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i19));
                            }
                        }
                    }
                }
                i18++;
            }
            kz5.g0.s(list3);
            for (int size4 = ((java.util.ArrayList) list3).size() - 1; -1 < size4; size4--) {
                ((java.util.ArrayList) list4).remove(((java.lang.Number) ((java.util.ArrayList) list3).get(size4)).intValue());
            }
            int size5 = ((java.util.ArrayList) list4).size();
            for (int i27 = 0; i27 < size5; i27++) {
                list.add(((f4.t) ((java.util.ArrayList) list4).get(i27)).f340940c);
            }
            ((java.util.ArrayList) list4).clear();
            ((java.util.ArrayList) list3).clear();
        }
    }

    public final void b() {
        synchronized (this.f340942b) {
            int size = ((java.util.ArrayList) this.f340942b).size();
            while (true) {
                size--;
                if (-1 < size) {
                    if (((f4.t) ((java.util.ArrayList) this.f340942b).get(size)).f340939b != -1) {
                        ((java.util.ArrayList) this.f340942b).remove(size);
                    }
                }
            }
        }
    }

    public final java.util.List c(long j17, long j18) {
        java.util.ArrayList arrayList;
        synchronized (this.f340942b) {
            arrayList = new java.util.ArrayList(((java.util.ArrayList) this.f340941a).size() + ((java.util.ArrayList) this.f340942b).size());
            a(j17, j18, arrayList, this.f340941a);
            a(j17, j18, arrayList, this.f340942b);
        }
        return arrayList;
    }

    public final void d(java.lang.String str, java.util.List list, long j17) {
        synchronized (this.f340942b) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                f4.t tVar = (f4.t) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f340940c.f340945a, str) && tVar.f340939b < 0) {
                    tVar.f340939b = j17;
                }
            }
        }
    }
}
