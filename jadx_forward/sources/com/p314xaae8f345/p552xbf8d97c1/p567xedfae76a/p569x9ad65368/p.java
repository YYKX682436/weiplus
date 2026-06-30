package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f134395a = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.o.f134394d);

    public final void a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea supervisorToken, java.lang.String str, java.lang.String str2, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supervisorToken, "supervisorToken");
        java.util.concurrent.ConcurrentHashMap c17 = c();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : c17.entrySet()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) entry.getKey(), supervisorToken)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b(linkedHashMap, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.m(str, str2, z17));
    }

    public final void b(java.util.Map map, yz5.l lVar) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                lVar.mo146xb9724478(entry);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f;
                oj.j.d(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar), th6, ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) entry.getKey()).f134325e + ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) entry.getKey()).f134326f, new java.lang.Object[0]);
                if (th6 instanceof android.os.DeadObjectException) {
                    c().remove(entry.getKey());
                    oj.j.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar), "remote process of proxy is dead, remove proxy: " + ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) entry.getKey()) + ". size[" + c().size() + ']', new java.lang.Object[0]);
                }
            }
        }
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) this.f134395a.mo141623x754a37bb();
    }
}
