package ii;

/* loaded from: classes12.dex */
public final class b extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final ii.a f373140h;

    public b(ii.a memoryCanaryConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCanaryConfig, "memoryCanaryConfig");
        this.f373140h = memoryCanaryConfig;
    }

    @Override // qi.b
    public java.lang.String b() {
        return "Matrix.MemoryCanaryPlugin";
    }

    @Override // qi.b
    public void e() {
        boolean z17;
        boolean z18;
        if (this.f444988g == 2) {
            oj.j.b("Matrix.MemoryCanaryPlugin", "already started", new java.lang.Object[0]);
            return;
        }
        super.e();
        try {
            z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.d();
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.MemoryCanaryPlugin", th6, "", new java.lang.Object[0]);
            z17 = false;
        }
        ii.a aVar = this.f373140h;
        if (z17) {
            oj.j.a("Matrix.MemoryCanaryPlugin", "supervisor is " + oj.m.b(this.f444986e), new java.lang.Object[0]);
            ji.h[] configs = aVar.f373137a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configs, "configs");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (ji.h hVar : configs) {
                java.lang.Long valueOf = java.lang.Long.valueOf(hVar.f381418e);
                java.lang.Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new java.util.ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((java.util.List) obj).add(hVar);
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.lang.Object obj2 : iterable) {
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 interfaceC4660x9028c9b0 = ((ji.h) obj2).f381417d;
                    java.lang.Object obj3 = linkedHashMap2.get(interfaceC4660x9028c9b0);
                    if (obj3 == null) {
                        obj3 = new java.util.ArrayList();
                        linkedHashMap2.put(interfaceC4660x9028c9b0, obj3);
                    }
                    ((java.util.List) obj3).add(obj2);
                }
                for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    long longValue = ((java.lang.Number) entry.getKey()).longValue();
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 interfaceC4660x9028c9b02 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0) entry2.getKey();
                    java.lang.Object[] array = ((java.util.Collection) entry2.getValue()).toArray(new ji.h[0]);
                    if (array == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    ji.e eVar = new ji.e(longValue, interfaceC4660x9028c9b02, (ji.h[]) array);
                    ji.h[] hVarArr = eVar.f381411e;
                    java.lang.String arrays = java.util.Arrays.toString(hVarArr);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "java.util.Arrays.toString(this)");
                    oj.j.c("Matrix.monitor.AppBgSumPssMonitor", arrays, new java.lang.Object[0]);
                    int length = hVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            z18 = true;
                            break;
                        } else {
                            if (hVarArr[i17].f381416c) {
                                z18 = false;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (z18) {
                        oj.j.c("Matrix.monitor.AppBgSumPssMonitor", "none enabled", new java.lang.Object[0]);
                    } else {
                        eVar.f381410d.mo40963x40b15f2e(new ji.d(eVar));
                    }
                }
            }
        }
        for (ji.p pVar : aVar.f373138b) {
            ji.o oVar = new ji.o(pVar);
            ji.p pVar2 = oVar.f381429c;
            oj.j.c("Matrix.monitor.BackgroundMemoryMonitor", java.lang.String.valueOf(pVar2), new java.lang.Object[0]);
            if (pVar2.f381434e) {
                pVar2.f381435f.mo40966xc74540ab(new ji.n(oVar));
            }
        }
        java.util.ArrayList arrayList = ki.i.f389632a;
        ki.b config = aVar.f373139c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (config.f389617a) {
            if (config.f389618b.isEmpty()) {
                throw new java.lang.IllegalArgumentException("config.delayMillis is empty");
            }
            if (!ih.d.c()) {
                oj.j.b("Matrix.TrimMemoryNotifier", "Matrix NOT installed yet", new java.lang.Object[0]);
                return;
            }
            ih.d d17 = ih.d.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "Matrix.with()");
            d17.f373004b.registerComponentCallbacks(new ki.h());
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4674xf3711510 c4674xf3711510 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4674xf3711510.f19958x4fbc8495;
            java.util.ArrayList arrayList2 = ki.i.f389632a;
            ki.d dVar = new ki.d("ProcessStagedBg", c4674xf3711510, arrayList2, config, false);
            dVar.f389623g.mo40963x40b15f2e(new ki.c(dVar));
            ki.d dVar2 = new ki.d("ProcessDeepBg", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495, arrayList2, config, true);
            dVar2.f389623g.mo40963x40b15f2e(new ki.c(dVar2));
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4682x5dbe6c9e c4682x5dbe6c9e = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4682x5dbe6c9e.f19972x4fbc8495;
            java.util.ArrayList arrayList3 = ki.i.f389633b;
            ki.d dVar3 = new ki.d("AppStagedBg", c4682x5dbe6c9e, arrayList3, config, false);
            dVar3.f389623g.mo40963x40b15f2e(new ki.c(dVar3));
            ki.d dVar4 = new ki.d("AppDeepBg", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, arrayList3, config, true);
            dVar4.f389623g.mo40963x40b15f2e(new ki.c(dVar4));
        }
    }
}
