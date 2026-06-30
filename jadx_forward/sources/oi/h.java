package oi;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    public static final oi.h f427100e = new oi.h();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f427101a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f427102b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f427103c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f427104d = new java.util.ArrayList();

    public void a(oi.e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f427102b) {
            int indexOf = ((java.util.LinkedList) this.f427102b).indexOf(eVar);
            if (-1 == indexOf) {
                oj.j.a("Matrix.ResRecordManager", "del info not found: %s", eVar.m151425x9616526c());
                return;
            }
            oi.e eVar2 = (oi.e) ((java.util.LinkedList) this.f427102b).get(indexOf);
            if (eVar2 == null) {
                return;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = eVar2.f427099l;
            atomicInteger.set(atomicInteger.get() - 1);
            if (atomicInteger.get() == 0) {
                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41200xb27602fe(eVar2.f427091d);
                pi.e eVar3 = eVar2.f427090c;
                if (eVar3 != null) {
                    eVar3.a();
                    eVar2.f427090c = null;
                }
            }
            oi.b bVar = eVar2.f427093f;
            if (bVar != null) {
                long j17 = bVar.f427073i;
                if (j17 != 0) {
                    com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41200xb27602fe(j17);
                    bVar.f427073i = 0L;
                    pi.e eVar4 = bVar.f427072h;
                    if (eVar4 != null) {
                        eVar4.a();
                        bVar.f427072h = null;
                    }
                }
            }
            ((java.util.LinkedList) this.f427102b).remove(eVar2);
            synchronized (this.f427101a) {
                for (oi.g gVar : this.f427101a) {
                    if (gVar != null) {
                        oi.i iVar = (oi.i) gVar;
                        synchronized (iVar.f427105a) {
                            ((java.util.LinkedList) iVar.f427105a).remove(eVar2);
                        }
                    }
                }
            }
        }
    }

    public java.lang.String b() {
        int hashCode;
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f427102b;
            if (i18 >= linkedList.size()) {
                break;
            }
            oi.e eVar = (oi.e) linkedList.get(i18);
            int hashCode2 = eVar.a().hashCode();
            int hashCode3 = eVar.b().hashCode();
            oi.b bVar = eVar.f427093f;
            if (bVar == null) {
                hashCode = 0;
            } else {
                pi.e eVar2 = bVar.f427072h;
                hashCode = (eVar2 == null ? "" : eVar2.f436031a).hashCode();
            }
            int hashCode4 = bVar == null ? 0 : bVar.a().hashCode();
            boolean c17 = eVar.c();
            long j17 = hashCode2 + hashCode3 + hashCode4 + hashCode;
            long j18 = eVar.f427094g;
            pi.a aVar = eVar.f427098k;
            java.lang.String str = eVar.f427088a;
            long m158553x8cdac1b = j17 + j18 + aVar.m158553x8cdac1b() + str.hashCode() + (c17 ? 1L : 0L);
            oi.c cVar = (oi.c) hashMap.get(java.lang.Long.valueOf(m158553x8cdac1b));
            if (cVar == null) {
                hashMap.put(java.lang.Long.valueOf(m158553x8cdac1b), new oi.c(eVar));
                i17 = i18;
            } else {
                oi.e eVar3 = cVar.f427077a;
                boolean z17 = eVar.f427092e == eVar3.f427092e;
                boolean equals = str.equals(eVar3.f427088a);
                i17 = i18;
                boolean z18 = j18 == eVar3.f427094g;
                boolean m158552xb2c87fbf = aVar.m158552xb2c87fbf(eVar3.f427098k);
                boolean z19 = eVar.c() == eVar3.c();
                if (z17 && equals && z18 && m158552xb2c87fbf && z19) {
                    cVar.f427081e++;
                    ((java.util.ArrayList) cVar.f427078b).add(java.lang.Integer.valueOf(eVar.f427089b));
                    if (eVar3.f427093f != null) {
                        cVar.a(eVar.f427093f);
                        cVar.f427080d += eVar.f427093f.b();
                    }
                    hashMap.put(java.lang.Long.valueOf(m158553x8cdac1b), cVar);
                }
            }
            i18 = i17 + 1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (oi.c cVar2 : hashMap.values()) {
            if (cVar2.f427077a.f427092e == oi.d.TEXTURE) {
                arrayList.add(cVar2);
            }
            oi.e eVar4 = cVar2.f427077a;
            if (eVar4.f427092e == oi.d.BUFFER) {
                arrayList2.add(cVar2);
            }
            oi.d dVar = oi.d.FRAME_BUFFERS;
            oi.d dVar2 = eVar4.f427092e;
            if (dVar2 == dVar) {
                arrayList3.add(cVar2);
            }
            if (dVar2 == oi.d.RENDER_BUFFERS) {
                arrayList4.add(cVar2);
            }
            if (dVar2 == oi.d.EGL_CONTEXT) {
                arrayList5.add(cVar2);
            }
        }
        oi.f fVar = new oi.f(this);
        java.util.Collections.sort(arrayList, fVar);
        java.util.Collections.sort(arrayList2, fVar);
        java.util.Collections.sort(arrayList3, fVar);
        java.util.Collections.sort(arrayList4, fVar);
        java.util.Collections.sort(arrayList5, fVar);
        pi.c cVar3 = new pi.c();
        java.lang.StringBuilder sb6 = cVar3.f436029a;
        sb6.append("-------------------------------------------------------------------------");
        sb6.append("\n");
        cVar3.c(java.lang.String.format("textures Count = %d", java.lang.Integer.valueOf(arrayList.size())), 3);
        cVar3.c(java.lang.String.format("buffer Count = %d", java.lang.Integer.valueOf(arrayList2.size())), 3);
        cVar3.c(java.lang.String.format("framebuffer Count = %d", java.lang.Integer.valueOf(arrayList3.size())), 3);
        cVar3.c(java.lang.String.format("renderbuffer Count = %d", java.lang.Integer.valueOf(arrayList4.size())), 3);
        cVar3.c(java.lang.String.format("egl context Count = %d", java.lang.Integer.valueOf(arrayList5.size())), 3);
        sb6.append("-------------------------------------------------------------------------");
        sb6.append("\n");
        cVar3.b();
        cVar3.c("texture part :", 3);
        cVar3.b();
        cVar3.a(e(arrayList));
        cVar3.b();
        cVar3.c("buffers part :", 3);
        cVar3.b();
        cVar3.a(e(arrayList2));
        cVar3.b();
        cVar3.c("renderbuffer part :", 3);
        cVar3.b();
        cVar3.a(e(arrayList4));
        cVar3.b();
        cVar3.c("egl context part :", 3);
        cVar3.b();
        cVar3.a(e(arrayList5));
        sb6.append("\n");
        return cVar3.m158556x9616526c();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oi.e c(oi.d r6, long r7, long r9, int r11) {
        /*
            r5 = this;
            java.util.List r0 = r5.f427102b
            monitor-enter(r0)
            java.util.List r1 = r5.f427102b     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3d
            oi.e r2 = (oi.e) r2     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L18
            goto L3a
        L18:
            oi.d r3 = r2.f427092e     // Catch: java.lang.Throwable -> L3d
            if (r6 != r3) goto L9
            oi.d r3 = oi.d.EGL_CONTEXT     // Catch: java.lang.Throwable -> L3d
            if (r6 == r3) goto L2e
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L27
            goto L2e
        L27:
            long r3 = r2.f427095h     // Catch: java.lang.Throwable -> L3d
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L9
            goto L34
        L2e:
            long r3 = r2.f427094g     // Catch: java.lang.Throwable -> L3d
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L9
        L34:
            int r3 = r2.f427089b     // Catch: java.lang.Throwable -> L3d
            if (r3 != r11) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return r2
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            r6 = 0
            return r6
        L3d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.h.c(oi.d, long, long, int):oi.e");
    }

    public void d(oi.e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f427102b) {
            ((java.util.LinkedList) this.f427102b).add(eVar);
        }
        synchronized (this.f427101a) {
            for (oi.g gVar : this.f427101a) {
                if (gVar != null) {
                    oi.i iVar = (oi.i) gVar;
                    synchronized (iVar.f427105a) {
                        ((java.util.LinkedList) iVar.f427105a).add(eVar);
                    }
                }
            }
        }
    }

    public final java.lang.String e(java.util.List list) {
        java.lang.String str;
        pi.c cVar = new pi.c();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oi.c cVar2 = (oi.c) it.next();
            cVar.a(java.lang.String.format(" alloc count = %d", java.lang.Integer.valueOf(cVar2.f427081e)));
            oi.e eVar = cVar2.f427077a;
            cVar.a(java.lang.String.format(" egl context is release = %s", java.lang.Boolean.valueOf(eVar.c())));
            cVar.a(java.lang.String.format(" egl surface is release = %s", java.lang.Boolean.valueOf(eVar.d())));
            cVar.a(java.lang.String.format(" total size = %s", java.lang.Long.valueOf(cVar2.f427080d)));
            cVar.a(java.lang.String.format(" id = %s", cVar2.f427078b.toString()));
            cVar.a(java.lang.String.format(" activity = %s", eVar.f427098k.f436026b));
            cVar.a(java.lang.String.format(" type = %s", eVar.f427092e));
            cVar.a(java.lang.String.format(" eglContext = %s", java.lang.Long.valueOf(eVar.f427094g)));
            cVar.a(java.lang.String.format(" java stack = %s", eVar.a()));
            cVar.a(java.lang.String.format(" native stack = %s", eVar.b()));
            str = "";
            if (eVar.f427093f != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int i17 = 0;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) cVar2.f427079c;
                    if (i17 >= arrayList.size()) {
                        break;
                    }
                    sb7.append(" ");
                    sb7.append((java.lang.String) arrayList.get(i17));
                    sb7.append("\n");
                    i17++;
                }
                sb6.append(sb7.toString());
                sb6.append("\n");
                pi.e eVar2 = eVar.f427093f.f427072h;
                sb6.append(java.lang.String.format(" memory java stack = %s", eVar2 != null ? eVar2.f436031a : ""));
                sb6.append("\n");
                sb6.append(java.lang.String.format(" memory native stack = %s", eVar.f427093f.a()));
                str = sb6.toString();
            }
            cVar.a(str);
            cVar.f436029a.append("\n");
        }
        return cVar.m158556x9616526c();
    }
}
