package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ov extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(java.lang.String str) {
        super(2);
        this.f217019d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        java.lang.String str;
        bq.z1 cgi = (bq.z1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) obj2, "<anonymous parameter 1>");
        bu2.g0 g0Var = bu2.g0.f106044a;
        java.lang.String userName = this.f217019d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        synchronized (g0Var) {
            java.util.Map map = bu2.g0.f106045b;
            if (map.containsKey(userName)) {
                bu2.f0 f0Var = (bu2.f0) ((java.util.LinkedHashMap) map).get(userName);
                if (f0Var != null) {
                    f0Var.f106038b = cgi;
                }
            } else {
                if (map.size() >= bu2.g0.f106046c) {
                    java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (it.hasNext()) {
                            long j17 = ((bu2.f0) ((java.util.Map.Entry) next).getValue()).f106037a;
                            do {
                                java.lang.Object next2 = it.next();
                                long j18 = ((bu2.f0) ((java.util.Map.Entry) next2).getValue()).f106037a;
                                if (j17 > j18) {
                                    next = next2;
                                    j17 = j18;
                                }
                            } while (it.hasNext());
                        }
                        obj3 = next;
                    } else {
                        obj3 = null;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj3;
                    if (entry != null && (str = (java.lang.String) entry.getKey()) != null) {
                    }
                }
                java.util.Map map2 = bu2.g0.f106045b;
                bu2.f0 f0Var2 = new bu2.f0(0L, null, null, null, 15, null);
                f0Var2.f106038b = cgi;
                map2.put(userName, f0Var2);
            }
        }
        return jz5.f0.f384359a;
    }
}
