package com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/plugin/finder/detector/api/detect/BaseEventDetector;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/lifecycle/x;", "<init>", "()V", "plugin-finder-detector_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.plugin.finder.detector.api.detect.BaseEventDetector */
/* loaded from: classes10.dex */
public abstract class AbstractC25298xba75790f<T> implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f296759d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f296760e = "Detector_" + hashCode() + '_' + g();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f r12, ns5.a r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f.b(com.tencent.plugin.finder.detector.api.detect.BaseEventDetector, ns5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f struct, ls5.f event, ns5.a detectParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectParams, "detectParams");
    }

    public final java.util.Map c(java.util.Map map, java.util.Map map2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void d(ls5.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f296759d;
        concurrentHashMap.remove(event.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f296760e, "eventEnd getEventKey " + event.b() + " size: " + concurrentHashMap.size());
    }

    public final void e(ls5.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f296759d;
        concurrentHashMap.put(event.b(), event);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f296760e, "eventStart getEventKey " + event.b() + " size: " + concurrentHashMap.size() + " extra: " + event.f402666c + ' ');
    }

    public final android.app.Activity f(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof android.app.Activity)) {
            android.view.ViewParent parent = view.getParent();
            return f(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return (android.app.Activity) context;
    }

    public abstract java.lang.String g();

    public abstract long h();

    public abstract java.util.Map i(java.lang.String str);

    public abstract int j();

    public abstract java.lang.String k(ls5.f fVar, ns5.a aVar);

    public abstract void l(ls5.f fVar);

    public abstract boolean m();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.Map r6, ns5.a r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ms5.b
            if (r0 == 0) goto L13
            r0 = r8
            ms5.b r0 = (ms5.b) r0
            int r1 = r0.f412676h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412676h = r1
            goto L18
        L13:
            ms5.b r0 = new ms5.b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f412674f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f412676h
            r3 = 1
            jz5.f0 r4 = jz5.f0.f384359a
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f412673e
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.f412672d
            com.tencent.plugin.finder.detector.api.detect.BaseEventDetector r7 = (com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L64
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L4a
            java.lang.String r6 = r5.f296760e
            java.lang.String r7 = "leakReport data size = 0 , return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7)
            return r4
        L4a:
            r0.f412672d = r5
            r0.f412673e = r6
            r0.f412676h = r3
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            ms5.c r2 = new ms5.c
            r3 = 0
            r2.<init>(r6, r5, r7, r3)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r8, r2, r0)
            if (r7 != r1) goto L5f
            goto L60
        L5f:
            r7 = r4
        L60:
            if (r7 != r1) goto L63
            return r1
        L63:
            r7 = r5
        L64:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.concurrent.ConcurrentHashMap r0 = r7.f296759d
            java.lang.Object r1 = r8.getKey()
            r0.remove(r1)
            boolean r0 = r7.m()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "leakReport isNeedAutoRecover: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = " \n data = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " dataEventMap: "
            r1.append(r2)
            java.util.concurrent.ConcurrentHashMap r2 = r7.f296759d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r7.f296760e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            if (r0 == 0) goto L6c
            java.lang.Object r8 = r8.getValue()
            ls5.f r8 = (ls5.f) r8
            r7.l(r8)
            goto L6c
        Lb6:
            java.lang.String r6 = r7.f296760e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "leakReport after dataEventMap: "
            r8.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r7 = r7.f296759d
            int r7 = r7.size()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f.n(java.util.Map, ns5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void o(java.util.Map leaks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leaks, "leaks");
    }

    public final java.lang.String p(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ ");
        int i17 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (i17 != 0) {
                sb6.append(" ; ");
            }
            i17++;
            sb6.append("eventName: " + ((ls5.f) entry.getValue()).b());
        }
        sb6.append(" }");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public java.lang.Object q(ns5.a aVar, java.util.Map.Entry entry, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }
}
